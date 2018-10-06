package PJava01;
import java.util.*;

public class Test06 {
  public static void main(String[] args) {


    String[] names = { "1", "2", "3", "4" };
    System.out.println(Arrays.toString(names));

    // 배열을 리스트로 변환
    List<String> list = Arrays.asList(names);


    // 리스트 뒤집어 주기
    Collections.reverse(list);

    // 리스트를 배열로 다시 변환
    names = list.toArray(new String[list.size()]);

    // 순서 뒤집어진 배열을 문자열로 변환 후 출력
    String s = Arrays.toString(names);
    System.out.println(s);


  }
}