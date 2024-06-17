# Projeto Iphone

#### Autor
- [Gabriel Garcia](https://github.com/GabrielGarciaUSP)

## Iphone - Desafio

Este projeto consiste em uma aplicação Java simples que implementa um iphone, com algumas funcionalidades básicas, utilizando um UML previamente feito, com funções como reproduzir musica, navegar pela internet, realizar e atender ligações e etc

## UML 
<img src="/Imagens/UML.jpg">
  
## Estrutura do Projeto

* Interfeces: o projeto é composto por 3 interfaces, uma para cada "aplicativo", que contém apenas a declaração dos métodos.

* Iphone: a classe iphone é onde definimos o que cada método faz, definimos também o construtor do iphone e os métodos getters e setters

* Main: por fim temos a classe main, que serve basicamente para instanciar o objeto iphone e demosntrar todas as funcionalidades funcionando corretamente

### Interfaces utilizadas:
```java
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}
```

## Resultados
 O projeto foi um sucesso, realizando o UML percebi que facilitou bastante a forma de pensar na lógica para fazer o programa e também a velocidade na qual eu implementei todos os métodos, ainda acho que falta algumas melhorias como por exemplo utilizar métodos get e set para definir a música como fixa, e não obte-la sempre diretamente no código e sim utilizar um scanner assim eu obtenho a música do usuário e caso necessário eu troco quando for adequado, há outras melhorias, futuramente eu desenvolvo novas versões!

