# Ciclos de Vida y Desarrollo de Software 
# Laboratorio #2
# Elaborado por: Daniel Felipe Alfonso Bueno 
## Patterns - Factory
## La herramienta Maven

* ¿Cuál es su mayor utilidad?
  
  La mayor utilidad es facilitar el proceso de construccion(Compilacion y ejecucion) de proyectos JAVA permitiendo que un desarrollador comprenda el estado completo de un esfuerzo de desarrollo en el menor tiempo posible 
* Fases de maven

     - Validar: validar que el proyecto es correcto y toda la información necesaria está disponible
     - Compilar: compila el código fuente del proyecto
     - Prueba: prueba el código fuente compilado utilizando un marco de prueba de unidad adecuado. Estas pruebas no deberían requerir que el código se empaquete o implemente
     - Paquete: tome el código compilado y empaquételo en su formato distribuible, como un JAR.
     - Verificar: ejecutar cualquier verificación de los resultados de las pruebas de integración para garantizar que se cumplan los criterios de calidad
     - Instalar: instala el paquete en el repositorio local, para usarlo como dependencia en otros proyectos localmente
     - Despliegue: hecho en el entorno de compilación, copia el paquete final en el repositorio remoto para compartirlo con otros desarrolladores y proyectos.
* Ciclo de vida de la construcción
  
  Maven se basa en el concepto central de un ciclo de vida de construcción. Lo que esto significa es que el proceso para construir y distribuir un artefacto particular está claramente definido.
  
  Existen tres ciclos de vida de complicacion son: 
  - _Default_ maneja la implementación de su proyecto.
  - _Clean_ maneja la limpieza del proyecto.
  - _Site_ maneja la creación de la documentación del sitio de su proyecto.
* Para qué sirven los plugins
* Qué es y para qué sirve el repositorio central de maven
