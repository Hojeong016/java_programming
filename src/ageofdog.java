public class ageofdog {
    public static void main(String[] Args){
        //연습문제#2
        int winterAge = 3;
        int maxAge = 6;
        boolean same = winterAge == maxAge;
        boolean winterisoder = winterAge > maxAge;
        boolean maxisoder = winterAge < maxAge;
        System.out.println("윈터의 나이가 맥스의 나이와 같은가?:" + same);
        System.out.println("윈터의 나이가 맥스의 나이보다 많은가?:" + winterisoder);
        System.out.println("맥스의 나이가 윈터의 나이보다 많은가?:"+ maxisoder);
    }
}
