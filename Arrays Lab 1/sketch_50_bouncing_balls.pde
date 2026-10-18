/**
 *@author James McGuigan
 * 50 bouncing balls
 */
Ball[] balls = new Ball[50];

void setup() {
  size(800, 500);
  background(255);

  for (int i = 0; i < balls.length; i++) {
    float ballSize = random(10, 40);
    balls[i] = new Ball(random(width), random(height), random(2, 5), random(2, 5), ballSize);
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

  Ball(float x, float y, float dx, float dy, float size) {
    this.x = x;
    this.y = y;
    this.dx = dx;
    this.dy = dy;
    this.size = size;
    this.c = color(random(255), random(255), random(255));
  }

  void move() {
    x += dx;
    y += dy;

    if (x - size / 2 < 0 || x + size / 2 > width) {
      dx *= -1;
      x = constrain(x, size / 2, width - size / 2);
      c = color(random(255), random(255), random(255));
    }

    if (y - size / 2 < 0 || y + size / 2 > height) {
      dy *= -1;
      y = constrain(y, size / 2, height - size / 2);
      c = color(random(255), random(255), random(255));
    }
  }

  void display() {
    noStroke();
    fill(c);
    ellipse(x, y, size, size);
  }
}
