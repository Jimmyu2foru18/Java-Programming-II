void setup() {
  size(500, 600);
  background(255);
  noLoop();  // Draws the pattern only once
}

void draw() {
  int circleRadius = 10;
  int interval = 20;
  
  for (int x = circleRadius; x < width; x += interval) {
    for (int y = circleRadius; y < height; y += interval) {
      ellipse(x, y, circleRadius * 2, circleRadius * 2);
    }
  }
}
