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
int pop = 100;
int predatorX = 10;
int predatorY = 10;

 Bacteria [] colony = new Bacteria[pop]; //make "rooms"

 public void setup()   
 {     
 	//initialize bacteria variables here   
 	size(400, 400);
 	//frameRate(30);
 	for(int make = 0; make < colony.length; make++) //make bacteria
 	{
 		colony[make] = new Bacteria();
 	}

 }   

 public void draw()   
 {    
 	//move and show the bacteria  
 	background(255);
 	/*for(int foodY = 75; foodY < 400; foodY += 250 ) //food
 	{
 		for(int foodX = 75; foodX < 400; foodX += 250)
 		{
 			fill(0);
 			ellipse(foodX, foodY, 15, 15);
 		}
 	}*/
 	
 	for(int num = 0; num < colony.length; num++) //show
 	{
 		colony[num].walk();
 		colony[num].show();
 		colony[1].food();
 	}
 	stroke(0);
 	fill(255, 0, 0);
	ellipse(predatorX, predatorY, 15, 15);
//predator();
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

public void keyPressed()
{
	if(key == CODED)
	{
		if(keyCode == UP)
		{
			predatorY-=5;
			//make shark go up
		}
		else if(keyCode == DOWN)
		{
			predatorY+=5;
			//make shark go down
		}
		else if(keyCode == RIGHT)
		{
			predatorX+=5;
			//make shark go right and face right
		}
		else if(keyCode == LEFT)
		{
			predatorX-=5;
			//make shark go left and face left
		}

	}
}

 class Bacteria    
 {     
 	int myX, myY, colors, addSub, speedX, speedY;
 	Bacteria()
 	{
 		myX = 200;
 		myY = 200;
 		colors = color((int)(Math.random()*113)+112, (int)(Math.random()*113)+112, (int)(Math.random()*113)+112);
 		speedX = 2; // for biased walk
 		speedY = 2; // for biased walk
 	}
 	public void walk()
 	{
 		//(int)(Math.random()*5)
 		//double dRandom = (int)(Math.random()*4);
 		myX = myX + (int) (Math.random()*5)-speedX;
 		myY = myY + (int) (Math.random()*5)-speedY;
 		/*if(get(mouseX, mouseY)) //go to top left food
 		{
 			speedX = 3;
 			speedY = 3;
	 	}	
	 	else if(dRandom == 1) //go to top right food
 		{
 			speedX = 1;
 			speedY = 3;
	 	}
	 	else if(dRandom == 2) //go to bottom left food
 		{
 			speedX = 3;
 			speedY = 1;
	 	}
	 	else if(dRandom == 3) //go to bottom right food
 		{
 			speedX = 1;
 			speedY = 1;
	 	}*/
 	}

 	 public void food()
 	{
 		noStroke();
 		fill(0, 255, 0);
 		ellipse(mouseX-3, mouseY-2, 5, 5);
 		ellipse(mouseX+7, mouseY+6, 5, 5);
 		ellipse(mouseX+6, mouseY-3, 5, 5);
 	}

 	public void show()
 	{
 		noStroke();
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
