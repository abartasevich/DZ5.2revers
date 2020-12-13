package vtb.abartasevich;

public class Main {

    public static void main(String[] args) {
        int[] myArray1 = {5, 12, 65, 1000, 5, 17, 600, 2};
        //создаем первый массив
        for (int i = 0; i < myArray1.length; i++) {
            System.out.println(myArray1[i]);
        }
        int[] myArray2 = new int[myArray1.length];
        //создаем второй массив равный по длине первому
        int z = myArray1.length - 1;
        //создаем переменную равную номеру последней ячейки в первом массиве
        for (int k = 0; k < myArray2.length; k++) {
            //заполняем второй массив
            int m = myArray1[z];
            myArray2[k] = m;
            z--;
            System.out.println();
        }
        int j = 0;
        //Копируем значения второго массива в первый
        for (int v = 0; v < myArray1.length; v++) {
            int l = myArray2[j];
            myArray1[v] = l;
            j++;
            System.out.println(myArray1[v]);
        };
    }
}
