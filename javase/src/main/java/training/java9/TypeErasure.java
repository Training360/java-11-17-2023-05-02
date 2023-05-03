package training.java9;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("John");
//
//        String name = names.get(0);

//        List names = new ArrayList();
//        names.add("John");
//
//        String name = (String) names.get(0);

        List<String> names = new ArrayList<>();
        names.add("John");

        List objectList = names; // Raw type
        objectList.add(16);

        System.out.println(names);

//        String name = names.get(1);

        String name = (String) names.get(1);

    }
}
