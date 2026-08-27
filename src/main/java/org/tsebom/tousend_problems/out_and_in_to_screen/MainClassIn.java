package org.tsebom.tousend_problems.out_and_in_to_screen;

import java.util.Scanner;

public class MainClassIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.8. Составить программу вывода на экран числа, вводимого с клавиатуры.
        // Выводимому числу должно предшествовать сообщение «Вы ввели число».
//        System.out.print("Enter a number: ");
//        int in1 = Integer.parseInt(scanner.nextLine());
//        System.out.printf("Вы ввели число: %d\n\n", in1);

        // 1.9. Составить программу вывода на экран числа, вводимого с клавиатуры.
        // После выводимого числа должно следовать сообщение «– вот какое число Вы ввели».
//        System.out.print("Enter a number: ");
//        double in2 = Double.parseDouble(scanner.nextLine());
//        System.out.printf("%.1f – вот какое число Вы ввели\n\n", in2);

        // 1.10. Составить программу, которая запрашивает имя человека и повторяет его на экране.
//        System.out.print("Введите свое имя: ");
//        String in3 = scanner.nextLine();
//        System.out.printf("%s\n\n", in3);

        // 1.11. Составить программу, которая запрашивает название футбольной команды и повторяет его на экране со словами «– это чемпион!».
//        System.out.print("Введите: ");
//        String in4 = scanner.nextLine();
//        System.out.printf("%s – это чемпион!\n\n", in4);

        // 1.12. Напишите программу, в которую вводится имя человека и выводится на экран приветствие в виде слова «Привет»,
        // после которого должна стоять запятая, введенное имя и восклицатель- ный знак. После запятой должен стоять пробел,
        // а перед воскли- цательным знаком пробела быть не должно.
//        System.out.print("Введите: ");
//        String in5 = scanner.nextLine();
//        System.out.printf("Привет, %s!\n\n", in5);

        // 1.13. Напишите программу, в которую вводится целое число, после чего на экран выводится следующее и предыдущее целое число.
        // Например, при вводе числа 15 на экран должно быть вы- ведено:
        //
        // Следующее за числом 15 число – 16.
        // Для числа 15 предыдущее число – 14.

//        System.out.print("Enter a number: ");
//        int in0 = Integer.parseInt(scanner.nextLine());
//        System.out.printf("Следующее за числом %s число – %s\n", in0, in0 + 1);
//        System.out.printf("Для числа %s предыдущее число – %s\n", in0, in0 - 1);

        // 1.14. Составить программу вывода на экран в одну строку трех любых чисел, вводимых с клавиатуры, с двумя пробелами между ними.

//        int[] arr = new int[3];
//        for (int i = 0; i < arr.length; i++) {
//            int num = Integer.parseInt(scanner.nextLine());
//            arr[i] = num;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%s  ", arr[i]);
//        }

        // 1.15. Составить программу вывода на экран в одну строку четырех любых чисел, вводимых с клавиатуры, с одним пробелом между ними.
//        int[] arr = new int[4];
//        for (int i = 0; i < arr.length; i++) {
//            int num = Integer.parseInt(scanner.nextLine());
//            arr[i] = num;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%s ", arr[i]);
//        }

        // Составить программу вывода на экран следующей информации:
        // а) 5 10      б) 100 t     в) x 25
        //    7 см         1949 v       x y
        // Примечание t, v, x и y – переменные величины целого типа,
        // значения которых вводятся с клавиатуры и должны быть выведены вместо имен величин.
//        int t = Integer.parseInt(scanner.nextLine());
//        int v = Integer.parseInt(scanner.nextLine());
//        int x = Integer.parseInt(scanner.nextLine());
//        int y = Integer.parseInt(scanner.nextLine());
//        System.out.printf("а) 5 10      б) 100 %s     в) %s 25\n", t, x);
//        System.out.printf("   7 см         1949 %s       %s %s", v, x, y);

        // 1.17. Составить программу вывода на экран следующей ин- формации:
        // а) 2 кг    б) а 1    в) x y
        //    13 17      19 b      5 y
        // Примечание a, b, x и y – переменные величины целого типа,
        // значения которых вводятся с клавиатуры и должны быть выведены вместо имен величин.
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        System.out.printf("а) 2 кг    б) %s 1    в) %s %s\n", a, x, y);
        System.out.printf("   13 17      19 %s      5 %s", b, y);
    }
}
