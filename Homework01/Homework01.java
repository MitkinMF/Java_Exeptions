// Реализуйте 2 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий 
// новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий 
// новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//  Если длины массивов не равны, необходимо как-то оповестить пользователя. 
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class Homework01 {

    public static void main(String[] args) {
        int[] first = {1,2,3,1,5,76,4};
        int[] second = {1,5,2,4,0,76,6};
        int[] result = new int[first.length];
        //arraySub(first,second);
        // for (int i : result) {
        //     System.out.println(i);
        // }

        result = arrayDiv(first,second);
        for (int i : result) {
            System.out.println(i);
        }


    }

    static public int[] arraySub (int[] first, int[] second) {
        if( first.length != second.length){
            throw new RuntimeException("Arrays must be the same length ");
        }
        int[] result = new int [first.length];
        for (int i = 0; i < first.length; i++) {
            result[i] = first[i]-second[i];
        }
       return result;
    }

    static public int[] arrayDiv (int[] first, int[] second) {
        if( first.length != second.length){
            throw new RuntimeException("Arrays must be the same length ");
        }
        int[] result = new int [first.length];
        for (int i = 0; i < first.length; i++) {
            if( second[i] == 0){
                throw new RuntimeException("Divide by zero");
            }
            result[i] = first[i]/second[i];
        }
       return result;
    }

}
