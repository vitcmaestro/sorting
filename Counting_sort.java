
package countingsort;

import java.util.Scanner;

public class CountingSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input to sort");
        String s = scan.nextLine();
        char[] charr = s.toCharArray();
        sort(charr);
        
    }

    private static void sort(char[] charr) {
        int[] count = new int[256];
        for(int i =0;i<charr.length;i++)
        {
            count[charr[i]]++;
        }
        for(int i =1;i<256;i++)
        {
            count[i]+=count[i-1];
        }
        char[] output = new char[charr.length];
        for(int i =0;i<charr.length;i++)
        {
            output[count[charr[i]]-1] = charr[i];
            count[charr[i]]--;
        }
        for(int i =0;i< charr.length;i++)
            System.out.print(output[i]);
    }
    
}
