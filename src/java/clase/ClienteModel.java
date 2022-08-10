
package clase;


public class ClienteModel {
    
  private String nombre;
  private String apellido;
  private String codigo;
  private String numero;
  private String Correo;
  private String contraseña;
private String direccion;


public ClienteModel (String codigo, String nombre, String correo, String direccion, String apellido, String contraseña){
        this.codigo=codigo;
        this.nombre=nombre;
        this.Correo=correo;
        this.direccion=direccion;     
        this.apellido=apellido;
        this.contraseña=contraseña;
   
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
  
    
  
    
  
    
    
    

}
