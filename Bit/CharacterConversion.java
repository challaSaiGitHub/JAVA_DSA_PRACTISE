package Bit;

public class CharacterConversion {
    public static void main(String args[])
    {
        char num='A';
            System.out.println("Capital to Small");
        System.out.println((char)(num |1<<5));
        System.out.println("Small to Capital");
        char ch='a';
        System.out.println((char)(ch & ~(1<<5)));
    }
}
