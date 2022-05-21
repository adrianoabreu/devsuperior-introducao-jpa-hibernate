package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity //Esta anotação defini esta classe como entidade
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id   //Informa que o atributo da classe id é a chave primária da tabela no banco de dados.
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //Incrementa o id de maneira automática.
	private Integer id;
	//@Column(name = "nomeCompleto") //Informa ao JPA que o atributo nome vai ter nomenclatura na tabela como nomeCompleto. 
	private String  nome;
	private String email;
	
	public Pessoa() {
	}

	public Pessoa(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
	
}
