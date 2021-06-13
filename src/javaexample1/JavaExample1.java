
package javaexample1;

import static java.lang.System.in;
import java.util.Scanner;

public class JavaExample1 {

    
    public static void main(String[] args) {
       
        String myInput= GetInput("Enter the input: ");
        System.out.println("The output is: "+myInput);
    }
    
    private static String GetInput(String promt)
    {
        System.out.print(promt);
        Scanner myScan=new Scanner(in);
        String myInput=myScan.nextLine();
        return myInput;
    }
    
}
