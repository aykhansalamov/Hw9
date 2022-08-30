import java.util.Collections;
import java.util.HashSet;

public class RoboCat extends Pet{
    public RoboCat() {
        super("Robot",
                1,
                0);
    }

    public void respond (){
        System.out.println("Hello, owner. I am " + Species.CAT + ". I miss you!");
    }
}
