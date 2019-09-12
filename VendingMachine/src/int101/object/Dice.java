package int101.object;
import java.util.Random;



public class Dice {
    private final Random random;
    private int face;

    public Dice() {
        this.random = new Random();
        roll();
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        if (face < 1) return;
        if (face > 6) return;
        this.face = face;
    }
    public void roll() {
        this.face = random.nextInt(6) + 1 ;
    }
    
}
