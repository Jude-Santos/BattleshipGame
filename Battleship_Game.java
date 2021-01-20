import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Battleship_Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship_Game
{

    public static void main(String[] args) {
            System.out.print('\u000C');
            Scanner key = new Scanner(System.in);
            Random rand = new Random();
        boolean playAgain = true;
        int x,y;
        String hit = "H";
        String miss = "M";
        int number = 5;
        int iCount = 0;
        int jCount = 0;
        int shipx1_0 = rand.nextInt(10) + 1;
        int shipy1_0 = rand.nextInt(10) + 1;
        int shipx1_1 = shipx1_0 + 1;
        int shipy1_1 = shipy1_0;
        int shipx1_2 = shipx1_0 - 1;
        int shipy1_2 = shipy1_0;
        int shipx2_0 = rand.nextInt(10) + 1;
        int shipy2_0 = rand.nextInt(10) + 1;
        int shipx2_1 = shipx2_0 + 1;
        int shipy2_1 = shipy2_0;
        int shipx2_2 = shipx2_0 - 1;
        int shipy2_2 = shipy2_0;
        int shipx3_0 = rand.nextInt(10) + 1;
        int shipy3_0 = rand.nextInt(10) + 1;
        int shipx3_1 = shipx3_0 + 1;
        int shipy3_1 = shipy3_0;
        int shipx3_2 = shipx3_0 - 1;
        int shipy3_2 = shipy3_0;
        int shipx4_0 = rand.nextInt(10) + 1;
        int shipy4_0 = rand.nextInt(10) + 1;
        int shipx4_1 = shipx4_0 + 1;
        int shipy4_1 = shipy4_0;
        int shipx4_2 = shipx4_0 - 1;
        int shipy4_2 = shipy4_0;
        int shipx5_0 = rand.nextInt(10) + 1;
        int shipy5_0 = rand.nextInt(10) + 1;
        int shipx5_1 = shipx5_0;
        int shipy5_1 = shipy5_0 + 1;
        int shipx5_2 = shipx5_0;
        int shipy5_2 = shipy5_0 - 1;
        int count = 0;
        String HIT = "1";
        String MISS = "0";
        int Orient = rand.nextInt(2);
        shipx1_1 = shipx1_0 + 1;
        String[][] board = {{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"}};
        String[][] hiddenBoard = {{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0","0"}};
        for (int i = 0; i < 11; i++) {  // Rows
                for (int j = 0; j < 11; j++) {  // Columns
                    hiddenBoard[i][j] = "MM";
                }
            }
            for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("     " + hiddenBoard[i][j] + "     ");
                hiddenBoard[shipx1_0][shipy1_0] = "1a";
                hiddenBoard[shipx1_1][shipy1_1] = "1b";
                hiddenBoard[shipx1_2][shipy1_2] = "1c";
                hiddenBoard[shipx2_0][shipy2_0] = "2a";
                hiddenBoard[shipx2_1][shipy2_1] = "2b";
                hiddenBoard[shipx2_2][shipy2_2] = "2c";
                hiddenBoard[shipx3_0][shipy3_0] = "3a";
                hiddenBoard[shipx3_1][shipy3_1] = "3b";
                hiddenBoard[shipx3_2][shipy3_2] = "3c";
                hiddenBoard[shipx4_0][shipy4_0] = "4a";
                hiddenBoard[shipx4_1][shipy4_1] = "4b";
                hiddenBoard[shipx4_2][shipy4_2] = "4c";
                hiddenBoard[shipx5_0][shipy5_0] = "5a";
                hiddenBoard[shipx5_1][shipy5_1] = "5b";
                hiddenBoard[shipx5_2][shipy5_2] = "5c";
            }
            System.out.println();
        }
      
            for (int i = 0; i < 11; i++) {  // Rows
                for (int j = 0; j < 11; j++) {  // Columns
                    board[i][j] = "?";
                }
            }
            System.out.println(shipx1_0 + "," + shipy1_0);
            System.out.println(shipx1_1 + "," + shipy1_1);
            System.out.println(shipx1_2 + "," + shipy1_2);
            System.out.println(shipx2_0 + "," + shipy2_0);
            System.out.println(shipx2_1 + "," + shipy2_1);
            System.out.println(shipx2_2 + "," + shipy2_2);
            System.out.println(shipx3_0 + "," + shipy3_0);
            System.out.println(shipx3_1 + "," + shipy3_1);
            System.out.println(shipx3_2 + "," + shipy3_2);
            System.out.println(shipx4_0 + "," + shipy4_0);
            System.out.println(shipx4_1 + "," + shipy4_1);
            System.out.println(shipx4_2 + "," + shipy4_2);
            System.out.println(shipx5_0 + "," + shipy5_0);
            System.out.println(shipx5_1 + "," + shipy5_1);
            System.out.println(shipx5_2 + "," + shipy5_2);
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("     " + board[i][j] + "     ");
            }
            System.out.println();
        }
         while (HIT == "1") {
             
             System.out.println("What x-coordinate would you like to hit");
             x = key.nextInt();
             System.out.println("What y-coordinate would you like to hit");
             y = key.nextInt();
             System.out.print('\u000C');
             System.out.println("You tried to hit the spot in " + x + ", " + y);
             count++;
             System.out.println("You have attacked " + count + " times");
             
             if (x == shipx1_0 && y == shipy1_0) {
                 for (int i = 0; i<11; i++) {
                     for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx1_0][shipy1_0] = hit;
                }
                 System.out.println();
            }
           }
            else if (x == shipx1_1 && y == shipy1_1) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx1_1][shipy1_1] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx1_2 && y == shipy1_2) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx1_2][shipy1_2] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx2_0 && y == shipy2_0) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx2_0][shipy2_0] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx2_1 && y == shipy2_1) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx2_1][shipy2_1] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx2_2 && y == shipy2_2) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx2_2][shipy2_2] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx3_0 && y == shipy3_0) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx3_0][shipy3_0] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx3_1 && y == shipy3_1) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx3_1][shipy3_1] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx3_2 && y == shipy3_2) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx3_2][shipy3_2] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx4_0 && y == shipy4_0) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx4_0][shipy4_0] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx4_1 && y == shipy4_1) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx4_1][shipy4_1] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx4_2 && y == shipy4_2) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx4_2][shipy4_2] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx5_0 && y == shipy5_0) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx5_0][shipy5_0] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx5_1 && y == shipy5_1) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx5_1][shipy5_1] = hit;
                }
                System.out.println();
            }
        }
        else if (x == shipx5_2 && y == shipy5_2) {
            for (int i = 0; i<11; i++) {
                for (int j = 0; j<11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[shipx5_2][shipy5_2] = hit;
                }
                System.out.println();
            }
        }
        else {
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    System.out.print("     " + board[i][j] + "     ");
                    board[x][y] = miss;
                }
                System.out.println();
            }
        }
        if (board[x][y] == hit) {
            System.out.println("You hit part of a ship. Good job");
        }
        if (board[x][y] == miss) {
           System.out.println("You missed the boat. Get good at RNG");
        } 
        if (board[shipx1_0][shipy1_0] == hit && board[shipx1_1][shipy1_1] == hit && board[shipx1_2][shipy1_2] == hit && board[shipx2_0][shipy2_0] == hit && board[shipx2_1][shipy2_1] == hit && board[shipx2_2][shipy2_2] == hit && board[shipx3_0][shipy3_0] == hit && board[shipx3_1][shipy3_1] == hit && board[shipx3_2][shipy3_2] == hit && board[shipx4_0][shipy4_0] == hit && board[shipx4_1][shipy4_1] == hit && board[shipx4_2][shipy4_2] == hit && board[shipx5_0][shipy5_0] == hit && board[shipx5_1][shipy5_1] == hit     && board[shipx5_2][shipy5_2] == hit) 
        {
            System.out.println("Congratulations! You hit all of the ships in " + count + " times!");
             HIT = "2";
        }
        }
        
    }
}
       
 