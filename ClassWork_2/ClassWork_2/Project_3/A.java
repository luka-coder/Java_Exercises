package ClassWork_2.Project_3;

import java.util.Scanner;

public class A {
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n=input.nextInt();
        int[] m = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            m[i]=input.nextInt();
        }
        System.out.print("Array elements are: ");
        for (int i=0; i<n; i++)
        {
            System.out.print(m[i]+"; ");
        }
    }
    public void input_random(){
        int rand = (int)(Math.random() * 15);
        int[] m = new int[10];
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 15);
        }

        System.out.print("\nArray: ");

        for (int num = 0; num < m.length; num++){

            System.out.print(m[num]+"; ");
        }
    }

}
