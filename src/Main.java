public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 2\n" + " Задание 1");
        task1();
        System.out.println(" Задание 2 ");
        task2();
        System.out.println(" Задание 3 ");
        task3();
        System.out.println("\n" + "Домашнее задание - 3\n" + " Задание 1");
        task4();
        System.out.println(" Задание 2 ");
        task5();
        System.out.println(" Задание 3 ");
        task6();
    }

    public static void task1() {
        int age = 5;
        if (age >= 18)
            System.out.println("с совершеннолетием");
        else
            System.out.println("возраст совершеннолетия ещё не наступил, и нужно немного подождать");
    }

    public static void task2() {
        int age = 23;
        if ((age >= 7) && (age < 18))
            System.out.println("ребенок ходит в школу");
        else if ((age >= 18) && (age < 24))
            System.out.println("человек уже закончил школу и может отправляться в университет");
        else if (age >= 24)
            System.out.println("человек окончил университет и ему пора искать первую работу");
    }

    public static void task3() {
        int numberOfPeople = 62;
        int wagonCapacity = 102;
        int seatPlace = 60;
        if ((numberOfPeople >= 0) && (numberOfPeople < seatPlace))
            System.out.println("в вагоне есть сидячее место");
        else if ((numberOfPeople >= seatPlace) && (numberOfPeople < wagonCapacity))
            System.out.println("в вагоне есть стоячее место");
        else if (numberOfPeople >= wagonCapacity)
            System.out.println("вагон полностью забит");
    }

    public static void task4() {
        int age = 19;
        if (age >= 2 && age <= 6) {
            System.out.println("нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("место в университете");
        } else if (age > 24) {
            System.out.println("пора ходить на работу");
        }
    }

    public static void task5() {
        int age = 6;
        if (age < 5) {
            System.out.println("не может кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age >= 14) {
            System.out.println("может кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        int one = 1;
        int two = 2;
        int free = 3;
        if (one < free && two < free) {
            System.out.println(free);
        } else if (one < two && two > free) {
            System.out.println(two);
        } else if (one > two && one > free) {
            System.out.println(one);
        }
    }
}