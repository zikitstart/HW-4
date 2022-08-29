public class Main {
    public static void main(String[] args) {
        //Задание-1.
        System.out.println("Задание-1.");

        int age = 7;

        if (age >= 18) {
            System.out.println("Поздравляем пользователя с совершеннолетием!");
        } else  {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
        //Задание-2.
        System.out.println("Задание-2.");

        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else if (age >= 24 ) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }
        //Задание-3.
        System.out.println("Задание-3.");

        int totalPlaces = 102;
        int totalSeats = 60;
        int standingPlaces = totalPlaces - totalSeats;

        int seatsPlaces = 61;
        int standPlaces = 43;

        if (seatsPlaces < totalSeats) {
            System.out.println("Есть ещё " + (totalSeats - seatsPlaces) + " сидячих мест.");
        }
        if (standPlaces < standingPlaces) {
            System.out.println("Есть ещё " + (standingPlaces - standPlaces) + " стоячих мест.");
        } else if ((seatsPlaces + standPlaces) > totalPlaces) {
            System.out.println("Вагон уже полностью забит.");
        }
    }
}