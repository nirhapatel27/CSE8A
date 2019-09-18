/* Filename: PSA4A.java 
 * Created by: Nirha Patel, cs8afbdo and Jesus Gutierrez, cs8afawe
 * Email: nrp001@ucsd.edu, jeg080@ucsd.edu
 * PID: A13695370, A13228299
 * Date: 29th October,2016
 */ 
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/*Picture.java: This is the file that allows us to add instructions for the class Picture. Adding a method here allows us to make
 * pictures do what we want them to do, while not having to repeatedly code those instructions.
 * PSA4A.java: In this file we create a collage of 3 pictures. Those 3 pictures are modifications of a source picture which we modify
 * the grayscale, flipHorizontal, and flipVertical methods. They are stitched together in a picture array which we define as being three
 * pictures long and add that array to a canvas
 * PSA44B.java: In this file we test the flipVerticalRectangle and flipHorizontalRectangle methods. These methods take a specified
 * portion of a picture and flips them in the wanted manner. In our case, we wanted to make sure the picture never went out of bounds
 * so we defined a small rectangle a fourth of the size of the original halfway into the picture to be flipped.
 * 
 /**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture (1) extends SimplePicture 
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
   * This method is basically like mirroring vertically where the axis is at the edge of the picture. In this method, it will
   * the calling object horizonatlly with the use of for loops.
   */
  public void flipHorizontal()
  {
    Color tempColor;
    
    int limit1 = this.getWidth();
    int limit2 = this.getHeight();
    Pixel temp=new Pixel(new Picture(),0,0);
    Pixel source,destination;
    
    for(int i = 0; i < limit1/2; i++)  //As it is flipping around the horizontal axis, we are dividing the the picture through a 
      //horizontal line
    {
      for(int j = 0; j < limit2; j++)  //This is for the picture to loop around the y-axis
      {
        source=getPixel(i,j);
        destination=getPixel(getWidth()-1-i,j);
        tempColor = destination.getColor();
        temp.setColor(source.getColor());
        source.setColor(tempColor);
        destination.setColor(temp.getColor());
        
      }
    }
    
  }
  
  /**Vertical flip method
    * This method is basically like mirroring horizontally where the axis is at the edge of the picture. In this method, it will
    * the calling object vertically with the use of for loops.
    */
  public void flipVertical()
  {
    Color tempColor;
    
    int limit1 = this.getWidth();
    int limit2 = this.getHeight();
    Pixel temp=new Pixel(new Picture(),0,0);
    Pixel source,destination;
    
    for(int j = 0; j < limit2/2; j++) //As it is flipping around the vertical axis, we are dividing the the picture through a 
      //vertical line
    {
      for(int i = 0; i < limit1; i++)  //This is for the picture to loop around the x-axis
      {
        
        source=getPixel(i,j);
        destination=getPixel(i,getHeight()-1-j);
        tempColor = destination.getColor();
        temp.setColor(source.getColor());
        source.setColor(tempColor);
        destination.setColor(temp.getColor());
        
      }
    } 
  }
  
  /**
   * Grayscale method
   * this method takes each pixel value of RGB and takes an average of it and sets it the value of each component and turning the 
   * picture into black and white and each pixel into gray.
   */
  public void grayscale()
  {
    Pixel[] pixelArray=this.getPixels();
    Pixel pixelObj;
    int i=0;
    while (i<pixelArray.length)  //loop to cover the entire picture.
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
    * it takes the three images created by the methods: grayscale,flipHorizontal and flipVertical and makes 
    * a collage of width*3 as all the images are same. It makes the collage on a canvas which is created in the PSA4A.java
    */ 
  
  public void collage(Picture [] pictures)
  {
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for(int i = 0; i < pictures.length; i++) //it goes through all the pictures in the picture array
    {
      for(int sourceX = 0, targetX = i*getWidth()/3; sourceX< this.getWidth()/3;sourceX++,targetX++)  //it takes the picture and 
        //copies it the to canvas.this loop defines the x-coourdinate of the collage-canvas.
      {
        for(int sourceY = 0, targetY=0; sourceY< this.getHeight();sourceY++,targetY++) //copies the pictures to the canvas.This loop 
          //defines the y-coordinate of the collage-canvas.
        {
          sourcePixel=pictures[i].getPixel(sourceX,sourceY);
          targetPixel = this.getPixel(targetX,targetY);
          targetPixel.setColor(sourcePixel.getColor());
        }
      }
    }
  }
  
  /*FlipVertical: this method flips a small rectangle of width width and height height vertically of the calling image.
   */ 
  
  
  public void flipVerticalRectangle(int x, int y, int width, int height)
  {
    Color tempColor;
    
    int limit1 = width;
    int limit2 = height;
    Pixel temp=new Pixel(new Picture(),0,0);
    Pixel source,destination;
    
    for(int j=0; j < limit2/2; j++) //it is to loop around the y axis and the limit2 makes the loop stop half way through the axis.
    {
      for(int i=0; i < limit1; i++) //it is to loop aorund the x-axis. Limit 1 is the width of the rectangle to be flipped.
      {
        //FILL THIS OUT AND THEN UNCOMMENT IT!
        source=getPixel(x+i,y-j);
        destination=getPixel(x+i,j+y-height+1);
        tempColor = destination.getColor();
        temp.setColor(source.getColor());
        source.setColor(tempColor);
        destination.setColor(temp.getColor());
        
      }
    } 
  }
  
  /*FlipHorizontal: this method flips a small rectangle of width width and height height horizonatlly of the calling image.
   */ 
  public Picture flipHorizontalSquare(int x, int y, int size)
  {
    Picture copy=new Picture(this);
    
    int sizeX=0;
    int sizeY=0;
    Color tempColor;
    
    if (size+x>this.getWidth())
    {
      sizeX=this.getWidth()-x;
      sizeY=size;
    }
   
    if (size-y<0)
    {
      sizeY=0+y;
      sizeX=size;
      
    }
    
    
    int limit1 = ((sizeX/2) +x);
    int limit2=sizeY-y;
    
    Pixel temp=new Pixel(new Picture(),0,0);
    Pixel source,destination;
    
    for(int j=0; j < limit2; j++) //it is to loop around the y axis and the limit2 makes the loop around the height of the rectangle.
    {
      for(int i=0; i < limit1; i++)  //it is to loop around the x axis and the limit1 makes the loop stop half way through the axis.
      {
        
        source=copy.getPixel(x+i,y-j);
        destination=copy.getPixel(x-i+sizeX-1,y-j);
        tempColor = destination.getColor();
        temp.setColor(source.getColor());
        source.setColor(tempColor);
        destination.setColor(temp.getColor());
        
        //System.out.println((x+i) + " " + (y-j) + " " + (x-i+sizeX-1) + " " + (y-j));
      }
    }
    return copy;
  }
  
  
}