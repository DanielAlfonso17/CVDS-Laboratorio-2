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

_mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Patterns -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false_

Para compilar nuestro proyecto usamos el comando: 

_mvn package_ o _mvn -U package_

Para ejecutar nuestro proyecto usamos el comando:

_mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.shapes.ShapeMain" -Dexec.args="Quadrilateral"_

Codigo de implementacion ShapeFactory.java: 

```package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;
public class ShapeFactory {
    public static Shape create(RegularShapeType shapeType) {
		Shape figura; 
		switch(shapeType){
			case Triangle:
				figura = new Triangle();
				break;
				
			case Pentagon:
				figura = new Pentagon();
				break;
				
			case Hexagon:
				figura = new  Hexagon();
				break;
				
			case Quadrilateral:
				figura = new  Quadrilateral();
				break;
				
			default: 
				figura = null;
				break;
		}
		return figura;
    }
}
```
- ¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?
    * Sin parámetros: El resultado de la ejecucion es: Parameter of type RegularShapeType is required.
    
    * Parámetro: qwerty: El resultado de la ejecucion es : Parameter 'qwerty' is not a valid RegularShapeType
    
    * Parámetro: pentagon: El resultado de la ejecucion es: Parameter 'pentagon' is not a valid RegularShapeType
    
    * Parámetro Hexagon: El resultado de la ejecucion es:  Successfully created a Hexagon with 6 sides.
    
- Gitignore: Sirve para decirle a Git qué archivos o directorios completos debe ignorar y no subir al repositorio de código, no todos los archivos y carpetas son necesarios de gestionar a partir del sistema de control de versiones. Hay código que no necesitas enviar a Git, ya sea porque sea privado para un desarrollador en concreto y no lo necesiten (o lo deban) conocer el resto de las personas.
