int numDrops = 100;
float[] dropX = new float[numDrops];
float[] dropY = new float[numDrops];
float[] dropSpeed = new float[numDrops];
color[] dropColors = new color[numDrops];

void setup() {
  size(800, 600);
  smooth();
  
  // Initialize arrays
  for (int i = 0; i < numDrops; i++) {
    dropX[i] = random(width);
    dropY[i] = random(height);
    dropSpeed[i] = random(1, 5);
    dropColors[i] = color(random(255), random(255), random(255));
  }
}

void draw() {
  background(0);
  
  for (int i = 0; i < numDrops; i++) {
    // Update drop position
    dropY[i] += dropSpeed[i];
    
    // Check if drop reaches the bottom
    if (dropY[i] > height) {
      dropY[i] = 0;
    }
    
    // Draw drop
    drawDrop(dropX[i], dropY[i], dropColors[i]);
  }
}

void drawDrop(float x, float y, color c) {
  noStroke();
  fill(c);
  ellipse(x, y, 20, 20);
}
