import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class notedpad02 {
    //scanner. 전역변수로 지정하여 모든 메소드에서 사용할 수 있도록 함
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //메인 메소드

        while (true) {
            //3번을 누르면 반복문을 탈출하면서 종료
            System.out.println("원하는 작업 번호를 입력하세요.");
            System.out.println(1 + ". 메모 읽기");
            System.out.println(2 + ". 새 메모");
            System.out.println(3 + ". 종료");

            int number = scanner.nextInt();
            scanner.hasNextLine();

            //1. 메모읽기
            if (number == 1) {
                //어떤 매개변수와 인자를 가지는 메소드를 만들 수 있을까. // 입력 파일 명에 해당 하는 소스를 호출 할  수 있다.

                // 파일명 입력
                System.out.println("파일명을 입력하세요");
                String fileName = scanner.nextLine();

                readFile(fileName);
            }

            // 2. 새 메모
            else if (number == 2) {
                // 새로운 파일을 생성하고 내용을 저장할 수 있다.

                System.out.println("파일명을 입력하세요");
                String input = scanner.nextLine();

                madeFile(input);

            }
            else if (number == 3) {
                System.out.println("메모장을 종료합니다.");
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
    }

    public static void readFile(String fileName) {
        FileInputStream inputStream = null;

        //파일 찾기
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("파일을 불러오지 못했습니다.");
            return; // 탈출의 역할로의 return
        }

        //inputStream 소스를 불러 올  Scaaner생성
        Scanner scanner1 = new Scanner(inputStream);
        while (scanner1.hasNextLine()) {
            String line = scanner1.nextLine();
            System.out.println(line + "\n");
        }

        scanner1.close();
      // return//어떤 위치에서 리턴을 해주어야 할까?
        // 리턴의 역할 : 1. 반환값 2. 함수 탈출(반환값의 타입이 void 로 지정되었을 때)
        //계속 해맨 이유,, 나는 파일 이름을  String 값을 지정해 주어야 한다고 생각헀다.
        // 반복문을 탈출 ,,,?? void 로 지정해주어야 한다.. 왜?? 이런 경우엔 왜 void로 지정해 주어야할까??
    }

    public static void madeFile(String inputFile){
        FileWriter writer = null;

        try{
            writer = new FileWriter(inputFile);
        }catch (IOException e){
            System.out.println("파일 생성에 실패하였습니다.");
            return;
        }

        System.out.println("내용을 입력하세요.");
        while (true){
            String input = scanner.nextLine();

            if(input.equals("")){
                System.out.println("작성을 종료합니다.");
                break;
            }

            try {
            writer.write(input + "\n");
            }catch (IOException e){
                System.out.println("문자열 저장에 실패하였습니다.");
            }

            try {
                writer.close();
            }catch (IOException e){
                System.out.println("저장에 실패하였습니다.");
            }

            try {
                Thread. sleep(2000);
            }catch (InterruptedException e){
                System.out.println("실패");
            }
        }
    }
}

