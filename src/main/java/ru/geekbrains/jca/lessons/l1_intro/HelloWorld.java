package ru.geekbrains.jca.lessons.l1_intro;

//UpperCamelCase (PascalCase) SomeLongNamedJavaClass
public class HelloWorld {

    public static void main(String[] args) {
//        middleMethod();
//        basicVariables();
//        arithmeticOps();
//        booleanConditions();
//        ifs();

        int result = calcSum(30, 40);
        System.out.println(result);
        System.out.println(calcSum(112, 84));

        String s = "Hi" + " ffff " + (14 + 14);
        System.out.println(s);

    }


    public static int calcSum(int a, int b) {
//        int a = 10;
//        int b = 14;
//        int result = a + b;
//        return result;
        return a + b;
    }

    private static void ifs() {
        int a = 100;

        if (a < 20) {
            System.out.println("one");
        } else if (a < 50) {
            System.out.println("two");
        } else if (a < 100) {
            System.out.println("three");
        } else {
            System.out.println("nothing");
        }

        System.out.println("never mind");
    }

    private static void booleanConditions() {
        boolean b = (10 * 2) == 20;
        boolean b1 = (10 * 2) != 20;
        boolean b3 = 5 > 2;
        boolean b4 = 5 < 5;
//        System.out.println(5 <= 5);

        boolean logic = 2 * 3 < 14 / 2 && 10 == 11;
        System.out.println(logic || 2 * 2 != 4);
    }

    private static void arithmeticOps() {
        int a = 2 + 2 - 2 * 2 / 3 - (2 + 2);
        System.out.println(a);
        System.out.println(11 % 3);

        a++; //increment (post) a = a + 1;
        ++a; //increment (pre)
        a--; //decrement
        --a;

        a += 2; // a = a + 2;
        a *= 3;
        a /= 3;
        a %= 3;

        System.out.println(++a);
        System.out.println(a);
    }

    private static void basicVariables() {
        byte b;
        b = 10;
        byte byteVariable = 99; //8 bit -128..127
        short shortVar = 512; //16 bit -32768..32767
        int integerVar = 2_110_000_000; // 32 bit -2.1M..2.1M
        long longVar = 2_510_000_000L; //64 bit

        double doubleVar = 10.8777; //64 bit
        float floatVar = 0.21f; //32 bit
        double d = 10.0 / 3;
        float f = 10.0f / 3;
        System.out.println(f);
        System.out.println(d);

        boolean booleanVar = true;
        var myLongVar = 100L;

        char characterVar = 70; //0..65535
        char charVar = 'Q';
        char charVar2 = '\u0000';
        char charVar3 = '\u2235';
        System.out.println(charVar3);

        int hex = 0x12F;

        HelloWorld hw = new HelloWorld();

        String stringVal = new String("Some text");
        String s = "My super string!";

        System.out.println(s);
    }

    public static void middleMethod() {
        printHelloWorld();
    }

    //camelCase someCamelCaseMethod
    public static void printHelloWorld() {
        System.out.println("Hello world!");
    }
}
