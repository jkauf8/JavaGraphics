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

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
       bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );
      //house
      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
      //roof 
      window.setColor(Color.BLACK);

      window.fillRect( 170, 150, 450, 80 );
      //windows
      window.setColor(Color.YELLOW);

      window.fillRect( 250, 300, 80, 80 );
      
      window.setColor(Color.YELLOW);

      window.fillRect( 480, 300, 80, 80 );
      //door
      window.setColor(Color.WHITE);

      window.fillRect( 365, 450, 80, 150 );
      

   }
}