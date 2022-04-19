package com.bridgelabs;
import java.util.*;
public class Vovelsandconsonent {
    public static void main()
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("\n Enter Character: ");
        char c=((inp.nextLine()).charAt(0));
        char z=Character.toUpperCase(c);

        switch(z)
        {
        case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println(c+" is a Vowel.");
                break;

            default: System.out.println(c+" is a Non-Vowel Character.");
        }

    }
}
