/*2) Вычислить с помощью цикла факториал числа - n введенного с
клавиатуры (4<n<16). Факториал числа это произведение всех чисел от
этого числа до 1. Например 5!=5*4*3*2*1=120
*/
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial 4 < n < 16");
        System.out.print("Enter a number for get factorial = ");
        byte number = sc.nextByte();
        int factorial = 1;
        if( number >= 4 || number <= 16){
            for (byte i = number; i > 1;i--){
                factorial *= i;
            }
        }else
            System.out.println("Error, enter a number 4 < n < 16");
        System.out.println("Factorial a number "+number+" = "+factorial);
    }
}
