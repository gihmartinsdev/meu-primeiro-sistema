package br.com.meusistema.main;


import br.com.meusistema.model.carro;

public class Sistema {
public static void main(String[] args) {
System.out.println("Iniciando o sistema...");
// Criando o objeto (Construindo o Carro 1)

carro meuCarro = new carro();
meuCarro.modelo = "Fusca";
meuCarro.cor = "Azul";

carro meuCarro2 = new carro();
meuCarro2.modelo = "Golf";
meuCarro2.cor = "Cinza";


// Chamando o método (Comportamento)

meuCarro.buzinar();
meuCarro2.buzinar();


}
}
