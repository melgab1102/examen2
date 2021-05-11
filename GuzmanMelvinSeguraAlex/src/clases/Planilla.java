
package clases;


public class Planilla {
    
    
    int codigo;
    String Nombre_Empleado;
    int Horas_trabajadas;
    double pago_Horas;
    
    
    public Planilla() {
    }

    public Planilla(int codigo, String Nombre_Empleado, int Horas_trabajadas, double pago_Horas) {
        this.codigo = codigo;
        this.Nombre_Empleado = Nombre_Empleado;
        this.Horas_trabajadas = Horas_trabajadas;
        this.pago_Horas = pago_Horas;
    }
    
public double getPago_Horas() {
        return pago_Horas;
    }

    public void setPago_Horas(double pago_Horas) {
        this.pago_Horas = pago_Horas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_Empleado() {
        return Nombre_Empleado;
    }

    public void setNombre_Empleado(String Nombre_Empleado) {
        this.Nombre_Empleado = Nombre_Empleado;
    }

    public int getHoras_trabajadas() {
        return Horas_trabajadas;
    }

    public void setHoras_trabajadas(int Horas_trabajadas) {
        this.Horas_trabajadas = Horas_trabajadas;
    }
  
}
