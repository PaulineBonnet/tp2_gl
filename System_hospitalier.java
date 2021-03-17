package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Analyser la requête
		return "requête analysée";
	}//analyserRquete prend en paramètre la requête que l'on veut analyser. Lorsqu'elle a fini de l'analyser, elle renvoit le message de type string "requête analysée".
	
	private String comparerDonnes() {
		// Comparaison des données
		return "Cluster trouvé";
	} // compareDonnes compare toutes les données du système. Si il y a une ressemblance entre plusieurs données, le programme renvoie le message "cluster trouvé", sinon il renvoit rien. 

}
