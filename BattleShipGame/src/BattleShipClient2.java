import java.io.BufferedReader ;
import java.io.DataInputStream ;
import java.io.DataOutputStream ;
import java.io.IOException ;
import java.io.InputStreamReader ;
import java.net.Socket ;
import java.net.UnknownHostException ;
import java.util.Arrays ;
import java.util.Scanner ;

/**
 * 
 */

/**
 * 
 *
 * @author tstev
 * @version 1.0.0 2020-11-16 Initial implementation
 *
 */
public class BattleShipClient2
    {

    /**
     * 
     *
     * @param args
     */
    public static void main( String[] args )throws UnknownHostException, IOException
        {
        Socket socket = new Socket( "Player 2", 1234 ) ;
        
        DataInputStream inStream = new DataInputStream( socket.getInputStream() ) ;
            
        DataOutputStream outStream = new DataOutputStream( socket.getOutputStream() ) ;
        
        BufferedReader inputFromUser = new BufferedReader( new InputStreamReader( System.in ) ) ;
        
        
                   
        System.out.println("BattleShip Game! Please type ready when you are ready to play");
        String ready = inputFromUser.readLine();
        if (ready == "ready") {
            displayBoard();
            String[] occupied = getLocations();
            attack(occupied);
        }
        }
        
   
        /**
     * 
     *
     */
        private static void displayBoard()
        {
        //Opens Gui
        
        }



        /**
         * @return 
         */
        public static String[] getLocations() {
        Scanner s = new Scanner (System.in);
        String destroyer; //2
        String submarine; //3
        String battleShip; //4
        String aircraftCarrier; //5
        String[] occupied = new String[14];
        
        System.out.println("Enter Location for destroyer (2 spots) Column: a-j, Row: 0-9 (Ex:a8a9)");
        destroyer = s.next();
        if(destroyer.length() == 4 ) {
        String dSpot1 = destroyer.substring(0,2);
        String dSpot2 = destroyer.substring( 2,4 );
        occupied[0] = dSpot1;
        occupied[1] = dSpot2;
        } 
        System.out.println("Enter Location for destroyer (3 spots) Column: a-j, Row: 0-9 (Ex:b7b8b9)");
        submarine = s.next();
        if(submarine.length() == 6 ) {
        String sSpot1 = submarine.substring(0,2);
        String sSpot2 = submarine.substring( 2,4 );
        String sSpot3 = submarine.substring( 4,6 );
        occupied[2] = sSpot1;
        occupied[3] = sSpot2;
        occupied[4] = sSpot3;
        } 
        System.out.println("Enter Location for destroyer (4 spots) Column: a-j, Row: 0-9 (Ex:c6c7c8c9)");
        battleShip = s.next();
        if(battleShip.length() == 8) {
        String bSpot1 = battleShip.substring(0,2);
        String bSpot2 = battleShip.substring( 2,4 );
        String bSpot3 = battleShip.substring( 4,6 );
        String bSpot4 = battleShip.substring( 6,8 );
        occupied[5] = bSpot1;
        occupied[6] = bSpot2;   
        occupied[7] = bSpot3;
        occupied[8] = bSpot4;
        } 
        System.out.println("Enter Location for destroyer (5 spots) Column: a-j, Row: 0-9 (Ex:d5d6d7d8d9)");
        aircraftCarrier = s.next();
        if(aircraftCarrier.length() == 10) {
        String aSpot1 = aircraftCarrier.substring(0,2);
        String aSpot2 = aircraftCarrier.substring( 2,4 );
        String aSpot3 = aircraftCarrier.substring( 4,6 );
        String aSpot4 = aircraftCarrier.substring( 6,8 );
        String aSpot5 = aircraftCarrier.substring( 8,10 );
        occupied[9] = aSpot1;
        occupied[10] = aSpot2;
        occupied[11] = aSpot3;
        occupied[12] = aSpot4;
        occupied[13] = aSpot5;
        } 
        return occupied;
        }
         
        
        /**
         * 
         *
         * @param occupied
         */
        public static boolean attack(String[] occupied) {
        Scanner ss = new Scanner(System.in);
        boolean valid = false;
        boolean hit = false;
        System.out.println("Enter attack location! (Ex:a1)");
        String attack = ss.next();
        if(attack.length() == 2) {
        valid = true;
            if((valid && Arrays.asList(occupied).contains(attack) )) {
            hit = true;
            }
            else {
            hit = false;
            }
        return hit;
        }
        System.out.println("Not a valid attack location");
        return hit;
        }
        }    
    
    // end class BattleShipClient2