import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckDuplicates {
    public static void main(String[] args) {

        //메뉴를 입력받을 Scanner, list 생성
        Scanner scanner = new Scanner(System.in);
        List<String> menuList = new ArrayList<>();
//
//        System.out.println("메뉴판에 추가할 메뉴를 입력하세요.");
//        String menuName = scanner.nextLine();
//
//        menuList.add(menuName);

        while (true) {
            System.out.println("메뉴판에 추가할 메뉴를 입력하세요.");
            String menuName = scanner.nextLine();
          // menuList.add(menuName); 메뉴리스트에 값이 담기지 않아서? 공백으로 입력됨

            if (menuName.isEmpty()) {
                System.out.println("종료합니다.");
                break;
            }


            boolean repeated = menuList.contains(menuName);

            if (repeated == true) {
            //if(menuList.contains(menuName)){
                System.out.println("이미 메뉴판에 존재합니다." + "입력 메뉴 : "+ menuName);
                continue;
            } else {
                menuList.add(menuName);
                System.out.println(menuName + "을 메뉴판에 등록하였습니다.");
                System.out.println("총"+menuList.size()+"개의 메뉴가 작성되었습니다.");
            }
        }

        //왜 중복체크에 boolean 값을 주지 않았을까


        System.out.println(menuList);
    }
}
