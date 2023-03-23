package create_SmartTV;

public class SmartTv {
	
	boolean Ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		Ligada = true;
	}
	public void Desligar() {
		Ligada = false;
	}
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o Volume para: " + volume);
	}
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo o Volume para: " + volume);
	}
	public void QualCananl(int canalInformado) {
		canal = canalInformado;
	}
	public void MudarCanal() {
		canal++;
	}
	public void VoltarCanal() {
		canal--;
	}
}
