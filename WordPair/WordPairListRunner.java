
/**
 * Write a description of class WordPairListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordPairListRunner
{

    public static void main(){
        String[]wrds = {"elephant", "squirrel", "puppy", "elephant", "goose"};
        WordPairList str = new WordPairList(wrds);
        for(int i = 0; i<wrds.length; i++){    
            System.out.println(str.allPairs.get(i).getFirst() + "," + str.allPairs.get(i).getSecond());
        }
        System.out.println();
        WordPairList match = new WordPairList(wrds);
        System.out.println(match.numMatches());

    }
}
