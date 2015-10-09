package es.upm.miw.state.conexion;

public class Preparado extends State {
    private static final Estado PREPARADO = Estado.PREPARADO;

    @Override
    public Estado getEstado() {
        return PREPARADO;
    }
    
    @Override
    public void iniciar(Conexion conex){
        conex.setState(this);
    }
    
    @Override
    public void abrir(Conexion conex){
        conex.setState(this);
    }
    
    public void cerrar(Conexion conex){
        conex.setState(new Cerrado());
    }
    
    /*public void enviar(String msg){
        conex.
    }*/
}
