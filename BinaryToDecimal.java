package Q2;
//import ;
public class BinaryToDecimal {
    int[] binaryArray = new int[4];//declaring new int type array called binaryArray with size of 4


    public BinaryToDecimal(){

    }

    public BinaryToDecimal(int[] b1){
        binaryArray = b1;
    }


//**************************** DISPLAY ARRAY METHOD *******************************************************************************

    public void displayArray(){//void method to display array
        System.out.print("[ ");//start of array
        for (int i=0; i< binaryArray.length; i++){//using for statement to print each element in the array
            System.out.print(binaryArray[i]+" ");
        }
        System.out.print("]");//end of array

    }

//**************************** CONVERT BINARY TO DECIMAL METHOD *******************************************************************************

    public int getDecimalValue(){//public method that converts binary number to decimal value
       int decimal = 0;//initializing int type variable
       for (int i= binaryArray.length-1, j = 0; i>=0; i--, j++){//using for statement to calculate decimal value of binary number
           //start at last element of array because it is the least significant, and move on to the next
           //i = array position
           //j = binary number significance
           //higher binary position = closer to start of array position
           //       start of array   ---------> end of array
           //       most significant ---------> least significant
           decimal =  decimal + (  binaryArray[i] * (int) MyMethod.myPow(2,j)  );//adding all values of binary elements to get the number
           //casting myMethod.myPow to int because it is double type and return type is int
       }
        //depends on the length of the array
        //depends if the index is a 1 or a 0

        return decimal;//return statement
    }

//**************************** DOUBLE THE ARRAY METHOD *******************************************************************************

    public void doubleTheSizeZeroPadding(){//void method that converts the 4 bit number to an 8 bit number without changing its value (by padding the left with 0's)
        int[] binaryArray2 = new int[2 * binaryArray.length];//size of binaryArray2 is double the size of binaryArray
        System.arraycopy(binaryArray, 0, binaryArray2,/*destPos*/ (binaryArray2.length/2), binaryArray.length);
        //since binaryArray2 is double the size of binary array, we need to copy binaryArray to the last positions of the array in order to keep the value of the binary number the same
        binaryArray = binaryArray2;//binaryArray is now pointing to the 8 bit array instead of the 4 bit array
        binaryArray2 = null;//discard binaryArray2


    }

//**************************** REVERSE ARRAY METHOD *******************************************************************************

    public int[] reverseArray(){//public method with int array return type
        int [] reverseA = new int[binaryArray.length];//making new int array called reverseA that has the same size as binaryArray
        for (int i = binaryArray.length - 1, j=0   ;i >= 0    ; i--, j++) {//using for statement to reverse the order of elements
            reverseA[j] = binaryArray[i];
        }
        //i = starts at last element of binaryArray and goes backwards
        //j = starts at first element of reverseA and goes forward
        //reverseA is populated in the reverse order of binaryArray
        return reverseA;//return statement

    }


//**************************** SHIFT ELEMENTS RIGHT METHOD *******************************************************************************

    public void shiftRight(){//void method that prints binaryArray shifted one element to the right
        int [] copyBinaryArray = new int[binaryArray.length];//creating binaryArrayCopy with the same size of binaryArray
        //System.arraycopy(binaryArray, 0, copyBinaryArray,0, binaryArray.length);
        for (int i = 0; i< binaryArray.length-1; i++){//populating binaryArrayCopy position + 1 with binaryArray
            copyBinaryArray[i+1]=binaryArray[i];
        }
        //first element remains unpopulated because 0+1 = 1 , so it is populated with binaryArray's last element
        copyBinaryArray[0]=binaryArray[binaryArray.length-1];

        binaryArray=copyBinaryArray;//binaryArray now points to the same place that copyBinaryArray is pointing to : the shifted array
        copyBinaryArray=null;//discarding copyBinaryArray
        displayArray();//calling void method to display the new shifted array



    }

//**************************** SHUFFLE ELEMENTS METHOD *******************************************************************************

    public void shuffleArray(){//void method that shuffles array and displays it
        int j; int b;//declaring int type variables
        for (int i = 0; i< binaryArray.length; i++){//using for statement to shuffle array
            j = (int)(Math.random()* binaryArray.length);
            b = binaryArray[i];
            binaryArray[i] = binaryArray[j];
            binaryArray[j] = b;
        }
        //*************************************************************************
        displayArray();//calling method to display shuffled array


    }



}
