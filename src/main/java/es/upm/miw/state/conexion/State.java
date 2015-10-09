package es.upm.miw.state.conexion;

public abstract class State {
    Estado estado;

    public void abrir(Conexion conex) {
        throw new UnsupportedOperationException();
    }

    public void cerrar(Conexion conex) {
        throw new UnsupportedOperationException();
    }

    public void parar(Conexion conex) {
        throw new UnsupportedOperationException();
    }

    public void iniciar(Conexion conex) {
        throw new UnsupportedOperationException();
    }

    public void enviar(Conexion conex, String msg) {
        throw new UnsupportedOperationException();
    }

    public void recibir(Conexion conex, int respuesta) {
        throw new UnsupportedOperationException();
    }

    public abstract Estado getEstado();
}
