import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteDAO {

	private static Map<Long, Cliente> banco = new HashMap<Long, Cliente>();

	static {

		/*Cachorro(String nome, String raca, String servicoPet, int idCachorro, Double valorServicoPet)*/
		Cachorro cachorro1 = new Cachorro("Abóbora", "Golden Retriever", "Banho", 1, 40.00);
		Cachorro cachorro2 = new Cachorro("Cebola", "Poodle", "Tosa", 2, 55.00);
		Cachorro cachorro3 = new Cachorro("Girafa", "Fila brasileiro", "Hospedagem", 3, 35.00);

		List<Cachorro> cachorros = new ArrayList<>();

		cachorros.add(cachorro1);
		cachorros.add(cachorro3);
		cachorros.add(cachorro2);

		Cliente cliente = new Cliente(cachorros, "Fulano da Silva", "Campo Grande", "Rua dos Alecrins", "00011122233",1);
		
		banco.put(1l, cliente);


	}
	public Cliente busca(Long idCliente) {
		return banco.get(idCliente);
	}

}
