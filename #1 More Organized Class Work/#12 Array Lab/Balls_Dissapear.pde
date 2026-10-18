/**
 *@author James McGuigan
 * 50 white balls
 * auto format "ctrl T"
 */

Ball[] balls = new Ball[50];

void setup() {
  size(800, 500);
  background(255);

  for (int i = 0; i < balls.length; i++) {
    float ballSize = random(10, 40);
    color initialColor = color(random(255), random(255), random(255));
    balls[i] = new Ball(random(width), random(height), random(2, 5), random(2, 5), ballSize, initialColor);
  }
}

void draw() {
  background(255);

  for (Ball ball : balls) {
    ball.move();
    ball.display();
  }
}

class Ball {
  float x, y;
  float dx, dy;
  float size;
  color c;
  int colorChange;

  Ball(float x, float y, float dx, float dy, float size, color initialColor) {
    this.x = x;
    this.y = y;
    this.dx = dx;
    this.dy = dy;
    this.size = size;
    this.c = initialColor;
    this.colorChange = 1;
  }

  void move() {
    x += dx;
    y += dy;

    if (x - size / 2 < 0 || x + size / 2 > width) {
      dx *= -1;
      x = constrain(x, size / 2, width - size / 2);
      updateColor();
    }

    if (y - size / 2 < 0 || y + size / 2 > height) {
      dy *= -1;
      y = constrain(y, size / 2, height - size / 2);
      updateColor();
    }
  }

  void updateColor() {
    colorChange += 1;
    float newRed = red(c) + colorChange;
    float newGreen = green(c) + colorChange;
    float newBlue = blue(c) + colorChange;
    c = color(constrain(newRed, 0, 255), constrain(newGreen, 0, 255), constrain(newBlue, 0, 255));
  }

  void display() {
    noStroke();
    fill(c);
    ellipse(x, y, size, size);
  }
}
