
# 🚗 Meu Primeiro Sistema

> **Organize seu código. Construa sua arquitetura.**

## 🎯 Sobre o Projeto

A **Missão 02** tem como objetivo desenvolver um pequeno sistema em **Java**, deixando para trás o conceito de arquivo único e aprendendo a organizar classes em **pacotes**.

O projeto simula uma estrutura simples onde diferentes responsabilidades ficam separadas em seus próprios "bairros".

## 🧩 O Desafio

Durante a missão, foram trabalhados conceitos fundamentais de **Programação Orientada a Objetos**:

* 📦 Organização de classes em pacotes
* 🧱 Criação e utilização de classes
* 🔗 Comunicação entre classes
* 📥 Uso de `import`
* 🏗️ Criação de objetos
* ⚙️ Métodos e atributos
* 💻 Compilação e execução pelo terminal
* ☁️ Versionamento e publicação no GitHub

## 📂 Estrutura do Projeto

```text
meu-primeiro-sistema/
│
├── src/
│   └── br/
│       └── com/
│           └── meusistema/
│               ├── model/
│               │   └── Carro.java
│               │
│               └── main/
│                   └── Sistema.java
│
└── .gitignore
```

### 🚗 `Carro.java`

Responsável por representar o objeto **Carro**, contendo seus atributos e o método de buzina.

### ⚙️ `Sistema.java`

Classe principal responsável por executar o programa, criar os objetos `Carro` e utilizar seus comportamentos.

## 🛠️ Tecnologias

* **Java**
* Programação Orientada a Objetos
* Git
* GitHub
* VS Code

## ▶️ Como Executar

Compile as classes:

```bash
javac src/br/com/meusistema/model/*.java src/br/com/meusistema/main/*.java
```

Execute o sistema:

```bash
java -cp src br.com.meusistema.main.Sistema
```

### 💻 Exemplo de saída

```text
Iniciando o sistema...
O Fusca Azul fez: BIIII BIIII!
```

## 🎯 Objetivo da Missão

Aprender a estruturar um projeto Java utilizando **múltiplos pacotes e classes**, além de praticar o fluxo completo de desenvolvimento: **criar → testar → versionar → publicar**.

---

### 🏆 Missão 02 Concluída!

> **Do arquivo único para uma arquitetura organizada.** 🚀
