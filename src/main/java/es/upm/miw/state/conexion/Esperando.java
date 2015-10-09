package es.upm.miw.state.conexion;

public class Esperando extends State {

    private static final Estado ESPERANDO = Estado.ESPERANDO;
    
    @Override
    public Estado getEstado() {
        return ESPERANDO;
    }
    
    @Override
    public void recibir(Conexion conex, int respuesta) {
        if (respuesta > 0) {
            conex.setState(new Cerrado());
        } else if (respuesta == 0) {
            conex.setState(new Preparado());
        }
    }
    
    

}
