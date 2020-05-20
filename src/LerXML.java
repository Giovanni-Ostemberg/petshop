

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LerXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("src/Cliente.xml");
		
		Element raiz = doc.getDocumentElement();
		
		
		/*String nome, String cidade, String rua, String cpfCliente,
		int idCliente*/
		
		NodeList nome = raiz.getElementsByTagName("nomeCliente");
		Node nomeCliente = nome.item(0).getFirstChild();
		String nomeC = nomeCliente.getTextContent();
		
		NodeList cidade = raiz.getElementsByTagName("cidade");
		Node cidadeCliente = cidade.item(0).getFirstChild();
		String cidadeC = cidadeCliente.getTextContent();
		
		NodeList rua = raiz.getElementsByTagName("rua");
		Node ruaCliente = rua.item(0).getFirstChild();
		String ruaC = ruaCliente.getTextContent();
		
		NodeList cpf = raiz.getElementsByTagName("cpfCliente");
		Node cpfCliente = cpf.item(0).getFirstChild();
		String cpfC = cpfCliente.getTextContent();
		
		System.out.println( "Nome:" + nomeC + "\nCidade: " + cidadeC + "     Rua: " + ruaC +"\nCpf: " + cpfC );
		
		List<Cachorro> cachorros = new ArrayList<Cachorro>();
		NodeList cachorro = raiz.getElementsByTagName("Cachorro");
		
		for(int i=0; i<3; i++) {
		Element cachorroElement = (Element) cachorro.item(i);
		
		NodeList nomeCachorro = cachorroElement.getElementsByTagName("nome");		
		Node nomeValor = nomeCachorro.item(0).getFirstChild();
		System.out.println();
		
		NodeList raca = cachorroElement.getElementsByTagName("raca");		
		Node racaValor = raca.item(0).getFirstChild();
		
		NodeList valor = cachorroElement.getElementsByTagName("valorServicoPet");		
		Node valorValor = valor.item(0).getFirstChild();
		
		NodeList servicoPet = cachorroElement.getElementsByTagName("servicoPet");		
		Node servicoValor = servicoPet.item(0).getFirstChild();
		System.out.println("Cachorro " + (i+1) + ":" + nomeValor.getTextContent() + ", " + racaValor.getTextContent() + ", " + servicoValor.getTextContent() + ", " + valorValor.getTextContent());
		
		/*Cachorro(String nome, String raca, String servicoPet, int idCachorro, Double valorServicoPet)*/
		
		
		
		}
	
	}

}
