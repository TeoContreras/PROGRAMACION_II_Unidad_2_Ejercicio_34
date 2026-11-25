public class LogArchivoLocal implements DestinoLog {
    public void guardarRegistro(String nivel, String mensaje) { System.out.println("[Archivo local] " + nivel + ": " + mensaje); }
}
