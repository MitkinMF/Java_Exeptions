package Homework02;

import java.util.Scanner;

public class Homework02 {

    public static void main(String[] args) throws Exception  {
        //getNumber();
        //task2();
        //task3();
        task4();

    }



//Задание 1

public static void getNumber() {
    Scanner scanner;
    scanner = new Scanner(System.in, "cp866");
    System.out.println("Введите дробное число ");
    while (!scanner.hasNextFloat()) {
        System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз:");
        scanner.next();
    } 
    float result =scanner.nextFloat();
    scanner.close();
    System.out.println(result);
}


//Задание 2


    public static void task2 () {
        int[] intArray={1,2,3,5,6,4,6,4,6,4};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
        }
    }


//Задание 3

    public static void task3() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
        public static void printSum(Integer a, Integer b) throws Exception {
            System.out.println(a + b);
        }


//Задание 4
        public static void task4() {
            Scanner scanner;
            scanner = new Scanner(System.in, "cp866");
            System.out.println("Введите что-нибудь");
            String str = scanner.nextLine();
            str=str.replaceAll( "[\\s\\n\\r]", "");
            while (str == "") { 
                System.out.println("Строка не должна быть пустой:");
                str=scanner.nextLine();
                str=str.replaceAll( "[\\s\\n\\r]",null);
            } 

        
            //scanner.nextLine()
            //str=str.replaceAll( "[\\s\\n\\r]","");
            System.out.println(str);
            scanner.close();
        }
    
}