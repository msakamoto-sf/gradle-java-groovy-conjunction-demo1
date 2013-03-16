package g1

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

class GroovyBeanTest {
    @Test void greeting() {
        def b = new GroovyBean("Jon")
        assertThat b.greeting("Bob"), is("Good morning Bob. I'm Jon.")
    }
}
