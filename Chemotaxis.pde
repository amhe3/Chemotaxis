 //declare bacteria variables here  
Bacteria [] colony = new Bacteria[100]; //make "rooms"

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
   for(int num = 0; num < colony.length; num++) //show
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
     if(myX < mouseX)
     {
        myX = myX + (int) (Math.random()*5)+1; //move right
        myY = myY + (int) (Math.random()*5)-2;
     } else
     if(myX > mouseX)
     {
        myX = myX + (int) (Math.random()*5)-5; //move left
        myY = myY + (int) (Math.random()*5)-2;
     } else
     if(myY < mouseY)
     {
        myY = myY + (int) (Math.random()*10)+1; //move down
        myX = myX + (int) (Math.random()*100)-50;
     } else
     if(myY > mouseY)
     {
        myY = myY + (int) (Math.random()*10)-10; //move up
        myX = myX + (int) (Math.random()*100)-50;
     } /*else
     if(myX < mouseX && myY < mouseY)
     {
        myX = myX + (int) (Math.random()*5)+1; //move diagonally down right
        myY = myY + (int) (Math.random()*5)+1;
     } else
     if(myX > mouseX && myY > mouseY)
     {
        myX = myX + (int) (Math.random()*5)-5; //move diagonally up left
        myY = myY + (int) (Math.random()*5)-5;
     }else
     if(myX < mouseX && myY > mouseY)
     {
        myX = myX + (int) (Math.random()*5)+1; //move diagonally up right
        myY = myY + (int) (Math.random()*5)-5;
     } else
     if(myX > mouseX && myY < mouseY)
     {
        myX = myX + (int) (Math.random()*5)-5; //move diagonally down left
        myY = myY + (int) (Math.random()*5)+1;
     }*/
   }
   
   void show()
   {
       noStroke();
       fill(colors);
       ellipse(myX, myY, 10, 10);
   }
 }    