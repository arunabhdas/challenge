package challenge;

public class Challenge {

  public static final void main(String[] args) {
    final String inputString = "Beth,Charles,Danielle,Adam,Eric\n17945,10091,10088,3907,10132\n2,12,13,48,11";
    HashMap<String, Integer> hmap = new HashMap<String, Integer>();

    returnAgesArray(inputString);
  }

  public static String sortCsvColumns( String csv_data ) {
    String lines[] = csv_data.split("\\r?\\n");
    System.out.println("lines");
    return lines[0];
  }

  public static String[] returnNamesArray(String inputString) {
    String[] rows = inputString.split("\\r?\\n");
    String[] namesArray = rows[0].split(",");
    return namesArray;
  }
  
  public static String[] returnNumbersArray(String inputString) {
    String[] rows = inputString.split("\\r?\\n");
    String[] numbersArray = rows[1].split(",");
    return numbersArray;
  }
  
  public static String[] returnAgesArray(String inputString) {
    String[] rows = inputString.split("\\r?\\n");
    String[] agesArray = rows[2].split(",");
    System.out.println(agesArray);
    for (int i=0; i < agesArray.length; i++) {
        System.out.print(agesArray[i]);
    }
    return agesArray;
  }

}
