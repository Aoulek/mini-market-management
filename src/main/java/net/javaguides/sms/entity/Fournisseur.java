package net.javaguides.sms.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "fournisseurs")
public class Fournisseur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_four;
	
	@Column(name = "nom_fournisseur", nullable = false)
	private String nom_four;
	
	@Column(name = "ville_fournisseur")
	private String ville_four;
	
	@Column(name = "tel_fournisseur")
	private String tel_four;
	
	@OneToMany(mappedBy="fournisseur")
	private Collection<Livraison> livraisons;
	
	@OneToMany(mappedBy="fournisseur")
	private Collection<Societe> societes;

	
	@Override
	public String toString() {
		return "Fournisseur [nom_four=" + nom_four + "]";
	}


	public Fournisseur() {
		
	}


	public Fournisseur(int cod_four, String nom_four, String ville_four, String tel_four) {
		super();
		this.cod_four = cod_four;
		this.nom_four = nom_four;
		this.ville_four = ville_four;
		this.tel_four = tel_four;
	}


	public int getCod_four() {
		return cod_four;
	}


	public void setCod_four(int cod_four) {
		this.cod_four = cod_four;
	}


	public String getNom_four() {
		return nom_four;
	}


	public void setNom_four(String nom_four) {
		this.nom_four = nom_four;
	}


	public String getVille_four() {
		return ville_four;
	}


	public void setVille_four(String ville_four) {
		this.ville_four = ville_four;
	}


	public String getTel_four() {
		return tel_four;
	}


	public void setTel_four(String tel_four) {
		this.tel_four = tel_four;
	}


	public Collection<Livraison> getLivraisons() {
		return livraisons;
	}


	public void setLivraisons(Collection<Livraison> livraisons) {
		this.livraisons = livraisons;
	}


	public Collection<Societe> getSocietes() {
		return societes;
	}


	public void setSocietes(Collection<Societe> societes) {
		this.societes = societes;
	}
	
	
}
