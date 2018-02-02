/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicazionetcp;

/**
 *
 * @author josef
 */
import java.io.*;
import java.net.*;
public class Client {

    String nServer="Server di Josef";
    int portaServer =814; //anno morte carlo magno :)
    Socket miosocket;
    BufferedReader tastiera;
    String stringaUtente;
    String stringaRicevutaDalServer;
    DataOutputStream outVersoServer;
    BufferedReader inDalServer;
    
    public void comunica(){
        try //leggo una riga
        {
            System.out.println("4 ... inserire la stringa da trasmettere al server:"+'n');
            stringaUtente = tastiera.readLine();
            //la spedisco al server
            System.out.println("5 ... invia la stringa al server e attendo ...");
            outVersoServer.writeBytes(stringaUtente+'n');
            //leggo la risposta al server
            stringaRicevutaDalServer=inDalServer.readLine();
            System.out.println("8 ... risposta dal server "+'\n'+stringaRicevutaDalServer );
            //chiudo la connessione
            System.out.println("9 CLIENT: termina elaborazione e chiude la connessione" );
            miosocket.close();
        }
        catch (Exception e)
                {
                    System.out.println(e.getMessage());
                    System.out.println("Errore durante la comunicazione col server!");
                    System.exit(1);
                }       
    }
    
    public Socket connetti(){
        System.out.println("2 CLIENT partito in esecuzione ...");
        try
            {
                tastiera = new BufferedReader(new InputStreamReader(System.in)); //per l'input da tastiera
                miosocket = new Socket(nServer, portaServer);
                //miosocket = new Socket(InetAddress.geLocal(),814);
                outVersoServer = new DataOutputStream(miosocket.getOutputStream());
                inDalServer = new BufferedReader(new InputStreamReader (miosocket.getInputStream()));
            }
        catch (UnknownHostException e){
            System.err.println("Host sconosciuto");
        }
        catch (Exception e)
    {
        System.out.println(e.getMessage());
        System.out.println("Errore durante la connessione!");
        System.exit(1);
    }
return miosocket;
    
    
}
    
}