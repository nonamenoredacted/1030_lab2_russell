import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
      int includeChpt;
      int i, j;
      boolean anySelected = false;
      
      // Get the chapter selections
      for (i = 1; i <= 15; ++i) {
         includeChpt = scnr.nextInt(); 
         if (includeChpt==1) {
            chptList[i] = true;
         } else {
            chptList[i] = false;
         }
      }
      
      /* Type your code here. */
      for (i = 1; i <= 15; ++i) {
        if (chptList[i]==true) {
            anySelected = true;
            if (i<=13 && chptList[i]==true && chptList[i+1]==true && chptList[i+2]==true) {
                j = i;
                while (i<=14 && chptList[i]==true && chptList[i+1]==true) {
                    i++;
                }
                System.out.print(j + "-" + i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
      }
      if (anySelected==false) {
        System.out.print("None ");
      }
      System.out.println("");
   }
}

