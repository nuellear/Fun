package ejercicio

import java.text.SimpleDateFormat

class PersonaController {

    def personaService

    def index() {
        List<Persona> personas = personaService.listarPersonas(params)
        render(view: '/persona/index', model:[personas:personas])
    }

    def create() {

    }

    def guardarPersona(){
        println params
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy")
        params.fechaNacimiento = formato.parse(params.fechaNacimiento)
        Persona persona = personaService.guardarPersona(params)
        render(view: '/persona/detalle', model: [persona:persona])
    }
}
