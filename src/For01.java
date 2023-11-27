public class For01 {
    public static void main(String[] args) {
        for (int i=0; i<10; i=i+1){
            System.out.println("i : " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("j : " + j);
            }
        }
    }
}
