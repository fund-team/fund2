/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fund2;

import org.eclipse.jetty.server.Server;

public class App {

    // used to start the CI server in command line
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        server.setHandler(new ContinuousIntegrationServer()); 
        server.start();
        server.join();
    }
}
