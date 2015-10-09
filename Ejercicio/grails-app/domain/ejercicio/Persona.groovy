package ejercicio

class Persona {
    String nombre
    String apellidoPaterno
    String apellidoMaterno
    int edad
    Date fechaNacimiento

    static constraints = {
        nombre nullable: false, blank: false
        apellidoPaterno nullable: false, blank: false
        apellidoMaterno nullable: false, blank: false
        edad nullable: false, blank: false
        fechaNacimiento  nullable: false, blank: false
    }
}
