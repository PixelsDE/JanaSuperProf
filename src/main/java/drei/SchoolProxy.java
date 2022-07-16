package drei;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class SchoolProxy implements ConnectionInterface {


    private HashSet<String> denyListedHosts;
    private URL redirectPage;
    private Set<Integer> teacherIDs;
    private boolean authorized;
    private NetworkConnection networkConnection;


    public SchoolProxy(HashSet<String> denyListedHosts, URL redirectPage, Set<Integer> teacherIDs, boolean authorized) {
        this.denyListedHosts = denyListedHosts;
        this.redirectPage = redirectPage;
        this.teacherIDs = teacherIDs;
        this.authorized = authorized;
        networkConnection = new NetworkConnection();
    }

    public void login(int teacherID) {
        if (teacherIDs.contains(teacherID)) {
            authorized = true;
        }
    }

    public void logout() {
        authorized = false;
    }


    @Override
    public void connect(URL url) {
        if (denyListedHosts.contains(url.getHost())) {
            System.err.println("Connection to " + url.getHost() + " was rejected.");
        } else {
            networkConnection.connect(url);
        }
    }

    @Override
    public void disconnect() {
        networkConnection.disconnect();
    }

    @Override
    public boolean isConnected() {
        return networkConnection.isConnected();
    }

    public HashSet<String> getDenyListedHosts() {
        return denyListedHosts;
    }

    public void setDenyListedHosts(HashSet<String> denyListedHosts) {
        this.denyListedHosts = denyListedHosts;
    }

    public URL getRedirectPage() {
        return redirectPage;
    }

    public void setRedirectPage(URL redirectPage) {
        this.redirectPage = redirectPage;
    }

    public Set<Integer> getTeacherIDs() {
        return teacherIDs;
    }

    public void setTeacherIDs(Set<Integer> teacherIDs) {
        this.teacherIDs = teacherIDs;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public NetworkConnection getNetworkConnection() {
        return networkConnection;
    }

    public void setNetworkConnection(NetworkConnection networkConnection) {
        this.networkConnection = networkConnection;
    }
}
