package project.avs.br;

public class Aresta {
	
	private Vertice a;  //origem
	private Vertice b;	//destino
	private int valor;  //valor da aresta
	private boolean aponta; // a ideia era usar como confirmação da aresta.
	
	public Aresta(Vertice a,Vertice b){
		this.a = a;
		this.b = b;
		aponta = false;
	}
	
	public Aresta(Vertice a,Vertice b,int valor,boolean aponta) {
		this.a = a;
		this.b = b;
		this.valor = valor;
		this.aponta = aponta;
	}
	
	
	public Vertice getA() {
		return a;
	}
	public void setA(Vertice a) {
		this.a = a;
	}
	public Vertice getB() {
		return b;
	}
	public void setB(Vertice b) {
		this.b = b;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	

}
