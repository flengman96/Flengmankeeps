/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.number;

import java.util.Scanner;

/**
 *
 * @author scomi
 */
public class PrimeNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        int number = sc.nextInt();
        int prime = prime(number);
        System.out.println("The Number of Factors for this number is: " + prime);
        if (prime > 2)
            System.out.println("this is not a prime");
        else
            System.out.println("This is a prime");
                               
                
            }
    
    public static int prime(int number){
        int num = number;
        int count = 0;
        for (int i = 1; i <= num; i++){
            if ((num % i == 0)){
                System.out.print(i + ", ");
                count = count + 1;
                }
            
           
        }
        System.out.println();
        return count;
    }
        }
                


