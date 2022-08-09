package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();


        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1, 100));
        }

        System.out.println("-------------");


        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();


        for (Integer a :
                arrayList) {
            if (a % 2 == 0) {
                arrayList2.add(a);
            }else {
                arrayList3.add(a);
            }
        }
        System.out.println("Chet-" + arrayList2);
        System.out.println("NeChet-" + arrayList3);
    }

}