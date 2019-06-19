package io.github.yglukhov.jnim;

public class TestClass {
    // Static fields
    public static Object objectSField = "obj";
    public static char charSField = 'A';
    public static byte byteSField = 1;
    public static short shortSField = 2;
    public static int intSField = 3;
    public static long longSField = 4;
    public static float floatSField = 1.0f;
    public static double doubleSField = 2.0;
    public static boolean booleanSField = true;

    // Fields
    public Object objectField = "obj";
    public char charField = 'A';
    public byte byteField = 1;
    public short shortField = 2;
    public int intField = 3;
    public long longField = 4;
    public float floatField = 1.0f;
    public double doubleField = 2.0;
    public boolean booleanField = true;
    public String checkStringProperty = "OK";

    // Static methods
    public static Object objectSMethod(Object v) {
        return v;
    }
    public static char charSMethod(char v) {
        return v;
    }
    public static byte byteSMethod(byte v) {
        return v;
    }
    public static short shortSMethod(short v) {
        return v;
    }
    public static int intSMethod(int v) {
        return v;
    }
    public static long longSMethod(long v) {
        return v;
    }
    public static float floatSMethod(float v) {
        return v;
    }
    public static double doubleSMethod(double v) {
        return v;
    }
    public static boolean booleanSMethod(boolean v) {
        return v;
    }

    // Methods
    public Object objectMethod(Object v) {
        return v;
    }
    public char charMethod(char v) {
        return v;
    }
    public byte byteMethod(byte v) {
        return v;
    }
    public short shortMethod(short v) {
        return v;
    }
    public int intMethod(int v) {
        return v;
    }
    public long longMethod(long v) {
        return v;
    }
    public float floatMethod(float v) {
        return v;
    }
    public double doubleMethod(double v) {
        return v;
    }
    public boolean booleanMethod(boolean v) {
        return v;
    }

    // Arrays
    public int[] intArray = { 1, 2, 3, 4, 5 };
    public static char[] staticCharArray = "Hello".toCharArray();
    public Object[] objectArray;
    public boolean checkObjectArray() {
        if(objectArray.length != 2)
            return false;
        if(!objectArray[0].equals("Hello"))
            return false;
        if(!objectArray[1].equals("world!"))
            return false;
        return true;
    }

    // Methods returning arrays
    public double[] getDoubleArray(double factor) {
        double[] res = new double[10];
        for(int i = 1; i <= 10; i++) {
            res[i-1] = (double)i * factor;
        }
        return res;
    }
    public static String[] getStringArrayS() {
        String[] arr = {"Hello", "from", "java!"};
        return arr;
    }
}
