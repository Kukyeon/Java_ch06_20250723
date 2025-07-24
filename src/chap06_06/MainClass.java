package chap06_06;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member = new Member();
		
//		member.name = "김국연";
//		member.id = "tiger";   -> 필드인 id 가 프라이빗 떄문에 값을 못가져옴
//		member.pw = "1235";
//		member.age = 21;
		
//		member.age = 40;
		//System.out.println(member.name);
		
		
		member.setName("김국연");
		member.setId("tiger");    //setter메소를 통해 우회해서 값 입력
		member.setPw("1235");
		member.setAge(21);
		
		System.out.println(member);
		
			
		Member member2 = new Member("이순신", "lion", "12345", 27);
//		member2.age = 45;
//		
	}

}
