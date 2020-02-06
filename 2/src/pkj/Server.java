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

	/**
	 * Constructor
	 */
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

	/**
	 * echoes the datapack back to client
	 * @throws Exception
	 */
	private void echo() throws Exception
	{
		receivePacket = Client.waitPacket(receiveSocket, "Server");
		byte[] data = receivePacket.getData();
		
	}

	/**
	 * verify data packet has the right format
	 * @param data: byte array to be verified
	 * @return true for no error, false for error
	 */
	private boolean verify(byte[] data)
	{
		int zerosCount =0;
		boolean one=false,two=false,three=true,four=false;

		if(data[0]==0)
		{
			one=true;
			zerosCount++;
		}
		if(data[1]==1 || data[1]==2)
		{
			two=true;
		}
		for(int i=2; i<data.length; i++)
		{
			if(data[i]<32 && data[i]!=0)
			{
				three=false;
			}
			if(data[i]==0)
			{
				zerosCount++;
			}
		}
		if(data[data.length-1]==0)
		{
			four=true;
		}
		return(one&&two&&three&&four&&zerosCount>=3); 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//todo

	}

}
