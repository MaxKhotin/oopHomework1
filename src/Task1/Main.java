package Task1;

//Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса
//        создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
//        вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
//        прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
//        принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
//        площадь.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите две стороны прямоугольника: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        Rectangle rect = new Rectangle();
        rect.setSide1(side1);
        rect.setSide2(side2);
        System.out.println("Площадь прямоугольника: " + rect.areaCalculator());
        System.out.println("Периметр прямоугольника: " + rect.perimeterCalculator());
    }
}
