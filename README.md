
# Documentação da Classe `Pessoa`

A classe `Pessoa` representa uma entidade básica que contém informações sobre uma pessoa, como nome, sexo e idade. Além disso, a classe possui métodos para manipular essas informações.

## Estrutura da Classe

```java
public class Pessoa {
    private String nome, sexo;  
    private int idade;
    
    public void fazerAniversario() {
        this.idade++;
    }
    
    // Métodos Especiais
    public String getNome() { ... }
    public void setNome(String nome) { ... }
    public String getSexo() { ... }
    public void setSexo(String sexo) { ... }
    public int getIdade() { ... }
    public void setIdade(int idade) { ... }
    
    @Override
    public String toString() { ... }
}
```

## Atributos

- `nome` (String): O nome da pessoa.
- `sexo` (String): O sexo da pessoa.
- `idade` (int): A idade da pessoa.

## Métodos

### `fazerAniversario()`

```java
public void fazerAniversario()
```

Incrementa a idade da pessoa em 1.

### Métodos Especiais

#### `getNome()`

```java
public String getNome()
```

Retorna o nome da pessoa.

#### `setNome(String nome)`

```java
public void setNome(String nome)
```

Define o nome da pessoa.

#### `getSexo()`

```java
public String getSexo()
```

Retorna o sexo da pessoa.

#### `setSexo(String sexo)`

```java
public void setSexo(String sexo)
```

Define o sexo da pessoa.

#### `getIdade()`

```java
public int getIdade()
```

Retorna a idade da pessoa.

#### `setIdade(int idade)`

```java
public void setIdade(int idade)
```

Define a idade da pessoa.

### `toString()`

```java
@Override
public String toString()
```

Retorna uma representação em string da pessoa, incluindo nome, sexo e idade.

## Exemplo de Uso

```java
Pessoa pessoa = new Pessoa();
pessoa.setNome("João");
pessoa.setSexo("Masculino");
pessoa.setIdade(30);

System.out.println(pessoa); // Saída: Pessoa{nome=João, sexo=Masculino, idade=30}

pessoa.fazerAniversario();
System.out.println(pessoa.getIdade()); // Saída: 31
```
