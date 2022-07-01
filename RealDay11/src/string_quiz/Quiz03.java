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
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] member = memberStr.split(":");
		int count = 0;
		String[] member2 = new String[10];
		
		
	        for ( int i = 0; i < member.length; i++) {
	        	
	          for ( int j = i+1; j<member.length; j++) {
	                if ( member[i].equals(member[j])) {
	                      member2[i] = member[i];
	                }
	          }
	          
	          System.out.println(member2[i]);
	         

	        }
		
		
	        int number = 0;
	        for ( int i =0; i<member2.length; i++) {
	        	
	        	if (member2[i] == null) {
	        		continue;
	        	} else {
	        		number++;
	        		
	        		
	        		
	        	}
	        	
	        }

	        System.out.println(number );
		
		
		
	        
	        
	        
	        
		
		
		
	}

}
