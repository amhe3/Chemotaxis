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
 int pop = 5;
 Bacteria [] colony = new Bacteria[pop]; //make "rooms"

 public void setup()   
 {     
 	//initialize bacteria variables here   
 	size(400, 400);
 	frameRate(30);
 	for(int make = 0; make < colony.length; make++) //make bacteria
 	{
 		colony[make] = new Bacteria();
 	}
 }   

 public void draw()   
 {    
 	//move and show the bacteria  
 	background(255);
 	for(int num = 0; num < colony.length; num++) //show
 	{
 		colony[num].walk();
 		colony[num].show();
 	}
 	
	/*int addSub = (int)(Math.random()*51);
 	if(addSub == 25)
 	{
 		pop++; //population increase
 		redraw();
 	}
 	else if(addSub == 50) 
 	{
 		pop--; //population decrease
 		redraw();
 	}

 	fill(0);
 	textSize(20);
 	text("Population: " + pop, 2, 21);*/
 }  

 class Bacteria    
 {     
 	int myX, myY, colors, addSub;
 	Bacteria()
 	{
 		myX = 200;
 		myY = 200;
 		colors = color((int)(Math.random()*113)+112, (int)(Math.random()*113)+112, (int)(Math.random()*113)+112);
 		
 	}
 	public void walk()
 	{
 		myX = myX + (int) (Math.random()*5)-2;
 		myY = myY + (int) (Math.random()*5)-2;
 		if(get(myX+10, myY+10) != color(255, 255, 255))
 		{
 			myX = myX + (int) (Math.random()*3)-2; //go left
 			myY = myY + (int) (Math.random()*3)-2; //go up
 		}
 		if(get(myX-10, myY-10) != color(255, 255, 255))
 		{
 			myX = myX + (int) (Math.random()*3); //go right
 			myY = myY + (int) (Math.random()*3); //go down
 		}
 	}
 	public void show()
 	{
 		fill(colors);
 		ellipse(myX, myY, 10, 10);
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
