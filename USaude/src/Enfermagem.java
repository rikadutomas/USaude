
public class Enfermagem extends Profissional {

	public Enfermagem(String nome) {
		setNome(nome);
		setCategoria("Enfermagem");
			
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
}
