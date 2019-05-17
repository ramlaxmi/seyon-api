package io.seyon.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class UserInfoNoPwd {
	
	@Id
	String email;
	
	@Column
	String name;

	
	@Column
	Boolean active;
	
	@Column
	Long companyId;
	
	@Column
	Boolean superUser;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Boolean getSuperUser() {
		return superUser;
	}

	public void setSuperUser(Boolean superUser) {
		this.superUser = superUser;
	}

	@Override
	public String toString() {
		return "UserInfoNoPwd [email=" + email + ", name=" + name + ", active=" + active + ", companyId=" + companyId
				+ ", superUser=" + superUser + "]";
	}

	
	
	

}
