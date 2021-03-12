package ClassWork_1;

import java.util.Scanner;

public class Exercise_7 {
    public Exercise_7(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Number 2: ");
        int num2 = input.nextInt();
        int gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }
        int lcm = (num1 * num2) / gcd;
        System.out.println("Greatest Common Divisor: "+gcd);
        System.out.println("Least Common Multiple: "+lcm);
    }
}
