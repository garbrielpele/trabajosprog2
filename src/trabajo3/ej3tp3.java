
public class ej3tp3 {

    
     

  public static void main(String[] args) {
      String post = "buenos dias soy @Gabriel";
      System.out.println("Longitud del posteo: " + calcularLongitud(post));
      System.out.println("Cumple con el limite de caracteres? " + cumpleLimite(post));
      System.out.println("Posteo con hashtag: " + agregarHashtag(post, "programacion"));
      System.out.println("Nombre de usuario: " + extraerUsuario(post));}
  
  public static int calcularLongitud(String post) {
      StringBuilder builder = new StringBuilder(post);
      return builder.length();}//calculo la longitud
  
  public static boolean cumpleLimite(String post) {
      StringBuilder builder = new StringBuilder(post);
      return builder.length() <= 280;}//verifico que no pase los 280 caracteres
  
  public static String agregarHashtag(String post, String hashtag) {
      StringBuilder builder = new StringBuilder(post);
      builder.append(" #").append(hashtag);
      return builder.toString();}//agrego el # al final
  
  public static String extraerUsuario(String post) {
      StringBuilder builder = new StringBuilder(post);
      int index = builder.indexOf("@");
      if (index != -1) {
          int endIndex = builder.indexOf(" ", index);
          if (endIndex == -1) {
              endIndex = builder.length();}
          return builder.substring(index, endIndex);}//saco el nombre del usuario
      return null;}
}