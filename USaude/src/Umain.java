// import java.util.Set;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Vector;
import java.util.Iterator;


public class Umain implements Uinterface{
	
	Utente utente = null;
	Familia familia = null;
	Profissional profissional = null;
	
	TreeMap<String,Utente> treeUtente = new TreeMap<String,Utente>();
	TreeMap<String,Familia> treeFamilia = new TreeMap<String,Familia>();
	TreeMap<String,Profissional> treeProfissional = new TreeMap<String,Profissional>();

	public void registarProfissional(String categoria, String nome) {
		if(treeProfissional.containsKey(nome)) {
			System.out.println("Profissional existente");
		}
		else {
			if (categoria.equals("Medicina")) {
				Profissional profissional = new Medicina(nome);
				treeProfissional.put(nome, profissional);
				System.out.println("Profissional registado com sucesso.");
				
				
			}
			else if (categoria.equals("Enfermagem")) {
					Profissional profissional = new Enfermagem(nome);
					treeProfissional.put(nome, profissional);
					System.out.println("Profissional registado com sucesso.");
			}
			else if (categoria.equals("Auxiliar")) {
				Profissional profissional = new Auxiliar(nome);
				treeProfissional.put(nome, profissional);
				System.out.println("Profissional registado com sucesso.");
			}
			else {
				System.out.println("Categoria inexistente.");
			}
		}
				
	}
	
	public void registarUtente(String nome, String etaria) {
		if (treeUtente.containsKey(nome)) {
			System.out.println("Utente existente.");
		}
		else {
		
			if (etaria.equals("Jovem")) {
				Utente utente = new Jovem(nome);
				treeUtente.put(nome, utente);
				System.out.println("Utente registado com sucesso.");
			}
			else if (etaria.equals("Adulto")) {
				Utente utente = new Adulto(nome);
				treeUtente.put(nome, utente);
				System.out.println("Utente registado com sucesso.");
			}
			else if (etaria.equals("Idoso")) {
				Utente utente = new Idoso(nome);
				treeUtente.put(nome, utente);
				System.out.println("Utente registado com sucesso.");
			}	
			else {
				System.out.println("Faixa etaria inexistente.");
			}
		}
	}
	
	public void registarFamilia(String nomeFamilia) {
		if (treeFamilia.containsKey(nomeFamilia)){
			System.out.println("Familia existente.");
		}
		else {
			Familia familia = new Familia(nomeFamilia);
			treeFamilia.put(nomeFamilia, familia);
			System.out.println("Familia registada com sucesso.");
		}		
	}
	
	public void associarFamilia(String nome,String nomeFamilia) {
		if (treeUtente.containsKey(nome)){
			if (treeFamilia.containsKey(nomeFamilia)) {
				Vector<Familia> v = new Vector<Familia>();
				Familia f = v.add(treeFamilia.get(nomeFamilia));
				
				
				Iterator i = v.iterator();
				while (i.hasNext()) {
					System.out.println(i);
				}

			}
			else {
				System.out.println("Familia inexistente.");
			}
		}
		else {
			System.out.println("Utente inexistente.");
		}
		
	}
	

}
