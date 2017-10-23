/**
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.
*/
import java.util.Scanner;
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
       int count = 0;
       while (x != 0 || y!= 0)
       {
           if ((x%2==0 ^ y%2==0)||(x%2==1 ^ y%2 ==1) )
            {
                count++;
            }
            
            x = x/2;
            y = y/2;
       }
       return count;
    }  
    public static void main(String args[])
    {   System.out.println("The Hamming distance between two integers is the number" 
                            +"of positions at which the corresponding bits are different.");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 2 integers: \na: ");
        int a = scn.nextInt();
        System.out.println("b: ");
        int b = scn.nextInt();
        System.out.println("The binary hamming distance between a and b is: " + hammingDistance(a,b));
    }
}