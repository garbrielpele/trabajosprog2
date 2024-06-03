
package trabajo4;
import java.util.List;

public class  tp4ej1{
  public static void main(String[] args){
    class Persona {
  String nombre;
  int edad;
}//declaramos persona

class Jugador extends Persona {
  String posicion;
  int numero;
  int golesanotados;
}//declaramos jugadores con el atributo de posicion numero en la espalda y goles

class Entrenador extends Persona {
  int aniosexperiencia;
  String titulo;
  String nombreequipo;
}//declaramos entrenador

class Masajista extends Persona {
  int aniosexperiencia;
  List<String> certificados;
  String especialidad;
}//declaramos al masajista y a una lista para colocar sus certificados

class Utilero extends Persona {
  int aniosExperiencia;
  String funciones;
  String categoria;
}//declaramos al utilero y sus funciones

class Equipo {
  String nombreequipo;
  String ciudad;

  List<Jugador> jugadores;
  List<Entrenador> entrenadores;
  List<Masajista> masajistas;
  List<Utilero> utileros;

  void concentrar() {
    
  }

  void viajar() {
    
  }

  void jugarPartido() {
    
  }

  void entrenar() {
    
  }

  void mostrargolesjugadores() {
    for (Jugador jugador : jugadores) {
      System.out.println(jugador.nombre + " - Goles: " + jugador.golesanotados);
    }
  }

  void mostrarjugadoresporposicion() {
    
  }

  void eliminarjugador(String nombreJugador) {
    for (Jugador jugador : jugadores) {
      if (jugador.nombre.equals(nombreJugador)) {
        jugadores.remove(jugador);
        break;
      }
    }
  }
}
}
}
