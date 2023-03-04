package dsa;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world !!");
        Cookie cookieOne = new Cookie("blue");
        Cookie cookieTwo = new Cookie("green");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;
        System.out.println(map1);
        System.out.println(map2);

        map1=map3;
        System.out.println(map1);
        System.out.println(map2);


    }
}
