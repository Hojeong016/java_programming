public class String01 {
    public static void main(String[] args){
        //문자열의 글자수 세기
        String username = "채호정";
        int length = username.length();
        System.out.println("글자수:" + length);

        //문자열 바꾸기
        String fat = "치킨은 살 안쪄요, 살은 내가 쪄요.";
        String replaceall = fat.replaceAll("내가", "네가");
        int lenGth = fat.length();
        System.out.println("글자수:"+lenGth+"이고, 다시 적은 문장은"+replaceall+"입니다.");

        //문자열 자르기
        String birthday = "2000/01/06";
        String year = birthday.substring(0,4);
        String day = birthday.substring(8);
        System.out.println("출생년도:"+ year);
        System.out.println("출생일:" + day);
    }
}
