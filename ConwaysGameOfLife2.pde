/**
 *@author James McGuigan
 *CS 5210 Programming 2
 */
int numColumns;
int numRows;
int resolution = 10;

int[][] cells;
int[][] nextCells;


void setup() {
  size(200, 200);
  calculateCellCounts();

  cells = new int[numColumns][numRows];
  nextCells = new int[numColumns][numRows];
  initializeCells();
  frameRate(10);
}

void draw() {
  background(255);
  drawCells(cells);
  updateCells();
}

void calculateCellCounts() {
  // Calculate the number of columns and rows based on resolution
  numColumns = floor(width / resolution);
  numRows = floor(height / resolution);
}

void initializeCells() {
  // Initialize cells with random values
  for (int i = 0; i < numColumns; i++) {
    for (int j = 0; j < numRows; j++) {
      cells[i][j] = (int) random(2);
    }
  }
}

void drawCells(int[][] cells) {
  // Draw cells on the canvas
  for (int i = 0; i < numColumns; i++) {
    for (int j = 0; j < numRows; j++) {
      float x = i * resolution;
      float y = j * resolution;
      fill(cells[i][j] * color(255));
      rect(x, y, resolution, resolution);
    }
  }
}

void updateCells() {
  // Update cells based on Conway's Game of Life rules
  for (int i = 0; i < numColumns; i++) {
    for (int j = 0; j < numRows; j++) {
      int state = cells[i][j];
      int neighbors = countNeighbors(cells, i, j);
      int nextState = state;

      if (state == 0) {
        // Rule for dead cells
        if (neighbors == 3) {
          nextState = 1;
        }
      } else {
        // Rule for live cells
        if (neighbors < 2 || neighbors > 3) {
          nextState = 0;
        }
      }

      // Update the next state of the cell
      nextCells[i][j] = nextState;
    }
  }

  // Copy the next state to the current state
  arrayCopy(nextCells, cells);
}

int countNeighbors(int[][] cells, int x, int y) {
  int sum = 0;

  // Define relative positions of neighbors using x and y offsets
  int[] xOffset = {-1, -1, -1, 0, 0, 1, 1, 1};
  int[] yOffset = {-1, 0, 1, -1, 1, -1, 0, 1};

  // Iterate over the neighbors
  for (int i = 0; i < xOffset.length; i++) {
    // Calculate neighbor coordinates
    int neighborX = (x + xOffset[i] + numColumns) % numColumns;
    int neighborY = (y + yOffset[i] + numRows) % numRows;

    // Add the value of the neighbor cell to the sum
    sum += cells[neighborX][neighborY];
  }

  // Subtract the cell's own state as it was added in the loop
  sum -= cells[x][y];

  return sum;
}
