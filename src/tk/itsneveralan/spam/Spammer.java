package tk.itsneveralan.spam;
import java.util.Random;
public class Spammer {
    public static void main( String args[] ){
        int SpammerInt = 0x2;
        while(SpammerInt > 1){
            Random rand = new Random();
            int randmax = 0x3b9aca00;
            int int_random = rand.nextInt(randmax);
            double double_random=rand.nextDouble();
            float float_random=rand.nextFloat();
            System.out.println("Random integer value from 0 to" + (randmax-1) + " : "+ int_random);
            System.out.println("Random float value between 0.0 and 1.0 : "+float_random);
            System.out.println("Random double value between 0.0 and 1.0 : "+double_random);
            System.out.println("Random interger value = " + rand.nextInt(randmax));
            System.out.println("Random double value = " + rand.nextDouble());
            System.out.println("Random float value = " + rand.nextFloat());
        }
    }
}