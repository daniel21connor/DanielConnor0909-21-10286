
package clase;

public class AlumnoController {
      ClienteModel[] tablaALumno;
    int indiceArray;
    
    public AlumnoController(){
        this.tablaALumno = new  ClienteModel[100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno( ClienteModel cliente){
        this.tablaALumno[this.indiceArray]=cliente;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public  ClienteModel[] getAlumnos(){
        return this.tablaALumno;
    }
    
}