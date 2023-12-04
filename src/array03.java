public class array03 {
    public static void main(String[] args) {
        //배열을 반복문에 사용하기
        String[] days = {"월","화","수","목","금","토","일"};

        //배열에 특정요소 바꾸기
        days[0]="일";

        for (int i = 0; i < days.length; i = i+1){
            System.out.println(days[i]+"요일");
        } //인덱스로 특정 위치의 요소를 선언 ,,, days의 배열중 i에 해당하는 것
        //i의 초기값은 = 0 따라서 월요일 , 1씩 증가 반복하고 배열의 길이보다 적을때 멈춘다. 즉 7보다 적을때
        //day[6]은 일요일


    }
}
