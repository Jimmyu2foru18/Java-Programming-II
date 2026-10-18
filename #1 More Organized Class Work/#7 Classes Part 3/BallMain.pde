Ball ball1, ball2, ball3, ball4, ball5;

void setup() {
  size(800, 800);
  frameRate(60);

  // Create and initialize the balls
  ball1 = new Ball(random(width), random(height), random(-10, 10), random(-5, 5), 50, color(random(255), random(255), random(255)));
  ball2 = new Ball(random(width), random(height), random(-10, 10), random(-5, 5), 125, color(random(255), random(255), random(255)));
  ball3 = new Ball(random(width), random(height), random(-10, 10), random(-5, 5), 70, color(random(255), random(255), random(255)));
  ball4 = new Ball(random(width), random(height), random(-10, 10), random(-5, 5), 55, color(random(255), random(255), random(255)));
  ball5 = new Ball(random(width), random(height), random(-10, 10), random(-5, 5), 40, color(random(255), random(255), random(255)));
}

void draw() {
  background(255);

  // Update and display all the balls
  ball1.update(width, height);
  ball2.update(width, height);
  ball3.update(width, height);
  ball4.update(width, height);
  ball5.update(width, height);

  ball1.display();
  ball2.display();
  ball3.display();
  ball4.display();
  ball5.display();
}
