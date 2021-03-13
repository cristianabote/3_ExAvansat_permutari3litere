package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // scrie un program care afiseaza toate permutarile distincte formate din 3 elemente

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti elementele: ");
        String elemente=scan.next();
        System.out.println("Problema are "+ factN(elemente.length())+" solutii.");
        int n=elemente.length();
        Main permutations=new Main();
        permutations.calculate(elemente, 0, n-1);

    }

    public static int factN(int n) {
        if (n == 1)
            return 1;
        else
            return n * factN(n - 1);

    }

    public void calculate(String sir, int left, int right){
        if(left==right)
            System.out.println(sir);
        else {
            for(int i=left; i<=right;i++) {
                String swapped=this.swap(sir, left, i);
                this.calculate(swapped, left+1,right);
            }
        }

    }
    public String swap(String sir, int i, int j){
        char temp;
        char[] charSir=sir.toCharArray();
        temp=charSir[i];
        charSir[i]=charSir[j];
        charSir[j]=temp;
        return String.valueOf(charSir);
    }
}


