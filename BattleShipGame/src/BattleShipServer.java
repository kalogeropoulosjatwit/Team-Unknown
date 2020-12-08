import java.io.BufferedReader ;
import java.io.DataOutputStream ;
import java.io.IOException ;
import java.io.InputStreamReader ;
import java.net.ServerSocket ;
import java.net.Socket ;
import java.net.UnknownHostException ;
import java.util.Arrays ;

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
public class BattleShipServer
    {
    
   
    /**
     * 
     *
     * @param args
     */
    public static void main(String[] args ) throws UnknownHostException, IOException
        {
        ServerSocket serverSocket = new ServerSocket(1234);
        while (true) {
        Socket connectionSocket = serverSocket.accept();
        
      
        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
        
        if(inFromClient.readLine() == "ready") {
        outToClient.writeBytes("ready");
        }
        String[] occupied = new String[14];
        for(int i = 0; i >= 13; i++ ) {
        occupied[i] = inFromClient.readLine();
        }
        String[] attack = new String[14];
        occupied[0] = "a1";
        occupied[1] = "a2";
        occupied[2] = "b1";
        occupied[3] = "b2";
        occupied[4] = "b3";
        occupied[5] = "c1";
        occupied[6] = "c2";
        occupied[7] = "c3";
        occupied[8] = "c4";
        occupied[9] = "d1";
        occupied[10] = "d2";
        occupied[11] = "d3";
        occupied[12] = "d4";
        occupied[13] = "d5";
        
        attack[0] = "a1";
        attack[1] = "a2";
        attack[2] = "b1";
        attack[3] = "b2";
        attack[4] = "b3";
        attack[5] = "c1";
        attack[6] = "c2";
        attack[7] = "c3";
        attack[8] = "c4";
        attack[9] = "d1";
        attack[10] = "d2";
        attack[11] = "d3";
        attack[12] = "d4";
        attack[13] = "d5";
        
        
        boolean valid = false;
        boolean hit = true;
        
        if(attack.length == 2) {
        valid = true;
        }
        for(int i = 0; i>= 13; i++) {
        if((valid && Arrays.asList(occupied).contains(attack[i]) )) {
        int j = 0;
        j++;
        
            if(j == 13) {
            System.out.println("You win");
            System.exit( 0 );
            }
        }
        
        else {
        hit = false;
        }
            
            }
        
        }
    }
    }
    
    

        
        
            
        

    
	// end class BattleShipServer