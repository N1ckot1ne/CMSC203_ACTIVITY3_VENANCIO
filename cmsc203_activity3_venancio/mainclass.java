import java.io.IOException;
import java.util.Scanner;



public class mainclass {
    
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner (System.in);
        boolean done = false;

        do
        {
            System.out.println("NO. of Test Cases: ");

            int testcase = scan.nextInt();
            System.out.println("Uber & Grab");


            if (1 <= testcase && testcase <= 10)
            {
                String inputs[] = new String [testcase];
                for ( int i = 0; i < testcase; i++)
                {
                  scan = new Scanner(System.in);

                  inputs[i] = scan.nextLine();

                
                }

                System.out.println();
                System.out.println("\nResult:");
                System.lineSeparator();

                for (String input : inputs)
                
                System.out.println(processInput(input));

                done = true;
            }
                else
                System.out.println ("\nInput must be 1-10 only");

        }

        while (!done);

        scan.close();
        
    }


    private static String processInput(String input)
    {

        String [] Inputs = input.split("\\s+");

        if ( Inputs.length !=2)

        return "INVALID INPUT";
        
        try
        {
            int UBER = Integer.parseInt(Inputs[0]);
            int GRAB = Integer.parseInt(Inputs[1]);

            if (UBER < GRAB)
            return "FIRST";

            else if (UBER > GRAB )
            return ("SECOND");

            else 
            return "ANY";
        }

            catch (Exception e)
            {
                return "INVALID INPUT";
            }

     }
        }