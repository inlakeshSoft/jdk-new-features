package org.inlakeshsoft.jdk17.features;

public class TextBlocks {

	private void textBlock() {
		String query = """
				SELEC * FROM students
				WHERE id = 1
				AND name = 'student name';
				""";

		System.out.println(query);
	}

	public static void main(String[] args) {
		TextBlocks textBlocks = new TextBlocks();
		textBlocks.textBlock();
	}

}
