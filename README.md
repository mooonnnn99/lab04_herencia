# lab04_herencia
Practica 4_LPOO

¿Cuál es la diferencia entre extends e implements? ¿Cuándo usas cada uno?
La diferencia principal entre extends e implements radica en la herencia de clases y la implementación de interfaces.
Extends: Se utiliza para indicar que una clase hereda de otra clase. La clase hija (subclase) hereda los atributos y métodos de la clase padre (superclase). Una clase puede extender solo una clase padre debido a la herencia simple en Java.
Implements: Se utiliza para indicar que una clase implementa una interfaz. Una interfaz define un contrato que la clase debe cumplir, es decir, la clase debe proporcionar implementaciones para todos los métodos declarados en la interfaz. Una clase puede implementar múltiples interfaces, lo que permite la herencia múltiple de comportamiento.

¿Qué ventaja tiene llamar super.atacar() dentro de Guerrero.atacar() en lugar de reescribir todo?
Al llamar a super.atacar(), se reutiliza la implementación del método atacar() de la clase padre (Personaje), evitando la duplicación de código y facilitando el mantenimiento.

Si declaras una variable Personaje p = new Guerrero(...) y llamas p.atacar(), ¿qué método se ejecuta, el de Personaje o el de Guerrero? ¿Por qué?
Ejecutará el método atacar() de Guerrero debido al polimorfismo. Aunque la variable es de tipo Personaje, el objeto real es una instancia de Guerrero, por lo que se invoca el método sobrescrito en la subclase; porque en tiempo de ejecución, Java determina el tipo real del objeto y llama al método correspondiente.

Explicacion de conceptos y temas vistos en clase:
this: Se utiliza para hacer referencia a los elementos locales de la clase en la que te encuentras (variables, propiedades o métodos, ya sean públicos o privados). Es decir, apunta a la instancia actual del objeto.
super: Se utiliza para hacer referencia a la clase superior (clase padre o superclase abstracta). Sirve para mandar a llamar métodos o constructores que pertenecen al padre y no a la clase local. En el ejemplo, usan super para invocar el método atacar original de la clase superior.
set (Mutador): Sirve para inyectar o cambiar un valor. 
get (Accesor): Sirve para leer o recuperar ese valor almacenado para utilizarlo en la lógica del programa.
