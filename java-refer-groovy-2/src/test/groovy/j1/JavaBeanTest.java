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
    @Test
    public void greeting2() {
        JavaBean b = new JavaBean("Bob");
        assertThat(b.greeting2("Jon"), is("Good morning Jon. I'm Bob."));
    }
}
