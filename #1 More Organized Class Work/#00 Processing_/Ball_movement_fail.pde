// James McGuigan

void setup()
{
  size(600,600);
}

void draw()
{
  background(255);

  int Pos1 = 60;
  int Pos2 = 60;
  int VelA= 5;
  int VelB=5;
  int Diamater = 40;
  

  Pos1=(Pos1+=VelA);
  Pos2=(Pos2+=VelB);

  if (Pos1 - Diamater / 2 < 0 || Pos1 + Diamater / 2 > width)
  {
    VelA *= -1;
  }
  
  if (Pos2 - Diamater / 2 < 0 || Pos2 + Diamater / 2 > height) 
  {
    VelB *= -1;
  }
  
  fill(255,0,0);
  ellipse (Pos1,Pos2,Diamater,Diamater);
  
}