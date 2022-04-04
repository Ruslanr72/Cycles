package ru.skypro;

public class Main {

    public static void main(String[] args) {
 int i = 0;   //ЗАДАЧА 1
 while (i <= 10) {
     System.out.print(i + " " );
     i ++;
 }
        System.out.println(" ");
  for (i = 10; i >= 0; i --){
      System.out.print(i + " ");
  }
        System.out.println(" ");
  //ЗАДАЧА 2
        int b = 1;
  for (b = 1; b <= 31; b = b+7){
      System.out.println("Today is a friday, " + b + "day, need to make report!");
  }
  //ЗАДАЧА 3
int c = 0;
  for (c = 0; c <= 2100; c = c + 79){
      if (c > 1822)
          System.out.println(c + " year");
      }

}
    }
