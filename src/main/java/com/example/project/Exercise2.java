package com.example.project;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.existenDuplicados(s));
        }
    }

    public boolean existenDuplicados(String str) {
        MyStack<Character> stack = new LinkedListStack<>();
                for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
        }
        char c = stack.pop();
        for(int i = 0; i < stack.size(); i++) {
            if(stack.isEmpty()){
                return true;
            }else{
                char c2 = stack.pop();
                if(c == ')' || c == 'b' || c == 'a' || c == '+' || c == '-'){
                    if(c2 == '(' || c2 == '+' || c2 == '-' || c2 == 'b' || c2 == 'a'){
                        c = stack.pop();
                    }else{
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
