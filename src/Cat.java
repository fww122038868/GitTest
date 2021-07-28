
public class Cat {
	String name;
	String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		System.out.println("cat is yy");
		return "Cat [name=" + name + "]";
	}
	//添加索引就是add到暂存区
	
	
}
