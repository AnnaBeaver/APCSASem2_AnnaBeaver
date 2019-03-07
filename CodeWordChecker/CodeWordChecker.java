public class CodeWordChecker implements StringChecker
{
    // instance variables - replace the example below with your own
    private int min;
    private int max;
    private String str;
    /**
     * Constructor for objects of class CodeWordChecker
     */
    public CodeWordChecker(int mini, int maxi, String stri){
         min = mini;
         max = maxi;
         str = stri;
    }

    public boolean isValid(String check){
        if(str.length()<min || str.length()>max){
            return false;
        }
        for(int i = 0; i<str.length(); i++){
            if(str.substring(i,check.length()).equals(check)){
                return false;
            }
        }
        return true;
    }
}
