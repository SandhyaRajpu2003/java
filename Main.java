
package assignment;
class read {
	int i;
}
class display extends read{
	void put() {
		for(i=1; i<10; i++) {
			if(i==3 || i==6 || i==9) {
				System.out.print(i*5+1+"  ");
			}
			else {
				System.out.print(i*5+"  ");
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  display s1 = new display();
  s1.put();
	}

}
