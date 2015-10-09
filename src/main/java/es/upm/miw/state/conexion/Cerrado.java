package es.upm.miw.state.conexion;

public class Cerrado extends State {
    private static final Estado CERRADO = Estado.CERRADO;
    
    public void cerrar(Conexion conex){
        conex.setState(this);
    }

    public void abrir(Conexion conex){
        conex.setState(new Preparado());
    }
    @Override
    public Estado getEstado() {
        return CERRADO;
    }
}
