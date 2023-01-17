package 객체배열;

import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {

		/* ArrayList : 크기가 정해져있지 않은 가변 배열
		 * 배열과 비슷한 구조를 가지고 있다
		 * 인덱스의 구조를 가지고 있다.
		 *
		 * 1. ArrayList 생성하기
		 * ArrayList<저장할 데이터의 자료형> 리스트명 = new ArrayList<>();
		 * 배열과 다른점 크기를 지정하지 않는다
		 * 데이터 자료형은 레퍼런형 자료형만 사용할 수 있다.
		 * Java에서 제공하는 기능 ---> import
		 * int : Integer
		 * float : Float
		 * double : Double
		 */
		ArrayList<String> list = new ArrayList<>();
		/* <> : 제네릭 기법
		 * 생성하는 순간에 자료형을 결정 기법
		 * 책(390p)
		 * 
		 * 2. 값을 추가하기
		 * 값을 추가하는 메서드가 내부적으로 설계되어있음
		 * 
		 */
		list.add("선경주");
		list.add("노건희");
		list.add("김다운");
		System.out.println(list);
		
		/* 원하는 위치에 데이터값을 넣어보자
		 * add(index, 데이터값)
		 */
		list.add(1, "김대웅");
		System.out.println(list);
		
		/* 3. 값을 확인하기(가져오기)
		 * get(index)
		 */
		list.get(1);
		System.out.println(list.get(1));
		System.out.println(list);
		
		/* 4. 값을 삭제하기
		 * remove(index);
		 */
		list.remove(2);
		System.out.println(list);
		
		/* 4-1. 값을 한번에 삭제하기
		 * clear()
		 */
		list.clear();
		System.out.println(list);
		
		/* 5. ArrayList 크기 확인하기
		 * size()
		 */
		System.out.println(list.size());
	}

}
