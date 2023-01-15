public class Team {

	private String name; //チーム名
	private String color; //チームカラー
	private String belongs; // 所属

	public Team(String name, String color, String belongs) {
		this.name = name;
		this.color = color;
		this.belongs = belongs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBelongs(String Belongs) {
		this.belongs = belongs;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public String getBelongs() {
		return this.belongs;

	}

}