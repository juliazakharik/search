import read.FileReader;
import search.WordSearcher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        long start1 = System.currentTimeMillis();
        System.out.println("Начало записи бд в массив");
        List<String> arr = FileReader.readFile("db.txt");
        System.out.println("Запись массива выполнялась " + (System.currentTimeMillis() - start1) + " миллисекунд");

        long start = System.currentTimeMillis();
        System.out.println("Начало выполнения алгоритма");
//        System.out.println(WordSearcher.search(arr, "235/70R150 шипов амобила камаз чесааалка для попы МАЗ автомабиблей кИвека"));
        System.out.println(WordSearcher.search(arr, "чесалллка"));

        System.out.println("алгоритм выполнялся " + (System.currentTimeMillis() - start) + " миллисекунд");

    }
}
