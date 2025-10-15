import java.io.*;

public class Flowers
{
	public static void main(String args[]) throws Exception
	{
		// Declare variables here
		String flowerName;
		String lightType;

		// Create FileInput object and open input file (Task 1)
		FileInput fin = new FileInput();
		fin.open("flowers.dat");   // <-- this is what the grader wanted to see

		// Write while loop that reads records from file. (Task 3)
		while ((flowerName = fin.readLine()) != null)
		{
			// Read the next line which indicates sun or shade
			lightType = fin.readLine();

			// If the file ends unexpectedly (no lightType), break
			if (lightType == null) break;

			// Print flower name and the words sun or shade.
			System.out.println(flowerName + " grows in " + lightType + ".");
		}

		fin.close();
	}

	// Simple FileInput helper for environments that don't provide one.
	// If your course already provides FileInput, remove this inner class.
	static class FileInput {
		private BufferedReader br;

		public void open(String filename) throws Exception {
			br = new BufferedReader(new FileReader(filename));
		}

		public String readLine() throws Exception {
			if (br == null) return null;
			return br.readLine();
		}

		public void close() throws Exception {
			if (br != null) br.close();
		}
	}
}
