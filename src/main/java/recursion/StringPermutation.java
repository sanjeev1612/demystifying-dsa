package recursion;

public class StringPermutation {

  public static void permute (String str , int l , int r ){
    if (l ==r) {
      System.out.println("value is :"+str);
      return;
    }
     for(int i=l ;i <=r ;i++){
     str = swap(str ,l , i);
     permute(str , l+1,r);
     str = swap(str ,l , i);

     }
  }

  public static String swap(String str, int i, int j)
  {
    char ch[] = str.toCharArray();
    char temp = ch[i];
    ch[i] = ch[j];
    ch[j] = temp;
    return String.valueOf(ch);
  }


  public static void main(String[] args) {
permute("abc",0,2);
  }
}
