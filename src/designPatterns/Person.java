package designPatterns;
public class Person {

	private String name;
	
	private NewsPaper newsPaper;
	
	Person(String name){
		this.name= name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public void sendNewsPaer(NewsPaper newsPaper2) {
		this.newsPaper = newsPaper2;	
	}
	
	
}
