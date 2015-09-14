import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 //declare bacteria variables here  
 Bacteria duck, raven, fox, wolf, bear;

 public void setup()   
 {     
 	//initialize bacteria variables here   
 	size(400, 400);
 	duck = new Bacteria();
 	raven = new Bacteria();
 	fox = new Bacteria();
 	wolf = new Bacteria();
 	bear = new Bacteria();
 }   

 public void draw()   
 {    
 	//move and show the bacteria  
 	background(255);
 	duck.show();
 	duck.walk(); 
 	raven.show();
 	raven.walk();
 	fox.show();
 	fox.walk();  
 	wolf.show();
 	wolf.walk();
 	bear.show();
 	bear.walk();  
 }  

 class Bacteria    
 {     
 	int myX, myY, colors;
 	Bacteria()
 	{
 		myX = 200;
 		myY = 200;
 		colors = color(0, 191, 255);
 	}
 	public void walk()
 	{
 		myX = myX + (int) (Math.random()*3)-1;
 		myY = myY + (int) (Math.random()*3)-1;
 	}
 	public void show()
 	{
 		fill(colors);
 		ellipse(myX, myY, 15, 15);
 	}   
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
