package g1

class Main {
    def static main(args) {
        def b = new GroovyBean('Groovy')
        println b.greeting('Java')
    }
}
