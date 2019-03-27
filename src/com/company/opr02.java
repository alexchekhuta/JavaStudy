package com.company;

public class opr02 {
    int op(String n) {
        int res = 123;
        if (n.equals("+")) {
            res = 1;
        } else if (n.equals("-")) {
            res = 2;
        } else if (n.equals("*")) {
            res = 3;
        } else if (n.equals("/")) {
            res = 4;
        }
        return res;
    }
}