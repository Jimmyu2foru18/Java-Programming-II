//James McGuigan
void setup()
{
  size(256, 256);
  frameRate(60);
  
    for (int x =0;x<width;x++)
  {
    for (int y = 0; y<height; y++)
    {
      float r = random(256);
      float g = random(256);
      float b = random(256);
      set(y,x,color(r,g,b));
    }
  //  set (x,y,color(255,0,0))
    
}
}
void draw()
{
  //background(255);
  
  //for (int x =0;x<width;x+=2)
  //{
    //for (int y = 0; y<height; y+=2)
    //{
      //float r = map(x,0,width,0,255);
      //fill( r, 0,0);
      //rect(y,x,2,2);
    //}
  //}
}
