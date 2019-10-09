import java.io.IOException;
import java.util.Scanner;

public class UserCommunicator
{

    private Scanner Input;

    public UserCommunicator()
    {
        Input = new Scanner(System.in);
    }

    public int GetMaxNumber()
    {
        System.out.println("Choose the maximum number, you will be able to guess from 0 to this number");

        return Input.nextInt();
    }

    public void SendGeuss(int guess)
    {
        System.out.println("I am guessing that your number is"+ Integer.toString(guess));
    }

    public int RetrieveGeussResult()
    {
        System.out.println("So did I make it?");
        System.out.println("1 - Yeah..thats my number");
        System.out.println("2 - No, it is larger that my number");
        System.out.println("3 - No, it is smaller than my number");

        return Input.nextInt();
    }

    public void SendVictoryMessage()
    {
        System.out.println("I WON !");
    }
}
