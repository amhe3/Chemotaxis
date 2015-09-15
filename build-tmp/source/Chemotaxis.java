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
 Bacteria [] colony = new Bacteria[100];

 public void setup()   
 {     
 	//initialize bacteria variables here   
 	size(400, 400);
 	for(int room = 0; room < colony.length; room++)
 	{
 		colony[room] = new Bacteria();
 	}
 }   

 public void draw()   
 {    
 	//move and show the bacteria  
 	background(255);
 	for(int num = 0; num < colony.length; num++)
 	{
 		//colony[num] = new Bacterica(num);
 		colony[num].walk();
 		colony[num].show();
 	}
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
 		myX = myX + (int) (Math.random()*5)-2;
 		myY = myY + (int) (Math.random()*5)-2;
 	}
 	public void show()
 	{
 		stroke(255);
 		fill(colors);
 		ellipse(myX, myY, 10, 10);
 		//point(myX, myY, 5, 5);
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
