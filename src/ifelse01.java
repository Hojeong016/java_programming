import java.util.Scanner;

public class ifelse01 {
    public static void main(String[] args) {
        System.out.println("현재 갖고있는 돈을 입력하세요.");
        Scanner scanner =new Scanner(System.in);
        String money = scanner.nextLine();
        try {
            int myMoney = Integer.parseInt(money);
            if (myMoney >= 8000) {
                System.out.println("냠냠 스테이크 맛있다");
            } else if (myMoney >= 7500) {
                System.out.println("냠냠 햄버거 맛있다.");
            } else if (myMoney >= 5000) {
                System.out.println("냠냠 과자 맛있다.");
            } else {
                System.out.println("꼬르륵 배고프다.");
            }
        }catch(Exception e){
            System.out.println("숫자로 입력하세요.");
            System.out.println("입력값="+money);
        }
    }
}
