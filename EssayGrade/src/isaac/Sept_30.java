package isaac;

public class Sept_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Essay e = new Essay();
		e.setScore(20);
		e.setGrammer(20);
		e.setContent(15);
		System.out.println(e.getScore());
		;
		
		Essay y = new Essay(10, 20,30,40);
		

	/*	Essay y = new Essay(10, 20, 30, 40);
		System.out.println(y.getContent());
		int z = y.getGrammer() + y.getContent() + y.getCorrectLength() + y.getSpelling();
		System.out.println(z);
		System.out.println(y.getScore());
		y.setScore(y.getScore());
		System.out.println(y.getScore());
		System.out.println(y.getGrade());
	}*/

}
}