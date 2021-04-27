public class WhatDo{
    public static int someFunction(int a, int b) {
        if (b == 0){
            return 1;
        }
        else if (b == 1){
            return a;
        }
        else if (b % 2 == 0){
            return someFunction(a*a, b/2);
        } 
        else{        
            return someFunction(a*a, b/2) * a;
        }
    }
    public static void main(String[] args) {
        System.out.println(someFunction(2, 5));
        System.out.println(someFunction(10, 4));
    }
}