public class WordMatch
{

private String secret;

public WordMatch(String word)
{
    secret = word;
}

public int scoreGuess(String guess)
{
    int score = 0;
    for(int i = 0; i <= secret.length() - guess.length(); i++)
    {
        if(secret.substring(i, i + guess.length()).equals(guess)) score++;
    }
    return score * guess.length() * guess.length();
}
/** Returns the better of two guesses, as determined by scoreGuess and the rules for a
* tie-breaker that are described in part (b).
* Precondition: guess1 and guess2 contain all lowercase letters.
* guess1 is not the same as guess2.
*/
public String findBetterGuess(String guess1, String guess2)
{
    int score1 = this.scoreGuess(guess1);
    int score2 = this.scoreGuess(guess2);
    if(score1 > score2) return guess1;
    if(score2 > score1) return guess2;
    if(guess1.compareTo(guess2) < 0) return guess2;
    return guess1;
}
}