import java.util.*;

public class PhoneBookTest {
	public static void main(String[] args) {
		int n;
		String name, value, searchKey;
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();

		System.out.print("�Է��Ϸ��� �������� ���� :  ");
		n = sc.nextInt();
		System.out.println("�̸��� ��ȭ��ȣ�� �Է��ϼ���.(�� ȫ�浿 010-111-1212) ");
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + ". �̸�, ��ȭ��ȣ>> ");
			name = sc.next();
			value = sc.next();
			map.put(name, value);
		}

		System.out.print("��ȭ��ȣ�� ã������ ȸ���� �̸��� :  ");
		searchKey = sc.next();

		if (map.containsKey(searchKey))
			System.out.println(searchKey + "�� ��ȭ��ȣ�� " + map.get(searchKey));
		else
			System.out.println("�ش��ϴ� �̸��� ȸ���� ����Ʈ�� �����ϴ�.");
	}

}
