package proc.dds.singleListLib;

import java.util.Random;

import proc.dds.Node;

public class SingleLLUtils_1_Test {

	public static void main(String[] args) {
		Node node = generateList(5);
		System.out.println(node);
		System.out.println("length = " + SingleLLUtils_1.length(node));
		System.out.println("max = " + SingleLLUtils_1.max(node));
		System.out.println("sum = " + SingleLLUtils_1.sum(node));
	}

	private static Node generateList(int amount) {
		Node node = null;
		for (int i = 0; i < amount; i++) {
			node = new Node(getRandomInRange(1, 11), node);
		}
		return node;
	}

	private static int getRandomInRange(int min, int max) {
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

}
