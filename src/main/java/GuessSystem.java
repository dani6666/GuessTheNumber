public class GuessSystem
{
    private int _maxGuessVaule;
    private int _minGuessValue = 0;
    private int _lastGuess;

    public GuessSystem(int max)
    {
        _maxGuessVaule = max;
    }

    public void NotifyAboutGuess(boolean isBigger)
    {
        if(isBigger)
        {
            _minGuessValue = _lastGuess;
        }
        else
        {
            _maxGuessVaule = _lastGuess;
        }
    }

    public int DoTheGuess()
    {
        _lastGuess = (_minGuessValue - _maxGuessVaule)/2;

        return _lastGuess;
    }
}
