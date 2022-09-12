public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // 8 primitive data types
        //6-ish numeric
        //1-ish character
        //1 switch flipper

        //integers --- 4 kinds
        byte tinyNums = 42;                 // 8-bits       -128 to 127
        short mediumSizedNums = -23846;     //16-bits       -32768 to 32767
        int normalSizedNums = 2843965;      //32-bits       -2147483648 to 214783647
        long hugeishNumbers = 8378549972L;  //64-bits       -9quintillion to 9quintillion

        //reals -- DECIMALS!!!
        float LessAccurateNumbers = 39.627F;    //32-bits       ~7 digits of accuracy (sigfigs)
        double moreAccurateNumbers = 847956.736485903;      //64-bits       ~15 digits of accuracy      MOST USED

        //characters            characters are really integers
        char singleLetter = '&';            //16-bits       65535 characters in the bank (UNICODE)
                                            //'A' == 65     'a' == 97       '0' == 48

        //boolean
        boolean lightSwitch = true;         // true or false

        String wordsAndPhrases = "Good morning, San Diego!";

        //Practice Starts
        int x = 128;
        System.out.println(x);

        x = -98;
        System.out.println (x);

        byte b = 24;
        System.out.println(b);

        char c = 97;
        System.out.println(c);

        double d = 9.7;
        System.out.println(d);

        d = 5.5;
        System.out.println(d);

        float f = 7.89f;
        System.out.println(f);

        short s = 350;
        System.out.println(s);

        int z = 'A' +   5;
        System.out.println(z);

        c = 'A' + 5;
        System.out.println(c);

        double w = 'a' + 5;
        System.out.println(w);

        long u = 'A' - 48;
        System.out.println(u);

        w = f + 5;
        System.out.println(w);

        b = 21;
        System.out.println(b);

        w = 'A' * 2.0;
        System.out.println(w);

        //f = w;
        //System.out.println(f);

        u = 982743L;
        System.out.println(u);

        d = 3.2e2;
        System.out.println(d);

        //s = c;
        //System.out.println(s);

        //z = w;
        //System.out.println(z);
    }


}