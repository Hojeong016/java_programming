import java.util.Scanner;

public class StringTointnteger {
    public static void main(String[] args) {

        System.out.println("숫자를 입력 하세요.");
        Scanner number = new Scanner(System.in);
        String intscanner = number.nextLine();
        int intnumber = Integer.parseInt(intscanner);
        intnumber = intnumber + 1;
        System.out.println("입력한 숫자의 다음 숫자는"+intnumber+"입니다.");

    }
}
