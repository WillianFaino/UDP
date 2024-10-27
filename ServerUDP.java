import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class ServerUDP {
    private static int PORTA = 8080;

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(PORTA);
            DatagramPacket pacote = new DatagramPacket(new byte[1024], 1024);
            while (true) {
                socket.receive(pacote);
                System.out.println("Pacote de: " + 
                            pacote.getAddress().getHostName() +
                            ": "+pacote.getPort());
                System.out.println(new String(pacote.getData()));
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
