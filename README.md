


# Documentação do Projeto Heranca

Este projeto é uma implementação simples de um sistema de gerenciamento de pessoas, incluindo diferentes tipos de pessoas, como alunos, funcionários e professores.
As classes principais são `Pessoa`, `Aluno`, `Funcionario`, `Professor` e a classe `main` que executa o programa.

## Estrutura do Projeto

### Classe `Pessoa`

A classe `Pessoa` representa uma entidade básica que contém informações sobre uma pessoa.

#### Atributos

- `nome` (String): O nome da pessoa.
- `sexo` (String): O sexo da pessoa.
- `idade` (int): A idade da pessoa.

#### Métodos

- `fazerAniversario()`: Incrementa a idade da pessoa em 1.
- `getNome()`: Retorna o nome da pessoa.
- `setNome(String nome)`: Define o nome da pessoa.
- `getSexo()`: Retorna o sexo da pessoa.
- `setSexo(String sexo)`: Define o sexo da pessoa.
- `getIdade()`: Retorna a idade da pessoa.
- `setIdade(int idade)`: Define a idade da pessoa.
- `toString()`: Retorna uma representação em string da pessoa.

### Classe `Aluno`

A classe `Aluno` estende a classe `Pessoa` e representa um aluno.

#### Atributos

- `matricula` (int): O número de matrícula do aluno.
- `curso` (String): O curso em que o aluno está matriculado.

#### Métodos

- `cancelarMatricula()`: Cancela a matrícula do aluno.
- `getMatricula()`: Retorna o número de matrícula do aluno.
- `setMatricula(int matricula)`: Define o número de matrícula do aluno.
- `getCurso()`: Retorna o curso do aluno.
- `setCurso(String curso)`: Define o curso do aluno.

### Classe `Funcionario`

A classe `Funcionario` estende a classe `Pessoa` e representa um funcionário.

#### Atributos

- `setor` (String): O setor em que o funcionário trabalha.
- `trabalhando` (boolean): Indica se o funcionário está trabalhando.

#### Métodos

- `mudarTrabalho()`: Altera o estado de trabalho do funcionário.
- `getSetor()`: Retorna o setor do funcionário.
- `setSetor(String setor)`: Define o setor do funcionário.
- `isTrabalhando()`: Retorna o estado de trabalho do funcionário.
- `setTrabalhando(boolean trabalhando)`: Define o estado de trabalho do funcionário.

### Classe `Professor`

A classe `Professor` estende a classe `Pessoa` e representa um professor.

#### Atributos

- `especialidade` (String): A especialidade do professor.
- `salario` (float): O salário do professor.

#### Métodos

- `receberAumento(float aumento)`: Aumenta o salário do professor.
- `getEspecialidade()`: Retorna a especialidade do professor.
- `setEspecialidade(String especialidade)`: Define a especialidade do professor.
- `getSalario()`: Retorna o salário do professor.
- `setSalario(float salario)`: Define o salário do professor.

### Classe `main`

A classe `main` contém o método principal que executa o programa.

#### Exemplo de Uso

```java
public static void main(String[] args) {
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
```

