/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author Alisson Kaelan
 */
public abstract class Pessoa {
    protected String nome, sexo;  
    protected int idade;
    
    public void fazerAniversario(){
        this.idade ++;
        
    }
    
    //Metodos Especiais

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Dados{" + "nome = " + nome + ", sexo = " + sexo + ", idade = " + idade + '}';
    }
    
    
}
