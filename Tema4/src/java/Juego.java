
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC
 */
public class Juego {

    private int computer;
    private int user;
    
    public Juego(int userSlct){
        computer = userSlct;
    }
    public int getComp() {
        Random obj = new Random();
        int move = obj.nextInt(3);
        return move;
    }

    public int getDecision(int choice1, int choice2) {
        if (choice1 == choice2) {
            return 0;
        } else {
            switch (choice1) {
                case 0:
                    if (choice2 == 2) {
                        computer += 1;
                        return 2;
                    } else {
                        user += 1;
                        return 1;
                    }
                case 1:
                    if (choice2 == 0) {
                        computer += 1;
                        return 2;
                    } else {
                        user += 1;
                        return 1;
                    }
                case 2:
                    if (choice2 == 1) {
                        computer += 1;
                        return 2;
                    } else {
                        user += 1;
                        return 1;
                    }
            }
        }
        return 0;
    }

    public void getResult() {
        if (user > computer) {
            System.out.println("User Wins");
        } else if (computer > user) {
            System.out.println("Computer wins");
        } else {
            System.out.println("It is a tie");
        }
    }
}
