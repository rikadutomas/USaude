
public class Medicina extends Profissional{

	public Medicina(String nome) {
		setNome(nome);
		setCategoria("Medicina");
			
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
}
