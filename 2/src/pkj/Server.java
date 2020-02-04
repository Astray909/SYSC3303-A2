/**
 * 
 */
package pkj;

import java.io.*;
import java.net.*;

/**
 * @author Jia Chen Huang
 * @verison Feb 3, 2020
 *
 */
public class Server {
	
	private static DatagramPacket sendPacket, receivePacket;
	private static DatagramSocket sendSocket, receiveSocket;
	private boolean running;
	private byte[] buf = new byte[256];

	public Server()
	{
		try {
			receiveSocket = new DatagramSocket(4445);
		} catch (SocketException se) {
			se.printStackTrace();
			System.exit(1);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
