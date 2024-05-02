/*Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor
to initialize the data members and another class ‘Employee’ that inherits the properties of
class Person and also contains its own data members like Empid, Company_name,
Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits
the properties of class Employee and contains its own data members like Subject,
Department, Teacherid and also contain constructors and methods to display the data
members. Use array of objects to display details of N teachers.*/
import java.util.*;

class Person {
    String Name;
    String Gender;
    String Address;
    int age;

    Person(String n, String g, String add, int a) {
        Name = n;
        Gender = g;
        Address = add;
        age = a;
    }
}

class Employee extends Person {
    int empid;
    String Company_name;
    double salary;

    Employee(String n, String g, String ad, int a, int empid, String compnam, double sal) {
        super(n, g, ad, a);
        this.empid = empid;
        Company_name = compnam;
        salary = sal;
    }
}

class Teacher extends Employee {
    String Depart;
    int Tid;

    Teacher(String nam, String g, String add, int a, int eid, String c, double s, String dep, int td) {
        super(nam, g, add, a, eid, c, s); // corrected
        Depart = dep;
        Tid = td;
    }

    void display() {
        System.out.println("name: " + Name);
        System.out.println("gender: " + Gender);
        System.out.println("Address: " + Address);
        System.out.println("age: " + age);
        System.out.println("employee id: " + empid);
        System.out.println("company name: " + Company_name);
        System.out.println("salary: " + salary);
        System.out.println("Department : " + Depart);
        System.out.println("Teacher id: " + Tid);
    }
}

class PersonMain {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Amalu Jose \n Roll no:13 \n 08-04-24");
        System.out.println("enter the size ");
        int n = s.nextInt();
        s.nextLine(); // consume newline

        Teacher t[] = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the details about " + (i + 1) + " details");
            System.out.println("enter the Name:");
            String nam = s.nextLine();
            System.out.println("enter the gender:");
            String gen = s.nextLine();
            System.out.println("enter the address:");
            String add = s.nextLine();
            System.out.println("enter the age:");
            int age = s.nextInt();
            System.out.println("enter the id:");
            int eid = s.nextInt();
            s.nextLine(); // consume newline
            System.out.println("enter the company name:");
            String com = s.nextLine();
            System.out.println("enter the salary:");
            double sal = s.nextDouble();
            s.nextLine(); // consume newline
            System.out.println("enter the DepartName:");
            String dep = s.nextLine();
            System.out.println("enter the Teacher id:");
            int tid = s.nextInt();
            s.nextLine(); // consume newline

            t[i] = new Teacher(nam, gen, add, age, eid, com, sal, dep, tid);
        }

       
        for (int i = 0; i < n; i++) {
         System.out.println("------Details of Teachers("+(i+1)+")--------------");
            t[i].display();
        }
    }
}

