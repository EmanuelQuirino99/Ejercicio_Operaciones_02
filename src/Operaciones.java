public class Operaciones {

    double numero1,numero2;

    double division,suma,diferencia,producto,modulo;


    public Operaciones() {
    }

    public Operaciones(double numero1, double numero2, double division, double suma,
                       double diferencia, double producto, double modulo) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.division = division;
        this.suma = suma;
        this.diferencia = diferencia;
        this.producto = producto;
        this.modulo = modulo;
        }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getDivision() {
        return (numero1 /numero2);
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public double getSuma() {
        return numero1 + numero2;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getDiferencia() {
        return (numero1 - numero2) ;
    }

    public void setDiferencia(double diferencia) {
        this.diferencia = diferencia;
    }

    public double getProducto() {
        return (numero1*numero2);
    }

    public void setProducto(double producto) {
        this.producto = producto;
    }

    public double getModulo() {
        return (numero1%numero2);
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }



    @Override
    public String toString() {
        return "Operaciones:" + "\n" +
                  "numero1 = " + numero1 + "\n" + "\n" +
                  "numero2 =  " + numero2 +  "\n" + "\n" +
                  "------------------------------------------"+"\n" +
                  "suma    =    "  +  getSuma()  + "\n" + "\n" +
                  "diferencia  =  " + getDiferencia() + "\n" + "\n" +
                  "division    =    " + getDivision() + "\n" + "\n" +
                  "producto    =    " + getProducto() + "\n" + "\n" +
                  "modulo      =      " + getModulo() + "\n" + "\n" +
                ':';
    }


}
