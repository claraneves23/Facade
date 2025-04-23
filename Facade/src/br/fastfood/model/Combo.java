package br.fastfood.model;

public class Combo {
	private ItemCombo burguer = new Burguer("Manjado", 15);
	private ItemCombo bebida = new Bebida("Coca-Cola", 10);
	private ItemCombo sobremesa = new Sobremesa("Bolo", 12);
	private ItemCombo combo;
	
	Combo(Burguer burger, Bebida bebida, Sobremesa sobremesa ){
		this.burguer = burguer;
		this.bebida = bebida;
		this.sobremesa = sobremesa;
	}
	
	
	public Combo getCombo1() {
		Combo combo = new Combo(new Burguer(""))
	}
	
}
