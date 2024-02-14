import java.io.*;
class Product{
int price;
String pcode,pname;

public Product(String pcode,String pname,int price)
{
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
String getPcode()
{
return pcode;
}
String getPname()
{
return pname;
}
int price()
{
return price;
}
void display(){



System.out.print("product name=");
System.out.println(this.pname);
System.out.print("product code=");
System.out.println(this.pcode);
System.out.print("product price=");
System.out.println(this.price);
}

}
class ProductMain
{
public static void main(String args[])
{
System.out.println("amalu jose  Rollno:13 program 1)Define a class ‘product’ with data members pcode, pname and price. date:13-feb-24");
System.out.println("product 1");
Product p1=new Product("ca45","car",540000);
p1.display();
System.out.println("product 2");
Product p2=new Product("bike45","bike",100000);
p2.display();
System.out.println("product 3");
Product p3=new Product("lorry45","lorry",1000000);
p2.display();
Product p;

System.out.println("------product details of lower price---");
if(p1.price<p2.price)
{
  if(p1.price<p3.price)
  {
  p=p1;
  }
  else
  {
  p=p3;
  }
 }
else
 {
  if(p2.price<p3.price)
  {
  p=p2;
  }
  else
  {
  p=p3;
  }
 }
 p.display();
 }
 }
  

