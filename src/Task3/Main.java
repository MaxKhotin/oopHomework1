package Task3;
//Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов
//        Computers размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер
//        (используя loop)


public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer(i);
        }
    }
}
