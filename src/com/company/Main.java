package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon co bao nhieu sinh vien");
        int size = sc.nextInt();
        int []array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap diem sinh vien thu "+i+" vao day ");
            array[i]=sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(array[i]>=5){
                System.out.print(array[i] + "\t");
                count++;
            }
        }
        System.out.println();
        System.out.println("co tong cong "+count+" sinh vien thi do");
    }
}
