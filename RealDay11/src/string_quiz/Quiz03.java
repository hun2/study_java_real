package string_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		
		//1번 문자열 검색
		//파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.
		
//		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//
//
//		int count = 0;
//		for ( int i = 0; i< files.length; i++) {
//			
//			if ( files[i].contains("jpg")) {
//				count += 1;
//			}
//		}
//		System.out.println("jpg 파일의 개수 : " + count);
		
		
		
		//2번 영 단어 퀴즈 영어 단어 퀴즈를 낸다. 아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다. 
		// 100점 만점 기준으로 몇점인지 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("1. 승리를 영어로 입력하세요 : ");
//		String answer = scan.next();
//		System.out.print("2. 사랑을 영어로 입력 하세요 : ");
//		String answer2 = scan.next();
//		System.out.print("3. 컴퓨터를 영어로 입력 하세요 : ");
//		String answer3 = scan.next();
//		System.out.print("4. 노트북을 영어로 입력하세요 :");
//		String answer4 =  scan.next();
//		
//		int result = 0;
//		if ( answer.equals("victory")) {
//			result +=25;
//		}
//		if (answer2.equals("love")) {
//			result +=25;
//		}
//		if ( answer3.equals("computer")) {
//			result +=25;
//		}
//		if ( answer4.equals("notebook")) {
//			result +=25;
//		}
//		
//		System.out.println("점수는 : " + result + " 점 입니다.");
		
		
		// 3번 동명이인 수 구하기
		String memberStr = "김혜수:김혜수:김혜수:김혜수:김혜수:김혜수:김혜수:이병헌:김모씨:이병헌";
		String[] member = memberStr.split(":");
		
//		int sameCount = 0;
//		
//		for ( int i = 0;  i < member.length -1 ; i++) {  // 마지막 애는 굳이 안돌아도 되니
//			String name  = member[i]; // 검사할 기준 이름 
//			boolean isSame = false;
//			
//			if ( name.equals("-")) { //중복되서 마킹이 되면 skip 되는 if
//				continue;
//			}
//			
//			for ( int j  = i+1; j < member.length; j++) {
//				
//				if (name.equals(member[j])) {
//					isSame = true;
//					member[j] = "-"; // 중복이면 마킹한다.
//				}
//			}
//			
//			if ( isSame) {
//				sameCount++;
//			}
//		}
//		
//		System.out.println("동명이인 종류의 수 " + sameCount);
		
		
		
		
		//다른 방법
//		int resultCount = 0;
//	    
//		
//		for ( int i =0 ; i < member.length - 1; i++) {
//			
//			int tempCount = 0; // 기준 이름 갯수
//			for ( int j = i+1; j < member.length; j++) {
//				if (member[i].equals(member[j])) {
//					tempCount ++;
//				}
//			}
//			
//			if (tempCount == 1) {
//				resultCount ++;
//			}
//		}
//	        
//		System.out.println(resultCount);
	        
	        
	        
	        
		
		
	        
	        
	        
	        
		
		
		
	}

}
