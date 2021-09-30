# prova1-metodos-avan-ados-programa-ao
Repositório destinado a prova da disciplina Método Avançado de Programação

Definições:
Princípios SOLID:

1- Princípio da responsabilidade única. Para este princípio, uma classe deve possuir apenas uma responsabilidade. No meu código, as classes e interfaces atuam com apenas uma responsabilidade. 

2- Princípio Aberto-Fechado. Para este princípio, o código deve estar aberto para extensão e fechado para a modificação. Para tanto, no código cada tipo de cerveja extend a classe mãe, a classe cerveja. Desse modo, caso haja necessidade de aumentar a quantidade dos tipos de cerveja basta criar uma classe com um novo tipo, sem a necessidade de modificar o código.

3- Princípio da Substituíção de Liskov. Este princípio diz que as classes bases/mãe podem ser substituídas pela classes derivadas/filhas sem causar danos ao código. Implemento isso no meu código quando crio a classe TipoCerveja que extends Cerveja e quando instancio um objeto na classe Principal, ao invés de usar a classe mãe(Cerveja) uso a classe filha(TipoCerveja) sem causar danos ao código.

4- Princípio da Segregação de Interface. Este princípio diz que deve-se implementar Interfaces mais especificas e não genéricas de modo que a classe implemente apenas as interfaces que de fato utilize. No meu código, implementei interfaces (CriarCerveja e FactoryInterface) de modo que elas sejam implementadas nas classes apenas se realmente for útil essa implementação.

5- Princípio da Inversão de Dependência. Este princípio diz que é deve-se depender de abstrações e não de implementações. No meu código, na classe Cervejaria, ao invés de instaciar um objeto direto da classe concreta (FactoryCerveja) utilizei a Injeção de dependência via Construtor onde instanciei um objeto a partir da interface.


Factory Method:
É um padrão de projetos em que ocorre o uso de uma Superclasse para que sejam criados objetos. Neste padrão de projeto, a factory decide qual instancia utilizar. No meu código,  há a superclasse FactoryCerveja que instancia os objetos.

