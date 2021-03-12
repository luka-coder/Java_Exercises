package ClassWork_1;

import java.util.Scanner;

public class Exercise_4 {
    public Exercise_4(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int num = input.nextInt();
        int d1 = num/100;
        int d2 = (num/10)%10;
        int d3 = num%10;
        System.out.println(d1+"\n"+d2+"\n"+d3);
    }
}
