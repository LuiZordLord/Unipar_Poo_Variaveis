package br.unipar.erp.data.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="usuario")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    private Integer codigo;

    @Column (name = "username")
    private String usuario;

    @Column (name = "password")
    private String senha;

    private String nome;

    @Column(name = "nascimento")
    private LocalDate dataNascimento;

}

==========
==========

spring.application.name=erp
spring.datasource.url=jdbc:postgresql://localhost:5432/Exemplo1
spring.datasource.username=postgres
spring.datasource.password=admin123
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgresSQLDialect

==========
==========

package br.unipar.erp;

import br.unipar.erp.data.entity.Usuario;
import br.unipar.erp.data.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ErpApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setNome("Spring JPA");
		usuario.setSenha("123456");
		usuario.setUsuario("springjpa");
		usuario.setDataNascimento(LocalDate.of(1993,6,20));

		usuarioRepository.save(usuario);
	}
}

==========
==========

package br.unipar.erp.data.repository;

import br.unipar.erp.data.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
