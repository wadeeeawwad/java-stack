public class calc{
	
	private double number1;
	private double number2;
	private double operator;
	private double results;
	public calc(){}
	
	public void setNum1(double num1) {
		this.number1 = num1;
	}
	
	public void setNum2(double num2) {
		this.number2 = num2;
	}
	
	public void setOperator(double operator) {
		this.operator = operator;
	}
	public void performOperation(){
		if(this.operator=='+'){
			results=(number1)+(number2);
		}
		else if (this.operator=='-'){
			results=(number1)-(number2);
		}
		else if(this.operator=='*'){
			results=(number1)*(number2);
		}
		else if(this.operator=='/'){
			results=(number1)/(number2);
		}
	}
	public void getResults() {
		System.out.print(this.results);
		
	}

		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}