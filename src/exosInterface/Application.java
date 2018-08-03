package exosInterface;

public class Application {

	public static void main(String[] args) {
		// ici je initialise une instance de Implinterface1 avec le nom "note"
		
		Implinterface1 note = new Implinterface1();
		
		//ici je initialise des valeurs des variables v1 et v2 via la methode Setters
		note.setV1(14);
		note.setV2(12);
		
		//ici je demande la programme de imprimer la note minimale et maximale en utilisant la methode note.minimum et note.maximum
		System.out.println("La note minimale est " + note.minimum());
		System.out.println("La note maximale est " + note.maximum());
		System.out.println();
		
		//ici je initialise une instance de Implinterface2 avec le nom "note2"
		Implinterface2 note1 = new Implinterface2();
		
		//ici je initialise des valeurs des variables v1, v2 et v3 via la methode Setters
		note1.setV1(165);
		note1.setV2(189);
		note1.setV3(171);
		
		//ici je demande la programme de imprimer la taille minimale et la taille maximale en utilisant la methode note1.minimum et note1.maximum
		System.out.println("La taille minimale est " + note1.minimum());
		System.out.println("La taille maximale est " + note1.maximum());

	}

}
