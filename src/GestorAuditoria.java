import java.util.ArrayList;
public class GestorAuditoria {
    private ArrayList<DestinoLog> destinos = new ArrayList<DestinoLog>();
    public void agregarDestino(DestinoLog destino) { destinos.add(destino); }
    public void registrar(String nivel, String mensaje) {
        for (DestinoLog destino : destinos) destino.guardarRegistro(nivel, mensaje);
    }
}
