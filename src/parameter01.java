public class parameter01 {
    public static void main(String[] args) {
        number(5); // 0~4 까지의 숫자 출력
        //인자 : 5
        number2(2,6); //2~5 까지의 숫자를 반복해서 출력

        int result  =  sum(5,6);
        result += 1;
    }

    public static void number(int limit){
        int i =0;

        while (i<limit){
            System.out.println(i);
            i++;
        }

        //number 메소드 호출 / 매개변수 :int limit
    }
    // 재활용성이 더 높은 메소드
    public static void number2(int start, int end){
        int i = start;
        while (i < end){
            System.out.println(i);
            i++;
        }
    }

    public static int sum(int a, int b){
        int i = a+b;
        return i;
    }
}
