package structural.proxy;

public class ProxyTesting {

    /*
    A real world example can be a cheque or credit card is a proxy for what is in our bank account.
    It can be used in place of cash, and provides a means of accessing that cash when required.
    And that’s exactly what the Proxy pattern does –
    Controls and manage access to the object they are protecting


    * It can be used in Virtual Proxy scenario---Consider a situation where there is multiple database call to extract huge size image.
        Since this is an expensive operation so here we can use the proxy pattern which would create multiple proxies and point to the huge size memory consuming object for further processing.
        The real object gets created only when a client first requests/accesses the object and after that we can just refer to the proxy to reuse the object. This avoids duplication of the object and hence saving memory.

    * It can be used in Protective Proxy scenario---It acts as an authorization layer to verify that whether the actual user has access the appropriate content or not.
        For example, a proxy server which provides restriction on internet access in office.
        Only the websites and contents which are valid will be allowed and the remaining ones will be blocked.

    * It can be used in Remote Proxy scenario---A remote proxy can be thought about the stub in the RPC call.
        The remote proxy provides a local representation of the object which is present in the different address location.
        Another example can be providing interface for remote resources such as web service or REST resources.

    * It can be used in Smart Proxy scenario---A smart proxy provides additional layer of security by interposing specific actions when the object is accessed.
        For example, to check whether the real object is locked or not before accessing it so that no other objects can change it.


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