import java.util.*;
import java.util.Scanner;

class Employee {
    int empid;
    String name;
    double salary;
    String address;

    Employee(int eid, String n, double sal, String add) {
        empid = eid;
        name = n;
        salary = sal;
        address = add;
    }
}

class Teacher extends Employee {
    String dep;
    String sub;

    Teacher(int eid, String n, double slry, String add, String d, String sub) {
        super(eid, n, slry, add);
        dep = d;
        this.sub = sub;
    }

    void display() {
        
        System.out.println("employee id:" + empid);
        System.out.println("employee name:" + name);
        System.out.println("employee salary:" + salary);
        System.out.println("employee dep:" + dep);
        System.out.println("employee subject:" + sub);
        System.out.println("employee address:" + address);
    }
}

class EmpMain {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Amalu Jose \n Roll no:13 \n 02-april-2024");
        System.out.println("enter the number of teachers:");
        int n = s.nextInt();
        Teacher[] teachers = new Teacher[n];
        for (int i = 0; i < n; i++) {
            s.nextLine(); 
            System.out.println("Enter employee name "+(i+1)+" :");
            String empname = s.nextLine();
            System.out.println("Enter employee id:");
            int empid = s.nextInt();
            System.out.println("Enter employee salary:");
            double empsal = s.nextDouble();
            s.nextLine(); 
            System.out.println("Enter employee address:");
            String empadd = s.nextLine();
            System.out.println("Enter department:");
            String empdep = s.nextLine();
            System.out.println("Enter subject:");
            String empsub = s.next();
            teachers[i] = new Teacher(empid, empname, empsal, empadd, empdep, empsub);
        }
        System.out.println("-----------employee details---------------");
        for (int i=0;i<n;i++) {
            teachers[i].display();
            System.out.println("--------------------------");
        }
        
    }
}

