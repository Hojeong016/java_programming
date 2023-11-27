import java.sql.SQLOutput;
import java.util.Scanner;

public class passwordinput02 {

    public static void main(String[] args) {
        String password = "abc123";
        Scanner scanner = new Scanner(System.in);
        String input;

        do{
            System.out.println("비밀번호를 입력하세요");
            input = scanner.nextLine();
        }while(password.equals(input) !=true);

        System.out.println("올바른 비밀번호를 입력하셨습니다.");
    }
}
