package vier;

import java.net.URL;

public class OnlineCourse {

    private URL url;
    private int attendies;
    private final String title;

    public OnlineCourse(String title) {
        this.title = title;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public int getAttendies() {
        return attendies;
    }

    public void setAttendies(int attendies) {
        this.attendies = attendies;
    }

    public String getTitle() {
        return title;
    }
}
