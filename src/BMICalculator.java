import java.sql.SQLOutput;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double kg =0;
        double m = 0;
        Scanner kgScanner = new Scanner(System.in);

        try{
            System.out.println("몸무게를 입력하세요.");
            kg = kgScanner.nextDouble();
            System.out.println("신장을 입력하세요.");
            m = kgScanner.nextDouble();
        }catch (Exception e) {
            System.out.println("숫자로 입력해주세요.");
        }

        //Scanner kgScanner = new Scanner(System.in);

//        try{
//            kg = kgScanner.nextDouble();
//             m = kgScanner.nextDouble();
//        }catch (Exception e) {
//            System.out.println("숫자로 입력해주세요.");
//        }

        double BMI = kg / (m*m);
        if(BMI < 18.5){
            System.out.println("저체중입니다.");
        }else if(BMI>=23){
            System.out.println("과체중입니다.");
        }else {
            System.out.println("정상체중입니다.");
        }
    }
}
