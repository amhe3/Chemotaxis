 //declare bacteria variables here  
 Bacteria [] colony = new Bacteria[100];
 void pop = 100;

 void setup()   
 {     
 	//initialize bacteria variables here   
 	size(400, 400);
 	for(int room = 0; room < colony.length; room++)
 	{
 		colony[room] = new Bacteria();
 	}
 	//text("Population: " + pop, 200, 200); HERE!!
 }   

 void draw()   
 {    
 	//move and show the bacteria  
 	background(255);
 	for(int num = 0; num < colony.length; num++)
 	{
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
 		colors = color((int)(Math.random()*113)+112, (int)(Math.random()*113)+112, (int)(Math.random()*113)+112);
 	}
 	void walk()
 	{
 		myX = myX + (int) (Math.random()*5)-2;
 		myY = myY + (int) (Math.random()*5)-2;
 	}
 	void show()
 	{
 		fill(colors);
 		ellipse(myX, myY, 10, 10);
 	}   
 }    