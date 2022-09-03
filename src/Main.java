public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        task1();
        System.out.println("Задание 2 ");
        task2();
        System.out.println("Задание 3 ");
        task3();
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
}