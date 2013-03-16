package j1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class JavaBeanTest {
    @Test
    public void greeting() {
        JavaBean b = new JavaBean("Bob");
        assertThat(b.greeting("Jon"), is("Hello, Jon. I'm Bob."));
    }
}
