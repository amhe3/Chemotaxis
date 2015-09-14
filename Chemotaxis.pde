 //declare bacteria variables here  
 Bacteria duck, raven, fox, wolf, bear;

 void setup()   
 {     
 	//initialize bacteria variables here   
 	size(400, 400);
 	duck = new Bacteria();
 	raven = new Bacteria();
 	fox = new Bacteria();
 	wolf = new Bacteria();
 	bear = new Bacteria();
 }   

 void draw()   
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
 	void walk()
 	{
 		myX = myX + (int) (Math.random()*3)-1;
 		myY = myY + (int) (Math.random()*3)-1;
 	}
 	void show()
 	{
 		fill(colors);
 		ellipse(myX, myY, 15, 15);
 	}   
 }    