package epam;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.util.List;

import javenue.csv.Csv;

public class test {

	public static void main(String[] args) throws Exception {
		Csv.Reader reader = new Csv.Reader(new BufferedReader(new FileReader("C:\\in_file.csv")));
		List<String> strings = reader.readLine();
		String[] column;
		for (String columnWithType : strings) {
			column = columnWithType.trim().split(" ");
		}
	}

}
