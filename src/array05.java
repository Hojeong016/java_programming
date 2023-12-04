import java.util.Arrays;

public class array05 {

    public static void main(String[] args) {
        //2차원 배열
        String[][] days = {
                {"월","화","수","목","금","토","일"},
                {"일","화","수","목","금","토","일"},
                {"월","화","수","목","금","금","금"},
        };

        System.out.println((days[0][2])+"요일");//수요일
        //days[줄번호][인덱스]

    }
}
