import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileinput02 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src/acronym.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }

        Scanner scanner = new Scanner(inputStream); // 왜 경고가 뜨는 거지??
        String line = scanner.nextLine();
        System.out.println(line); // 첫 줄 출력
        line = scanner.nextLine();
        System.out.println(line);// 두번째 줄 출력
        line = scanner.nextLine();
        System.out.println(line);//세번째 줄 출력
        //텍스트 파일의 줄이 늘어날 수록 line을 계속 만들어 내야한다는 어려움이 있음. 반복문을 사용하여 해결
    }
}