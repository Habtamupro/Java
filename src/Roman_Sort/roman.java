package Roman_Sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class roman {
    //checking if the letter is in the array
    public static int check_val(String input,String[] array){
        int val=0;
        int count =0;
        while(count < array.length) {
            if(input.equalsIgnoreCase(array[count])){
                val = count+1;
                break;
            }
            count++;
        }
        return val;
    }
    public static int  existance(String input,ArrayList<String>use) {
        int p =0,check =0;
        while ( p < use.size()) {
            if (input.equals(use.get(p))) {
                check = 1;
                break;
            }
            p++;
        }
        return  check;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean pass= true;
        String[] Roman_Number = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII",
                "IX", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        //Showing the user the list of Roman Numbers
        int show_count=0;
        System.out.println("Here are the Roman Numbers");
        for (String Rom:Roman_Number) {
            if(show_count < 10) {
                System.out.print(" " + "'"+(show_count + 1) +"'" +" = " + Rom+",");
                show_count++;
            }
            else{
                System.out.print(" "+(show_count)+ " = "+ Rom+",");
                if (show_count == 20){
                    System.out.println();
                }
                show_count+=10;
            }
        }
        System.out.println();
        //Accepting the numbers without boundary
        System.out.println("Enter the Roman Numbers and Press 'enter' to Finish");
        System.out.println("Enter the Roman Number 1:");
        String num = input.nextLine();
        if (check_val(num, Roman_Number) != 0) {
            ArrayList<String> user = new ArrayList<>();
            int input_Count = 1;
            while (!num.equals("")) {
                user.add(num);
                System.out.println("Enter the roman number " + (input_Count + 1));
                num = input.nextLine();
                //empty and correct
                if (check_val(num, Roman_Number) == 0 && !num.equals("")) {
                    System.out.println("PLease enter correct roman Number");
                    pass= false;
                    break;
                }
                input_Count++;
            }
            if(pass) {
                System.out.println("You have pressed enter ");
                System.out.println("Exiting and sorting out....");
                //Displaying the entered numbers
                int ct = 0;
                System.out.println("------------------------------");
                System.out.println("   You entered the numbers");
                System.out.println("------------------------------");
                for (String i : user) {
                    System.out.print(" " + i.toUpperCase());
                    if (ct + 1 < user.size()) {
                        System.out.print(", ");
                    }
                    ct++;
                }
                System.out.println();

                //sorting the array
                int k = 0;
                while (k < user.size()) {
                    int j = k;
                    while (j < user.size()) {
                        if (check_val(user.get(k), Roman_Number) > check_val(user.get(j), Roman_Number)) {
                            //built in swapper
                            Collections.swap(user, k, j);
                        }
                        j++;
                    }
                    k++;
                }

                ArrayList<String> final_user = new ArrayList<>();
                for (String s : user) {
                   if((existance(s,final_user)) == 0){
                       final_user.add(s);
                   }
                }

                //Displaying the numbers
                System.out.println("------------------------------");
                System.out.println("   The sorted numbers");
                System.out.println("------------------------------");
                int count = 0;
                for (String i : final_user) {
                    System.out.print(i.toUpperCase() + " ");
                    if (count + 1 < final_user.size()) {
                        System.out.print("< ");
                    }
                    count++;
                }
            }
        }
        else{
            System.out.println("PLease enter correct roman Number");
        }
    }

}
