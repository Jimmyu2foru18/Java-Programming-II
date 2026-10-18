/**
*@author James McGuigan
*CS 5210 Programming 2
*/

int XVal;
int YVal;
int resolution = 10;

int[][] cells;
int[][] nextCells;
int frameRateValue = 5;

void setup() {
  size(200, 200);
  calculateCellCounts();

  cells = new int[XVal][YVal];
  nextCells = new int[XVal][YVal];
  initializeCells();
  frameRate(60);
}

void draw() {
  background(255);
  drawCells(cells);
  updateCells();
}

void calculateCellCounts() {
  XVal = floor(width / resolution);
  YVal = floor(height / resolution);
}

void initializeCells() {

  for (int i = 0; i < XVal; i++) {
    for (int j = 0; j < YVal; j++) {
      cells[i][j] = (int) random(2);
    }
  }
}

void drawCells(int[][] cells) {
  for (int i = 0; i < XVal; i++) {
    for (int j = 0; j < YVal; j++) {
      float x = i * resolution;
      float y = j * resolution;
      fill(cells[i][j] * color(255));
      rect(x, y, resolution, resolution);
    }
  }
}

void updateCells() {

  for (int i = 0; i < XVal; i++) {
    for (int j = 0; j < YVal; j++) {
      int state = cells[i][j];
      int neighbors = countNeighbors(cells, i, j);
      int nextState = state;

      if (state == 0) {
        if (neighbors == 3) {
          nextState = 1;
        }
      } else {
        if (neighbors < 2 || neighbors > 3) {
          nextState = 0;
        }
      }

      nextCells[i][j] = nextState;
    }
  }

  int[][] temp = cells;
  cells = nextCells;
  nextCells = temp;
}

int countNeighbors(int[][] cells, int x, int y) {
  int sum = 0;
  for (int i = -1; i <= 1; i++) {
    for (int j = -1; j <= 1; j++) {
      int XPos = (x + i + XVal) % XVal;
      int YPos = (y + j + YVal) % YVal;
      sum += cells[XPos][YPos];
    }
  }
  sum -= cells[x][y];
  return sum;
}
