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

        //Домашнее задание 3.
        //Задание-1.
        System.out.println("Задание-1.");

        int yearsOld = 14;

        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то ему нужно ходить в детский сад.");
        } else if (yearsOld >= 7 && yearsOld <= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то ему нужно ходить в школу.");
        } else if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то ему нужно ходить в университет.");
        } else if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то ему нужно ходить на работу.");
        }

        //Задание-2.
        System.out.println("Задание-2.");

        if (yearsOld < 5) {
            System.out.println("Если ребенку " + yearsOld + " лет, то он не может кататься на аттракционе.");
        } else if (yearsOld >= 5 && yearsOld < 14) {
            System.out.println("Если ребенку " + yearsOld + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (yearsOld >= 14) {
            System.out.println("Если ребёнку " + yearsOld + " лет, то он может кататься без сопровождения взрослого.");
        }

        //Задание-3.
        System.out.println("Задание-3.");

        int one = 5;
        int two = 5;
        int free = 5;

        if (one > two) {
            if (one > free) {
                System.out.println("Максимальное число " + one);
            } else if (one < free) {
                System.out.println("Максимальное число " + free);
            } else if (one == free) {
                System.out.println("Числа " + one + " и " + free + " равны.");
            }
        } else if (one < two) {
            if (two > free) {
                System.out.println("Максимальное число " + two);
            } else if (two < free) {
                System.out.println("Максимальное число " + free);
            } else if (two == free) {
                System.out.println("Числа " + two + " и " + free + " равны.");
            }
        } else if (one == two && one > free) {
            System.out.println("Числа " + one + " и " + two + " равны.");
        } else
            if (one > free) {
                System.out.println("Максимальное число " + one);
            } else if (one < free) {
                System.out.println("Максимальное число " + free);
            }else {
                System.out.println("Все числа равны.");
            }
        }
    }