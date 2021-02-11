package networking.workingwithdatagrams;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QuoteClient {
    public static void main(String[] args) throws IOException {

        int port;
        InetAddress address;
        DatagramSocket socket = null;
        DatagramPacket packet = null;
        byte[] sendBuf = new byte[256];

        if (args.length != 1) {
            System.out.println("Usage: java QuoteClient <hostname>");
            return;
        }

            //  get a datagram socket
        socket = new DatagramSocket();

            //  send request
        sendBuf = new byte[256];
        address = InetAddress.getByName(args[0]);
        packet = new DatagramPacket(sendBuf, sendBuf.length, address, 4445);
        socket.send(packet);

            //  get response
        packet = new DatagramPacket(sendBuf, sendBuf.length);
        socket.receive(packet);

            //  display response
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.print("Quote of the Moment: " + received);

        socket.close();
    }
}
