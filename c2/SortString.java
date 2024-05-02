import java.util.*;

class SortString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Amalu Jose Rollno:13 26-feb-2024");
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        String[] str = new String[size];
        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            str[i] = in.next();
        }
        Arrays.sort(str);
        System.out.println("Sorted strings:\n");
        for (int i = 0; i < size; i++) {
            System.out.println(str[i]);
        }
     
    }
}

