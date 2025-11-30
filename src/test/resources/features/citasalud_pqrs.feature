#Authors: Tu Nombre
#language: es

Característica: Gestión de PQRS en CitaSalud
  Como usuario del sistema CitaSalud
  Quiero registrar una PQRS (Petición, Queja, Reclamo o Sugerencia)
  Para gestionar mis solicitudes de manera efectiva

  Actor: Usuario

  @smoke
  Escenario: Registro exitoso de una PQRS
    Dado que el usuario navega a la página de CitaSalud PQRS
    Cuando el usuario completa el formulario de PQRS con los siguientes datos
      | campo         | valor                    |
      | nombre        | Juan Perez               |
      | email         | juan.perez@example.com   |
      | telefono      | 3001234567               |
      | tipo          | Petición                 |
      | descripcion   | Solicitud de información |
    Y el usuario envía el formulario
    Entonces el usuario debería ver un mensaje de confirmación exitoso

