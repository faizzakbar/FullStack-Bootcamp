package faizakbar;

public enum Books {
	JAVA("java ",10000), KOTLIN("kotlin ",11000),
	SPRING("spring ",12000), ANGULAR("angular ",13000);
	 
 	public String name;
 	public int price;
 	
 	Books(String name, int price){
 		this.name = name;
 		this.price = price;
 	
 	}
}
