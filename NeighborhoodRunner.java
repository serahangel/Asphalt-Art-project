import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

paintBackground serah= new paintBackground();
    pot serah1= new pot();
leaves serah2=new leaves();
    
serah.background("CornSilk");
    serah1.goToStart();
    serah1.drawPotOutline();
    serah1.paintPot();
    serah2.startofStem();
    serah2.paintStem();
    serah2.colorLeaves();
  }
}