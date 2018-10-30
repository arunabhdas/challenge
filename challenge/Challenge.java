package challenge;

public class Challenge {

  public static final void main(String[] args) {
    System.out.println("Main");
  }

  public static String sortCsvColumns( String csv_data ) {
    String lines[] = csv_data.split("\\r?\\n");
    System.out.println("lines");
    return lines[0];
  }
}
