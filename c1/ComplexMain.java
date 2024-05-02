import java.io.*;
import java.util.*;
class Complex
{
int r,img;

public Complex()
{
}
public Complex(int real,int image)
{
r=real;
img=image;
}

void display(int real,int image)
{
System.out.println(real+" +i"+image);
}
}
class ComplexMain
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Amalu Jose Rollno:13 q3)Add complex numbers  13-feb-24");
System.out.println("enter real part of first complex number");
int r1=in.nextInt();
System.out.println("enter image part of first complex number");
int i1=in.nextInt();
System.out.println("enter real part of second complex number");
int r2=in.nextInt();
System.out.println("enter image part of second complex number");
int i2=in.nextInt();
Complex c1=new Complex(r1,i1);
System.out.println("first complex number is:");
c1.display(r1,i1);
Complex c2=new Complex(r2,i2);
c2.display(r2,i2);
int creal=c1.r+c2.r;
int cimage=c1.img+c2.img;
System.out.print("sum of two complex number=");
Complex c=new Complex();
c.display(creal,cimage);
}
}

