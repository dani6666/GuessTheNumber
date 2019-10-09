public class Main
{
    public static void main(String[] args)
    {
        // write your code here
        UserCommunicator userCommunicator = new UserCommunicator();

        GuessSystem guessSystem = new GuessSystem(userCommunicator.GetMaxNumber());

        userCommunicator.SendGeuss(guessSystem.DoTheGuess());

        int result = userCommunicator.RetrieveGeussResult();

        while (result != 1)
        {
            guessSystem.NotifyAboutGuess(result==2);

            userCommunicator.SendGeuss(guessSystem.DoTheGuess());

            result = userCommunicator.RetrieveGeussResult();
        }

        userCommunicator.SendVictoryMessage();
    }
}
