package com.destcorse.sprig.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
/*@Table(name = "Dest")*/
public class Destination {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
    @Size(max = 100)
    @Column(unique = true)
	private String ville;
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Destination(String ville) {
		super();
		this.ville = ville;
	}
	
	public Destination() {
		// TODO Auto-generated constructor stub
	}
	/*@NotNull
    @Size(max = 100)
    @Column(unique = true)
	private String adress;
	@NotNull
    @Size(max = 100)
    @Column(unique = true)
	private  String depart;
	@NotNull
    @Size(max = 100)
	 @Column(unique = true)
	private  String Arrive;
	private Set<Course> course = new HashSet<Course>();
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "dest_cor", joinColumns = {
			@JoinColumn(name = "codeville")},inverseJoinColumns = {
					@JoinColumn(name = "courseId" )})
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getDepart() {
		return depart;
	}

	public String getArrive() {
		return Arrive;
	}

	public void setArrive(String arrive) {
		Arrive = arrive;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Destination() {
		super();
		}

	public Destination(Long codeville, String ville, String adress) {
		super();
		this.codeville = codeville;
		this.ville = ville;
		this.adress = adress;
	}
	
	public Long getCodeville() {
		return codeville;
	}

	public void setCodeville(Long codeville) {
		this.codeville = codeville;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	

	@Override
	public String toString() {
		return "Destination [codeville=" + codeville + ", ville=" + ville + ", adress=" + adress + "]";
	}
	
	
	
	*/
	

}
