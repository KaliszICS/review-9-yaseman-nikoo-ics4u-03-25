public class PracticeProblem {
	
	public static void main(String args[]) {
		
	}

	public static int lettersToFive(String sentence, char letter){
		int numletter=0;
		int x=0;
		while (x<sentence.length()){
			if (sentence.charAt(x)==letter){
				numletter++;
			}
			x++;
			if (numletter==5){
				return x;
				}
			}
	return -1;
	}

	public static int countLetter(String sentence, char letter){
		int num=0;
		for (int i =0; i< sentence.length();i++){
			if (sentence.charAt(i)==letter){
				num++;
			}
		}
		return num;
	}
 public static int oddSum(int num1, int num2){
	int sum=0;
	int num= num1;
	for (int i=0;i<(num2-num1+1); i++){
		if (num%2!=0){
			sum=sum+num;
		}
		num++;
	}
	return sum;
 }

}

