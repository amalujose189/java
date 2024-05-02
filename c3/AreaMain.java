import java.io.*;
import java.util.*;
class Area
{
void shape(int l,int b)
{
int area;
area=l*b;
System.out.println("area of the rectangle="+area);
}
void shape(int l)
{
int area;
area=l*l;
System.out.println("area of the square="+area);
}

class AreaMain{
public static void main(String args[]){
Area a=new Area();
Scanner s=new Scanner(System.in);
System.out.println("Amalu jose \n rollno:13 \n 26-03-2024");
System.out.println("enter the length and breadth of rectangle:");
int len=s.nextInt();
int bred=s.nextInt();
a.shape(len,bred);
System.out.println("enter the side of square:");
int side=s.nextInt();
a.shape(side);
System.out.println("enter the radius of circle:");


}
}
}
