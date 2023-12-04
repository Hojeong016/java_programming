import java.util.Arrays;

public class array04 {
    public static void main(String[] args) {
        //배열의 한계
       String[] days = {"월","화","수","목","금","토","일"};
        //System.out.println(days[7]);
    //배열의 크기는 시작부터 정해져있다. 따라서 7은 없기에 ,, 에러가 뜬다.
        //배열에 값추가하기
        String[] days2 = Arrays.copyOf(days,9);
        days2[8]="월";
        days2[7]="일";

        //복사 후 크기 추가
        for(String day : days2){
            System.out.println(day+"요일");
        }
    }
}
