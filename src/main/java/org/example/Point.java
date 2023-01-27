package org.example;

import java.util.Scanner;

public class Point implements Cloneable
{
    Integer x;
    Integer y;
    
    Point(Integer a,Integer b)
    {
        this.x=a;
        this.y=b;
    }
    void eq()
    {
        System.out.println(x.equals(y));

    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter x corodinate:");
        Integer p=s.nextInt();
        System.out.println("Enter y corodinate:");
        Integer q=s.nextInt();
        Point r =new Point(p,q);
        Point m=(Point)r.clone();
        m.eq();


    }

}
