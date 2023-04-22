package br.com.rspinfotec.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("def");
        list.add("ghi");

        for (String s : list) {
            System.out.println(s);
        }

    }
}
