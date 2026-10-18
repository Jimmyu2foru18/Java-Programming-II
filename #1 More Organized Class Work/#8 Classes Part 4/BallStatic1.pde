/**
 * @author Jimmy McGuigan
 * CS 2510 Programming 2
 * Lab Static/Final
 */
int redColor;
int greenColor;
int blueColor;

Ball Ball1,Ball2,Ball3,Ball4,Ball5;

void setup() 
{
  size(600, 400);
  redColor = color(255, 0, 0);
  greenColor = color(0, 255, 0);
  blueColor = color(0, 0, 255);
  Ball1 = new Ball(50, width / 2, height / 2);
    Ball2 = new Ball(50, width / 2, height / 2);
      Ball3 = new Ball(50, width / 2, height / 2);
        Ball4 = new Ball(50, width / 2, height / 2);
          Ball5 = new Ball(50, width / 2, height / 2);
}

void draw() {
  background(greenColor);
  Ball1.move();
  Ball1.display();
    Ball2.move();
  Ball2.display();
    Ball3.move();
  Ball3.display();
    Ball4.move();
  Ball4.display();
    Ball5.move();
  Ball5.display();

}

class Ball {
  private final int ballSize;
  private float x, y;
  private float xSpeed, ySpeed;

  Ball(int size, float startX, float startY) 
  {
    ballSize = size;
    x = startX;
    y = startY;
    xSpeed = random(-5, 5);
    ySpeed = random(-5, 5);
  }

  int getBallSize() 
  {
    return ballSize;
  }

  void move() 
  {
    x += xSpeed;
    y += ySpeed;


    if (x > width - ballSize / 2 || x < ballSize / 2) 
    {
      xSpeed *= -1; 
    }
    
    if (y > height - ballSize / 2 || y < ballSize / 2) 
    {
      ySpeed *= -1; 
    }
  }

  void display() 
  {
    fill(redColor);
    ellipse(x, y, ballSize, ballSize);
  }
}
