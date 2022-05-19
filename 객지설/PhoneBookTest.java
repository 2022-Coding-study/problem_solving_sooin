import java.util.*;

public class PhoneBookTest {
	public static void main(String[] args) {
		int n;
		String name, value, searchKey;
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();

		System.out.print("입력하려는 데이터의 수는 :  ");
		n = sc.nextInt();
		System.out.println("이름과 전화번호를 입력하세요.(예 홍길동 010-111-1212) ");
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + ". 이름, 전화번호>> ");
			name = sc.next();
			value = sc.next();
			map.put(name, value);
		}

		System.out.print("전화번호를 찾으려는 회원의 이름은 :  ");
		searchKey = sc.next();

		if (map.containsKey(searchKey))
			System.out.println(searchKey + "의 전화번호는 " + map.get(searchKey));
		else
			System.out.println("해당하는 이름의 회원은 리스트에 없습니다.");
	}

}
