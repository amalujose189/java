/* Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)
and static nested class RAM (memory, manufacturer). Create an object of CPU and print
information of Processor and RAM.*/
import java.io.*;
class CPU
{
double price;
public CPU(double p)
{
price=p;
}
void Cdisplay()
{
System.out.println("Amalu jose Rollno:13 Q5)Create CPU,inner class Proccessor 14-feb-24");
System.out.println("price of CPU="+price);

}
class Processor
{

int nofC;
String manufact;
public Processor(int no,String manu)
{
nofC=no;
manufact=manu;
}
void Pdisplay()
{
System.out.println("----------Processor information--------");
System.out.println("no of cores="+nofC);
System.out.println("manufacturer of Processor="+manufact);
}

}
static class RAM
{
double memory;
String manuf;
RAM(double mem,String manu)
{
memory=mem;
manuf=manu;

}
void Rdisplay()
{
System.out.println("----------RAM information--------");
System.out.println("memory ="+memory+"GB");
System.out.println("manufacturer of Ram="+manuf);
}
}
}
class CpuMain
{
public static void main(String[] args)
{

CPU.RAM ram=new CPU.RAM(8,"samsung");
CPU c=new CPU(10000);
c.Cdisplay();

CPU.Processor pro=c.new Processor(8,"intel");
pro.Pdisplay();

ram.Rdisplay();
}
}

