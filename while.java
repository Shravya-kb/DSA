// print numbers from 1 to n using while loop

import java.util.*;
public class JavaBasic{
  public static void main(String args[]){
    int counter = 1;
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    while(counter<=range){
      System.out.println(counter);
      counter++;
    }
  }
}
