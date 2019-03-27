package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первое число от 0 до 10 или от I до X.");

        Scanner num = new Scanner(System.in);

        Operations a = new Operations();

        float aa = a.opr(num.nextLine());

        while (aa == 123){
            System.out.println("Вы ввели недопустимое значение.");
            System.out.println( "Введите первое число от 0 до 10 или от I до X.");
            aa = a.opr(num.nextLine());
        }

        System.out.println("Введите второе число от 0 до 10 или от I до X.");

        Operations b = new Operations();

        float bb = b.opr(num.nextLine());

        while (bb == 123){
            System.out.println("Вы ввели недопустимое значение.");
            System.out.println( "Введите второе число от 0 до 10 или от I до X.");
            bb = b.opr(num.nextLine());
        }

        System.out.println("Введите операцию, которую необходимо сделать с двумя введенными числами.");

        opr02 c = new opr02();

        String o = "";

        int cc = c.op(num.nextLine());

        while (cc == 123){
            System.out.println("Вы ввели недопустимую операцию.");
            System.out.println("Введите + или - или * или /");
            cc = c.op(num.nextLine());
        }
        float result = 0.0f;
        if (cc == 1){
            result = aa + bb;
            o = "+";
        } else if (cc == 2) {
            result = aa - bb;
            o = "-";
        } else if (cc == 3) {
            result = aa * bb;
            o = "*";
        } else if (cc == 4) {
            result = aa / bb;
            o = "/";
        }

        System.out.println(aa + o + bb + "=" + result);

    }
}
