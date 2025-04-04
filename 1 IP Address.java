import java.net.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(InetAddress.getByName("www.yahoo.com").getHostAddress());
    }
}
