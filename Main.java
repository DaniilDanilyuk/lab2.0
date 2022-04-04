package com.company;

import java.util.Scanner;

public class Main {
    /*
     25)Оценки, полученные спортсменом в соревнованиях по фигурному катанию (в баллах),
     хранятся в массиве из 18 элементов. В первых шести элементах записаны оценки по
     обязательной программе, с седьмого по двенадцатый — по короткой программе, в
     остальных — по произвольной программе. Выяснить, по какому виду программы спортсмен
     показал лучший результат.
     */
    public static void main(String[] args) {
    int bigest = 0;
    int rating[]  = new int[18];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter scores");
    int sum =0;
    int bigestresult = 0;
    for(int i=0; i<18; i++){
        rating[i] = scanner.nextInt();
        if (rating [i] > bigestresult){
            bigest = i + 1;
            bigestresult = rating [i];
        }
    }

    for (int i=0; i<6; i++){
        if (bigestresult == rating [i]){
            sum +=1;
            break;
        }
    }
    for (int i = 6; i<12; i++) {
        if (bigestresult == rating[i]) {
            sum += 2;
            break;
        }
    }
    for (int i=12; i <18; i++){
        if (bigestresult == rating [i]){
            sum += 4;
            break;
        }
    }


    if ( sum == 1 && bigest <6){
        System.out.print("Better result in prog. 1");
    }
    else if (sum ==2 && bigest > 6 && bigest < 12 ) {
        System.out.print("Better result in prog. 2");
    }
    else if (sum == 4 && bigest > 12) {
        System.out.print("Better result in prog. 3");
        }
    else if (sum== 3 && bigest < 12){
        System.out.print("Better results in prog. 1 and 2");
    }
    else if (sum == 5 && (bigest < 6 || bigest > 12)){
        System.out.print("Better results in prog. 1 and 3");
    }
    else if ( sum == 6 && bigest > 6){
        System.out.print("Better results in prog. 2 and 3");
    }
    else if ( sum == 7){
        System.out.print("There are the same results in all programs");
    }




    }

}
/*
50) Задана последовательность N целых чисел. Вычислить сумму элементов массива, у которых
    порядковый номер совпадает со значением.
 */
class lab2 {
    public static void main(String[] args){
    System.out.println("Write N");
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int x[] = new int[N];
    for (int i=0; i<N; i++){
        x[i] = (int) (Math.random()*N);
    }
    int sum =0;
    for (int i=0; i < N; i++){
        if (x[i] == i){
            sum += x[i];
        }
    }
    System.out.println("Sum = "+sum);
    }
}
/*
75) Дана непустая последовательность целых чисел, оканчивающаяся числом 100.
Определить, есть ли в последовательности число 77. Если имеются несколько таких чисел, то определить
порядковый номер первого из них.
 */
class lab3 {
    public static void main(String[] args){
    int[] x = new int[100];
    x[99] = 100;
    for (int i=0; i<99; i++){
        x[i] = (int) (Math.random()*100);
        if (x[i] == 77){
            System.out.println("Its number "+i);
            break;
        }

    }

    }
}
/*
100) Удалить элемент массива вещественных чисел, которые больше первого, но меньше 6-го элементов массива.
Если таких элементов нет, выдать сообщение «таких элементов нет», иначе удалить первый найденный элемент.
 */
class lab4 {
    public static void main(String[] args) {
    int[] array = new int[10];
    int len = 0;
    for (int i=0; i<10; i++) {
        array[i] = (int) (Math.random() * 10);
    }
    for (int i=0; i<10;i++){
        if (array[0] < array[i] && array[6] > array[i]) {
            len = i;
            break;
        }
    }
    if (len == 0){
        System.out.println("There are no such elements");
    }
    else {
        for (int i = len; i < 9; i++) {
            array[i] = array[i + 1];
        }
    }


    }

}
/*
Даны вещественные числа а1, а2, ..., an. Среди них есть положительные и отрицательные.
Заменить нулями те числа, величина которых по модулю больше максимального числа (|ai| > max {a1, a2, …, an}).

 */
class lab5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write N");
    int n = scanner.nextInt();
    int bigestnum = 0;
    int[] array = new int[n];
    System.out.println("Your array:");
    for (int i = 0; i < n; i++) {
        array[i] = (int) Math.round((Math.random() * 40) - 20);
        System.out.println(array[i]);
        if (array [i] > bigestnum){
            bigestnum = array[i];
        }
    }
    System.out.println("New array:");
    for (int i = 0; i < n; i++) {
        if(array [i]*-1 > bigestnum){
            array [i] = 0;
        }
    System.out.println(array[i]);
    }



    }
}
