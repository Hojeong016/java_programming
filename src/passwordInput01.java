import java.util.Scanner;

public class passwordInput01 {
    public static void main(String[] args) {
        //비밀번호 설정
        String passWord = "abc123";
        Scanner scanner = new Scanner(System.in);

        System.out.println("비밀번호를 입력해주세요");
        String input = scanner.nextLine();

        while (input.equals(passWord) !=true){
            System.out.println("비밀번호를 다시 입력하세요.");
            input = scanner.nextLine();
        }
        //탈출
        System.out.println("올바른 비밀번호를 입력하였습니다.");

    }
}
