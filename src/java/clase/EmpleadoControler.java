
package clase;

public class EmpleadoControler {
      EmpeladoModel [] tablaALumno;
    int indiceArray;
    
    public EmpleadoControler(){
        this.tablaALumno = new  EmpeladoModel [100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno( EmpeladoModel empleados){
        this.tablaALumno[this.indiceArray]=empleados;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public EmpeladoModel[] getAlumnos(){
        return this.tablaALumno;
    }
    
}