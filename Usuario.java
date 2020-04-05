public class Usuario {
    
    private String nombre;
    private int edad;
    private String contraseña;
    private int cedula;
    private int cantHijos;
    private int saldo;
    
    public Usuario() {
		this.nombre = "";
		this.contraseña = "";
		this.edad = 0;
        this.cedula = 0;
        this.cantHijos = 0;
		this.saldo = 0;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String unaContraseña) {
        this.contraseña = unaContraseña;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int unaCedula) {
        this.cedula = unaCedula;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int hijos) {
        this.cantHijos = hijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int unSaldo) {
        this.saldo = unSaldo;
    }
    
}
