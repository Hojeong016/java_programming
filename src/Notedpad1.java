import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notedpad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            //작업 번호
            System.out.println("원하는 작업 번호를 입력하시오");
            System.out.println(1 + ". 메모 읽기");
            System.out.println(2 + ". 새 메모");
            System.out.println(3 + ". 종료");

            //사용자로부터 입력받기
            int number = scanner.nextInt();
            scanner.nextLine();
            //int 형식의 Scanner 값을 입력 받게 됨. - if 속 String 값을 입력 \n  값이 있을 때 int 가행 문자를 먼저 인식 하여 공백이 생김 - 종료 하는 문제가 생겼음, 뒤에  next 라인 기능 주가

            //메모 읽기
            if (number == 1) {

                System.out.println("파일명을 입력하세요.");

                //사용자 입력
                String fileName = scanner.nextLine();

                //파일 열기
                FileInputStream inputStream = null;

                try {
                    inputStream = new FileInputStream(fileName);
                } catch (FileNotFoundException e) {
                    System.out.println("파일을 불러오는 것에 실패하였습니다.");
                    continue;
                }
                //스캐너 생성
                Scanner file = new Scanner(inputStream);
                while (file.hasNextLine()) {
                    String line = file.nextLine();
                    System.out.println(line);
                }

                System.out.println("작업 번호창으로 돌아갑니다.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("실패");
                }
            }
            // 새 메모
            else if (number == 2) {

                //사용자 파일명 지정
                System.out.println("파일명을 입력하세요.");
                String fileName = scanner.nextLine();

                // 파일 쓰기 타입을 선언
                FileWriter write = null;

                try {
                    write = new FileWriter(fileName);
                    System.out.println("파일을 생성하였습니다.");
                } catch (IOException e) {
                    System.out.println("파일 생성에 실패하였습니다.");
                }

                System.out.println("내용을 입력하세요");

                while (true) {
                    //사용자 입력내용
                    String input = scanner.nextLine();

                    if (input.isEmpty()) {
                        System.out.println("파일을 저장합니다.");
                        break;
                    }
                    try {
                        write.write(input + "\n");
                    } catch (IOException e) {
                        System.out.println("파일에 문자열 생성을 실패하였습니다.");
                    }
                }
                try {
                    write.close();
                } catch (IOException e) {
                    System.out.println("파일 저장에 실패하였습니다.");
                }

                System.out.println("작업 번호창으로 돌아갑니다.");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("실패");
                }
            }
            // 종료
            else if (number == 3) {
                System.out.println("프로그램을 종료합니다");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
