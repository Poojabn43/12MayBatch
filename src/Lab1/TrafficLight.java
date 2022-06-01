package Lab1;

public class TrafficLight {
	public static void main(String[] args) {
		String red;
		String yellow;
		String green;

		switch ("green") {
		case "red": {
			System.out.println("stop");
			break;
		}
		case "green": {
			System.out.println("go");
			break;
		}
		case "yellow": {
			System.out.println("ready");
			break;
		}
		default: {
			System.out.println("No message displayed");
		}
		}
	}
}
