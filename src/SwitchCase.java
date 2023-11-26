import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
//        int month=3;
        System.out.println("숫자를 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        //int month = scanner.nextInt();
        try {
            int intMonth = Integer.parseInt(month);
            switch (intMonth) {
                case 1:
                    System.out.println("january");
                    break;
                case 2:
                    System.out.println("february");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("april");
                    break;
                default:
                    System.out.println("번역할 수 없음");
            }
        }catch(Exception e) {
            System.out.println("숫자를 입력해주세요.");
        }
    }
}
