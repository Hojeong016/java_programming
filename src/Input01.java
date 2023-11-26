import java.util.Scanner;
//import구문 : 어떤 타입을 가져다 사용하겠다는 뜻
public class Input01 {
    public static void main(String[] args) {
        //Scanner 타입에 scanner 변수를 생성한다.
        // 새로운 값을 생성하기 위한 nwe 값을 작성 후 Scanner(타입명) 작성 후
        //System의 입력 소스를 괄호안에 넣었다.
       // Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();
        //System.out.println(input);

        //이름을 입력받아 환영하는 문자열 되돌려받기
        Scanner name = new Scanner(System.in);
        String input  = name.nextLine();
        System.out.println(input + "님 만나서 반갑습니다.");
    }
}
