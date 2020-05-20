import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class Cliente {
	List<Cachorro> listaCachorros = new ArrayList<Cachorro>();
	String nomeCliente, cidade, rua, cpfCliente;
	int idCliente;
	
	
	public String toXML() {
		return new XStream().toXML(this);
	}

	public Cliente(List<Cachorro> listaCachorros, String nome, String cidade, String rua, String cpfCliente,
			int idCliente) {
		super();
		this.listaCachorros = listaCachorros;
		this.nomeCliente = nome;
		this.cidade = cidade;
		this.rua = rua;
		this.cpfCliente = cpfCliente;
		this.idCliente = idCliente;
	}
	public List<Cachorro> getListaCachorros() {
		return listaCachorros;
	}
	public void setListaCachorros(List<Cachorro> listaCachorros) {
		this.listaCachorros = listaCachorros;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nome) {
		this.nomeCliente = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
}
