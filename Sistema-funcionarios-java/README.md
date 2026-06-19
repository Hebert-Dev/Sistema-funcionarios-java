## Padrões de Projeto

Este projeto utiliza o padrão **Strategy** para o cálculo de salário.
Cada tipo de funcionário (Vendedor, Gerente) recebe uma estratégia de
cálculo diferente (`CalculoComComissao`, `CalculoComBonus`), permitindo
trocar ou adicionar novas regras de cálculo sem alterar as classes
existentes.

## Como executar

1. Instale o MySQL (ou XAMPP, que já inclui o MySQL)
2. Inicie o serviço do MySQL
3. Execute o script `schema.sql` para criar o banco e a tabela
4. Caso seu usuário/senha do MySQL sejam diferentes do padrão
   (`root` sem senha), ajuste em `ConexaoDB.java`
5. Abra o projeto no IntelliJ IDEA e execute a classe `Main`