package OOP_Abstraction;

public abstract class Application {
	
	
	//All methods are abstract in nature
	 //no non abstract methods
   //100 % abstraction	
	
	
	public abstract void serverSetup();
	public abstract void dbSetup();
	public abstract void envSetup();
	
	
	public void UILayerComponents() {
		
		System.out.println("UILayerComponents");
		
	}
	

}
