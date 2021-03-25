package interview;

public class IpAddress {

	public static void main(String[] args) {
		String address = "1.3.4.5";
		String alterAddress = defangIPaddr(address);
		System.out.println(alterAddress);

	}

	public static String defangIPaddr(String address) {
		StringBuilder add = new StringBuilder();
		for (char c : address.toCharArray()) {
			
			if(c == '.') {
				add.append("[.]");
			}else {
				add.append(c);
			}

		}

		return add.toString();

	}
}
