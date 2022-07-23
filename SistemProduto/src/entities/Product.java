package entities;

public class Product {
//  private, protege encapsulando o atributo. 	
	String name; // Atributos da classe.
	private double price; // Atributos da classe.
	private int quantity; // Atributos da classe.

//		Construtor :		
	public Product() {
	}

//		Construtor :	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

//		Construtor 2 / Sobrecarga : difereça entre os dois é o que está entre parênteses.	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
//		this.quantity = 0; Colocar esse é OPCIONAL.		
	}
	
	public String getName() { // Retornará um valor. Usa o encapsulamento.
		return name;
	}
	
	public void setName(String name) { // Modifica um valor. Usa o encapsulamento.
		this.name = name;
	}

	public double getPrice() { // Retornará um valor. Usa o encapsulamento.
		return price;
	}

	public void setPrice(double price) { // Modifica um valor. Usa o encapsulamento.
		this.price = price; // está alterando o valor.
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public int getQuantity() { // Retornará um valor. Usa o encapsulamento.
		return quantity;
	}

	public void addProducts(int quantity) { // Já é usado como "setQuantity".
		this.quantity += quantity;
//	ou  this.quantity = this.quantity +	quantity;
	}

	public void removeProducts(int quantity) { // Já é usado como "setQuantity".
		this.quantity -= quantity;
//	ou	this.quantity = this.quantity - quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) + ", " 
				+ quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}