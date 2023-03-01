package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		FortisHospital fh = new FortisHospital();
		fh.cardioService();
		fh.emergencyService();
		fh.ENTService();
		fh.gyancService();
		fh.orthoService();

		System.out.println(USMedical.min_fee);

		fh.pathologyService();
		fh.medicalInsurane();
		fh.billing();


		fh.medicalTraining();
		fh.covidTest();

		USMedical.hospitalAdmin();

		UKMedical uk = new FortisHospital();
		uk.covidTest();
		uk.emergencyService();
		uk.pediaService();
		uk.ENTService();
		
				



	}

}
