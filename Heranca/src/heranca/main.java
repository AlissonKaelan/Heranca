/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca;

/**
 *
 * @author Alisson Kaelan
 */
public class main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa1 = new Pessoa();
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        Funcionario funcionario1 = new Funcionario();
        
        pessoa1.setNome("Joao");
        pessoa1.setIdade(30);
        pessoa1.setSexo("M");
        
        aluno1.setNome("Maria");
        aluno1.setCurso("Informatica");
        aluno1.setIdade(18);
        aluno1.setSexo("F");
        
        professor1.setNome("Claudio");
        professor1.setEspecialidade("Ingles");
        professor1.setIdade(24);
        professor1.setSalario(2900.98f);
        professor1.setSexo("M");
        
        
        funcionario1.setNome("Marcia");
        
        System.out.println(pessoa1.toString());
        System.out.println(aluno1.toString());
        System.out.println(professor1.toString());
        System.out.println(funcionario1.toString());
        
        
    }
    
}
