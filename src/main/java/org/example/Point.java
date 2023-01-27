package org.example;

import java.util.Scanner;

public class Point
{
    int x;
    int y;
    String c;
    String d;

    String poi;
    Scanner s=new Scanner(System.in);
    Point()
    {
        System.out.println("enter the x coordinate:");
        x= s.nextInt();
        System.out.println("enter the y coordinate:");
        y= s.nextInt();
         c=String.valueOf(x);
         d=String.valueOf(y);
        poi=("(" + c + "," + d + ")");
        System.out.println("original point is : " + poi);
        eq();
    }
    void eq()
    {
        System.out.println(c.equals(d));

    }
    void cloned()
    {
        String e=c;
        String f=d;
        String npoi=("(" + e + "," + f + ")");
        System.out.println("cloned point is :" + npoi);
    }

    public static void main(String[] args)
    {
        Point o=new Point();
        Point j= o;
        j.cloned();
    }

}
