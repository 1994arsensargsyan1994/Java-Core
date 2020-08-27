package IO.FiloutputStreamAndFileInputStream;
import java.util.*;
import java.io.*;
class FIS {
   public static void  main(String arg[]) throws Exception {
       File name = new File("/home/arsen/Desktop/a/a.txt");
       File name1 = new File("/home/arsen/Desktop/a/a.txt");
        InputStream fio1 = new FileInputStream(name);
        InputStream fio11 = new FileInputStream(name);
// Создание объекта файлового потока
        int size;
        int size1;
        size1 = fio1.available();
        size = fio1.available(); // получения количества доступных байтов в потоке
        System.out.println("Available Bytes: " + size); //вывод количества доступных байт
        System.out.println("1st  25% of the file: read()"); //вывод на экран 25% потока
// считывание побайтно в цикле из потока fio1. Приведение каждого байта к типу
// char и вывод побайтно на экран
        for (int i=0; i < size/4; i++) {System.out.print((char) fio1.read()); }
        System.out.println("Available: " + fio1.available());
//вывод количества доступных байт, после вывода порции информации
        System.out.println("Reading the next 1/8: read(b[])");//вывод на экран 12,5% потока
        byte[] arr = new byte[size/8];
//создание массива типа байт, размером равным 1/8 объема первоначального потока.
// использование условного оператора для проверки соответствия считанных
// данных, размера на соответствие 1/8 исходного размера потока
        if (fio1.read(arr) != arr.length) {System.err.println("Something wrong");}
// создание объекта tempstring строкового типа, содержащего временную строку
// длиной arr.length
        String tempString = new String(arr, 0, 0, arr.length);
        System.out.println(tempString); //вывод строки на экран
        System.out.println("Available: " + fio1.available()); //вывод количества доступных байт
        System.out.println("Skip 1/4: skip()"); //Сообщение о пропуске следующих 25% потока
        fio1.skip(size/4); //пропуск ¼ данных
        System.out.println( "Available: " + fio1.available()); //вывод количества оставшихся байт
        System.out.println("Read len=1/8 to the end of array");
//Считывание в массив последних данных файла размером 1/8 исходного размера потока.
// Использование условного оператора для проверки соответствия считанных
// данных, размера на соответствие 1/8 исходного размера потока.
        if (fio1.read(arr, arr.length-size/8, size/8) != size/8) {
            System.err.println("Something wrong");}
        System.out.println("Available: " + fio1.available()); //вывод количества оставшихся байт
        fio1.close(); //закрытие потока, объект не связан с файлом, файл закрывается
       System.out.println("_____________________________________________________________");
       for (int i = 0; i <size1 ; i++) {
           System.out.print((char) fio11.read());
       }
       fio11.close();
    }}
