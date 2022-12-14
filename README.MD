#Talent Zone - Reto Backend

Proyecto práctico para validación y mejoramiento de habilidades en Programación Backend
Pre-requisitos:
Para efectos del alcance de este proyecto, se sugiere la utilización del lenguaje Java
para el desarrollo.

Versión de Java sugerida: 8+
Framework sugerido: Spring (Spring Boot 2.7) https://start.spring.io/
Hacer uso de un sistema para la gestion y construccion del proyecto: Maven, Gradle
Utilizar un IDE para desarrollo en lenguaje Java de tu preferencia: Eclipse, IntelliJ
Idea, VS Code, entre otros.

Crear y utilizar una base de datos: Relacional (SQL) o NoSQL, se sugiere utilizar
docker para la construcción de una imagen

Consideraciones:

● Este proyecto se ha diseñado con el objetivo de validar conocimientos considerados
esenciales para el desarrollo de aplicaciones web en backend.

● Para la estructuración del código del proyecto se sugiere el uso de alguna
arquitectura (ej. por capas, hexagonal, etc) y buenas prácticas en la escritura del
código (ej. clean code, domain-driven design)

● Así mismo, al momento de implementar el código se sugiere emplear prácticas y
conceptos asociados a la programación orientada a objetos.
Enunciado
Tenemos el siguiente escenario: uno de los eventos más importantes del ciclismo a nivel
mundial es el Tour de Francia. Como parte del equipo de tecnología que apoya a la
competición, se te ha encargado la tarea de desarrollar una aplicación o servicio que
permita el registro de los equipos y sus respectivos ciclistas.
Como requerimientos del sistema, se establecen las siguientes reglas:

● Cada equipo debe tener como datos principales: nombre de equipo, un código
abreviado único (alfanumérico, máximo 3 caracteres), y un país asociado

● Cada ciclista debe tener como datos principales: nombre completo, un número de
competidor único (máximo 3 dígitos), estar asociado a un equipo y un país de
procedencia (nacionalidad).

● Un equipo de ciclismo estará conformado por un máximo de 8 corredores.
Se sugiere la programación de APIs Rest para las actividades de inserción, modificación,
consulta y eliminación de registros en las entidades consideradas (por ejemplo, registrar un
equipo, modificar un equipo, registrar un ciclista, etc). La idea es seguir las buenas prácticas
para el desarrollo de APIs Restful, como el uso de los métodos GET, POST, PUT y DELETE.

Ej.

Adicional a las consultas propias de una entidad (CRUD), se recomienda practicar la
implementación de métodos que permitan hacer consultas de entidades relacionadas, como
por ejemplo:

● Método que permita consultar los ciclistas pertenecientes a un equipo a partir del
código de un equipo

● Consulta de los equipos asociados a un determinado país

● Consulta de los ciclistas por su nacionalidad

Otro objetivo de esta práctica es
familiarizarse con los principios de la
programación orientada a objetos,
arquitecturas y patrones de diseño en
la implementación de un proyecto de
backend, por lo que se espera que se
tomen en cuenta aspectos como la
herencia de clases, implementación
de interfaces, estructuración del
código en paquetes, entre otros.

Ej.:

También puede utilizarse este proyecto como práctica para manejo de repositorios git, por lo
que se invita a experimentar con manejo de ramas (branches), restricciones de subida de
archivos a través de un archivo .gitignore, etc.
➔ Recurso para la generación de archivos .gitignore basados en las tecnologías
utilizadas: gitignore.io
Se recomienda también la práctica del uso de anotaciones propias de frameworks como
Spring, Jackson, Lombok, entre otros. Estas anotaciones facilitan el proceso de desarrollo
ya que expanden la funcionalidad de las clases e interfaces y ayudan a reducir la cantidad
de código fuente a escribir.

Ejemplo de una entidad:

Tiempo estimado sugerido para completar el proyecto: 2 días

Nota importante: Este proyecto se plantea para la evaluación de habilidades esenciales en el
proceso de programación de un proyecto de backend. El mismo puede ser expandido y
además servir como base para la práctica incluso utilizando tecnologías diferentes a Java +
Spring.

---
