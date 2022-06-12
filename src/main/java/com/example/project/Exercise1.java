package com.example.project;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.esBalanceado(s));
        }
    }

    public boolean esBalanceado(String s) {
        MyStack<Character> stack = new LinkedListStack<>();
        // Colocar codigo aqui
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.push(c);
        }
        char c = stack.pop();
        if(c == '(' || c == '[' || c == '{'){
            return false;
        }
        for(int i = 0; i < stack.size(); i++) {
            if(stack.isEmpty()){
                return true;
            }else{
                char c2 = stack.pop();
                if(c == '}' || c == '{'){
                    if(c2 == '{' || c2 == ']' || c2 == ')' || c2 == '}'){
                        c = stack.pop();
                    }else{
                        return false;
                    }
                }else if (c == ']' || c == '[') {
                    if(c2 == '[' || c2 == ')' || c2 == '{'){
                        c = stack.pop();
                    }else{
                        return false;
                    }
                }else{
                    if(c2 == '(' || c2 == ')' || c2 == '[' || c2 == '}'){
                        c = stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
        return false;
    }
}
