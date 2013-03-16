package j1;

import g1.*;

public class JavaBean {
    String name;
    public JavaBean(String myname) {
        this.name = myname;
    }
    public String greeting(String yourname) {
        return "Hello, " + yourname + ". I'm " + this.name + ".";
    }
    public String greeting2(String yourname) {
        GroovyBean b = new GroovyBean(this.name);
        return b.greeting(yourname);
    }
}
