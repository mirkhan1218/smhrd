package com.khan.ex1020;

public class DirectVO {
    // VO란? 사용자 정의 자료형!
    // 1. 필드
    //  - 이 자료형이 저장해야 하는 변수들 (String title, String address)
    //  - 캡슐화를 만족시켜야함 => 접근제한자 (private -> 해당클래스 안에서만, protected -> 하위클래스까지, public -> 누구나)
    private String title;
    private String address;

    // 2. 생성자 메소드
    //  - 일반 메소드는 호출하여 실행가능! but 생성자 메소드는 객체 생성(new)할 때 딱 한 번만 자동으로 실행!
    //  - 이러한 특성 때문에 보통 필드 초기화(메모리에 최초로 값을 지정)하는 용도로 사용 -> 변수에 값 저장하는 용도로 사용!
    //  - 일반 메소드가 생성자 메소드가 되려면?? -> 1) void를 적지않고 2) 메소드의 이름을 클래스의 이름과 동일하게 작성한다.
    public DirectVO(String title, String address) {
        this.title = title;
        this.address = address;
    }

    // 3. get/set
    //  - 필드가 캡슐화를 만족하고 있기 때문에 (private 걸려있기 때문에) 접근이 아예 불가능....
    //  - 확인하는 용도로 필드값을 리턴하는 getter
    //  - 수정하는 용도로 매개변수 값을 전달받아 필드에 저장하는 setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // 4. toString
    //  - 모든 클래스들의 취상위 클래스인 Object 클래스에 정의된 메소드
    //  - Object에 정의된 내용은 개체의 주소를 리턴 -> println(객체) 하면 주소값이 출력
    //  - VO에서는 toString 메소드를 오버라이딩(재정의) 하여 필드값을 문자열로 만들어 리턴

    @Override
    public String toString() {
        // String을 + 연산하게되면 메모리낭비가 심함! => 초보용!
        // StringBuffer => 고급

        StringBuffer temp = new StringBuffer();
        temp.append("DirectVO {");
        temp.append("title='");
        temp.append(title);
        temp.append(", address='");
        temp.append(address);
        temp.append("}");

        return temp.toString();
    }
}
