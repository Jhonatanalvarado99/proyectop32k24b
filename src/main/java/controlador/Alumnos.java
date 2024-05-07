/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

public class Alumnos {
    private String carnet_alumno;
    private String nombre_alumno;
    private String direccion_alumno;
    private String telefono_alumno;
    private String email_alumno;
    private String estatus_alumno;

    public Alumnos() {
    }
    
    //To string para qué no nos salga los resultados en memoria
     @Override
    public String toString() {
        return "Alumnos{" + "Carnet_alumno=" + carnet_alumno + ", Nombre_alumno=" + nombre_alumno + ", Direccion_alumno=" + direccion_alumno + ", Telefono_alumno=" + telefono_alumno + ", Email_alumno=" + email_alumno + ", Estatus_alumno=" + estatus_alumno + '}';
    }
    
    public String getCarnet_alumno() {
        return carnet_alumno;
    }

    public void setCarnet_alumno(String carnet_alumno) {
        this.carnet_alumno = carnet_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getDireccion_alumno() {
        return direccion_alumno;
    }

    public void setDireccion_alumno(String direccion_alumno) {
        this.direccion_alumno = direccion_alumno;
    }
    
    public String getTelefono_alumno() {
        return telefono_alumno;
    }

    public void setTelefono_alumno(String telefono_alumno) {
        this.telefono_alumno = telefono_alumno;
    }

    public String getEmail_alumno() {
        return email_alumno;
    }

    public void setEmail_alumno(String email_alumno) {
        this.email_alumno = email_alumno;
    }

    public String getEstatus_alumno() {
        return estatus_alumno;
    }

    public void setEstatus_alumno(String estatus_alumno) {
        this.estatus_alumno = estatus_alumno;
    }
    
    public Alumnos(String carnet_alumno) {
        this.carnet_alumno = carnet_alumno;
    }
    
    public Alumnos(String nombre_alumno, String carnet_alumno) {
        this.carnet_alumno = carnet_alumno;
        this.nombre_alumno = nombre_alumno;
    }
    
    public Alumnos(String carnet_alumno, String nombre_alumno, String direccion_alumno){
        this.carnet_alumno = carnet_alumno;
        this.nombre_alumno = nombre_alumno;
        this.direccion_alumno = direccion_alumno;
    }
    
    public Alumnos(String carnet_alumno, String nombre_alumno, String direccion_alumno, String telefono_alumno){
        this.carnet_alumno = carnet_alumno;
        this.nombre_alumno = nombre_alumno;
        this.direccion_alumno = direccion_alumno;
        this.telefono_alumno = telefono_alumno;
    }
    
    public Alumnos(String carnet_alumno, String nombre_alumno, String direccion_alumno, String telefono_alumno, String email_alumno){
        this.carnet_alumno = carnet_alumno;
        this.nombre_alumno = nombre_alumno;
        this.direccion_alumno = direccion_alumno;
        this.telefono_alumno = telefono_alumno;
        this.email_alumno = email_alumno;
    }
    
    public Alumnos(String carnet_alumno, String nombre_alumno, String direccion_alumno, String telefono_alumno, String email_alumno, String estatus_alumno) {
        this.carnet_alumno = carnet_alumno;
        this.nombre_alumno = nombre_alumno;
        this.direccion_alumno = direccion_alumno;
        this.telefono_alumno = telefono_alumno;
        this.email_alumno = email_alumno;
        this.estatus_alumno = estatus_alumno;
    }
    
}
