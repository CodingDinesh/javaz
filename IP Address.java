import java.net.*;

class IpAddr {
    public static void main(String args[]) {
        String s = "https://www.yahoo.com/";

        try {
            // Extracting the hostname from the URL
            String host = new URL(s).getHost();
            InetAddress ip = InetAddress.getByName(host);
            System.out.println("Public IP Address of " + host + " : " + ip.getHostAddress());
        } 
        catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        } 
        catch (UnknownHostException e) {
            System.out.println("Unknown Host");
        }
    }
}
