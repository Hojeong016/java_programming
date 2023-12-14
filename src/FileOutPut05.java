
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutPut05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //파일 생성하기
        FileWriter writer = null;

        try{
            writer = new FileWriter("src/output01.txt");
            writer.close();
        }catch (IOException e){
            System.out.println("파일생성에 실패하였습니다.");
        }

        //분자열 반복적으로 입력받기
        System.out.println("내용을 입력하세요.");

        while(true){
            String input = scanner.nextLine(); //문자열 입력 기능

            try{
                writer.write(input);
                writer.write("\n");
            }catch (IOException e){
                System.out.println("작성에 실패했습니다");

                if(input.equals("")){
                    System.out.println("종료합니다.");
                    break;
                }//종료 기능
            }


        }


    }
}
