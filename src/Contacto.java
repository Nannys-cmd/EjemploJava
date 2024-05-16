public class Contacto {
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getDireccion() { return direccion; }
    public void  setDireccion(String direccion) {this.direccion = direccion; }

    // Método toString para imprimir indormación del contacto
    public String toString() {
        return "contacto{" +
                "nombre=" + nombre + " \'" +
                ", telefono=" + telefono + " \'" +
                ", correo" + correo + " \'" +
        '}';
    }
}