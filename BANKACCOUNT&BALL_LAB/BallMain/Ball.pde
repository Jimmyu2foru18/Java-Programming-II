class Ball {
  float xPos, yPos;
  float xVel, yVel;
  int diameter;
  color ballColor;

  Ball(float x, float y, float vx, float vy, int d, color c) {
    xPos = x;
    yPos = y;
    xVel = vx;
    yVel = vy;
    diameter = d;
    ballColor = c;
  }

  void update(int canvasWidth, int canvasHeight) {
    // Update the position
    xPos += xVel;
    yPos += yVel;

    // Check for collisions with canvas boundaries
    if (xPos < diameter / 2 || xPos > canvasWidth - diameter / 2) {
      xVel *= -1;
    }

    if (yPos < diameter / 2 || yPos > canvasHeight - diameter / 2) {
      yVel *= -1;
    }
  }

  void display() {
    fill(ballColor);
    ellipse(xPos, yPos, diameter, diameter);
  }
}
