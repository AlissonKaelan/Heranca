/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author Alisson Kaelan
 */
public class main {
    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa();
        /*
        Visitante visitante = new Visitante();
        visitante.setNome("Camille");
        visitante.setIdade(22);
        visitante.setSexo("F");
        
        System.out.println(visitante.toString());
        */
        System.out.println("-------Aluno---------------");
        Aluno aluno = new Aluno();
        aluno.setNome("Neymar");
        aluno.setIdade(35);
        aluno.setCurso("Ti");
        aluno.setSexo("M");
        aluno.pagarMensalidade();
        System.out.println(aluno.toString());
        System.out.println("-----------------------------\n");
        
        
        System.out.println("------------Bolsista--------");
        Bolsista bolsista = new Bolsista();
        bolsista.setNome("Latrel");
        bolsista.setBolsa(12.5f);
        bolsista.setSexo("M");
        bolsista.pagarMensalidade();
        System.out.println(bolsista.toString());
        System.out.println("----------------------------\n");
        
        
        System.out.println("---------Curso Tecnico-------");
        Tecnico alunoTecnico = new Tecnico();
        alunoTecnico.setNome("Jubileu");
        alunoTecnico.setSexo("M");
        alunoTecnico.setCursoTecnico("Engenharia");
        alunoTecnico.praticar();
        System.out.println(alunoTecnico.toString());
        System.out.println("-----------------------------");
    }
    
}
