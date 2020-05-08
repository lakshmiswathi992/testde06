package selenium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling {

	public static void main(String[] exceptions) throws IOException {

		try {
			BufferedReader br=new BufferedReader(new FileReader("Data"));
		     while ((br.readLine()) != null)
		         {
		           System.out.println(br.readLine());
		         }
		}

		catch (IOException sql) {
			System.out.println("Inside catch block" + sql.getMessage());
		}
		try {
			throw new IndexOutOfBoundsException();
		}

		catch (IndexOutOfBoundsException outOfBoundsException) {
			System.out.println("Inside catch block"
					+ outOfBoundsException.getMessage());
		}

	}

}
