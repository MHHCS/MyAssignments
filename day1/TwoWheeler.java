package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 1234578887L;
	boolean isPunctured = false;
	String bikeName = "Honda";
	double runningKM = 32000;
	public static void main(String[] args) 
		{
		TwoWheeler habeebbike = new TwoWheeler();
			System.out.println("**my TwoWheeler details");
			System.out.println("1:" +habeebbike.noOfWheels);
			System.out.println("2:" +habeebbike.noOfMirrors);
			System.out.println("3:" +habeebbike.chassisNumber);
			System.out.println("4:" +habeebbike.isPunctured);
			System.out.println("4:" +habeebbike.bikeName);
			System.out.println("4:" +habeebbike.runningKM);
		}
	}


