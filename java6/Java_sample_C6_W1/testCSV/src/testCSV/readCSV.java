package testCSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readCSV {
	private static String COMMA_DELIMITER = ",";
	private static ArrayList<ArrayList<String>> wholeSheet = new ArrayList<>();

	public static ArrayList<ArrayList<String>> getWholeSheet() {
		if (wholeSheet.isEmpty()) {
			loadCSV();
		}
		
		return wholeSheet;
	}

	public static void loadCSV() {

		try (Scanner scanner = new Scanner(new File("sample.csv"));) {
			while (scanner.hasNext()) {

				wholeSheet.add(getRows(scanner.nextLine()));

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		for (int i = 0; i < wholeSheet.size(); i++) {
			// loopa genom values inne i records
			List<String> localValues = wholeSheet.get(i);
			System.out.println(localValues.size());
		}


	}

	private static ArrayList<String> getRows(String row) {

		ArrayList<String> rowValues = new ArrayList<String>();
		try (Scanner rowScanner = new Scanner(row)) {
			rowScanner.useDelimiter(COMMA_DELIMITER);
			while (rowScanner.hasNext()) {
				rowValues.add(rowScanner.next());
			}

			return rowValues;
		}

	}
	
	
	
	public static void printCSV() {
		for (ArrayList<String> row : wholeSheet) {
			
			System.out.println(row);

			
		}
		
		
	}

	
	
	

}
