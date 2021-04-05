package designPatterns;
public class NewsTest {

	public static void main(String[] args) {
		
		NewsPaper newsPaper =  new NewsPaper("The Hindu");
		
		
		Person p1 = new Person("Jhon");
		Person p2 = new Person("Sai");
		Person p3 = new Person("Sri");
		
		newsPaper.subscribe(p1);
		newsPaper.subscribe(p2);
		newsPaper.subscribe(p3);
		
		System.out.println(newsPaper);
		
		newsPaper.sendNewsPaperDaily();
		newsPaper.unSubscribe(p1);
		System.out.println(newsPaper);
		
	}

}
