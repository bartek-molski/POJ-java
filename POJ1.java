package com.poj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Zadanie 1.1 - Sprawdzenie, czy liczba jest doskonała
         **/
//        System.out.println("Zadanie 1.1 - Sprawdzenie, czy liczba jest doskonała");
//        System.out.print("Podaj liczbę: ");
//        int number = scanner.nextInt();
//        System.out.println("Czy liczba doskonała? " + isPerfectNumber(number));

        /**
         * Zadanie 1.2 - Kalkulator
         **/
//        System.out.println("\nZadanie 1.2 - Kalkulator");
//        System.out.print("Podaj pierwszą liczbę: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Podaj drugą liczbę: ");
//        double num2 = scanner.nextDouble();
//        System.out.print("Podaj operację (+, -, *, /): ");
//        char operation = scanner.next().charAt(0);
//        System.out.println("Wynik: " + calculator(num1, num2, operation));

        /**
         * Zadanie 2.1 - Liczby pierwsze w zakresie
         **/
//        System.out.println("\nZadanie 2.1 - Liczby pierwsze w zakresie");
//        System.out.print("Podaj początek zakresu: ");
//        int start = scanner.nextInt();
//        System.out.print("Podaj koniec zakresu: ");
//        int end = scanner.nextInt();
//        printPrimeNumbers(start, end);

        /**
         * Zadanie 2.2 - Odwracanie liczby
         **/
//        System.out.println("\nZadanie 2.2 - Odwracanie liczby");
//        System.out.print("Podaj liczbę: ");
//        int reverseNumber = scanner.nextInt();
//        System.out.println("Odwrócona liczba: " + reverseNumber(reverseNumber));

        /**
         * Zadanie 3.1 - Suma liczb w tablicy
         **/
//        System.out.println("\nZadanie 3.1 - Suma liczb w tablicy");
//        System.out.print("Podaj liczbę elementów tablicy: ");
//        int n = scanner.nextInt();
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Podaj liczbę: ");
//            numbers[i] = scanner.nextInt();
//        }
//        System.out.println("Suma elementów: " + sumArray(numbers));

        /**
         * Zadanie 3.2 - Najczęściej występujący znak w Stringu
         **/
//        System.out.println("\nZadanie 3.2 - Najczęściej występujący znak w Stringu"); //-------------------------
//        System.out.print("Podaj tekst: ");                                            //trzeba wpisac drugiego stringa
//        scanner.nextLine();
//        String inputText = scanner.nextLine();
//        System.out.println("Najczęściej występujący znak: " + mostFrequentCharacter(inputText));

        /**
         * Zadanie 4.1 - Silnia
         **/
//        System.out.println("\nZadanie 4.1 - Silnia");
//        System.out.print("Podaj liczbę: ");
//        int factorialNum = scanner.nextInt();
//        System.out.println("Silnia: " + factorial(factorialNum));


        /**
         *  Zadanie 4.2 - Koty Ali
         **/
//        System.out.println("\nZadanie 4.2 - koty Ali");
//        System.out.print("Podaj ilosc kotów: ");
//        int kitties = scanner.nextInt();
//        cats(kitties);
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        int i=0;
        while(sum<num){
            i=i+1;
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }

    public static double calculator(double a, double b, char op) {
        switch (op) {
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': return a/b;
        }
        return -1;
    }

    public static void printPrimeNumbers(int start, int end) {
        for(int i=start; i<=end; i++){
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {

        return false;
    }

    public static int reverseNumber(int num) {
        int reversed=0;
        int numPom=num;
        int x=1;
        while(numPom>0)
        {
            numPom=numPom/10;
            x=x*10;
        }
        while(num>0){
            reversed=reversed+(num%10 * x);
            num=num/10;
            x=x/10;
        }
        return reversed/10;
    }

    public static int sumArray(int[] arr) {
        int suma=0;
        for(int num : arr){
            suma+=num;
        }
        return suma;
    }

    public static char mostFrequentCharacter(String str) {
        int dl_max=0;
        char most_frequent=' ';
        for(int i=0;i<str.length();i++){
            int dl=0;

            for(int j=i; j<str.length();j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    dl++;
                }
            }

            if(dl>dl_max){
                dl_max=dl;
                most_frequent=str.charAt(i);
            }
        }
        return most_frequent;
    }

    public static int factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }

    public static Void cats(int n) {
        if(n==1){
            System.out.println("Ala ma 1 kota");
        }else
        if(n>9 && n<20){
            System.out.println("Ala ma " + n +" kotów");
        }else
        if(n%10==2 || n%10==3 || n%10==4){
            System.out.println("Ala ma " + n +" koty");
        }else{
            System.out.println("Ala ma " + n +" kotów");
        }
        return null;
    }
}
