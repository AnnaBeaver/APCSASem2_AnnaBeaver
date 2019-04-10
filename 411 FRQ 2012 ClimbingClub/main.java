

public class main{
    public static void main(){
      ClimbingClub hikerClub = new ClimbingClub();
      hikerClub.addClimbSort("Monadnock", 274);
      hikerClub.addClimbSort("Whiteface", 301);
      hikerClub.addClimbSort("Algonquin", 225);
      hikerClub.addClimbSort("Monadnock", 344);
      hikerClub.Print();
      System.out.println("The order printed above should be Algonquin, Monadnock, Monadnock, Whiteface");
   }
}
