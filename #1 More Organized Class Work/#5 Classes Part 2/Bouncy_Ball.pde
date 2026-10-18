/**
*@James McGuigan
*/
class Ball 
{
  int x;
  int y;
  int xVel;
  int yVel;
  int diameter;
  
  Ball(int x, int y, int diameter, int xVel, int yVel) 
  {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
    this.xVel = xVel;
    this.yVel = yVel;
  }

  void update() 
  {
    x += xVel;
    y += yVel;

    if (x - diameter < 0 || x + diameter > width) 
    {
      xVel *= -1; 
      xVel += int(random(-3, 4)); 
    }
    if (y - diameter < 0 || y + diameter > height) 
    {
      yVel *= -1; 
      yVel += int(random(-3, 4)); 
    }
  }

  void display() 
  {
    noFill();
    ellipse(x, y, diameter + 10, diameter + 10);
  }
}

Ball ball;

void setup() 
{
  size(700, 600);
  ball = new Ball(200, 200, 20, int(random(1, 20)), int(random(1, 20)));
}

void draw() 
{
  background(255);
  ball.update();
  ball.display();
}
