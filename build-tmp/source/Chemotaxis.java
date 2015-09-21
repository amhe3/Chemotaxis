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
 	for(int foodY = 75; foodY < 400; foodY += 250 ) //food
 	{
 		for(int foodX = 75; foodX < 400; foodX += 250)
 		{
 			fill(0);
 			ellipse(foodX, foodY, 15, 15);
 		}
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
 	int myX, myY, colors, addSub, speed;
 	Bacteria()
 	{
 		myX = 200;
 		myY = 200;
 		colors = color((int)(Math.random()*113)+112, (int)(Math.random()*113)+112, (int)(Math.random()*113)+112);
 		speed = 2; // for biased walk
 	}
 	public void walk()
 	{
 		//(int)(Math.random()*5)
 		double dRandom = 0;
 		myX = myX + (int) (Math.random()*5)-speed;
 		myY = myY + (int) (Math.random()*5)-speed;
 		if(dRandom == 0) //go to top left food
 		{
 			speed = 3;
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
