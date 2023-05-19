package JavaInterviewPrograms;

public class FirstUnique {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 3, 4, 5, 6 };
		
		int flag = 0, unique = -1;

		for (int i = 0; i < arr.length; i++) {
			flag = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				} else if (arr[i] == arr[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				unique = arr[i];
				break;
			}
		}
		System.out.println(unique);
	}
}
