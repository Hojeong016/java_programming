import java.util.Scanner;

public class DogFood {
    public static void main(String[] args) {
        System.out.println("강아지의 몸무게를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        String weight = scanner.nextLine();
        //double dogfood = Double.parseDouble(weight);
        double dogfood = Double.parseDouble(weight) * 10;
        System.out.println("1일 권장사료 급여량은 "+ dogfood+"g입니다.");
    }
}
