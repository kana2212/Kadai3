import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Team team = new Team("麻天狼", "グレー", "新宿");

		System.out.println("チーム名 :" + team.getName());
		System.out.println("チームカラー :" + team.getColor());
		System.out.println("所属 :" + team.getBelongs());

		//LIstの値をMapへ返還
		List<String> list = new ArrayList<>();
		list.add("麻天狼");
		list.add("MTC");
		list.add("F.P");
		list.add("B.B");

		Map<Integer, String> map = new HashMap<>();
		int i = 1;
		for (String str : list) {
			map.put(i, str);
			i++;
		}
		System.out.println(map);
		System.out.println("勝利の順位はこちらになります。");

		//try

		try {
			System.out.println(list.get(5));

		} catch (

		ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲を超えています。");

		}
	}
}
