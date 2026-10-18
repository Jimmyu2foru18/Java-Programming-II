//James McGuigan

int ballSize = 20; 
int ballX, ballY; 
float ballSpeedX, ballSpeedY; 
int rectWidth = 20;
int rectHeight = 100; 
int rect1X, rect1Y, rect2X, rect2Y; 
int rectSpeed = 5; 
boolean moveRect1Up, moveRect1Down, moveRect2Up, moveRect2Down; 

void setup() 
{
  size(800, 400); 
  
  ballX = width / 2;
  ballY = height / 2;
  ballSpeedX = random(2, 4);
  ballSpeedY = random(2, 4);
  
  rect1X = 10;
  rect1Y = height / 2 - rectHeight / 2;
  rect2X = width - 10 - rectWidth;
  rect2Y = height / 2 - rectHeight / 2;
}

void draw() 
{
  background(220);
  
  rect(rect1X, rect1Y, rectWidth, rectHeight);
  rect(rect2X, rect2Y, rectWidth, rectHeight);
  
  ballX += ballSpeedX;
  ballY += ballSpeedY;
  

  if (ballX - ballSize / 2 < rect1X + rectWidth && ballX + ballSize / 2 > rect1X && ballY > rect1Y && ballY < rect1Y + rectHeight) 
  {
    ballSpeedX *= -1;
  }
  
  if (ballX - ballSize / 2 < rect2X + rectWidth 
  && ballX + ballSize / 2 > rect2X && ballY > rect2Y 
  && ballY < rect2Y + rectHeight) 
  {
    ballSpeedX *= -1;
  }
  

  if (ballX - ballSize / 2 < 0 || ballX + ballSize / 2 > width)
  {
    ballSpeedX *= -1;
  }
  
  if (ballY - ballSize / 2 < 0 || ballY + ballSize / 2 > height) 
  {
    ballSpeedY *= -1;
  }
  

  ellipse(ballX, ballY, ballSize, ballSize);
  

  if (moveRect1Up && rect1Y > 0)
  {
    rect1Y -= rectSpeed;
  }
  if (moveRect1Down && rect1Y + rectHeight < height) 
  {
    rect1Y += rectSpeed;
  }
  if (moveRect2Up && rect2Y > 0) 
  {
    rect2Y -= rectSpeed;
  }
  if (moveRect2Down && rect2Y + rectHeight < height) 
  {
    rect2Y += rectSpeed;
  }
}


void keyPressed() 
{
  if (key == 'w') 
  {
    moveRect1Up = true;
  }
  if (key == 's') {
    moveRect1Down = true;
  }
  if (key == 'i') {
    moveRect2Up = true;
  }
  if (key == 'k') {
    moveRect2Down = true;
  }
}

// Key release events
void keyReleased() 
{
  if (key == 'w') 
  {
    moveRect1Up = false;
  }
  if (key == 's') {
    moveRect1Down = false;
  }
  if (key == 'i') {
    moveRect2Up = false;
  }
  if (key == 'k') {
    moveRect2Down = false;
  }
}
