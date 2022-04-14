package exception_handling;

public class InvalidSalaryException extends Exception{
   public InvalidSalaryException(String str){
        super(str);
    }
}