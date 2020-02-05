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

	private static final int INT_PORT = 23;
	private static final int SERVER_PORT = 69;
	
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
	
	/**
	 * build a packet that sends to a specific port on a host
	 * @param pkg: the package to be sent
	 * @param port: the port where the poackage will be sent to
	 */
	public void sendAndReceive(byte[] msg, int port)
	{
		
	}
	
	/**
	 * builds and sends a new Packet
	 * @param msg: the message you want to send
	 * @param len: length of the message
	 * @param desti: destination ip
	 * @param port: destination port
	 * @param s: source socket
	 * @param source: source address
	 */
	public void sendPacket(byte[]msg, int len, InetAddress desti, int port, DatagramSocket s, String source)
	{
		DatagramPacket packet = buildPacket(msg, len, desti, port);
		System.out.println(source + ": is sending a packet:");
		
		//prints out information about the packet
		System.out.println("Packet from host: " + packet.getAddress());
		System.out.println("From host port: " + packet.getPort());
		System.out.println("Length: " + packet.getLength());
		System.out.print("Containing: " );
		//prints out the packets;
		
		try
		{
			s.send(packet);
		} catch (IOException ie)
		{
			ie.printStackTrace();
			System.exit(1);
		}
		System.out.println(source + ": packet sent\n");
	}
	
	public void waitPacket(DatagramSocket s, String source)
	{
		//
	}
	
	/**
	 * builds a new packet
	 * @param msg: the message you want to convert
	 * @param len: length of the message
	 * @param desti: destination address
	 * @param port: destination port
	 */
	public DatagramPacket buildPacket(byte[]msg, int len, InetAddress desti, int port)
	{
		DatagramPacket packet = new DatagramPacket(msg, len, desti, port);
		return packet;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	}

}
