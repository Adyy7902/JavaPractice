package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author V KUMAR
 */
public class ReadInput {
    public static String read(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Expression (for example 3*4+1): ");
        
        String inputLine = scanner.nextLine();
        
        scanner.close();
        
        return inputLine;
    }
}
