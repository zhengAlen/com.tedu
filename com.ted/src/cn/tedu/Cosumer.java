package cn.tedu;

import java.util.ArrayList;

/**
 * @author allen
 * @date 2020/7/14 - 1:25
 */
public class Cosumer {
    private static final int NATION = 7;

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            System.out.println(o);
        }
    }
}

