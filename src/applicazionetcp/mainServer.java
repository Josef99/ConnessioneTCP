/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicazionetcp;

/**
 *
 * @author informatica
 */
public class mainServer {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		ServerStr servitore = new ServerStr();
		servitore.attendi();
                servitore.comunica();
	}
	
}
