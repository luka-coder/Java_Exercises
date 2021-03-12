package ClassWork_1;

import java.util.Scanner;

public class Exercise_8 {
    public Exercise_8(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter M: ");
        int m = input.nextInt();
        System.out.print("Enter N: ");
        int n = input.nextInt();
        System.out.print("Numbers from M to N: ");
        for(int i =m;i<=n;i++){
            System.out.print(i+";");
        }
    }
}
