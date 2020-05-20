
public class Cachorro {
	String nome, raca, servicoPet;
	int idCachorro;
	Double valorServicoPet;
	
	
	public Cachorro(String nome, String raca, String servicoPet, int idCachorro, Double valorServicoPet) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.servicoPet = servicoPet;
		this.idCachorro = idCachorro;
		this.valorServicoPet = valorServicoPet;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getServicoPet() {
		return servicoPet;
	}
	public void setServicoPet(String servicoPet) {
		this.servicoPet = servicoPet;
	}
	public int getIdCachorro() {
		return idCachorro;
	}
	public void setIdCachorro(int idCachorro) {
		this.idCachorro = idCachorro;
	}
	public Double getValorServicoPet() {
		return valorServicoPet;
	}
	public void setValorServicoPet(Double valorServicoPet) {
		this.valorServicoPet = valorServicoPet;
	}
	
	
}
