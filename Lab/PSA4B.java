/* Filename: PSA4B.java 
* Created by: Shuaiqi Xia, cs8a3 and Tony Xia, cs8a4
* Date: 
*/ 

public class PSA4B {
 public static void main(String [] args)
 {
   //Choose a picture file
   String sourceFile = FileChooser.pickAFile();
   Picture sourcePicture = new Picture(sourceFile);
  
   //Copy your Picture objects
   Picture copy1 = new Picture(sourcePicture);
   Picture copy2 = new Picture(sourcePicture);

   //Call flipVerticalRectangle and flipHorizontalRectangle on your copies
   copy1.flipVerticalRectangle(copy1.getWidth()/2, copy1.getHeight()/2, copy1.getWidth()/4, copy1.getHeight()/4);
   copy1.explore();
   
   copy2.flipHorizontalRectangle(copy2.getWidth()/2, copy2.getHeight()/2, copy2.getWidth()/4, copy2.getHeight()/4);
   copy2.explore();
   //Show both copies!
   
 }  
  
}