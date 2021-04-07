package br.com.autenticacao.oauth.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String name;
	    @Column(unique = true)
	    private String email;
	    @JsonIgnore
	    private String password;

	    @ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(name="user_role",
	            joinColumns=@JoinColumn(name="user_id"),
	            inverseJoinColumns=@JoinColumn(name="role_id")
	    )
	    private List<Role> roles;

	    public User() {
	    }

	    public User(String name, String email) {
	        super();
	        this.name = name;
	        this.email = email;
	    }
	    public User(User user) {
	        super();
	        this.name = user.getName();
	        this.email = user.getEmail();
	        this.password = user.getPassword();
	        this.roles = user.getRoles();
	        this.id = user.getId();
	    }
	    public User(String name, String email, String password, List<Role> roles) {
	        super();
	        this.name = name;
	        this.email = email;
	        this.roles = roles;
	        this.password = password;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<Role> getRoles() {
			return roles;
		}

		public void setRoles(List<Role> roles) {
			this.roles = roles;
		}

}
