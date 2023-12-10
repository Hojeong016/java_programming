import java.util.Random;
import java.util.Scanner;

public class random03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //0~225까지의 정수를 난수로 출력합니다.
        Random random = new Random();
        int randomNumber = random.nextInt(225);

        //while문 사용하기 (즉정조건을 만족할 때까지 반복하는 용도로 사용되기 때문에)
        //System.out.println("0~225까지 숫자중 한가지 숫자를 입력하세요."+randomNumber);
        //int input = scanner.nextInt();

        //while(input== randomNumber !=true ){
        // System.out.println("숫자를 다시 입력하세요");
        //input = scanner.nextInt();
        // }

        //System.out.println("올바른 숫자를 입력하였습니다.");
        // 어떻게 8번만 반복되게 하지??
        //while문에서 for문으로 바꿔서 다시 생각해보기

//        System.out.println("0~225까지의 숫자를 입력하세요"+randomNumber);
//        int input = scanner.nextInt();
//        //int i = input;
//        for(int i=0; i<7; i++) {
//            if (input!=randomNumber /*!=true*/){
//                System.out.println("숫자를 다시 입력하세요");
//                input = scanner.nextInt();}
//            else {
//                System.out.println("숫자가 일치합니다.");
//                break;
//            }

    //임의의 숫자와 비교하여 힌트주기
        System.out.println("0~225까지의 숫자를 입력하세요"+ randomNumber);

            int input = scanner.nextInt();

        for(int i=0; i<7; i++){
            if(input == randomNumber){
                System.out.println("축하합니다. 일치합니다");
                break;}
            else if (input < randomNumber){
                System.out.println("랜덤 숫자보다 작습니다.");
                System.out.println(7-i+"번의 기회가 남았습니다 다시 입력해주세요");
                input = scanner.nextInt();
            } else {
                System.out.println("랜덤값보다 큽니다.");
                System.out.println(7-i+"번의 기회가 남았습니다 다시 입력해주세요");
                input = scanner.nextInt();

            }

            }
        System.out.println("게임이 끝났습니다.");
        }
    }



