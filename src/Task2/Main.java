package Task2;

//Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
//        содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
//        названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
//        книги, имя автора и Содержание.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        String title = sc.nextLine();
        System.out.println("Введите имя автора: ");
        String author = sc.nextLine();
        System.out.println("Введите содержание: ");
        String content = sc.nextLine();
        book1.setTitle(title);
        book1.setAuthor(author);
        book1.setContent(content);
        book1.show();

    }
}