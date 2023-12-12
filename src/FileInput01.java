import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput01 {
    public static void main(String[] args) {
        //FileInputStream inputStream = new FileInputStream("src/chicken.txt"); \
        //빨간 줄이 쳐지는 이유,
        // FileNotFoundException 오류 : 예외 처리를 하지 않았을 때 뜨는 오류이다.
        //자바에서는 예외를 발생시키는 코드가 두가지 존재, 강요되는 예외/ 그렇지 않은 예외
        //src 라는 폴더에  chicken.txt 파일이 존자하지 않을 가능성이 있으니 이에 대응 할 수 있도록 명시적으로 알려주는 것.
    // try-catch문으로 예외 처리 하기
      FileInputStream inputStream = null;
      try{
          inputStream = new FileInputStream("src/chicken.txt");
      }catch (FileNotFoundException e){
          System.out.println("파일을 찾을 수 없습니다.");
      }

      Scanner scanner = new Scanner(inputStream);
      String line = scanner.nextLine();
      System.out.println(line);
      String line2 = scanner.nextLine();//오류

    }
}
