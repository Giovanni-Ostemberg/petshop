import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CriarXML {
	public static void main(String[] args) throws FileNotFoundException {

		String texto = busca();
	    
		System.out.println("Texto retornado");
		System.out.println(texto);
		
		//gravando o arquivo fisico no computador
		PrintWriter out = new PrintWriter("src/Cliente.xml");
		out.println(texto);
		out.close();
		
		
		
		}

		public static String busca() {
			Cliente cliente= new ClienteDAO().busca(1l);
			return cliente.toXML();
		}
}
