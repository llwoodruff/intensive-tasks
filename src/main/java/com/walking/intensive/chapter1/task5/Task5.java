package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 12;
        double b = 13;
        double c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(getAreaByHeron(a, b, c));
            System.out.println(Arrays.toString(getHeights(a, b, c)));
            System.out.println(Arrays.toString(getMedians(a, b, c)));
            System.out.println(Arrays.toString(getBisectors(a, b, c)));
        } else {
            System.out.println("Треугольник вырожден или не существует");
        }
    }

    static double getAreaByHeron(double a, double b, double c) {
        //        Место для вашего кода
        double p = (a + b + c) / 2;
        return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        //        Место для вашего кода
        double doubleS = 2 * getAreaByHeron(a, b, c);
        double[] heights = new double[3];

        heights[0] = doubleS / a;
        heights[1] = doubleS / b;
        heights[2] = doubleS / c;

        Arrays.sort(heights);

        return heights; // Заглушка. При реализации - удалить
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        //        Место для вашего кода
        double aPow = Math.pow(a, 2);
        double bPow = Math.pow(b, 2);
        double cPow = Math.pow(c, 2);
        double[] medians = new double[3];

        medians[0] = 0.5 * Math.sqrt(2 * aPow + 2 * bPow - cPow);
        medians[1] = 0.5 * Math.sqrt(2 * aPow + 2 * cPow - bPow);
        medians[2] = 0.5 * Math.sqrt(2 * cPow + 2 * bPow - aPow);

        Arrays.sort(medians);

        return medians; // Заглушка. При реализации - удалить
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        //        Место для вашего кода
        double p = (a + b + c) / 2;
        double[] bisectors = new double[3];

        bisectors[0] = (2 * Math.sqrt(a * b * p * (p - c))) / (a + b);
        bisectors[1] = (2 * Math.sqrt(a * c * p * (p - b))) / (a + c);
        bisectors[2] = (2 * Math.sqrt(c * b * p * (p - a))) / (c + b);

        Arrays.sort(bisectors);

        return bisectors; // Заглушка. При реализации - удалить
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        //        Место для вашего кода

        return null; // Заглушка. При реализации - удалить
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }

    static double getCircumradius(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }
}