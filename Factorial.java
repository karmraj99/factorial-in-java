package factorial;

import java.util.*;

public class Factorial {

    public static int factorial(int a){
        if(a!=0){
            return a*factorial(a-1);
        }else{
            return 1;
        }
   }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number whose Factorial you want ");
        int num = sc.nextInt();

        int fact = factorial(num);

        System.out.print("The Factorial of the number is "+fact);

        sc.close();
    }
}
