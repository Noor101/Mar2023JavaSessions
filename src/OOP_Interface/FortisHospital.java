package OOP_Interface;

public class FortisHospital extends MedicalAssocaition implements USMedical, UKMedical, IndianMedical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//US 
	@Override
	public void orthoService() {
		System.out.println("Fortis-orthoService");
	}

	@Override
	public void physioServive() {
		// TODO Auto-generated method stub
		System.out.println("Fortis-physioServive");
	}

	@Override
	public void cardioService() {
		// TODO Auto-generated method stub
		System.out.println("Fortis-cardioService");
	}
	
	//UKMedical interface

	@Override
	public void pediaService() {
		// TODO Auto-generated method stub
		System.out.println("Fortis-pediaService");
	}

	@Override
	public void ENTService() {
		// TODO Auto-generated method stub
		System.out.println("Fortis-ENTService");
	}

	
	//Indian interface
	@Override
	public void gyancService() {
		// TODO Auto-generated method stub
		System.out.println("Fortis-gyancService");
	}

	@Override
	public void neuroService() {
		// TODO Auto-generated method stub
		System.out.println("Fortis-neuroService");
	}

	@Override
	public void oncoService() {
		// TODO Auto-generated method stub
		System.out.println("Fortis-oncoService");
	}

	@Override
	public void emergencyService() {
		// TODO Auto-generated method stub
		System.out.println("Fortis-emergencyService");
	}
	
	public void pathologyService() {
		System.out.println("Fortis-pathologyService");
		
	}
	
	public void medicalInsurane() {
		
		System.out.println("Fortis-medicalInsurane");

	}
	
	@Override
	public void billing() {
		System.out.println("Fortis-billing");
	}

	@Override
	public void covidTest() {
		System.out.println(" Need to takes Covid Test at fortis");
		
	}
	
	@Override
	public void medicalTraining() {
		System.out.println("Fortis will provide Medical Training ");
	}

	@Override
	public void dermatologyService() {
		// TODO Auto-generated method stub
		
	}
}
