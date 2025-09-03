package studio1;

import java.util.Scanner;

public class average {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Give two integers");

        double n1 = in.nextInt();
        double n2 = in.nextInt();
        
        double Average = ((n1+n2)/2);
        System.out.println(Average);



    }

}
