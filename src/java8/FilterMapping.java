package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class FilterMapping {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "bike", 2000f));
		products.add(new Product(2, "car", 20000f));
		products.add(new Product(3, "cycle", 1000f));
		products.add(new Product(4, "TV", 20500f));
		products.add(new Product(5, "Mobile", 1000f));
		products.add(new Product(6, "Laptop", 12000f));
		products.add(new Product(7, "PC", 2700f));
		List<Float> collect = products.stream().filter(i -> i.getPrice() > 2000).map(Product::getPrice)
				.collect(Collectors.toList());

		Double sumvalue = products.stream().collect(Collectors.summingDouble(Product::getPrice));
		Product maxPrice = products.stream().max((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1).get();
		System.out.println("Max " + maxPrice.getPrice());

		System.out.println("summing value " + sumvalue);
		collect.forEach(System.out::println);
		Map<Integer, String> map = products.stream().collect(Collectors.toMap(Product::getId, Product::getProductName));
		map.forEach((k, v) -> System.out.println(k + ":" + v));

		Random randam = new Random(3);
		randam.ints().limit(2).forEach(System.out::println);
		// collect(Collectors.toList());

		List<Integer> nums = Arrays.asList(2, 3, 4, 2, 3, 4, 5, 6, 7);
		System.out.println("Second largest number " + findSecondLargest(nums));
		List<Integer> suareOfNumber = nums.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		suareOfNumber.forEach(System.out::println);

	}

	private static int findSecondLargest(List<Integer> intList) {
		if (null != intList) {
			List<Integer> outputList = intList.stream().filter((i) -> (i % 2) != 0).distinct()
					.sorted(Collections.reverseOrder()).collect(Collectors.toList());
			return outputList.get(1);
		}
		return 0;
	}

}

class Product {

	private int id;
	private String productName;
	private float price;

	public Product() {
		super();
	}

	public Product(int id, String productName, float price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
