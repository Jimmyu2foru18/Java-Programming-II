//ellipse(xcenter,ycenter,xdiameter,ydiameter)

int x;

void setup()
{
  size(800,800);
  //runs once the program starts
  System.out.println("hi, im in setup!");
   System.out.println(width);
   System.out.println(height);
   x=100;
}
  
 void draw()

    //runs 60 fps
 {
    background(114);
    x=x+1;
    ellipse(x,height/2,100,100);
    ellipse(10+x+100,height/2,100,100);
    ellipse(20+x+200,height/2,100,100);
    ellipse(30+x+300,height/2,100,100);
    ellipse(40+x+400,height/2,100,100);
    

    ellipse(10-x+100,height/2,50,50);
    ellipse(20-x+200,height/2,50,50);
    ellipse(30-x+300,height/2,50,50);
    ellipse(40-x+400,height/2,50,50);
    
    
    ellipse(x,height/4,100,100);
    ellipse(10+x+100,height/4,100,100);
    ellipse(20+x+200,height/4,100,100);
    ellipse(30+x+300,height/4,100,100);
    ellipse(40+x+400,height/4,100,100);
    
    ellipse(10-x+100,height/4,50,50);
    ellipse(20-x+200,height/4,50,50);
    ellipse(30-x+300,height/4,50,50);
    ellipse(40-x+400,height/4,50,50);
  

   
    
    System.out.println("bye, im in draw!");
    System.out.println(width);
    System.out.println(height);
    
 }
  
  
 