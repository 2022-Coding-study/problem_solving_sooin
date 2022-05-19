import java.util.*;

public class mapTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key, value;
		Map<String, String> map = new HashMap<String, String>();
		map.put("java", "�ڹ�");
		map.put("school", "�б�");
		map.put("map", "����");

		System.out.println("*** keySet() ***");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String k1 = it.next();
			System.out.println(String.format("�ܾ� : %s, �ǹ� : %s", k1, map.get(k1)));
		}

		System.out.println("*** entrySet() ***");
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, String> entry = entryIterator.next();
			String k2 = entry.getKey();
			String v = entry.getValue();
		}

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(String.format("(%s, %s)", entry.getKey(), entry.getValue()));
		}

		System.out.println("");
		do {
			System.out.print("ã�� ���� �ܾ� : ");
			key = sc.next();
			if (key.equals("quit"))
				break;
			else if (map.containsKey(key))
				System.out.println("�ܾ��� �ǹ̴� : "+map.get(key));
			else
				System.out.println("ã�� �ܾ �����ϴ�.");

		} while (!key.equals("quit"));
		System.out.println("���α׷� ����");
	}

}
