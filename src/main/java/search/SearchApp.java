package search;

public class SearchApp {
  public static void main(String[] args) {
    int returnedIndex = BinarySearch.findIterative(new int[]{1,2,3,4,5,6,7,8,9}, 8);
    int returnedIndexFromRecursion = BinarySearch.findRecursive(new int[]{1,2,3,4,5,6,7,8,9}, 0,8,8);

    System.out.println(returnedIndex);
    System.out.println(returnedIndexFromRecursion);
  }
}
