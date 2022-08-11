package structural.proxy;

public class ProxyTesting {

    /*
    A real world example can be a cheque or credit card is a proxy for what is in our bank account.
    It can be used in place of cash, and provides a means of accessing that cash when required.
    And that’s exactly what the Proxy pattern does –
    “Controls and manage access to the object they are protecting“.*/

    /*
    1. One of the advantages of Proxy pattern is security.
    2. This pattern avoids duplication of objects which might be huge size and memory intensive.
    3. This in turn increases the performance of the application.
    */

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}