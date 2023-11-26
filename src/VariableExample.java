public class VariableExample {
    public static void main(String[] args)
    {
        //연습문제#1
        String name = "홍길동석";
        String age = "50세";
        String address = "서울시";
        System.out.println("이름:"+ name);
        System.out.println("나이:"+ age);
        System.out.println("사는곳:" + address);

        //연습문제#2
        int winterAge = 3;
        int maxAge = 6;
        boolean same = winterAge==maxAge;
        boolean winterisoder = winterAge>maxAge;
        boolean maxisoder = winterAge<maxAge;
        System.out.println("윈터의 나이가 맥스의 나이와 같은가?:" + same);
        System.out.println("윈터의 나이가 맥스의 나이보다 많은가?:" + winterisoder);
        System.out.println("맥스의 나이가 윈터의 나이보다 많은가?:"+ maxisoder);
    }
}
