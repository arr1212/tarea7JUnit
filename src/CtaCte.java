public class CtaCte {

    int saldo = 1000000;

    public boolean extraccion(int monto){
        boolean exito=false;
        if (this.saldo>monto) {
            this.saldo = this.saldo - monto;
            exito = true;}
        return exito;
    }

    public int deposito(int monto){
        if (monto>0) {this.saldo = this.saldo + monto;}
        return this.saldo;
    }

    public int consultaSaldo(){
        return this.saldo;
    }
}
