 //declare bacteria variables here  
 Bacteria [] colony = new Bacteria[100];

 void setup()   
 {     
 	//initialize bacteria variables here   
 	size(400, 400);
 	for(int room = 0; room < colony.length; room++)
 	{
 		colony[room] = new Bacteria();
 	}
 }   

 void draw()   
 {    
 	//move and show the bacteria  
 	background(255);
 	for(int num = 0; num < colony.length; num++)
 	{
 		//colony[num] = new Bacterica(num);
 		//colors = color() HERE!!!
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
 	void walk()
 	{
 		myX = myX + (int) (Math.random()*5)-2;
 		myY = myY + (int) (Math.random()*5)-2;
 	}
 	void show()
 	{
 		stroke(255);
 		fill(colors);
 		ellipse(myX, myY, 10, 10);
 		//point(myX, myY, 5, 5);
 	}   
 }    