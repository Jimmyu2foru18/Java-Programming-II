int yvel;
int xvel;
int speed;
int gravity;

void setup()
{
  size(600,500);
  xvel=0;
  yvel=0;
  speed=2;
  gravity=7;
}

void draw()
{
  background(50,50,250);
  fill(400,200,300);
  ellipse (xvel, yvel, 30, 30);
  
  xvel= xvel + speed;
  yvel= yvel + gravity;
  
  if(xvel+15> width)
  {
    speed = -2;
  }
  if(xvel-15 < 0)
  {
    speed = 2;
  }
  
  if(yvel+15> height)
  {
    gravity = -7;
  }
  if(yvel-15 < 0)
  {
    gravity = 7;
  }
  
}
