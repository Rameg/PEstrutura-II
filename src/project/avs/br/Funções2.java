package project.avs.br;

import java.util.ArrayList;
import java.util.List;

public class Funções2 {
	
	
	private ArrayList<Vertice> vertices = new ArrayList<>();
	private ArrayList<Aresta> arestas = new ArrayList<>();
	
	
	public Vertice buscaVertice(String name) {
		for (Vertice v : vertices) {
			if(v.getNome().equals(name)) {
				return v;
			}
		}
		return null;
	}
	
	public Vertice insereVertice(String name) {
		if(buscaVertice(name) == null) {
			Vertice v = new Vertice();
			v.setNome(name);
			vertices.add(v);
			return v;
		}else return buscaVertice(name);
	}
	
	public boolean verificaAresta(String a, String b) {
		Vertice v = insereVertice(a);
		Vertice w = insereVertice(b);
		
		for (Aresta aresta : arestas) {
			if(aresta.getA().getNome().equals(v.getNome()) && aresta.getB().getNome().equals(w.getNome())) {
				return true;
			}
		}return false;
	}
	
	public void insereAresta(Vertice inicio,Vertice fim, int peso) {
		if(verificaAresta(inicio.getNome(), fim.getNome()) == false) {
			Aresta ares = new Aresta(inicio, fim, peso, true);
			arestas.add(ares);
		}else System.out.println("Erro Aresta já existe");
	}
	
	
	public void exibeArestas() {
		System.out.print("    ");
		for (Vertice vert : vertices) {
			System.out.print(vert.getNome()+"   ");
		}
		String pr = null;
		System.out.println("\n");
		int i = 0;
		for (Vertice ver2 : vertices) {
			System.out.print(ver2.getNome()+"   ");
			for (Vertice vert1 : vertices) {
				for (Aresta aresta : arestas) {
					if(aresta.getA().getNome().equals(vert1.getNome()) && aresta.getB().getNome().equals(ver2.getNome())) {
						pr = aresta.getValor()+"   ";
					}
				}
				if(pr != null){
					System.out.print(pr);
					}else System.out.print(-1+"   ");
					pr = null;
			}
			System.out.print("\n\n");
		}
	}
	
	public void madeIN() {
		int z = 0;
		while(z != 20) {
			System.out.print("*");
			z++;
		}z =0;
			System.out.println("\n");
			System.out.println("Adeeb Venancio");
			System.out.println("CC - P4");
			System.out.println("\n");
			while(z != 20) {
				System.out.print("*");
				z++;
			}System.out.println("\n\n\n");
	
	}

}
