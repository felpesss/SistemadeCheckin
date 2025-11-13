Relatório do Projeto – Sistema de Gerenciamento de Tarefas em Java
Introdução

Este projeto tem como objetivo desenvolver um sistema simples de gerenciamento de tarefas utilizando a linguagem Java.
O sistema permite adicionar, listar e remover tarefas, aplicando princípios da Programação Orientada a Objetos (POO) e os padrões GRASP (Controller e Creator).

O projeto busca reforçar conceitos fundamentais da POO, como encapsulamento, classes e responsabilidades bem definidas, além de demonstrar boas práticas de design orientado a objetos.

# Sistema de Check-in (Aplicação dos Padrões GRASP)

## Descrição
Este projeto foi desenvolvido como parte da atividade de GRASP.  
O sistema simula um controle simples de check-in de tarefas, com cadastro, listagem e exclusão.

## Padrões GRASP aplicados

 1. Controller
- **Onde**: Classe `TaskController`
- **Por que**: Centraliza o controle das ações da aplicação (criar, listar, excluir e marcar tarefas como concluídas).  
  O uso do padrão **Controller** isola a lógica de controle da interface, promovendo **baixo acoplamento (Low Coupling)** entre camadas e **alta coesão (High Cohesion)** dentro do controlador.

### 2. Creator
- **Onde**: Método `saveNew()` da classe `TaskRepository`
- **Por que**: O repositório é responsável por criar objetos `Task`, pois ele possui as informações necessárias (como o `nextId`) e gerencia o armazenamento das tarefas.  
  Assim, ele cumpre o princípio **Creator**, que define que uma classe deve criar objetos que ela usa ou contém.

## Conclusão

O sistema desenvolvido demonstra a aplicação prática dos princípios GRASP de Controller e Creator, reforçando boas práticas de design orientado a objetos.
As responsabilidades foram distribuídas de forma clara entre as classes, promovendo organização, reutilização e facilidade de manutenção do código.

