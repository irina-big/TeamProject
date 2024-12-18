package allclasses.yaropolov;

import java.util.Random;

public class Bebra {
    public String playerName; // Имя игрока
    public int trophies; // Количество трофеев
    public int battlesPlayed; // Количество сыгранных боев
    public int battlesWon; // Количество выигранных боев
    public Random random = new Random(); // Генератор случайных чисел

    public Bebra(String playerName, int trophies) {
        this.playerName = playerName;
        this.trophies = trophies;
        this.battlesPlayed = 0;
        this.battlesWon = 0;
    }

    public void playBattle(boolean win) {
        battlesPlayed++;
        if (win) {
            battlesWon++;
            int trophiesWon = random.nextInt(31) + 20; // Случайное число от 20 до 50
            trophies += trophiesWon;
            System.out.println(playerName + " выиграл бой и получил " + trophiesWon + " трофеев.");
        } else {
            int trophiesLost = random.nextInt(21) + 10;  // Случайное число от 10 до 30
            trophies = Math.max(0, trophies - trophiesLost);
            System.out.println(playerName + " проиграл бой и потерял " + trophiesLost + " трофеев.");
        }
    }
    public void resetTrophies(){
        trophies = 0;
        System.out.println(playerName + " обнулил кол-во трофеев");
    }


    public void showStatistics() {
        System.out.println(playerName + " статистика:");
        System.out.println("Трофеи: " + trophies);
        System.out.println("Сыграно боев: " + battlesPlayed);
        System.out.println("Выиграно боев: " + battlesWon);
    }
}