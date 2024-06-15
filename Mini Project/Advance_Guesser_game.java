import java.util.Scanner;

class Guesser
{
    int gussName;
    public int getGussName() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser guss the number :");
        gussName = sc.nextInt();
        return gussName;
    }
}
class Player
{
    int Player1;
    int Player2;
    int Player3;
    public int player1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player1 guss the number :");
        Player1 = sc.nextInt();
        return Player1;   
    }
    public int player2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player2 guss the number :");
        Player2 = sc.nextInt();
        return Player2;   
    }
    public int player3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player3 guss the number :");
        Player3 = sc.nextInt();
        return Player3;   
    }
}
class Umpire
{
    int gusser_no;
    int player_1;
    int player_2;
    int player_3;
    void collectNumFromGuesser()
    {
        Guesser obj = new Guesser();
        gusser_no = obj.getGussName();
    }
    void collectNumFromPlayer()
    {
        Player obj = new Player();
        player_1 = obj.player1();
        player_2 = obj.player2();
        player_3 = obj.player3();
    }
    void compare()
    {
        if(gusser_no==player_1)
        {
            if(gusser_no==player_2 && gusser_no==player_3)
            {
                System.out.println("All are win the game.");
            }
            else if (gusser_no==player_2) 
            {
                System.out.println("player 1 and 2 are win the game.");
            }
            else if (gusser_no==player_3) 
            {
                System.out.println("player 1 and 3 are win the game.");
            }
            else 
            {
                System.out.println("Player 1 win the game.");

            }
        }
        else if (gusser_no==player_2)
        {
            if(gusser_no==player_3)
            {
                System.out.println("player 2 and 3 are win the game.");
            }
            else
            {
                System.out.println("player 2 are win the game.");
            }
            
        }
        else if (gusser_no==player_3)
        {
            System.out.println("player 3 are win the game.");
        }
        else
        {
            System.out.println("all lost the game let's play again !! ");
        }
    }
}
public class Advance_Guesser_game 
{
    public static void main(String[] args) 
    {
        Umpire obj1 = new Umpire();
        obj1.collectNumFromGuesser();
        obj1.collectNumFromPlayer();
        obj1.compare();
        
    }
}
