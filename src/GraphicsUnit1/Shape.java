package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
                //finish this constructor
       setShape(x,y,wid,ht,col);
               
   }


   public void draw(Graphics window)
   {
      window.setColor(color);

      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()
      //window.fillRect(300, 300, 90, 90);
      //window.fillOval(320, 290, 50, 110);
      //window.fillOval(290, 320, 110, 50);
      window.fillRect(xPos, yPos, width, height);
      window.setColor(Color.ORANGE);
      window.fillOval(xPos-10, yPos, width+20, height);
      window.setColor(Color.CYAN);
      window.fillOval(xPos+width/4, yPos-height/2, height, width);

   }

   //BONUS
   //add in set and get methods for all instance variables
   public void setShape(int x, int y, int wid, int ht, Color col)
   {
                xPos = x;
                yPos = y;
                width = wid;
                height = ht;
                color = col;
   }

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}