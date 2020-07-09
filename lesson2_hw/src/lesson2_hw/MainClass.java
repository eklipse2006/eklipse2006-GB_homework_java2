package lesson2_hw;

class ArrayException extends IndexOutOfBoundsException {
    public ArrayException(String s) {super();}
}

class StringToIntException extends NumberFormatException {
    public StringToIntException(String s) {super();}
}

public class MainClass {
    public static void main(String args[]) {
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
            System.out.println("Результат расчета: " + arrayToInt(stringToArray(str)));
    }

    public static String[][] stringToArray(String str) {
        String[] a = str.split("\n");

        if (a.length != 4) {
            throw new ArrayException("Неверное число элементов массива");
        }

        String[][] resultArray = new String[4][];
        for (int i = 0; i < a.length; i++) {
            resultArray[i] = a[i].split(" ");
            if (resultArray[i].length != 4) {
                throw new IndexOutOfBoundsException("Неверное число элементов массива");
            }
        }

        return resultArray;
    }

    public static int arrayToInt(String[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result = Integer.parseInt(array[i][j]) + result;
                } catch (StringToIntException e) {
                    System.out.println("Элемент массива не является числом");
                }
            }
        }
        result = result / 2;
        return result;
    }
}
