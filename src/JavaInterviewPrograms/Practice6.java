package JavaInterviewPrograms;

public class Practice6 {
	/**
	 * 
	 */
	public void practice() {
		String str = "Arrb6???4xxbl5???rrr5";
		String numQ = "";
		int sum;
		int i, j, start = 0, end = 0, count = 0, flag = 0, startValue, endValue;

		for (i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '?') {
				numQ = numQ + str.charAt(i);
			}

		}
		System.out.print(numQ);
		System.out.println("\n" + numQ.length());
		for (i = 0; i < numQ.length(); i++) {
			if (Character.isDigit(numQ.charAt(i))) {
				start = i;
				break;
			}

		}
		System.out.print("\n" + start);

		for (i = numQ.length() - 1; i >= 0; i--) {
			if (Character.isDigit(numQ.charAt(i))) {
				end = i;
				break;
			}

		}
		System.out.println("\n" + end);

		sum = Character.getNumericValue(numQ.charAt(start));
		System.out.println("Initial num: " + sum);

		for (j = start; j < end; j++) {

			if (flag == 1) {
				break;
			}
			if (Character.isDigit(numQ.charAt(j))) {
				start = j;
				System.out.println("Next num: " + Character.getNumericValue(numQ.charAt(start)));

			} else if (numQ.charAt(j) == '?') {
				count++;
				if (count == 3 && Character.isDigit(numQ.charAt(j + 1))) {
					startValue = Character.getNumericValue(numQ.charAt(start));
					endValue = Character.getNumericValue(numQ.charAt(j + 1));
					sum = startValue + endValue;
					if (!(sum == 10)) {
						System.out.println("Sum is not 10: " + sum);
						System.out.println("false");
						flag = 1;
					}

					else {
						count = 0;
					}
				} else if (count > 3) {
					System.out.println("More than 3 Q");
					System.out.println("false");
					flag = 1;
				} else if (Character.isDigit(numQ.charAt(start)) && Character.isDigit(numQ.charAt(j + 1))
						&& count < 3) {
					System.out.println("Less than 3 Q");
					System.out.println("false");
					flag = 1;
				}
			}
		}
		if (flag == 0) {
			System.out.println("True");
		}

	}

	public static void main(String[] args) {
		Practice6 p = new Practice6();
		p.practice();
	}
}

/*
 * public void practice() { String str="jbhb25???5?fdd??565fft?"; String numQ =
 * ""; String result=""; int i,j,sum=0,qcount=0; for(i=0;i<str.length();i++) {
 * if(Character.isDigit(str.charAt(i)) || str.charAt(i)=='?') {
 * numQ=numQ+str.charAt(i); } } System.out.print(numQ);
 * 
 * for(i=0;i<numQ.length();i++) { if(Character.isDigit(numQ.charAt(i))) {
 * sum=numQ.charAt(i); } else if(numQ.charAt(i)=='?') { qcount++; } }
 * System.out.println("\n"+sum+"\n"+qcount); }
 */
