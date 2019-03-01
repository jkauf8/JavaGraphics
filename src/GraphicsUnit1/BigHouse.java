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
      
      //tree
      window.setColor(Color.BLACK);
      window.fillRect( 650, 450, 80, 150 );
      
      window.setColor(Color.GREEN);
      window.fillOval(615, 400, 150, 80);
      
      //seasaw
      window.setColor(Color.RED);
      window.fillRect( 0, 510, 200, 40 );
      window.setColor(Color.DARK_GRAY);
      window.fillRect( 70, 550, 50, 50 );

   }
}