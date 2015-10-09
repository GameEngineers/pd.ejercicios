package es.upm.miw.state.conexion;

public class Conexion {
    private State state;
    
    protected void setState(State state){
        this.state = state;
    }
    
    public void abrir(){
        state.abrir(this);
    }
    
    public void cerrar(){
        state.cerrar(this);
    }

    public void parar(){
        state.parar(this);
    }
    
    public void iniciar(){
        state.iniciar(this);
    }
    
    public void enviar(String msg){
        state.enviar(this, msg);
    }
    
    public void recibir(int respuesta){
        state.recibir(this, respuesta);
    }
    
    public Estado estado(){
        return this.state.getEstado();
    }
}
