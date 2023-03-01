package OOP_Abstraction;

public abstract class Page {

	//partial abstraction
	
	public Page() {
		System.out.println("Page --- Constructor.");
	}
	
	public abstract void title();
	public abstract void URL();
	public abstract void loading();
	
	
	public void header() {
		System.out.println(" page - header");
	}
	
	public static final void logo() {
		System.out.println("page - logo");
	}
}
