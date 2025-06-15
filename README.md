# Desafio: Componentes e Injeção de Dependência (Spring Boot)

Este projeto consiste em um sistema desenvolvido com **Java e Spring Boot** para calcular o valor total de um pedido, considerando **frete** e **desconto**. A lógica é dividida entre componentes (serviços) responsáveis por suas respectivas responsabilidades.

## Conteúdo

- [Objetivo](#objetivo)
- [Regras de Negócio](#regras-de-negócio)
- [Exemplos de Entrada e Saída](#exemplos-de-entrada-e-saída)
- [Arquitetura da Solução](#arquitetura-da-solução)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Executar](#como-executar)

---

## Objetivo

Criar um sistema com **injeção de dependência** que receba os dados de um pedido e calcule seu **valor total** aplicando uma **porcentagem de desconto** e um **valor de frete** com base em regras definidas.

---

## Regras de Negócio

O cálculo do valor total do pedido segue esta lógica:

```
valor_total = valor_básico - (desconto %) + frete
```

A regra para o **frete** é:

| Valor básico do pedido (sem desconto) | Frete      |
|--------------------------------------|------------|
| Abaixo de R$ 100.00                  | R$ 20.00   |
| De R$ 100.00 até R$ 200.00 exclusive | R$ 12.00   |
| R$ 200.00 ou mais                    | Grátis     |

---

## Exemplos de Entrada e Saída

### Exemplo 1

**Entrada:**
```
Código: 1034
Valor básico: 150.00
Desconto: 20.0%
```

**Saída:**
```
Pedido código 1034
Valor total: R$ 132.00
```

---

### Exemplo 2

**Entrada:**
```
Código: 2282
Valor básico: 800.00
Desconto: 10.0%
```

**Saída:**
```
Pedido código 2282
Valor total: R$ 720.00
```

---

### Exemplo 3

**Entrada:**
```
Código: 1309
Valor básico: 95.90
Desconto: 0.0%
```

**Saída:**
```
Pedido código 1309
Valor total: R$ 115.90
```

---

## Arquitetura da Solução

A aplicação é estruturada com os seguintes componentes:

- **`OrderService`**  
  Responsável pelo cálculo do valor total do pedido.

- **`ShippingService`**  
  Responsável pelo cálculo do frete conforme as regras de negócio.

- **`Order` (Entidade)**  
  Representa um pedido, contendo código, valor básico e porcentagem de desconto.

Cada serviço é anotado com `@Service`, permitindo a **injeção de dependência via Spring**.

---

## 🚀 Tecnologias Utilizadas

- Java 17+ (ou versão compatível com seu ambiente)
- Spring Boot
- Maven ou Gradle (como gerenciador de dependência)
- IntelliJ IDEA ou Spring Tool Suite (STS)
- Terminal para executar o projeto

---

## ▶️ Como Executar

1. Clone o projeto:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

2. Abra o projeto com o IntelliJ ou outro IDE compatível com Spring.

3. Execute a aplicação como uma aplicação Spring Boot.

4. Verifique a saída no terminal/log.

---

## 📬 Contato

Para dúvidas ou sugestões, sinta-se à vontade para abrir uma *issue* ou entrar em contato.

---
