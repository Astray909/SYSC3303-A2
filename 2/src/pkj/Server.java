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
public class Server
{
	
	private static DatagramPacket sendPacket, receivePacket;
	private static DatagramSocket sendSocket, receiveSocket;
	private boolean running;
	//private byte[] buf = new byte[256];
	public static final int port = 69;

	public Server()
	{
		try
		{
			sendSocket = new DatagramSocket(IntHost.port);
			receiveSocket = new DatagramSocket(port);
		}
		catch (SocketException se)
		{
			se.printStackTrace();
			System.exit(1);
		}
	}
	
	private void echo() throws Exception
	{
		receivePacket = Client.waitPacket(receiveSocket, "Server");
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//todo
		
	}

}
