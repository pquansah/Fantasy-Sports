//Paakwesi Quansah ECS 102 Professor Yu
import java.util.*;
import java.io.*;

public class FantasyBasketball
{
  public static void main(String[]args) throws IOException
  {
    //called the array for Fantasy class
    Fantasy[] fan = new Fantasy[30];
    //made a boolean variable
    boolean found = true;
    // called the Random and Scanner methods
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    PrintWriter outfile = new PrintWriter("FantasyStats.txt");
    Scanner read = new Scanner(new File("Fan.txt"));
    //declared all the elements in the
    // arrays that we will be using
    String[] playerPG= new String[]{"Elfrid Payton","Mario Chalmers","Patrick Beverley","George Hill","Darren Collison","Jeremy Lin","Jameer Nelson","Jose Calderon","Trey Burke","Brandon Jennings","Brandon Knight","Ricky Rubio","Michael Carter-Williams","Jrue Holiday","Kemba Walker","Jeff Teague","Deron Williams","Ty Lawson","Mike Conley","Kyle Lowry","Kyrie Irving","Goran Dragic","Rajon Rondo","Damian Lillard","Derrick Rose","John Wall","Stephen Curry","Russell Westbrook","Tony Parker","Chris Paul"};
    String[] playerSG= new String[]{"Ben McLemore","Tony Wroten","Giannis Antetokounmpo","C.J. Miles","Alec Burks","Avery Bradley","Jodie Meeks","Tony Allen","Iman Shumpert","Terrence Ross","Dion Waiters","Reggie Jackson","Victor Oladipo","Danny Green","Kyle Korver","Jimmy Butler","Arron Afflalo","Kevin Martin","J.J. Redick","Monta Ellis","Wesley Matthews","Joe Johnson","Lance Stephenson","Bradley Beal","Eric Bledsoe","Klay Thompson","Dwyane Wade","James Harden","Kobe Bryant"};
    String[] playerSF= new String[]{"Hollis Thompson","Solomon Hill","Andrei Kirilenko","Michael Kidd-Gilchrist","Maurice Harkless","Matt Barnes","Tayshaun Prince","P.J. Tucker","DeMarre Carroll","DeMarre Carroll","Mike Dunleavy Jr.","Jabari Parker","Andrew Wiggins","Jeff Green","Nick Young","Danilo Gallinari","Paul Pierce","Josh Smith","Tyreke Evans","Gordon Hayward","Nicolas Batum","Andre Iguodala","Chandler Parsons","Trevor Ariza","Luol Deng","Rudy Gay","DeMar DeRozan","Kawhi Leonard","Carmelo Anthony","Kevin Durant","LeBron James"};
    String[] playerPF= new String[]{"Luc Mbah a Moute","Jason Thompson","Josh McRoberts","Brandon Bass","Ersan Ilyasova","Terrence Jones","Marvin Williams","Markieff Morris","Amir Johnson","Kevin Garnett","Channing Frye","Amar’e Stoudemire","Thaddeus Young","Carlos Boozer","Derrick Favors","Nene Hilario","Greg Monroe","David West","Paul Millsap","Kenneth Faried","David Lee","Pau Gasol","Serge Ibaka","Zach Randolph","Dirk Nowitzki","Tim Duncan","Blake Griffin","Anthony Davis","Kevin Love","LaMarcus Aldridge"};
    String[] playerC= new String[]{"Tyler Zeller","Miles Plumlee","Kendrick Perkins","Samuel Dalembert","Larry Sanders","Tiago Splitter","Omer Asik","Jordan Hill","Nerlens Noel","Enes Kanter","Jonas Valanciunas","Anderson Varejao","Robin Lopez","JaVale McGee","Nikola Vucevic","Tyson Chandler","Andrew Bogut","Marcin Gortat","Nikola Pekovic","Andre Drummond","Roy Hibbert","DeAndre Jordan","Chris Bosh","Brook Lopez","Al Horford","Marc Gasol","Joakim Noah","DeMarcus Cousins","Al Jefferson","Dwight Howard"};
    // separate aarays for players ad points
    double[] pointsPG= new double[]{12.6,9.8,10.3,15.3,13.7,15.0,10.8,11.5,13.2,15.4,15.3,10.9,18.0,15.4,17.4,17.5,18.3,16.2,16.0,17.1,18.9,17.7,14.7,20.0,21.7,20.0,23.2,25.0,17.0,18.5};
    double[] pointsSG= new double[]{18.0,15.4,17.4,17.5,18.3,16.2,12.6,9.8,10.3,15.3,13.7,15.0,10.8,11.5,13.2,15.4,15.3,10.9,16.0,17.1,18.9,17.7,14.7,20.0,21.7,20.0,23.2,25.0,25.4,23.5};
    double[] pointsSF= new double[]{19.0,16.4,17.4,17.5,18.3,16.2,17.1,18.9,17.7,14.7,12.6,9.8,10.3,15.3,13.7,15.0,10.8,11.5,13.2,15.4,15.3,10.9,16.0,20.0,21.7,20.0,23.2,25.0,25.0,27.5};
    double[] pointsPF= new double[]{17.0,15.4,14.4,17.5,18.3,16.2,17.1,18.9,17.7,14.7,12.6,9.8,10.3,15.3,13.7,15.0,10.8,11.5,13.2,15.4,15.3,10.9,16.0,18.0,20.7,20.0,23.2,23.0,25.7,26.5};
    double[] pointsC= new double[]{12.0,15.7,17.4,17.2,18.3,16.2,17.1,18.9,17.7,14.7,12.6,9.8,10.3,15.3,13.7,15.0,10.8,11.5,13.2,15.4,15.3,10.9,16.0,18.0,20.7,21.0,20.2,21.0,23.7,25.5};
    // declared points sum to add a total of the points
    double pointsSum=0;
    //declared Arralist to store the names in an array
    ArrayList<String> names = new ArrayList<String>();
    char det;
    //used a do while loop to contiuously select players
    do
    {
    System.out.println("What postion do you choose?\nEnter pg for Point Guard\nsg for Shooting Guard\nsf for Small Forward\npf for Power Forward\nc for Center ");
    String player = scan.nextLine();
    //used switch statment to select certain positions
    switch(player)
    {
      case "pg":
        int index = new Random().nextInt(playerPG.length);
        String random = (playerPG[index]);
        System.out.println("Player: "+searchPlayer(playerPG,random));
        names.add(random);
        double points = pointsPG[index];
        pointsSum+=points;
        System.out.println("Points: "+points);
        break;
        
      case "sg":
        int index2 = new Random().nextInt(playerSG.length);
        random = (playerSG[index2]);
        System.out.println("Player: "+searchPlayer(playerSG,random));
        names.add(random);
        points = pointsSG[index2];
        pointsSum+=points;
        System.out.println("Points: "+points);
        break;
        
      case "sf":
        int index3 = new Random().nextInt(playerSF.length);
        random = (playerSF[index3]);
        System.out.println("Player: "+searchPlayer(playerSF,random));
        points = pointsSF[index3];
        pointsSum+=points;
        names.add(random);
        System.out.println("Points: "+points);
        break;
        
      case "pf":
        int index4 = new Random().nextInt(playerPF.length);
        random = (playerPF[index4]);
        System.out.println("Player: "+searchPlayer(playerPF,random));
        points = pointsPF[index4];
        pointsSum+=points;
        names.add(random);
        System.out.println("Points: "+points);        
        break;
        
      case "c":
        int index5 = new Random().nextInt(playerC.length);
        random = (playerC[index5]);
        System.out.println("Player: "+searchPlayer(playerC,random));
        names.add(random);
        points = pointsC[index5];
        pointsSum+=points;
        System.out.println("Points: "+points);
        break;
    }
    //used print statement to determine if person
    //would like to continue to select players
    System.out.println();
    System.out.println("Would you like to continue?(y/n)");
    det = scan.nextLine().charAt(0);
    } while(det == 'y'&&found == true);
    //used the outfile method to print it into an
    //external file.
    outfile.println("Players: "+names);
    outfile.println("Total Points: "+pointsSum);
    outfile.close();
  }
  public static String searchPlayer(String[] numbers, String key)
  {
       for (int index = 0; index < numbers.length; index++)
      {
           if (numbers[index].compareTo(key)==0)
                 return numbers[index];
      }
     return "error";
  }
}
/*What postion do you choose?
Enter pg for Point Guard
sg for Shooting Guard
sf for Small Forward
pf for Power Forward
c for Center  
pg
Player: Jeremy Lin 
Points: 15.0 
 
Would you like to continue?(y/n) 
y
What postion do you choose?
Enter pg for Point Guard
sg for Shooting Guard
sf for Small Forward
pf for Power Forward
c for Center  
c
Player: Al Jefferson 
Points: 23.7 
 
Would you like to continue?(y/n) 
y
What postion do you choose?
Enter pg for Point Guard
sg for Shooting Guard
sf for Small Forward
pf for Power Forward
c for Center  
c
Player: Brook Lopez 
Points: 18.0 
 
Would you like to continue?(y/n) 
y
What postion do you choose?
Enter pg for Point Guard
sg for Shooting Guard
sf for Small Forward
pf for Power Forward
c for Center  
sg
Player: Klay Thompson 
Points: 20.0 
 
Would you like to continue?(y/n) 
y
What postion do you choose?
Enter pg for Point Guard
sg for Shooting Guard
sf for Small Forward
pf for Power Forward
c for Center  
pf
Player: Zach Randolph 
Points: 18.0 
 
Would you like to continue?(y/n) 
y
What postion do you choose?
Enter pg for Point Guard
sg for Shooting Guard
sf for Small Forward
pf for Power Forward
c for Center  
sf
Player: P.J. Tucker 
Points: 18.9 
 
Would you like to continue?(y/n) 
y
What postion do you choose?
Enter pg for Point Guard
sg for Shooting Guard
sf for Small Forward
pf for Power Forward
c for Center  
sf
Player: Luol Deng 
Points: 21.7 
 
Would you like to continue?(y/n) 
n*/