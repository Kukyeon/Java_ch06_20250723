package chap06_06;

public class Member {

	private String name;  // 회원의 이름
	private String id; // 회원의 아이디
	private String pw; // 회원의 비밀번호
	private int age; // 회원의 나이
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(String name, String id, String pw, int age) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public void setName(String name) {// setter 메소드 생성
		this.name = "name";
	}
	
	
	
	public void setId(String id) { // setter 메소드 생성
		
		if(id.equals("tiger"));
	
		this.id = "tiger";
		// 프라이빗을 가져와서 다른곳에 사용가능
	}
	
	public void setPw(String pw) {// setter 메소드 생성
		this.pw = "pw";
	}

	public void setAge(int age) { //setter 메소드
		 //무결섬조건, 어떠한 조건을 주고 그거에 맞는 항목만 넣어라
			this.age = age;  // 프라이빗으로 조건을 감추고 세터메소드를 통해서 값을 변경가능
	
			

			
	}


	public String getName() {
		return name;
	}
	
}
