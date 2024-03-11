package java024_lombok.part08.item3;


import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
@AllArgsConstructor // static만 빼고 생성자가 만들어짐

public class Product {
   private static String code;
   @NonNull
   private String pname;
   private final int price;
   private boolean chk;
   
   

}