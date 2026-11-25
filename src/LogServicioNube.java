public class LogServicioNube implements DestinoLog {
    public void guardarRegistro(String nivel, String mensaje) { System.out.println("[Nube] " + nivel + ": " + mensaje); }
}
