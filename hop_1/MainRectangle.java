package hop_1;

import java.awt.*;
import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao number height :");
        int height = sc.nextInt();
        System.out.println("Nhap vao number width :");
        int width = sc.nextInt();

        Rectangle rc = new Rectangle(height,width);

        System.out.println(rc);
        System.out.println("Perimeter of the Rectangle :" + rc.getArea());
        System.out.println("Area of the Rectangle: "+ rc.getArea());




    }
}
