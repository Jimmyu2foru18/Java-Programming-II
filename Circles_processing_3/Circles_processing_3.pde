//ellipse(xcenter,ycenter,xdiameter,ydiameter)

void setup()
{
  size(800,800);
  //runs once the program starts
  System.out.println("hi, im in setup!");
   System.out.println(width);
   System.out.println(height);
}
  
 void draw()

    //runs 60 fps
 {
    ellipse((width/2)-200,height/2,100,100);
    ellipse((width/2)-100,height/2,100,100);
    ellipse((width/2),height/2,100,100);
    ellipse((width/2)+100,height/2,100,100);
    ellipse((width/2)+200,height/2,100,100);

   
    
    System.out.println("bye, im in draw!");
    System.out.println(width);
    System.out.println(height);
    
 }
  
  
 