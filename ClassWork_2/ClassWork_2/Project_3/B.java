package ClassWork_2.Project_3;

import java.util.Scanner;

public class B {
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n=input.nextInt();
        int[] m = new int[12];
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
        int[] m = new int[12];
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 15);
        }

        System.out.print("\nArray: ");

        for (int num = 0; num < m.length; num++){

            System.out.print(m[num]+"; ");
        }
    }
    public void greater_7(){
        int rand = (int)(Math.random() * 15);
        int[] m = new int[12];
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 15);
        }

        System.out.print("\nArray: ");

        for (int num = 0; num < m.length; num++){

            System.out.print(m[num]+"; ");
        }
        System.out.println("\nArray Elements Greater then 7: ");
        for (int num = 0; num < m.length; num++){
            if(m[num]>7){
                System.out.print("Index: "+num+"; ");
            }
            if(m[num]>7){
                System.out.print("Value: "+m[num]+"; \n");
            }
        }
    }
    public void Scattering_range(){
        int rand = (int)(Math.random() * 15);
        int[] m = new int[12];
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 15);
        }

        System.out.print("\nArray: ");

        for (int num = 0; num < m.length; num++){

            System.out.print(m[num]+"; ");
        }

        System.out.print("\nMax element of array: ");
        int max = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
        System.out.println(max);
        System.out.print("Min element of array: ");
        int min = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] < min) {
                min = m[i];
            }
        }
        System.out.println(min);
        int scattering = max-min;
        System.out.println("Scattering range of array: "+scattering);
    }
}
