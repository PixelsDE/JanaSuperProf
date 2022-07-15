package drei;

import java.net.URL;

public class NetworkConnection implements ConnectionInterface {

    private URL currentURL;

    private boolean connected;


    @Override
    public void connect(URL url) {
        connected = true;
    }

    @Override
    public void disconnect() {

    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public URL getCurrentURL() {
        return currentURL;
    }

    public void setCurrentURL(URL currentURL) {
        this.currentURL = currentURL;
    }
}
