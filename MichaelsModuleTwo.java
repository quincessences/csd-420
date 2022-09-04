// CSD420 - Advanced Programming with Java
// Name: Maria Q. Michaels
// Date: 08/20/2022
// Assignment: Module 2 Assignment
// Purpose: Create a program using a recursive method that returns the sum of provided input
// References: https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/, https://www.java67.com/2015/01/program-to-calculate-sum-of-digits-using-recursion-in-java.html

public class MichaelsModuleTwo {
    public static double recurSum(int n){
        if(n==1){
            return 1.0/2;
        }
        else{
            return (1.0*n)/(n+1);
        }
    }
    
    // testing
    public static void main(String[] args) {
        System.out.println(recurSum(7));
        System.out.println(recurSum(10));
        System.out.println(recurSum(13));
    }
}