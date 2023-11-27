import java.util.Scanner;

public class break03 {
    public static void main(String[] args) {
        String passWord = "abc123";
        Scanner scanner = new Scanner(System.in);

        System.out.println("비밀번호를 입력하세요.");

        while (true){

           // 입력창이 whil문 밖에 위치하면 무한반복이 됨. 왜 그런걸까?
            String input = scanner.nextLine();
            if(passWord.equals(input)){
                System.out.println("비밀번호가 일치합니다.");
                break;
            }else {
                System.out.println("비밀번호를 다시 입력하세요.");
            }
        }
//        String passWord = "abc123";
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("비밀번호를 입력하세요.");
//        String input = scanner.nextLine();
//
//        while(passWord.equals(input) !=true){
//            System.out.println("비밀번호를 다시 입력하세요.");
//            input = scanner.nextLine();
//           // if(passWord.equals(input)){
//               // break;
//            //}
//        }
//
//        System.out.println("올바른 비밀번호입니다.");

     }
}
