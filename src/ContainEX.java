import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ContainEX {
    public static void main(String[] args) {
        ArrayList<String> menuList = new ArrayList<>();

        menuList.add("치킨");
        menuList.add("피자");
        menuList.add("자장면");
        menuList.add("치킨");

        boolean menuListC = menuList.contains("치킨");

        System.out.println(menuListC);
    }
}
