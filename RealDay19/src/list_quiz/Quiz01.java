package list_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		// 2. 리스트를 만든다. [우솝, 루피, 상디, 나미, 로빈]
		List<String> list2 = new ArrayList<>();
		list2.add("우솝");
		list2.add("루피");
		list2.add("상디");
		list2.add("나미");
		list2.add("로빈");
		System.out.println("기존 리스트 :" + list2); // 기존 리스트

		Scanner scan = new Scanner(System.in);
		List<String> list3 = new ArrayList<>();
		for (int i = 0; i < list2.size(); i++) {
			System.out.print("입력하세요 :");
			String number = scan.next();
			list3.add(number);
		}
		System.out.println("입력 리스트 :" + list3); // 입력 리스트

		List<String> sumlist = new ArrayList<>();
		sumlist.addAll(list2);
		sumlist.addAll(list3);
		System.out.println("통합 리스트 : " + sumlist); // 통합 리스트

		List<String> list5 = new ArrayList<>(); // 채번 리스트

		// 한번씩 돌림
		for (int i = 0; i < sumlist.size(); i++) {
			String str = sumlist.get(i);
			int sum = 0;
			// 중복체크
			for (int j = 0; j < sumlist.size(); j++) {
				if (sumlist.get(i).equals(sumlist.get(j))) {
					if (i != j) {
						sum++;
					} else {
						break;
					}
				}
			}

			// sum이 진실일때 str 거짓일때 str + sum
			str = (sum < 1) ? str : str + sum;
			list5.add(str);
		}
		System.out.println("채번 리스트 : " + list5);
	}

}
