package Q2;
public class DemoBinaryToDecimal {
    public static void main(String[] args) {
        MyMethod.myHeader(7,2);//calling myHeader method from MyMethod class and entering parameters
        System.out.println();
        int [] arraySarah = new int[4];//instantiating new array called arraySarah and setting it to size 4
        for(int i = 0; i< arraySarah.length; i++) {
            //populating arraySarah with either 0 or 1 by changing Math.random() range from 0<=x<1 to 0<=x<2 and casting it to int
            arraySarah[i]=(  (int) ( Math.random()*2 )   );
        }
        BinaryToDecimal binaryArray = new BinaryToDecimal(arraySarah);//creating a BinaryToDecimal type variable and passing arraySarah to it
        System.out.print("The 4-bit number: ");
        binaryArray.displayArray();//calling displayArray method to display arraySarah
        System.out.println("\nThe corresponding decimal value is: " +binaryArray.getDecimalValue());//calling getDecimalValue to convert the binary number in arraySarah to a decimal value
        System.out.println();
        System.out.print("The 8-bit number: ");
        binaryArray.doubleTheSizeZeroPadding();//calling doubleTheSizeZeroPadding to convert the 4 bit number to an 8 bit number without changing the values
        binaryArray.displayArray();//displaying the now-8 bit number
        System.out.println("\nThe corresponding decimal value is: " +binaryArray.getDecimalValue());//displaying the dec value of that 8 bit number
        System.out.println();
        binaryArray = new BinaryToDecimal(binaryArray.reverseArray() );//reassigning binaryArray to the reverse array
        System.out.print("The reversed array is : ");
        binaryArray.displayArray();//calling displayArray method to display the reversed array
        System.out.println("\nThe corresponding decimal value is: " +binaryArray.getDecimalValue());//displaying the dec value of that reversed array
        System.out.println();
        System.out.print("The 8 bit number after the shift right operation: ");
        binaryArray.shiftRight();//calling the void method to shift the array and display it
        System.out.println("\nThe corresponding decimal value is: " +binaryArray.getDecimalValue());//displaying the dec value of that shifted array
        System.out.println();


        System.out.print("The 8 bit number after the shuffling operation: ");
        binaryArray.shuffleArray();//calling the void method to shuffle the array and display it
        System.out.println("\nThe corresponding decimal value is: " +binaryArray.getDecimalValue());//displaying the dec value of that shuffled array

        System.out.println();


        MyMethod.myFooter();//calling myFooter method from MyMethod class

    }
}
