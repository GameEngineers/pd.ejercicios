package es.upm.miw.pd.visitor;

public class Visitor2 extends Visitor {

    int contadorA;

    int contadorB;

    public Visitor2() {
        contadorA = 0;
        contadorB = 0;
    }

    @Override
    public void visitElementA(ElementA e) {
        contadorA += 1;

    }

    @Override
    public void visitElementB(ElementB e) {
        contadorB += 1;

    }
    
    public int getAs(){
        return contadorA;
    }
    
    public int getBs(){
        return contadorB;
    }

}
