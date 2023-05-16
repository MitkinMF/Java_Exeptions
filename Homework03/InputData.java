package Homework03;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in, "cp866");
        while (true){
            System.out.println("Введите строку через пробел как показанно на примере (Иванов Иван Иванович 10.10.1010 8888888888 f или m)");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                iScanner.close();
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели не все данные, попробуйте сначала");
            } else System.out.println("Вы ввели слишком много данных, попробуйте сначала");
        }
    }
}
