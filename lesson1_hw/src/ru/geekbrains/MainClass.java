package ru.geekbrains;

public class MainClass {
    public static void main(String[] args) {

        Action team[] = {new Human("Петр", 2000, 2), new Human("Арсений", 1500, 1), new Human("Степан", 1000, 1),
                        new Cat("Барсик", 500, 2), new Cat("Мурка", 1000, 3), new Cat("Борис", 700, 2),
                        new Robot("R2D2", 1000, 0), new Robot("Плазмотрон", 3000, 3), new Robot("Электроник", 1500, 5)};

        Obstructions obstructions[] = {new Wall(1), new Track(500), new Wall(3),
                 new Track(1000), new Wall(2), new Track(2000)};

        for (int i = 0; i < team.length; i++) {
            System.out.println("Участник под номером " + (i + 1) + ": " + team[i].getName());
        }

        for (Action participant: team) {
            for (int j = 0; j < obstructions.length; j++) {
                if (obstructions[j] instanceof Wall) {
                   if (participant.jump((Wall) obstructions[j])) {
                       System.out.println(participant.getName() + " перепрыгнул препятствие");
                   } else {
                       System.out.println(participant.getName() + " не перепрыгнул препятствие. Участник выбывает из гонки!");
                       break;
                   }
                } else {
                    if (participant.run((Track) obstructions[j])) {
                        System.out.println(participant.getName() + " пробежал препятствие");
                    } else {
                        System.out.println(participant.getName() + " не пробежал препятствие. Участник выбывает из гонки!");
                        break;
                    }
                }
            }
        }
    }
}
