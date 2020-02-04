/**
 * 
 */
package pkj;

import java.io.*;
import java.net.*;

/**
 * @author Jia Chen Huang
 * @version Feb 3, 2020
 *
 */
public class Client
{

	private DatagramPacket sendPacket, receivePacket;
	private DatagramSocket sendReceiveSocket;
	
	public Client()
	{
		try {
			sendReceiveSocket = new DatagramSocket();
		} catch (SocketException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
			System.exit(1);
		}
	}
	
	public void sendAndReceive()
	{
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	}

}
