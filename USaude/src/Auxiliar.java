
public class Auxiliar extends Profissional {

	public Auxiliar(String nome) {
		setNome(nome);
		setCategoria("Auxiliar");
			
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
}
