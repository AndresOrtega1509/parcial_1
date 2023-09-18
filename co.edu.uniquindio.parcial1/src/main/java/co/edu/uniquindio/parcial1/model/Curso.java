package co.edu.uniquindio.parcial1.model;

public class Curso {

    private String nombre;
    private int semestre;
    private String grupo;
    private int creditos;
    private String jornada;
    private String programa;
    private String facultad;
    private Estudiante estudiante1;
    private Estudiante estudiante2;
    private Estudiante estudiante3;
    private Docente docente;
    private Docente docenteAuxiliar;


    public Curso(String nombre, int semestre, String grupo, int creditos, String jornada, String programa, String facultad) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.grupo = grupo;
        this.creditos = creditos;
        this.jornada = jornada;
        this.programa = programa;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Estudiante getEstudiante1() {
        return estudiante1;
    }

    public void setEstudiante1(Estudiante estudiante1) {
        this.estudiante1 = estudiante1;
    }

    public Estudiante getEstudiante2() {
        return estudiante2;
    }

    public void setEstudiante2(Estudiante estudiante2) {
        this.estudiante2 = estudiante2;
    }

    public Estudiante getEstudiante3() {
        return estudiante3;
    }

    public void setEstudiante3(Estudiante estudiante3) {
        this.estudiante3 = estudiante3;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Docente getDocenteAuxiliar() {
        return docenteAuxiliar;
    }

    public void setDocenteAuxiliar(Docente docenteAuxiliar) {
        this.docenteAuxiliar = docenteAuxiliar;
    }

    /**
     * Metodo para mostrar la informacion de los estudiantes del curso
     */
    public void mostrarInformacionEstudiantes() {
        String informacionEstudiante1 = getEstudiante1().obtenerInformacion();
        String informacionEstudiante2 = getEstudiante2().obtenerInformacion();
        String informacionEstudiante3 = getEstudiante3().obtenerInformacion();
        System.out.println("Informacion del estudiante 1: " + informacionEstudiante1);
        System.out.println("Informacion del estudiante 2: " + informacionEstudiante2);
        System.out.println("Informacion del estudiante 3: " + informacionEstudiante3);
    }

    public double obtenerPromedioCurso() {
        double promedioEstuadiante1 = 0.0;
        double promedioEstuadiante2 = 0.0;
        double promedioEstuadiante3 = 0.0;
        double promedioCurso = 0.0;
        promedioEstuadiante1 = getEstudiante1().calcularPromedio();
        promedioEstuadiante2 = getEstudiante2().calcularPromedio();
        promedioEstuadiante3 = getEstudiante3().calcularPromedio();
        promedioCurso = (promedioEstuadiante1 + promedioEstuadiante2 + promedioEstuadiante3) / 3;

        return promedioCurso;
    }

    public String obtenerEstudianteNotaMayor4() {
        String estudiante = "";

        if (estudiante1.getNota5() > 4.0){
            estudiante = estudiante1.getNombre();
        }
        if (estudiante2.getNota5() > 4.0){
            estudiante = estudiante2.getNombre();
        }
        if (estudiante3.getNota5() > 4.0){
            estudiante = estudiante3.getNombre();
        }
        return estudiante;
    }



}