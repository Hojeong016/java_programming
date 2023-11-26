import java.util.Scanner;

public class EggCartonCounter {
    public static void main(String[] args) {

        System.out.println("닭이 낳은 달걀의 갯수를 입력하시오");
        Scanner scanner = new Scanner(System.in);

        int egg=0;

        try{
            egg = scanner.nextInt();
        }catch (Exception e){
            System.out.println("달걀의 갯수를 입력하세요.");
        }

        //int eggCase=30;
        int total = egg /30 ;

        if(egg>=30){
            System.out.println("총"+total+"개의 계란판이 필요합니다.");
        }else {
            System.out.println("계란판이 필요하지 않습니다.");
        }
    }
}

