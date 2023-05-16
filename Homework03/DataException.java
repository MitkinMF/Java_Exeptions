package Homework03;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exeption: NotCorrectData");
        System.out.printf(" Invalid data format : %s", i);
        System.out.println();
    }
}