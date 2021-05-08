
package discretemathhw10;

import java.util.Scanner;

/** Code written by William Fletcher, This program simply takes 
 * a user inputted string, and a caesar shift value and calculates
 * the subsequent caesar cipher. This program does not handle spaces 
 * in the user string(yet, may add it later), so if your getting errors when running, ensure 
* there are no spaces in your string input. Releasing as Open source, use it however you want.
*/

public class CaesarCipher{


    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
	System.out.println("Enter a string to be encoded with a caesar shift");
        String code = s.nextLine();
        code = code.toUpperCase();
        char[] charray = code.toCharArray();
        int[] intarray = new int[charray.length];
        for(int i=0; i<charray.length; i++){
        	intarray[i] = ((int)(charray[i])- 65);
        }
        //this converts the Charachters into ASCII value, which for capital
        //letters start at 65 to 91, so by subtracting 65 a=0, b=1 etc.
        //this offset will later be re-added to convert the int value back to char.

        System.out.println("Enter a proposed caesar shift value(integer):");
        int inpt = s.nextInt();
        char[] updatedchararray = new char[charray.length];
        for(int i=0; i<charray.length ; i++){
        	intarray[i] = (intarray[i] + inpt) % 26;
        	updatedchararray[i] =(char) (intarray[i] + 65);
        	System.out.print(updatedchararray[i]);
        }
       //this loop updates the character array according to the shift. 
       // keep in mind the % operator is equivelent to the mod operation.
       // this ensures our values stay within 0-25.
    }
    
}


