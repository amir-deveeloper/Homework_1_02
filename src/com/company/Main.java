package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s =0;

        int n = scanner.nextInt();
        int[] integers = new int[n];
        for(int i = 0; i < n; i++){
            integers[i] = scanner.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            if (integers[i+1] > integers[i]){

                s++;
            }
        }

        System.out.println(s);

    }
}