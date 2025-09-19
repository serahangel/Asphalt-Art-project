import org.code.neighborhood.*;
public class pot extends PainterPlus {

  public void goToStart() {
    turnRight();
        moveFast();     
    turnLeft();
    move();
    move();
    move();
    move();
   turnLeft();
    move();
   
      
    }
 public void drawPotOutline() {
        setPaint(100);
        turnRight();
   paint("black");
   move();
   paint("black");
   move();
   paint("black");
   move();
   paint("black");
   move();

   turnLeft();
   move();
   paint("black");
   move();
   paint("black");
   move();



   turnRight();
     move();
   paint("black");
  turnLeft();
   turnLeft();
   move();
   paint("black");
   move();
   paint("black");
   move();
   paint("black");
   move();
   paint("black");
   move();
   paint("black");
   move();
   paint("black");
   move();
   paint("black");

   turnLeft();
   move();
   turnLeft();
   move();
   paint("black");
   turnRight();
    move();
   paint("black");
   
  
 


    }

public void paintPot() {
 turnLeft();
  move();
  move();
  paint("sienna");
   move();
  paint("sienna");
   move();
  paint("sienna");
  turnLeft();
   move();
  paint("sienna");
  turnLeft();
   move();
  paint("sienna");
   move();
  paint("sienna");

  turnLeft();
  move();
  move();
  
  turnLeft();
  move();
  move();
  move();
  
  paint("sienna");
  move();
  turnLeft();
  move();
  paint("sienna");
  move();
  paint("sienna");

  turnRight();
  move();
  turnLeft();
  move();
  paint("sienna");
  
  
 while(canMove()){
      move();
 }
  
  turnLeft();
    while(canMove()){
      move();
}
  turnLeft();
   while(canMove()){
      move();
}
}
}