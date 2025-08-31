package org.example;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        // кодировка
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.err.println("UTF-8 not supported");
        }

        Scanner scanner = new Scanner(System.in, "UTF-8");
        int pix;

        do {
            // меню
            System.out.println("\n=== ПИКСА ЕБАТЕЛЬ 12000 ===");
            System.out.println("1. Программа прогрессии хуев");
            System.out.println("2. Генератор отчимов");
            System.out.println("3. pix.cry()");
            System.out.println("4. Анальная монетка судьбы пикса");
            System.out.println("5. Калькулятор литров спермы");
            System.out.println("0. Покинуть сексуальную обитель пикса...");
            System.out.print("Выбери способ издевательства: ");

            try {
                pix = scanner.nextInt();
                scanner.nextLine();

                // свич кейсы имба
                switch (pix) {
                    case 1:
                        MyProgram48(); // вызов метода
                        break; // выход из цикла
                    case 2:
                        OtchimGenerator();
                        break;
                    case 3:
                        pix_cry();
                        break;
                    case 4:
                        anal_monetka_pixa();
                        break;
                    case 5:
                        calculator_spermy();
                        break;
                    case 0:
                        System.out.println("Выход из сексуальной обители пикса...");
                        break;
                    default:
                        System.out.println("Ты далбаебина, заново пробуй");
                }

                if (pix != 0) {
                    System.out.println("\nЖме Enter для продолжения...");
                    scanner.nextLine();
                }

            } catch (Exception e) {
                System.out.println("Ты далбаеб, число введи");
                scanner.nextLine();
                pix = -1;
            }

        } while (pix != 0);

        scanner.close();
    }

    // Программа 1: Прогрессия хуев
    private static void MyProgram48() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("=== ПРОГРАММА ПРОГРЕССИИ ХУЕВ ===");
        System.out.print("Введите член прогрессии хуев в жопе пикса: ");
        String s = sc.nextLine();

        System.out.print("Введите множитель хуев пикса: ");
        int b = sc.nextInt();

        System.out.print("Введите количество повторений: ");
        int c = sc.nextInt();

        // проверки
        b = (b <= 1) ? 2 : b;
        c = (c < 10) ? 10 : c;

        System.out.println("------------------------------------------------------------------------------");

        String[] otchim = {"Маркус", "Дэрил", "Саймон", "Адольф", "Джэк", "Адам", "Дилан", "Дик", "Эрик", "Олег"};

        BigInteger chlensum = new BigInteger(s);
        chlensum = (chlensum.compareTo(BigInteger.TEN) < 0) ? BigInteger.TEN : chlensum;

        System.out.println("Сколько хуев множится в жопе пикса: " + chlensum);

        for (int i = 1; i <= c; i++) {
            BigInteger prev = chlensum;
            chlensum = chlensum.multiply(BigInteger.valueOf(b));
            String dick = otchim[rand.nextInt(otchim.length)];

            System.out.printf("Член %s № %d: %s * %d = %s%n", dick, i, prev, b, chlensum);

            try {
                Thread.sleep(180);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
                break;
            }
        }

        System.out.println("Сколько хуев в жопе пикса: " + chlensum);
    }

    // Программа 2: Генератор отчимов PIX 9000
    private static void OtchimGenerator() {
        System.out.println("=== ГЕНЕРАТОР ОТЧИМОВ PIX 9000 ===");
        System.out.println("Стоп слово - 'пикс гей'");

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String[] a = {"Маркус", "Дэрил", "Саймон", "Адольф", "Джэк", "Адам", "Дилан", "Дик", "Эрик", "Олег"};
        String[] goyda = {"Гитлер", "Dick", "Хуан", "Ломоаналов", "Джигурда", "Дебошир", "Пиписьков", "Стояк", "Кодыров", "Пиксаебатель9000"};
        String[] piska_markusa = {"по прозвищу 'Малыш'^^", "два слова: проблемы с отцом", "пикс хантер", "2 в одном)", "любит minecraft:ender_rod", "нянь по прозвищу 'Папочка'!", "FOR PIX"};

        final boolean[] shouldStop = {false};

        Thread stopThread = new Thread(() -> {
            while (!shouldStop[0]) {
                if (scanner.hasNextLine()) {
                    String input = scanner.nextLine();
                    if (input.equals("пикс гей")) {
                        System.out.println("\nТы чертовски прав, пикс гей!");
                        shouldStop[0] = true;
                        break;
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        stopThread.setDaemon(true);
        stopThread.start();

        try {
            while (!shouldStop[0]) {
                String otchim = String.format("%s %s (%s)",
                        a[rand.nextInt(a.length)],
                        goyda[rand.nextInt(goyda.length)],
                        piska_markusa[rand.nextInt(piska_markusa.length)]
                );
                System.out.println(otchim);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Генератор остановлен");
        }

        System.out.println("Пикс умер от хуев отчимав!");
    }

    // Программа 3: пикс плаке плаке
    private static void pix_cry() {
        System.out.println("=== НЫТЬЕ ПИКСА ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество нытья пикса: ");
        int nyt = sc.nextInt();

        nyt = (nyt <= 0) ? 10 : nyt;

        for (int i = 0; i < nyt; i++) {
            System.out.println("😭😭😭");

            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {}

        }

        System.out.println("Пикс умер от нытья");
        System.out.printf("\nПикс ныл %d раз(а)%n", nyt);


    }

    // Программа 4: Анальная монетка судьбы пикса
    private static void anal_monetka_pixa() {
        System.out.println("=== МОНЕТКА СУДЬБЫ ПИКСА ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество бросков монетки: ");
        int count = sc.nextInt();
        boolean anal = false;
        boolean anal2 = true;

        count = (count <= 0) ? 2 : count;

        for (int i = 0; i < count; i++) {
            double randomValue = random();
            if(randomValue >= 0.5) {
                anal = !anal;
                anal2 = !anal2;
            }
            System.out.println(anal ? "ПИКС СОСЕТ" : "ПИКС НЕ СОСЕТ");

            try {
                Thread.sleep(340);
            } catch (InterruptedException e) {}
        }
    }
    // Программа 5: Калькулятор литров спермы
    private static void calculator_spermy() {
        System.out.println("=== КАЛЬКУЛЯТОР ЛИТРОВ СПЕРМЫ ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество хуев в жопе пикса: ");
        String xuev = sc.nextLine();
        System.out.print("Введите множитель спермы: ");
        int sperm = sc.nextInt();
        int spermLiters = 0;

        BigInteger sperma = new BigInteger(xuev).multiply(BigInteger.valueOf(sperm));
        ++spermLiters;

        xuev = (xuev.length() > sperma.toString().length()) ? xuev.substring(0, sperma.toString().length()) : xuev; //substring(0, 1))
        sperm = (sperm <= 0) ? 200 : sperm;

        for (int i = 0; i < sperma.intValue(); i++) {
            sperma = sperma.multiply(BigInteger.valueOf(sperm));


        }

        for (int i = 2; xuev.length() <= sperma.intValue(); i++) {
            sperma = sperma.max(BigInteger.valueOf(i));
            sperma.pow(spermLiters);
            ++spermLiters;
        }
        System.out.println("Количество литров спермы в пиксе: " + spermLiters + sperma.pow(spermLiters) + "L");
    }

}