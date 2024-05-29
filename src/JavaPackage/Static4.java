package JavaPackage;

public class Static4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static3 s3 = new Static3(22,"Kamal");
		Static3 s2= new Static3(21,"Vimal");
		Static3 s1 = new Static3(20,"Akmal");
		
		s3.getresult();
		s2.getresult();
		s1.getresult();
		Static3.college="AKGEC";
		s3.getresult();
		s2.getresult();
		s1.getresult();
		

	}

}
