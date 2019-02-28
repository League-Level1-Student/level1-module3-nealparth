int x= 250;
int y= 250;
int birdvelocity= 30;
int gravity=1;
void setup(){
  size(500,500);
  
  
}






void draw(){
  
  background(20,152,216);
  fill(209,191,242);
  stroke(17,242,52);
  ellipse(x,y,50,50);
  y+=20;
  x+=20;
 
  y+=gravity;
  
  
  
  
  
  
  
  
  
  
  
  
  
}