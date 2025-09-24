package org.example;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

import static java.lang.Math.random;

public class PIX12000 {

    private static final Scanner sc = new Scanner(System.in, "UTF-8");

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
            System.out.println("6. Вычисление глубины и размера дырочки в попке пикса");
            System.out.println("7. Калькулятор физики проникновения хуя в пикса");
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
                        OtchimGenerator(); //  и так со всеми последующими кейсами
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
                    case 6:
                        popka_pixa();
                        break;
                    case 7:
                        physika_proniknoveniya();
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
            ++spermLiters;
        }
        System.out.println("сперма в пиксе: " + sperma + "Ltr's");

        for (int i = 2; xuev.length() <= sperma.intValue(); i++) {
            sperma = sperma.max(BigInteger.valueOf(i));
            sperma.pow(spermLiters);
            ++spermLiters;
        }
        System.out.println("Количество литров спермы в пиксе в общем: " + spermLiters + sperma.pow(spermLiters) + " Ltr's");
    }
    // Программа 6: вычисление глубины и размера дырочки в попке пикса
    private static void popka_pixa() {
        System.out.println("=== КАЛЬКУЛЯТОР ГЛУБИНЫ И РАЗМЕРА ДЫРОЧКИ В ПОПКЕ ПИКСА ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите окружность (радиус, строкой): ");
        String okrusnost = sc.nextLine().trim();
        System.out.print("Введите длину: ");
        int dlina = sc.nextInt();

        double r = Double.parseDouble(okrusnost);

        r = (r <= 0) ? 100 : r;
        dlina = (dlina <= 0) ? 100 : dlina;

        // вычисления анальных величин
        double pi = Math.PI;
        double dlinaDyrki = 2 * pi * r; // длина окружности
        double glubinaDyrki = dlina / dlinaDyrki;

        // объединения строк
        String d1rka = "Глубина дырочки в попке пикса: " + glubinaDyrki;
        String razmer = "Размер дырочки в попке пикса: ".concat(String.valueOf(dlinaDyrki));
        String goyda = String.join(" | ",
                "Окружность = " + r,
                "Длина = " + dlina,
                "Длина/окружность = " + dlinaDyrki
        );

        System.out.println(d1rka);
        System.out.println(razmer);
        System.out.println(goyda);
    }

    // Программа 7: Калькулятор скорости/физики проникновения
    private static void physika_proniknoveniya() {
        // Заголовок с использованием String.repeat
        final String title = "=== КАЛЬКУЛЯТОР ФИЗИКИ ПРОНИКНОВЕНИЯ ХУЯ В ПИКСА ===";
        System.out.printf("%n%s%n%s%n", title, "=".repeat(title.length()));

        // Выбор объекта (валидированный ввод)
        int objectType = getIntInput(
                "Выберите тип проникающего объекта:\n1. Огромный толстый хуй Маркуса\n2. Электрический дилдак\nВаш выбор: ",
                "Пожалуйста, введите 1 или 2",
                1, 2
        );

        // Ввод основных параметров (положительные значения с дефолтами)
        double distance = getPositiveDoubleInput("Введите расстояние проникновения (в см): ", 200);
        double time = getPositiveDoubleInput("Введите время проникновения (в секундах): ", 1);
        double mass = getPositiveDoubleInput("Введите массу объекта (в кг): ", 6.5);

        // Константы
        final double g = 9.8;
        final double frictionCoef = 0.28;

        // Базовые величины
        double velocity = distance / time; // v = s/t
        double force = mass * g; // F = m*g

        // Площадь контакта
        double radius = getPositiveDoubleInput("Введите радиус для расчета площади контакта: ", 2.5);
        double area = Math.PI * radius * radius; // S = πr²

        double pressure = force / area; // P = F/S
        double frictionForce = force * frictionCoef; // Fтр = μN

        // Кин. энергия: Ek = 1/2 m v²
        double velocityMps = velocity / 100.0; // см/с → м/с
        double kineticEnergy = 0.5 * mass * velocityMps * velocityMps; // Ek = 1/2 m v²

        // Красивый блок результатов
        String fmt = "%-26s %10.2f %s%n";
        StringBuilder results = new StringBuilder()
                .append("\n").append("=".repeat(35)).append("\n")
                .append("=== РЕЗУЛЬТАТЫ РАСЧЕТОВ ===\n")
                .append("-".repeat(40)).append("\n")
                .append(String.format(fmt, "Скорость", velocity, "см/с"))
                .append(String.format(fmt, "Сила", force, "Н"))
                .append(String.format(fmt, "Давление", pressure, "Па"))
                .append(String.format(fmt, "Сила трения", frictionForce, "Н"))
                .append(String.format(fmt, "Кинетическая энергия", kineticEnergy, "Дж"))
                .append("-".repeat(40)).append('\n');
        System.out.print(results.toString());

        boolean didMarcus = false;
        boolean didDildo = false;

        // Расчеты для объектов
        if (objectType == 1) {
            // Выталкивающая сила: F = ρ·V·g, V (мл) → (л) → (м³)
            double spermaVolume = getPositiveDoubleInput("Введите объем спермы (в мл): ", 50);
            double spermaDensity = 4000; // плотность, кг/м³
            double archimedesForce = spermaVolume * 0.001 * spermaDensity * g; // F = ρ·V·g

            // Давление на глубине: P = ρ·g·h
            double depth = getPositiveDoubleInput("Введите глубину проникновения (в см): ", distance);
            double depthPressure = spermaDensity * g * (depth / 100); // h в метрах

            // Сумм. сила
            double totalForce = force - frictionForce - archimedesForce;

            // Подраздел результатов
            String extraHeader = "\n— Дополнительно: Маркус —";
            StringBuilder extra = new StringBuilder()
                    .append(extraHeader).append('\n')
                    .append("-".repeat(extraHeader.length())).append('\n')
                    .append(String.format(fmt, "Выталкивающая сила", archimedesForce, "Н"))
                    .append(String.format("%-26s %10.2f %s%n", "Глубина", depth, "см"))
                    .append(String.format("%-26s %10.2f %s%n", "Давление на глубине", depthPressure, "Па"))
                    .append(String.format(fmt, "Суммарная сила", totalForce, "Н"));
            System.out.print(extra.toString());
            didMarcus = true;

        } else if (objectType == 2) {
            // Электрические параметры: P = U·I, E = P·t
            double voltage = getPositiveDoubleInput("Введите напряжение (в вольтах): ", 5);
            double current = getPositiveDoubleInput("Введите силу тока (в амперах): ", 0.5);

            double power = voltage * current; // P = U·I
            double energy = power * time; // E = P·t

            // Механическая работа: A = F·s (см → м)
            double work = force * distance / 100.0; // A = F·s

            // КПД: η = A/E · 100%
            double efficiency = (work / energy) * 100.0;

            String extraHeader = "\n— Дополнительно: Электродилдак —";
            StringBuilder extra = new StringBuilder()
                    .append(extraHeader).append('\n')
                    .append("-".repeat(extraHeader.length())).append('\n')
                    .append(String.format(fmt, "Мощность", power, "Вт"))
                    .append(String.format(fmt, "Энергия", energy, "Дж"))
                    .append(String.format(fmt, "Работа", work, "Дж"))
                    .append(String.format(fmt, "КПД", efficiency, "%"));
            System.out.print(extra.toString());
            didDildo = true;
        }

        // Предложение посчитать для другого варианта
        if (didMarcus) {
            if (getYesNoInput("\nТакже посчитать для электрического дилдака? (y/n): ")) {
                double voltage = getPositiveDoubleInput("Введите напряжение (в вольтах): ", 5);
                double current = getPositiveDoubleInput("Введите силу тока (в амперах): ", 0.5);

                double power = voltage * current;
                double energy = power * time;
                double work = force * distance / 100.0;
                double efficiency = (work / energy) * 100.0;

                String extraHeader = "\n— Дополнительно: Электродилдак —";
                StringBuilder extra = new StringBuilder()
                        .append(extraHeader).append('\n')
                        .append("-".repeat(extraHeader.length())).append('\n')
                        .append(String.format(fmt, "Мощность", power, "Вт"))
                        .append(String.format(fmt, "Энергия", energy, "Дж"))
                        .append(String.format(fmt, "Работа", work, "Дж"))
                        .append(String.format(fmt, "КПД", efficiency, "%"));
                System.out.print(extra.toString());
            }
        } else if (didDildo) {
            if (getYesNoInput("\nТакже посчитать для хуя Маркуса? (y/n): ")) {
                double spermaVolume = getPositiveDoubleInput("Введите объем спермы (в мл): ", 50);
                double spermaDensity = 4000;
                double archimedesForce = spermaVolume * 0.001 * spermaDensity * g;

                double depth = getPositiveDoubleInput("Введите глубину проникновения (в см): ", distance);
                double depthPressure = spermaDensity * g * (depth / 100);
                double totalForce = force - frictionForce - archimedesForce;

                String extraHeader = "\n— Дополнительно: Маркус —";
                StringBuilder extra = new StringBuilder()
                        .append(extraHeader).append('\n')
                        .append("-".repeat(extraHeader.length())).append('\n')
                        .append(String.format(fmt, "Выталкивающая сила", archimedesForce, "Н"))
                        .append(String.format("%-26s %10.2f %s%n", "Глубина", depth, "см"))
                        .append(String.format("%-26s %10.2f %s%n", "Давление на глубине", depthPressure, "Па"))
                        .append(String.format(fmt, "Суммарная сила", totalForce, "Н"));
                System.out.print(extra.toString());
            }
        }

        System.out.printf("%n%s%n", "Пикс выебан!");
    }

    // Метод для получения положительного double значения
    private static double getPositiveDoubleInput(String prompt, double defaultValue) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = sc.nextDouble();
                sc.nextLine(); // Очистка буфера
                if (value <= 0) {
                    System.out.printf("Используется значение по умолчанию: %.2f%n", defaultValue);
                    return defaultValue;
                }
                return value;
            } catch (InputMismatchException e) {
                System.out.printf("Ошибка ввода! Используется значение по умолчанию: %.2f%n", defaultValue);
                sc.nextLine(); // Очистка буфера
                return defaultValue;
            }
        }
    }

    // Метод для получения целого числа в заданном диапазоне
    private static int getIntInput(String prompt, String errorMessage, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = sc.nextInt();
                sc.nextLine(); // Очистка буфера
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println(errorMessage);
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                sc.nextLine(); // Очистка буфера
            }
        }
    }

    // Метод для получения ответа да/нет
    private static boolean getYesNoInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("y") || input.equals("д") || input.equals("да")) {
                return true;
            } else if (input.equals("n") || input.equals("н") || input.equals("нет")) {
                return false;
            } else {
                System.out.println("Пожалуйста, введите 'y'/'д' или 'n'/'н'.");
            }
        }
    }

}

