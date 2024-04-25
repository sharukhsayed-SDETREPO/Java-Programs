package JavaPrograms;

public class RemoveSpecialCharactersFromString {

	public static void main(String[] args) {
	String s="!@#$%^&* d kfjgdjkg32847623 784 234234234s dfjsdf isfs";

	
	System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
	
	}

}
