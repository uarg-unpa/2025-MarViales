package tp2;

public class Alumno {
    private String apellido;
    private int dni;
    private int edad;
    private char legajo;
    private char sexo;
    
    //Constructor

 public Alumno(String ape, int dni, int edad, char legajo, char sexo){
      this.apellido = ape;
      this.dni = dni;
      this.edad = edad;
      this.legajo = legajo;
      this.sexo = sexo;
 }

    // Metodos gets y setsgit

        public void setApellido(String a){
        this.apellido = a;
        }
        public String getApellido(){
        return this.apellido;
    }
        public void setDNI(int dni){
        this.dni = dni;
    }
        public int getDNI(){
        return this.dni;
    }
        public void setEdad(int edad){
        this.edad = edad;
    }
        public int getEdad(){
        return this.edad;
    }
        public void setLegajo (char legajo){
        this.legajo = legajo;
    }
        public char getLegajo(){
        return this.legajo;
    }
        public void setSexo(char sexo){
        this.sexo = sexo;
    }
        public char getSexo(){
        return this.sexo;
    }
}