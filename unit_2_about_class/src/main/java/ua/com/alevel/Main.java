package ua.com.alevel;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int count = 1000;
        Random random = new Random();
        Test[] tests = new Test[random.nextInt(count)];
        System.out.println("tests = " + tests.length);

        for (int i = 0; i < tests.length; i++) {
            tests[i] = new Test();
            tests[i].name = String.valueOf(i);
            random = new Random();
            int result = random.nextInt(2);
            if (result == 0) {
                tests[i].isStupid = true;
            } else {
                tests[i].isStupid = false;
            }
        }

        for (int i = 0; i < tests.length; i++) {
            System.out.println(
                    "tests = " + tests[i].name + " " + tests[i].isStupid
            );
        }