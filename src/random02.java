import java.sql.SQLOutput;

public class random02 {
    public static void main(String[] args) {
     //지연시간 추가하기
        System.out.println("지금 무슨 생각을 하고 있는지 맞춰보겠습니다");
     //Thread 는 try/catch구문을 사용하여주어야 한다.
        try{
           Thread. sleep(3000); //3초의 지연시간
        } catch (InterruptedException e){
            System.out.println("실패");
        }

        System.out.println("치킨")                                                                                                    ;
    }

}
