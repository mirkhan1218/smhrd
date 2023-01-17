package 문자열;

public class Ex01 {

	public static void main(String[] args) {
		
		String name = "스마트인재개발원";
		int index = name.indexOf('마');
		System.out.println(index + 1);
		
		String result = name.substring(5, 8);
		System.out.println(result);
		
//		result = name.charAt(2);
//		System.out.println(result);
		
		// 문자열을 정수로 변환시키는 기능!!
		// 문자열 "1234"
		// 문자열 "3456"
		String str1 = "1234";
		String str2 = "3456";
		
		// int의 속성과 기능들을 담고 있는 클래스
		// Integer : int클래스의 Wrapper Class
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1 + num2);
	}

}
