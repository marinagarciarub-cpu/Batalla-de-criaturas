# Gandalf vs Aragorn

#  PROYECTO: SIMULADOR DE BATALLA LORD OF THE RINGS

Este proyecto es una implementación de un sistema de combate por turnos desarrollado en **Java**, enfocado en el uso de **Programación Orientada a Objetos** y **Gestión de Excepciones**.

---

##  PERSONAJES

| **ARAGORN (El Guerrero)** | **VS** | **GANDALF (El Mago)** |
| :---: | :---: | :---: |
| ![Aragorn](https://assets.mycast.io/characters/aragorn-6976819-normal.jpg?1654419779) | | ![Gandalf](https://th.bing.com/th/id/R.fb2774b2556f035e6dcbd304a16a49ae?rik=IrS1Mgz4s4uDxA&riu=http%3a%2f%2fimages.wikia.com%2flotr%2fimages%2f8%2f8d%2fGandalf-2.jpg&ehk=Nm3tJ5SK6z6MbERxfYI6yqcd3virc6P6FuI9Uv1fxxw%3d&risl=&pid=ImgRaw&r=0](https://i.pinimg.com/736x/cb/b1/c5/cbb1c5e3895f1b23679b4e729daf5129.jpg)) |
| **Life:** 150 | | **Life:** 100 |
| **Energía:** 60 | | **Energía:** 100 |

---

##  ESTRUCTURA DEL CÓDIGO

### 1. Jerarquía de Clases
* **`Criatura` (Clase Abstracta):** El molde base. Contiene la lógica de salud, energía y el contrato de ataque.
* **`Guerrero`:** Especialista en combate físico. Sus ataques consumen energía de resistencia.
* **`Mago`:** Especialista en hechizos. Sus ataques consumen energía mágica.

### 2. Manejo de Errores (Excepciones)
El juego está protegido contra fallos mediante excepciones personalizadas:
* `EnergiaInsuficienteException`: Se lanza si intentas atacar sin recursos.
* `PersonajeDerrotadoException`: Controla que un personaje muerto no pueda seguir luchando.
* `NumberFormatException`: Gestiona errores cuando el usuario introduce letras en el menú numérico.

---

## MECÁNICAS DE JUEGO

1. **Ataques Variados:** Cada personaje tiene 3 niveles de ataque con diferentes costes y daños.
2. **Sistema de Descanso:** Permite saltar un turno para recuperar puntos de energía necesarios para ataques potentes.
3. **"IA" de Combate:** El rival elige sus movimientos de forma aleatoria basándose en su energía disponible.

---

## INSTRUCCIONES DE EJECUCIÓN

1. Clonar el repositorio.
3. Ejecutar la clase `Main.java`.
4. Seguir las instrucciones del menú en la consola.




