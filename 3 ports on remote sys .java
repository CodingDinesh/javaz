import java.net.*;

public class Main {
    public static void main(String[] args) {
        String host = "www.yahoo.com";
        int[] ports = {21, 22, 80, 443};

        for (int port : ports) {
            try (Socket s = new Socket(host, port)) {
                System.out.println("Port " + port + " is OPEN");
            } catch (Exception e) {
                System.out.println("Port " + port + " is CLOSED");
            }
        }
    }
}
