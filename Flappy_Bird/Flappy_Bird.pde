int x= 500;
int y= 250;
int z= 50;
int w= 50;

int birdvelocity= 30;
int b=  y+birdvelocity;
int gravity=1;
void setup(){
  size(500,500);
 
  
}






void draw(){
  
  background(20,152,216);
  fill(209,191,242);
  stroke(17,242,52);
  ellipse(150,y,w,z);
   y+=gravity;

  

 
  fill(222,27,27);
  x-=10;
  
  
 rect(x,250,10,250);
 
  
}

 

 
  

  
  
  
  
  
  
  

 void mousePressed(){
    y-=50;
    
    

 }
  