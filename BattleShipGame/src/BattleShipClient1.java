import java.io.BufferedReader ;
import java.io.DataInputStream ;
import java.io.DataOutputStream ;
import java.io.IOException ;
import java.io.InputStreamReader ;
import java.net.Socket ;
import java.net.UnknownHostException ;

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
        // open port of localhost 
        Socket socket = new Socket( "localhost", 1234 ) ;
        // read input from socket
        DataInputStream inStream = new DataInputStream( socket.getInputStream() ) ;
        // send data to socket
        DataOutputStream outStream = new DataOutputStream( socket.getOutputStream() ) ;
        // to read message from keyboard
        BufferedReader inputFromUser = new BufferedReader( new InputStreamReader( System.in ) ) ;
        // TODO Auto-generated method stub

        
    while (true) {
    System.out.println("BattleShip Game! Please type Ready when you are ready to play");
    String ready = inputFromUser.readLine() ;
    // if(client2 != Ready) //to see if other player is ready
        System.out.println("Player 2 is not ready")
        else {
        //send gui
        }
    }

    }
	// end class BattleShipClient1