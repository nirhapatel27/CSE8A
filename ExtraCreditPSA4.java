public class ExtraCreditPSA4 {
  public static void main(String [] args)
 {
   //Choose a picture file
   String sourceFile = FileChooser.pickAFile();
   Picture sourcePicture = new Picture(sourceFile);
   Picture canvas=new Picture (pictureWidth,pictureHeight);
   Picture copy1 = new Picture(sourcePicture);
   canvas.scramble(picArray);
   canvas.show;
  }
}