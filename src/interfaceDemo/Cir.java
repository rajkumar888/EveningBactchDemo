package interfaceDemo;

public class Cir implements Shape{
	
	
	int value=0;

	@Override
	public void setVal(int speed) {
		// TODO Auto-generated method stub
		
		value=speed;
		System.out.println("Value is set in circle calss");
		
	}

	@Override
	public int getVal() {
		// TODO Auto-generated method stub
		System.out.println("returning the value in  circle calss");
		return value;
	}
}
