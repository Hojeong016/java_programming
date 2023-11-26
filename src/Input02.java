import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        //next기능
        System.out.println("영단어와 한글 단어를 한개씩 입력해 보세요.");
        Scanner scanner = new Scanner(System.in);

        String EnglishWord = scanner.next();
        String KoreaWord = scanner.next();

        System.out.println("입력된 한글:"+ EnglishWord);
        //System.out.println("입력된 영어:"+ KoreaWord);
    }
}
