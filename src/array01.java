import java.lang.reflect.Type;

public class array01 {
    public static void main(String[] args) {
        // 월요일~금요일까지 출력
        String mon = "월요일";
        String tue = "화요일";
        System.out.println(mon+tue);
        //... 여러개의 String 타입의 문자열을 만들어야한다.
        //배열(Array)을 사용하기

        String[] days ={"월요일", "화요일", "수요일", "목요일", "금요일"};
        System.out.println(days); //오류는 아니지만 출력창에 나타나지 않음
        //인덱스 : 배열의 특정 요소를 사용
        System.out.println(days[0]); // 월요일 출력
        System.out.println(days[2]); // 수요일 출력

        //배열의 길이
        String[] hi ={"안녕", "안녕하세요","감사합니다.","고맙습니다","수고하세요"};
        int lengthOfHi = hi.length;
        System.out.println(lengthOfHi); //5출력

        //반복문 사용(for)
        String[] week ={"월","화","수","목","금","토","일"};
        //int lengthOfWeek = week.length;
        for(int i = 0; i < week.length; i++){
            System.out.println(week[i]+"요일");

        } // 1요일 ,2 요일. 3요일 숫자로 출력됨 day[i] 는 어떤 원리로 사용되는 것인가.
    }
}
