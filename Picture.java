import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /**
   * Horizontal flip method
   * In this method, I've given you the basic structure of how things will look.  There are a few incomplete assignments inside of the method.  It is your job to figure out how to complete those assignments!
   * This method works almost like the horizontal mirroring method you saw in your text book (pg 135), but instead of mirroring on the middle of the image, we want to flip it all the way.
   * Hint: Why do we need tempColor in this case?  I encourage you to reflect on this question if you find your method not working the way it should!**/
  public void flipHorizontal()
  {
    Color tempColor;

    int limit1 = this.getWidth();
    int limit2 = this.getHeight();
    Pixel temp=new Pixel(new Picture(),0,0);
    Pixel source,destination;
    
    for(int i = 0; i < limit1/2; i++)
    {
      for(int j = 0; j < limit2; j++)
      {
        //FILL THIS OUT AND THEN UNCOMMENT IT!
        source=getPixel(i,j);
        destination=getPixel(getWidth()-1-i,j);
        tempColor = destination.getColor();
        temp.setColor(source.getColor());
        source.setColor(tempColor);
        destination.setColor(temp.getColor());
        
        //After you store away your pixel colors...call setColor() here on the appropriate pixels and flip the picture!
        
      }
    }
    
  }
  
  /**
   * Vertical flip method
   * No hints for this one! **/
  public void flipVertical()
  {
   Color tempColor;

    int limit1 = this.getWidth();
    int limit2 = this.getHeight();
    Pixel temp=new Pixel(new Picture(),0,0);
    Pixel source,destination;
    
    for(int j = 0; j < limit2/2; j++)
    {
      for(int i = 0; i < limit1; i++)
      {
        //FILL THIS OUT AND THEN UNCOMMENT IT!
        source=getPixel(i,j);
        destination=getPixel(i,getHeight()-1-j);
        tempColor = destination.getColor();
        temp.setColor(source.getColor());
        source.setColor(tempColor);
        destination.setColor(temp.getColor());
        
        //After you store away your pixel colors...call setColor() here on the appropriate pixels and flip the picture!
        
      }
    } 
  }
  
  /**
   * Grayscale method **/
  public void grayscale()
  {
    Pixel[] pixelArray=this.getPixels();
    Pixel pixelObj;
    int i=0;
    while (i<pixelArray.length)
    { 
      pixelObj=pixelArray[i];
      int value=(pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3;
      pixelObj.setRed(value);
      pixelObj.setGreen(value);
      pixelObj.setBlue(value);
      i+=1;
    }
  }
  
  /**The collage method
    * This method will create the collage of your modified pictures.  
    * Hint 1: Inside of the for loop here will be another 2 nested for loops, giving you a grand total of 3 nested for loops in this method
    * Hint 2: If you're clever about the way you decide to draw your pixels onto the canvas, you may only have to write ONE LINE OF CODE inside the inner-most for loop to achieve the desired collage effect!
    * However, more than one line inside of the nested for loops is perfectly fine, of course! **/
  public void collage(Picture [] pictures)
  {
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for(int i = 0; i < pictures.length; i++)
    {
     for(int sourceX = 0, targetX = i*getWidth()/3; sourceX< this.getWidth()/3;sourceX++,targetX++)
     {
       for(int sourceY = 0, targetY=0; sourceY< this.getHeight();sourceY++,targetY++)
       {
         sourcePixel=pictures[i].getPixel(sourceX,sourceY);
         targetPixel = this.getPixel(targetX,targetY);
         targetPixel.setColor(sourcePixel.getColor());
       }
     }
    }
  }
  
  /*
   * TODO:
   * Write flipVerticalRectangle and flipHorizontalRectangle methods here **/
  
 /* public void flipVerticalRectangle(int x, int y, int width, int height)
  {
    Pixel temp=new Pixel(new Picture(), 0,0);
    Pixel source=null;
    Pixel destination=null;
    
    for(int z = y-height+1,k=0; z < y-height/2; z++,k++)     
    {
      for(int w = x; w < x+width; w++)   
      {
        source=getPixel(w,z);
        destination=getPixel(w,y-1-k);
       temp.setColor(source.getColor());
       source.setColor(destination.getColor());
       destination.setColor(temp.getColor());
      }
   }   
 }
 */public void flipVerticalRectangle(int x, int y, int width, int height)
  {
    Pixel temp=new Pixel(new Picture(), 0,0);
    Pixel source=null;
    Pixel destination=null;
    
    for(int z = y-height+1,k=0; z < y-height/2; z++,k++)     
    {
      for(int w = x; w < x+width; w++)   
      {
        source=getPixel(w,z);
        destination=getPixel(w,y-1-k);
       temp.setColor(source.getColor());
       source.setColor(destination.getColor());
       destination.setColor(temp.getColor());
      }
   }   
 }
  
  
  /*public void scramble(Picture picture)
  {
    int pieceWidth=picture.width()/3;
    int pieceHeight=picture.height()/3;
    
    int [] pieceArray = new int[8];
    Random randomGenerator = new Random();
    int sourceX = 0
    for (int i=0;i<9;i++)
    {
      int pieceNumber = random.nextInt(8);
     while (pieceArray[pieceNumber]==0)
       
    }
    
           }
    */  
     } // this } is the end of class Picture, put all new methods before this
  
