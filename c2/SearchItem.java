import java.util.*;

class SearchItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Amalu Jose Rollno:13 26-feb-2024");
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) { // Corrected loop start index
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to search:");
        int toSearch = in.nextInt();
        int flag = 0;
        int i;
        for (i = 0; i < size; i++) { // Corrected loop start index
            if (arr[i] == toSearch) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(toSearch + " found at position " + (i + 1)); // Corrected position
        } else {
            System.out.println("Element not found");
        }
    }
}
