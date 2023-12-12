import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileinput03 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try{
            inputStream = new FileInputStream("src/acronym5.txt");
        }catch (FileNotFoundException e){
            System.out.println("파일을 찾을 수 없습니다.");
        }

        Scanner scanner = new Scanner(inputStream);
        while(scanner.hasNextLine()){ //hasNextLine = 입력 소스에 다음 중이 존재한다면 true를 되돌려주는 기능
            // 따라서 while문 조건이 true인 동안 중괄호 안에 있는 코드를 반복하게 된다.
            String line = scanner.nextLine();
            System.out.println(line);
        }// 다음 주이 존재하지 않을 땐 탈출하게 된다.
    }
}
