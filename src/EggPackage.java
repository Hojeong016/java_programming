public class EggPackage {
    public static void main(String[] args){
        int totalegg = 277;
        int eggPackage = 30;

        // 계란판에 포장되고 남은 계란의 갯수를 계산합니다.
        int remainingegg = (totalegg%eggPackage);
        System.out.println("총" + remainingegg + "개의 계란이 남습니다");

    }
}
