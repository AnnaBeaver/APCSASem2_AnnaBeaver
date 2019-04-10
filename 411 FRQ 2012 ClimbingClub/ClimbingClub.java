import java.util.ArrayList;
public class ClimbingClub
{
    // Instance Variables
    private ArrayList <ClimbInfo> climbList = new ArrayList();

    //Constructor
    public ClimbingClub(){

    }

    //Methods
    /** Part A */
    public void addClimb(String peakName, int climbTime){
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    /** Part B */
    public void addClimbSort(String peakName, int climbTime){
        boolean added = false;
        ClimbInfo climbInfo = new ClimbInfo(peakName, climbTime);
        while(added == false){
            for(int i = 0; i<climbList.size();i++){
                if(climbList.get(i).getName().compareTo(climbInfo.getName())<1){
                    climbList.add(i,climbInfo);
                    added = true;
                }
            }
        }
        climbList.add(climbInfo);
    }

    /** Part C */
    public int distinctPeakNames(){
        if(climbList.size() == 0){
            return 0;
        }
        
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        
        for(int k = 1; k<climbList.size(); k++){
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if(prevName.compareTo(currName)!= 0){
                numNames++;
                prevName = currName;
            }
        }
       return numNames;
    }
    
    public void Print(){
        for(int i = 0; i<climbList.size(); i++){
            System.out.print(climbList.get(i).getName());
            System.out.println(climbList.get(i).getTime());
        }
    }
    
    // Question i: No
    // Question ii: Yes
}
