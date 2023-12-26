import java.sql.SQLOutput;
import java.util.Random;

public class random01 {
    public static void main(String[] args) {
         Random random  = new Random();
         int randomNumber = random.nextInt(255);
        System.out.println(randomNumber)                        ;
    }
}
