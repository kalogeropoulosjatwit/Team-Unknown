import java.io.BufferedReader ;
import java.io.DataInputStream ;
import java.io.DataOutputStream ;
import java.io.IOException ;
import java.io.InputStreamReader ;
import java.net.Socket ;
import java.net.UnknownHostException ;
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
public class BattleShipClient1
    {

    /**
     * 
     *
     * @param args
     */
    public static void main( String[] args )throws UnknownHostException, IOException
        {
        Socket socket = new Socket( "Player 1", 1234 ) ;
        
        DataInputStream inStream = new DataInputStream( socket.getInputStream() ) ;
            
        DataOutputStream outStream = new DataOutputStream( socket.getOutputStream() ) ;
        
        BufferedReader inputFromUser = new BufferedReader( new InputStreamReader( System.in ) ) ;
        
        
                   
        System.out.println("BattleShip Game! Please type ready when you are ready to play");
        String ready = inputFromUser.readLine();
        if (ready == "ready") {
            
            displayBoard();
            getLocations();
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
         * 
         *
         * @return
         */
        public static String getLocations() {
        Scanner s = new Scanner (System.in);
        String location;
        char r,c;
        boolean valid;
        
        System.out.println("Enter Location... Column: a-j, Row: 0-9 (Ex:a9)");
        location = s.next();
        
            if(location.length() == 2 && r>= 'a' && r<= 'j' && c >= '0' && c>= '9') {
            valid = true;
            r = location.charAt( 0 );
            c = location.charAt(1);
            }
                else {
                valid = false;
                }
                    if(!valid) {
                    System.out.println("Invalid Location");
                    }
        return location;
        }
                    
        }    
    
	// end class BattleShipClient1