package hop_2;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter double a : ");
        double a = sc.nextDouble();
        System.out.println("Enter double b : ");
        double b = sc.nextDouble();
        System.out.println("Enter double c : ");
        double c = sc.nextDouble();

        QuadraticEquation eq = new QuadraticEquation(a,b,c);

        System.out.println("In ra ket qua cua a " + eq.getA());
        System.out.println("In ");

        System.out.println(eq);

    }
}
