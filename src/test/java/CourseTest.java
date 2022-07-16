import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vier.OnlineCourse;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CourseTest {


    @Test
    void checkNumberOfIntendies(){
        var course = new OnlineCourse("cool");
        assertEquals(0, course.getAttendies());
        course.setAttendies(3);
        assertEquals(3, course.getAttendies());


    }

    @Test
    void checkTitle(){
        var course = new OnlineCourse("cool");
        assertEquals("cool", course.getTitle());
        assertNotEquals("cool2", course.getTitle());
    }

    @Test
    void checkUrl() throws MalformedURLException {
        var course = new OnlineCourse("cool");
        assertEquals(null, course.getUrl());
        try {
            course.setUrl(new URL("https://www.google.com"));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals(new URL("htt://www.googsele.c"), course.getUrl());
    }
}
