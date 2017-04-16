
public abstract class Place {
	
	static int nombreDePlacesAllouees = 0;
	public int numero;
	public boolean reserve;// vrai si la place est réservée
	
	private Place() {
		this.numero = nombreDePlacesAllouees++;// on incrémente 
		this.reserve = false;// au début la place est libre
	}
	
	
	void reserver(boolean reserve){
		this.reserve = reserve;
	}
	
	void liberer(){
		this.reserve = true;
	}
	
	abstract void park(ITransporteur);
	
	void park(IParticulier){
		
	}
}
