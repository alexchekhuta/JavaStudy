package com.company;

public class Operations {
    int opr (String n){
        int res = 123;
        if (n.equals("1") || n.equals("i") || n.equals("I")){
            res = 1;
        } else if (n.equals("2") || n.equals("ii") || n.equals("II")){
            res = 2;
        }else if (n.equals("3") || n.equals("iii") || n.equals("III")){
            res = 3;
        }else if (n.equals("4") || n.equals("iv") || n.equals("IV")){
            res = 4;
        }else if (n.equals("5") || n.equals("v") || n.equals("V")){
            res = 5;
        }else if (n.equals("6") || n.equals("vi") || n.equals("VI")){
            res = 6;
        }else if (n.equals("7") || n.equals("vii") || n.equals("VII")){
            res = 7;
        }else if (n.equals("8") || n.equals("viii") || n.equals("VIII")){
            res = 8;
        }else if (n.equals("9") || n.equals("ix") || n.equals("IX")){
            res = 9;
        }else if (n.equals("10") || n.equals("x") || n.equals("X")){
            res = 10;
        }else if (n.equals("0")){
            res = 0;
        }
        return res;
    }
}
