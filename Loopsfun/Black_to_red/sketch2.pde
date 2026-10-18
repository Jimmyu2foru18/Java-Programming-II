

void setup2()
{
  size(600, 600);
  frameRate(60);
}

void draw2()
{
  background(255);
  
  for (int x =0;x<width;x+=2)
  {
    for (int y = 0; y<height; y+=2)
    {
      float r = map(x,0,width,0,255);
      fill( r, 0,0);
      rect(x,y,2,2);
    }
  }
}
