public class LogBaseDatos implements DestinoLog {
    public void guardarRegistro(String nivel, String mensaje) { System.out.println("[Base de datos] " + nivel + ": " + mensaje); }
}
