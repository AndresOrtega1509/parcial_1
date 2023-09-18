package co.edu.uniquindio.parcial1.model;

public class Docente {
        private String nombre;
        private int edad;
        private String correo;

        public Docente(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }

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


        public double calcularPromedioCurso(double notaEstudiante1,double notaEstudiante2, double notaEstudiante3 ){
            double promedioCurso = 0.0;
            promedioCurso = (notaEstudiante1+notaEstudiante2+notaEstudiante3)/3;

            return promedioCurso;
        }



}
