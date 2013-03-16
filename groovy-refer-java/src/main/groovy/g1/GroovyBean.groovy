package g1

import j1.*

class GroovyBean {
    String name
    def GroovyBean(String myname) {
        this.name = myname
    }
    String greeting(String yourname) {
        return sprintf("Good morning %s. I'm %s.", yourname, name)
    }
    String greeting2(String yourname) {
        JavaBean b = new JavaBean(name)
        return b.greeting(yourname)
    }
}
