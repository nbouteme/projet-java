
public class PlaceParticulier extends Place{
	void park(ITransporteur){
		throw SeulementParticulier("On ne peut pas garer un transporteur ici !");
	}
}
