import java.io.FileWriter;
import java.io.IOException;

public class FileOutPut01 {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("src/output01.txt");
            writer. write("치킨은 살안쪄\n");
            writer.write("살은 내가 쪄");
            writer.close(); // 예상지 못한 오류를 막기 위해 항상 파일을 닫아주는 close 기능을 사용해야한다.
        }catch (IOException e){
            System.out.println("파일 생성에 실패했습니다.");
        }
    }
}
