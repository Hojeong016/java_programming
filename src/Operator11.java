public class Operator11 {
     public static void main(String[] args){
         int x = 5;
         int y = 2;
         //연산자//
         System.out.println(x+y);
         System.out.println(x-y);
         System.out.println(x*y);
         System.out.println(x/y);
         //2.5가 아닌 2가 출력되는 이유= 정수와 정수의 연산은 정수로 출력된다.
         System.out.println(x%y);

         //산술연산자//
         System.out.println((x+y)*y);
         System.out.println(x+y*y);

         //비교 연산자//
         System.out.println(x>y);
         //x의 값이 y보다 큰가?//
         System.out.println(x<y);
         System.out.println(x>=y);
         System.out.println(x<=y);
         System.out.println(x==y);
         System.out.println(x!=y);
}
}