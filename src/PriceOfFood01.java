import java.util.Scanner;

public class PriceOfFood01 {
    public static void main(String[] args) {

        System.out.println("메뉴 번호를 입력해주세요.");
        System.out.println("1.치킨");
        System.out.println("2.순대국");
        System.out.println("3.스테이크");

        Scanner scanner = new Scanner(System.in);
        //String number = scanner.nextline();
        //int menewNumber = number.Integer,parseInt(number);

        int number = 0;

        try{
            number = scanner.nextInt();
        }catch (Exception e){
            System.out.println("메뉴 번호를 입력해 주세요.");
        }

     switch (number){
         case 1:
             System.out.println("치킨은 500원 입니다.");
             break;
         case 2:
             System.out.println("순대국은 1000원입니다.");
             break;
         case 3:
             System.out.println("스테이크는 2000원입니다.");
             break;
         default:
             System.out.println("1번~3번을 선택해주세요.");
             break;
     }
    }
}
