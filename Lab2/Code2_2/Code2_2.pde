
int xVel;
int yVel;
int speed; 
int gravity;

void setup() 
{
 size(600,500);
 xVel = 0;
 yVel = 0;
 speed = 10;
 gravity = 10;
}

void draw() 
{
  background(255);
  fill(200);
  ellipse(xVel,yVel,30,30);
  
   yVel = yVel + gravity;
   xVel = xVel + speed;
   
  if(yVel+15 > height)
  {
    gravity= -10;
  }
  if(yVel-15 < 0)
  {
    gravity= 10;
  }
  //corrected for ball side hitting wall
  if(xVel+15 > width)
  {
    speed= -10;
  }
  if(xVel-15 < 0)
  {
    speed= 10;
  }
}
