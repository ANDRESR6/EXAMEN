/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author UseR
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String cargaHoraria;
    private String fechaNac;
    private String email;
    private String telefono;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, String cargaHoraria, String fechaNac, String email, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargaHoraria = cargaHoraria;
        this.fechaNac = fechaNac;
        this.email = email;
        this.telefono = telefono;
    }

    public Persona(String text, String text0, String text1, String text2, String text3, String text4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Persona(String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cargaHoraria
     */
    public String getCargaHoraria() {    
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria  the direccion to set
     */
    public void setCargaHoraria(String cargaHoraria) {   
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the fechaNac
     */
    public String getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\n CEDULA: "+getCedula()+"\n NOMBRE: "+getNombre()+"\n APELLIDO: "+getApellido()+"\n FECHA DE NACIMIENTO: "+getFechaNac()+
               "\n TELEFONO"+getTelefono()+"\n E-MAIL: "+getEmail()+"\n CARGA HORARIA: "+getCargaHoraria(); //To change body of generated methods, choose Tools | Templates.
    }
}
