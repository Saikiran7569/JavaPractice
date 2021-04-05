package designPatterns;


import java.util.ArrayList;
import java.util.List;

public class NewsPaper {

	List<Person> subs = new ArrayList<Person>();

	private String newsPaperName;

	NewsPaper(String name) {
		this.newsPaperName = name;
	}

	public boolean subscribe(Person person) {

		return subs.add(person);

	}

	public boolean unSubscribe(Person person) {

		return subs.remove(person);

	}

	public void sendNewsPaperDaily() {

		for (Person p : subs) {
			p.sendNewsPaer(this);
			System.out.println("paper send sucessfully");
		}

	}

	@Override
	public String toString() {
		return "NewsPaper [subs=" + subs + ", newsPaperName=" + newsPaperName + "]";
	}

}
