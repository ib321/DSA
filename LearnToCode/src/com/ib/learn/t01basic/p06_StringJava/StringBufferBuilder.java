package com.ib.learn.t01basic.p06_StringJava;

public class StringBufferBuilder {
    public static void main(String[] args) {
        // StringBuffer
        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        stringBuffer1.append(" World");
        System.out.println("StringBuffer: " + stringBuffer1);

        // StringBuilder
        StringBuilder stringBuilder2 = new StringBuilder("Hello");
        stringBuilder2.append(" World");
        System.out.println("StringBuilder: " + stringBuilder2);

        // StringBuffer methods
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        stringBuffer.insert(5, ",");
        stringBuffer.replace(6, 11, "Java");
        stringBuffer.delete(5, 6);
        System.out.println("StringBuffer: " + stringBuffer);

        // StringBuilder methods
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        stringBuilder.insert(5, ",");
        stringBuilder.replace(6, 11, "Java");
        stringBuilder.delete(5, 6);
        System.out.println("StringBuilder: " + stringBuilder);
    }
}
