package br.com.autenticacao.oauth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority{

	private static final long serialVersionUID = 8889938937146287618L;

		public Role(String name) {
	        this.name = name;
	    }
		
	    public Role() {
	    }

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String name;

	    @Override
	    public String getAuthority() {
	        return  this.name;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	    
}
