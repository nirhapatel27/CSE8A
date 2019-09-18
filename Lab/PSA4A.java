/* Filename: PSA4A.java 
* Created by: Shuaiqi Xia, cs8a3 and Tony Xia, cs8a4
* Date: 
*/ 

/*I've given you a basic skeleton of how your code is going to look so you can get a basic idea of the workflow here*/
public class PSA4A {
 public static void main(String [] args)
 {
  
   String sourceFile = FileChooser.pickAFile();
   Picture sourcePicture = new Picture(sourceFile);
   
   Picture copy1 = new Picture(sourcePicture);
   Picture copy2= new Picture(sourcePicture);
   Picture copy3=new Picture(sourcePicture);
   
   copy1.flipHorizontal(); 
   copy1.show();
   copy2.flipVertical();
   copy2.show();
   copy3.grayscale();
   copy3.show();
   //Do the same thing with the other 2 picture copies when you've finished implementing the other 2 transformations

   //Create your array of Pictures
   Picture[] picArray=new Picture[3];
   picArray[0] = copy1;
   picArray[1] = copy2;
   picArray[2] = copy3;
   Picture [] pictures = picArray;
   int collageHeight=sourcePicture.getHeight();
   int collageWidth=sourcePicture.getWidth()*3;
   Picture canvas=new Picture (collageWidth,collageHeight);
   
   //Call collage() with your canvas and show it!
   canvas.collage(picArray);
   canvas.show();
 }
 
}