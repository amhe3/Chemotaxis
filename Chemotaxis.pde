 //declare bacteria variables here  
 int pop = 5;
 Bacteria [] colony = new Bacteria[pop]; //make "rooms"

 void setup()   
 {     
 	//initialize bacteria variables here   
 	size(400, 400);
 	frameRate(30);
 	for(int make = 0; make < colony.length; make++) //make bacteria
 	{
 		colony[make] = new Bacteria();
 	}
 }   

 void draw()   
 {    
 	//move and show the bacteria  
 	background(255);
 	for(int foodY = 75; foodY < 400; foodY += 250 ) //food
 	{
 		for(int foodX = 75; foodX < 400; foodX += 250)
 		{
 			fill(0);
 			ellipse(foodX, foodY, 15, 15);
 		}
 	}
 	
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
 	int myX, myY, colors, addSub, speed;
 	Bacteria()
 	{
 		myX = 200;
 		myY = 200;
 		colors = color((int)(Math.random()*113)+112, (int)(Math.random()*113)+112, (int)(Math.random()*113)+112);
 		speed = 2; // for biased walk
 	}
 	void walk()
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
 	void show()
 	{
 		fill(colors);
 		ellipse(myX, myY, 10, 10);
 	}
 }    