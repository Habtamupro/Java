package count_Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        Scanner Input = new Scanner(System.in);
    int sum=0;
        int count_Positive =0;
        int count_Negative =0;

        //Accepting initial value
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter integers numbers only and enter 0 when you're finished");
        System.out.println("--------------------------------------------------------------");
        System.out.print("Enter integer Numbers ");
        int num = Input.nextInt();

        //Accepting uninitialized number of integers

         while(num != 0 ){
             Numbers.add(num);
             num = Input.nextInt();
        }
         //Displaying the Numbers user Entered
            System.out.println("The Number you entered are "+Numbers);
         //Counting +ve and -ve numbers and Comupting the sum
        for (int j :Numbers) {
            if(j > 0){
                count_Positive++;
            }
            else if(j < 0) {
                count_Negative++;
            }
            sum += j ;
        }

        float average = (float)sum/(float)Numbers.size();

        System.out.println("The number of positive numbers is " + count_Positive);
        System.out.println("The number of negative numbers is " + count_Negative);
        System.out.println("The total is " + sum);
        System.out.printf("The average is: " + average);
    }
}
