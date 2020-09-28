package com.company;

import java.util.*;

public class Main {
    public static void print(int index, Object object) {
        System.out.println(String.format("{%d}, %s", index, object));
    }

    public static void demoOperation(){
        print(1, 5 + 2);
        print(2, 5 - 2);
        print(3, 5 * 2);
        print(4, 5 / 2);
        print(5, 5 % 2);
        print(6, 5 << 2);
        print(7, 5 >> 2);
        print(8, 5 | 2);
        print(9, 5 ^ 2);
        print(10, 5 == 2);
        print(11, 5 != 2);


        print(12, 5.0 / 2);
        print(13, 5. / 2.0);


    }

    public static void demoString() {
        String str = "hello world";
        print(1, str.indexOf('e'));
        print(2, str.charAt(2));
        print(3, str.codePointAt(2));
        print(4, str.compareToIgnoreCase("HEELO WORLD"));
        print(5, str.compareTo("hello uorld"));
        print(6, str.compareTo("hello wa"));
        print(7, str.contains("hello"));
        print(8, str.toUpperCase());
        print(9, str.endsWith("world"));
        print(10, str.startsWith("hell"));
        print(11, str.replace('o', 'e'));
        print(12, str.replaceAll("o|l", "a"));
        print(13, str.replaceAll("hello", "hi"));

        // 线程不安全
        StringBuilder sb = new StringBuilder();
        sb.append("x ");
        sb.append(1.2);
        sb.append('a');
        sb.append(true);
        sb.append(2);
        print(14, sb.toString());
    }

    public static void demoList() {
        List<String> strListA = new ArrayList<String>(10);
        for (int i = 0; i < 4; i++) {
            strListA.add(String.valueOf(i));
        }
        print(1, strListA);

        List<String> strListB = new ArrayList<String>(10);
        for (int i = 0; i < 4; i++) {
            strListB.add(String.valueOf(i*i));
        }
        strListB.addAll(strListA);
        print(2, strListB);
        strListA.remove(0);
        print(3, strListA);
        print(4, strListB);
        Collections.sort(strListB);
        print(5, strListB);


    }

    public static void demoMap() {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i*i));
        }
        print(1, map);
        for (Map.Entry<String, String> entry: map.entrySet()) {
            print(2, entry.getKey() + "|" + entry.getValue());
        }
        print(3, map.values());
        print(4, map.keySet());
        print(5, map.containsKey("A"));
        map.replace("3", "27");
        print(6, map.get(3));
    }

    public static void demoException() {
        try{
            int k = 2;
//            k = k / 0;
            if (k == 2) {
                throw new Exception("我故意的");
            }
        }catch (Exception e) {
            print(2, e.getMessage());
        } finally {
            print(3, "finally");
        }
    }
    public static void demoOO() {
        Animal a = new Animal("jim", 10);
//        a.say();
        Animal b = new Human("Tom", 20, "China");
        b.say();
    }

    public static void demoFunction() {
        Random random = new Random();
//        random.setSeed(1);
        print(1, random.nextInt(1000));
        print(2, random.nextFloat());
    }

    public static void main(String[] args) {
//        demoOperation();
//        demoString();
//        demoList();
//        demoMap();
//        demoException();
//        demoOO();
        demoFunction();

    }
}
