/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author Alisson Kaelan
 */
public class Tecnico extends Aluno{
    private String cursoTecnico;
    public void praticar(){
        System.out.println(this.nome + " Esta fazendo aulas pratica de: " + this.cursoTecnico);
    }

    public String getCursoTecnico() {
        return cursoTecnico;
    }

    public void setCursoTecnico(String cursoTecnico) {
        this.cursoTecnico = cursoTecnico;
    }

    @Override
    public String toString() {
        return "Tecnico{"+"Nome = "+ nome + " Sexo = "+ sexo + " cursoTecnico = " + cursoTecnico + '}';
    }
    
    
    
}
