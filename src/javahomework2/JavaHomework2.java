/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework2;

import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class JavaHomework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Напишите любое трехзначное число:");
        int number= scanner.nextInt();
        int number100= (int)number/100;
        int number10= (int)(number/10)%10;
        int number1= (int)number%10;
        int summa= (int)number100+number10+number1;
        System.out.format(String.join("%n",
        "Единицы этого числа:%1$d",
        "Десятки этого числа:%2$d",
        "Сумма цифр этого числа:%3$d%n"),number1,number10,summa);
        
    }
    
}
