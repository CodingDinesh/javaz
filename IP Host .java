import java.net.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("Hostname: " + localHost.getHostName());
        System.out.println("IP Address: " + localHost.getHostAddress());
    }
}
