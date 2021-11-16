package ru.geekbrains.jca.lessons.lesson8_oop;

@FunctionalInterface
public interface Flying {
  public final String SOME_TYPE_STRING = "knark ek ekrv ";

   void fly();

   //Java 8+
   default void doSomethingDefault() {
      //.....
      System.out.println("DEFAULT");
      doSomethingPrivate();
   }

   //Java 9+
   private void doSomethingPrivate() {
      //......
   }

   //Java 9+
   static void doSomethingStatic() {
      System.out.println("STATIC");
   }

}
