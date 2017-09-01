package Base.Cycle.Cycle;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    static void prinArr(int a[]){
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void print2DArr(int a[][]){
        for(int arr[] : a){
            for (int elem : arr)
                System.out.print(elem + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Arr[] = new int [10];
        int Arr2D[][] = new int[5][10];
        Random random = new Random();

        System.out.println("-------- 1D ARRAY --------");

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = random.nextInt(10);
        }


        prinArr(Arr);

        System.out.println("\n\n-------- 2D ARRAY --------");

        System.out.println(Arr2D.length);
        System.out.println(Arr2D[1].length);

        for (int i = 0; i < Arr2D.length; i++) {
            for (int j = 0; j < Arr2D[i].length; j++) {
                Arr2D[i][j] = random.nextInt(10);
            }
        }


        print2DArr(Arr2D);

        System.out.println("\n\n-------- ARRAYS --------");
        System.out.println("-Sort --------");
        Arrays.sort(Arr);
        prinArr(Arr);
        System.out.println("-asList --------");

        Integer newArr[] = new Integer[Arr.length];

        for (int i = 0; i < Arr.length; i++) {
            newArr[i] = Arr[i];
        }

        //List include only reference data
        List<Integer> integers = Arrays.asList(newArr);



        System.out.println("asList --------\n \t size");
        System.out.println(integers.size());
        System.out.println("asList --------\n \t get");
        System.out.println("for -------- ");
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("sout -------- ");
        System.out.println(integers);

        System.out.println("fori -------- ");
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) +" ");
        }

        System.out.println("\nwhile -------- ");
        int k = 0;
        while (k < integers.size()){
            System.out.print(integers.get(k)+" ");
            k++;
        }
        //!!! remove Iterator
        System.out.println("\niterator -------- ");

        integers.set(1,100);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
           // System.out.println(iterator.hasNext());
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("asList --------\n \t ");

        List<Integer> integerList = new ArrayList<>(integers);
        CopyOnWriteArrayList<Integer> integers1 = new CopyOnWriteArrayList<>(integers);


        /*
        * Произойдет ConcurrentModificationException т.к. нелзя одновременно пробегать по
        * массиву и менять его размер.
        * НЕ ДОПУСКАЕТСЯ модифицировать коллекцию во время работы над ней
        * так как внутри коллекции используется счетчик и он сбивается
        *
        *   for (Integer integer : integerList) {
            if (integer == 3)
                integerList.remove(integer);
        }
        *
        * */

        System.out.println("remove --------\n \t ");

        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");


        for (Integer integer : new ArrayList<>(integerList)) {
            if (integer == 5)
                integerList.remove(integer);
        }


        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");

        Iterator<Integer> iterator2 = integerList.iterator();
        while (iterator2.hasNext()) {
            Integer next = iterator2.next();
            if ((next == 3)) {
                //integerList.remove(next); !!! ОШИБКА
                iterator2.remove();
            }
        }

        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }


        System.out.println("\n");

        System.out.println("CopyOnWriteArrayList");

        for (Integer integer : integers1) {
            if (integer == 9)
                integers1.remove(integer);
        }

        for (Integer integer : integers1) {
            System.out.print(integer + " ");
        }






        System.out.println("asArrayList --------\n \t ");

        integerList.add(121);

        Iterator<Integer> iterator1 = integerList.iterator();
        while (iterator1.hasNext()){
            //iterator1.remove();
        }


        System.out.println(integerList);

        System.out.println(Arrays.toString(Arr));


    }
}
