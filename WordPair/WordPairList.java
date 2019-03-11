import java.util.*;
public class WordPairList
{
    ArrayList <WordPair> allPairs;
    /**
     * Constructor for objects of class WordPairList
     */
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList <WordPair>();
        for(int i = 0; i<words.length-1; i++){
            for(int j = i+1; j<words.length; j++){
                allPairs.add(new WordPair(words[i],words[j]));
            }
        }
    }

    public int numMatches(){
        int counter = 0;
        for(int i = 0; i<allPairs.size(); i++){
            if(allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())){
                counter++;
            }
        }
        return counter;
    }
}
