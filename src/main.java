public class main {
    public static void main(String[] args) {
        GestorAuditoria gestor = new GestorAuditoria();
        gestor.agregarDestino(new LogArchivoLocal());
        gestor.agregarDestino(new LogBaseDatos());
        gestor.agregarDestino(new LogServicioNube());
        gestor.registrar("CRÍTICO", "Se detectó un error en el servidor.");
    }
}
