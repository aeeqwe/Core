package io.charset;




public class App00 {

	public static void main(String[] args) {
	Camera cam1 = new Camera();
	
}
	
abstract class Product <T extends Product<T>> implements Comparable <T>{

abstract void subCompare (T p);

public int compareTo(T p) {
	// TODO Auto-generated method stub
	return 0;
}

}

class Camera extends Product<Camera>{
	int pixel;
		
	void subCompare(Camera p) {
	}
	
}

class Phone extends Product<Phone> {
	int model;

	void subCompare(Phone p) {
			
	}
		
	

	}


}
	