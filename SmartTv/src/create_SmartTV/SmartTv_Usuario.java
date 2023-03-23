package create_SmartTV;

public class SmartTv_Usuario {
	
	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Tv ta ligada? " + smartTv.Ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
		smartTv.ligar();
		
		System.out.println("Novo Status: Tv ta ligada? " + smartTv.Ligada);
		
		//Volume
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
				
		smartTv.diminuirVolume();
		//end
		
		smartTv.QualCananl(15);
		System.out.println("Novo Status: Canal atual " + smartTv.canal);
		
		smartTv.Desligar();
		System.out.println("Novo Status: Tv ta ligada? " + smartTv.Ligada);
	}
}
