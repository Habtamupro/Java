package Pyramid;

import java.util.Scanner;

public class numPyr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows (lines)");
        int val = input.nextInt();
        if(val >= 1 && val <= 15) {
            //counting the number of rows
            for (int row = 1; row < val + 1; row++) {
                //Printing space before forming the triangle
                for (int j = val; j >= row; j--) {
                    System.out.print("   ");
                }
           /*The first half of right angle triangle
                     1
                   2 1
                 3 2 1
            */
                for (int k = row; k > 0; k--) {
                    if(k >= 10) {
                        System.out.print(k + " ");
                    }
                    else
                    {
                        System.out.print(k + "  ");
                    }
                }
           /*The second half of right angle triangle

                  2
                  2 3
                  2 3 4
            */
                for (int l = 2; l < row + 1; l++) {
                    if(l >= 10) {
                        System.out.print(l + " ");
                    }
                    else
                    {
                        System.out.print(l + "  ");
                    }
                }
                //entering new line after finishing a row
                System.out.println();
            }
        }
    }
}
