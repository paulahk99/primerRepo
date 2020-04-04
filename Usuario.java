
public class Usuario{
    private String nombre;
    private String cedula;
    private String contraseña;
    private int edad;
    private int cantidadHijos;
    private int saldo = 0;
    
   public Usuario(String unNombre, String unaCedula, String unaContraseña, int unaEdad, int unaCantidadHijos, int unSaldo){
        this.setNombre(unNombre);
        this.setCedula(unaCedula);
        this.setContraseña(unaContraseña);
        this.setEdad(unaEdad);
        this.setCantidadHijos(unaCantidadHijos);
        this.setSaldo(unSaldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}


