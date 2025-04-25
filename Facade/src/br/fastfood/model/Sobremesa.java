package br.fastfood.model;

public class Sobremesa implements ItemCombo {
	private final String nome;
	private final double preco;
	 
	public Sobremesa(String nome, double preco) {
       this.nome = nome;
       this.preco = preco;
   }
   public static Sobremesa Maca(){
    	return new Sobremesa("Maça",12);
   }
	
   public static Sobremesa Sorvete(){

        return new Sobremesa("sorvete",12);
   }

	@Override
   public String getNome()  
   { 
   	 return nome; 
   }
   @Override
   public double getPreco() { 
   	 return preco; 
   }

   @Override public String toString() { 
   	return nome + " R$" + preco; 
   	
   }
}
