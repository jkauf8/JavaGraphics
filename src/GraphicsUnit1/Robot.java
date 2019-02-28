package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      
      //call other methods
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      
      window.setColor(Color.BLACK);
      window.fillOval(330, 120, 30, 30);
      window.fillOval(440, 120, 30, 30);
      
      window.setColor(Color.BLUE);
      window.fillOval(380, 150, 30, 10);
      
      window.setColor(Color.RED);
      window.fillOval(366, 170, 70, 20);
      
				
   }

   public void upperBody( Graphics window )
   {
      window.setColor(Color.GREEN);
      window.fillRect( 340, 230, 120, 90 );
      
      window.setColor(Color.DARK_GRAY);
      window.drawLine(340,230,200,200);
      window.drawLine(459,230,500,100);
      
   }

   public void lowerBody( Graphics window )
   {
      window.setColor(Color.PINK);
      window.fillRect( 340, 340, 120, 90 );
      
      window.setColor(Color.DARK_GRAY);
      window.drawLine(459,430,500,500);
      window.drawLine(340, 428, 300, 500);

   }
}