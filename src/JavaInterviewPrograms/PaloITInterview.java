package JavaInterviewPrograms;

public class PaloITInterview {

	// 3 numbers in each string without repeated numbers
	public static void main(String[] args) {
		{
			String str = "abc1d63 56sd4 nn657";
			int i, j, count = 0, flag = 0, startIndex = 0;
			String num = "";
			for (i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i)) || Character.isSpace(str.charAt(i))) {
					num = num + str.charAt(i);
				}

			}
			System.out.println(num);
			for (j = startIndex; j < num.length(); j++) {
				/****************************************************************/
				if (Character.isDigit(num.charAt(j))) {
					count++;
					if (count > 3 && j == num.length() - 1) {
						System.out.println("Last String More than 3 numbers in a string ");
						flag = 1;
						break;
					} else if (count < 3 && j == num.length() - 1) {
						System.out.println("Last string Less than 3 numbers in a string ");
						flag = 1;
						break;
					} else if (count == 3 && j == num.length() - 1) {
						System.out.println("startIndex is: " + startIndex);
						System.out.println("endIndex is: " + j);
						for (int k = startIndex; k < num.length(); k++) {
							for (int m = k + 1; m < num.length(); m++) {
								if (num.charAt(k) == num.charAt(m)) {
									flag = 1;
									System.out.println("Last string Repeated characters of " + num.charAt(m));
									break;
								} else {
									continue;
								}
							}
							if (flag == 1) {
								break;
							}
						}
						startIndex = j + 1;
						count = 0;
					}

				}
				/****************************************************************/
				else {
					if (count == 3) {
						System.out.println("startIndex is: " + startIndex);
						System.out.println("endIndex is: " + j);
						for (int k = startIndex; k < j; k++) {
							for (int m = k + 1; m < j; m++) {
								if (num.charAt(k) == num.charAt(m)) {
									flag = 1;
									System.out.println("Repeated characters of " + num.charAt(m));
									break;
								} else {
									continue;
								}
							}
							if (flag == 1) {
								break;
							}
						}
						startIndex = j + 1;
						count = 0;
					} else if (count < 3) {
						System.out.println("Less than 3 numbers in a string ");
						flag = 1;
						break;

					} else if (count > 3) {
						System.out.println("More than 3 numbers in a string ");

						flag = 1;
						break;

					}
					if (flag == 1) {
						break;
					}
				}
			}
			if (flag == 1) {
				System.out.println("false");

			} else if (flag == 0) {
				System.out.println("true");
			}

		}
	}
}
