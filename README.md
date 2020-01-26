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

  Maven es un marco de ejecucion de plugins, todo el trabajo se realiza bajo la ejecucion de plugins. Sirven para ejecutar nuestros proyectos. Los plugins son donde se realiza gran parte de la acción real, los plugins se utilizan para: crear archivos jar, crear archivos war, compilar código, código de prueba de unidad, crear documentación del proyecto, y así sucesivamente. Casi cualquier acción que se te ocurra realizar en un proyecto se implementa como un plugins de Maven.
* Qué es y para qué sirve el repositorio central de maven

  El repositorio central de maven es una herramienta que nos permite conocer, multiples elementos, artefactos, plugins, dependencias, herramientas de construccion, informacion acerca de maven, integracion de bases de datos, despliegue JSON. Nos sirve como medio de documentacion para el uso de diferentes herramientas. 

## Crear un proyecto con Maven

Para crear un proyecto en maven usamos el siguiente comando: 
![](C:\Users\danie\OneDrive\Escritorio\CVDS\proyecto.JPG)
