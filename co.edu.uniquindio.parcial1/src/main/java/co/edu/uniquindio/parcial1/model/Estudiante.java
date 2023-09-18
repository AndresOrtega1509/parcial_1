package co.edu.uniquindio.parcial1.model;
import co.edu.uniquindio.parcial1.ejercicio1.MainEjercicio1;
public class Estudiante {
    private String nombre;
    private int edad;
    private String correo;
    private int semestre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;

    /*Constructor*/
    public Estudiante(){

    }

    public Estudiante(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3, double nota4, double nota5){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }

    /*  Getters y Setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    /**
     * Metodo que retorma la informacion del estudiante
     * @return
     */
    public String obtenerInformacion() {
        String informacion = "";
        informacion = informacion +
                "nombre: "+getNombre() + "\n"+
                "edad: "+getEdad() + "\n"+
                "correo: "+getCorreo() + "\n"+
                "semestre: "+getSemestre() + "\n"+
                "nota1: "+getNota1() + "\n"+
                "nota2: "+getNota2() + "\n"+
                "nota3: "+getNota3() + "\n";

        return informacion;
    }

    public double calcularPromedio(){
        double promedio = 0.0;
        promedio = (getNota1() + getNota2() + getNota3() + getNota4() + getNota5())/3;

        return promedio;
    }



}
