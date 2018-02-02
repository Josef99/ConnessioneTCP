/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicazionetcp;

/**
 *
 * @author Josef Lushi 30/01/2018  TPSIT A.S. 2017/2018
 */
public class ApplicazioneTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientStr cliente = new ClientStr();
        ServerStr servitore = ServerStr();
        servitore.attendi();
        servitore.comunica();
        cliente.connetti();
        cliente.comunica();
    }
    
}
