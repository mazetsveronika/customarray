package by.mazets.array.exception;

public class CustomArrayException extends Exception {

    public CustomArrayException(){
        super();
    }
     public CustomArrayException(String message){
        super(message);
     }
     public CustomArrayException(Exception e){
        super(e);
     }
     public CustomArrayException(String message, Exception e){
        super(message,e);
     }
}
