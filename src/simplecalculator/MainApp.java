package simplecalculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author V KUMAR
 */
public class MainApp {
    public static void main(String[] args) {
        final String input = ReadInput.read();
        
        Queue<String> operations;
        Queue<String> numbers;
        
        //This will split numbers and operators from the input String
        String numberArray[] = input.split("[-+*/]");
        String operArray[] = input.split("[0-9]+");
        
        //This will store splitted numbers and operators in the queues as Linked List
        numbers = new LinkedList<>(Arrays.asList(numberArray));
        operations = new LinkedList<>(Arrays.asList(operArray));
        
        Double result = Double.parseDouble(numbers.poll());
        
        while(!numbers.isEmpty()){
            String operator = operations.poll();
            
            Operate operate;
            switch (operator) {
                case "+" -> operate = new Add();
                case "-" -> operate = new Subtract();
                case "*" -> operate = new Multiply();
                case "/" -> operate = new Divide();
                default -> {
                    continue; 
                }
            }
            
            Double number = Double.parseDouble(numbers.poll());
            result = operate.getResult(result,number);
        }
        System.out.println("The result of the expression is: " +result);
    }
}
