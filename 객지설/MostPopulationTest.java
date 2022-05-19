import java.util.*;
import java.lang.*;

public class MostPopulationTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key, value;
		int max = 0;
		String maxPopulation = "";
		System.out.println("나라 이름과 인구를 3개 입력하세요.(예: Korea 5000)");
		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + ". 나라 이름, 인구 >> ");
			key = sc.next();
			value = sc.next();
			map.put(key, value);
		}

		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String k1 = it.next();
			if (Integer.parseInt(map.get(k1)) > max) {
				max = Integer.parseInt(map.get(k1));
				maxPopulation = k1;
			}
		}
		System.out.println(String.format("제일 인구가 많은 나라는 (%s, %s)", maxPopulation, map.get(maxPopulation)));
	}

}
