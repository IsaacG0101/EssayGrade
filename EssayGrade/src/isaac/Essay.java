package isaac;

public class Essay extends GradedActivity {

	private int grammer;
	private int spelling;
	private int correctLength;
	private int content;
	private int total;

	public Essay() {

	}
	
	

	public Essay(int grammer, int spelling, int correctLength, int content) {
		setGrammer(grammer);
		setSpelling(spelling);
		setCorrectLength(correctLength);
		setContent(content);
	}

	public int getGrammer() {
		return grammer;
	}

	public void setGrammer(int grammer) {
		if (grammer <= 30 && grammer >= 0) {
			grammer = grammer;
		} else {
			throw new ArithmeticException("Grammer can only be in between 0 and 30. please try again");
			//this.grammer = 30;
		}
		setTotal();

	}

	public int getSpelling() {
		return spelling;
	}

	public void setSpelling(int spelling) {
		if (spelling <= 20 && spelling >= 0) {
			this.spelling = spelling;
		} else {
			throw new ArithmeticException("Spelling can only be in between 0 and 20. please try again");
			//this.spelling = 20;
		}
		setTotal();
	}

	public int getCorrectLength() {
		return correctLength;
	}

	public void setCorrectLength(int correctLength) {
		if (correctLength <= 20 && correctLength >= 0) {
			this.correctLength = correctLength;
		} else {
			throw new ArithmeticException("CorrectLength can only be in between 0 and 20. please try again");
			//this.correctLength = 15;
		}
		setTotal();

	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		if (content <= 30 && content >= 0) {
			this.content = content;
		} else {
			throw new ArithmeticException("Content can only be in between 0 and 30. please try again");
			//this.content = 10;
		}
		setTotal();
	}
	@Override
	public void setScore(double s) {
		try {
			throw new Exception("Cannot change score manually");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void setTotal() {
		super.setScore(total);
	}
	
	

	/*public int getTotal() {
		return total;
	}
*/
	/*private void setTotal() {
		this.total += spelling + content + correctLength + grammer;
		if (total > 100 && total < 0) {
			this.total = 50;
		}
	}*/
}
