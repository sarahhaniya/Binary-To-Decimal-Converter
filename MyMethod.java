package Q2;

//MAIN METHOD **************************************************
public class MyMethod {

//COSINE METHOD **************************************************
        public static double myDegreeToRadian ( double degrees){
            double x = degrees;
            degrees = x * Math.PI / 180;


            return degrees;
        }


//COSINE METHOD **************************************************
        public static double myCos ( double x){
            double numerator, denominator, exponent, n = 0;
            double result = 0;
            int N = 20;
            for (n = 0; n <= N; n++) {
                numerator = myPow(-1, n);
                denominator = myFactorial((2 * n));
                exponent = myPow(x, (2 * n));
                result += (numerator * exponent) / denominator;
            }

            return result;
        }
//SIN METHOD **************************************************
        public static double mySin ( double x){
            double numerator, denominator, exponent, n = 0;
            double result = 0;
            int N = 20;
            for (n = 0; n <= N; n++) {
                numerator = myPow(-1, n);
                denominator = myFactorial((2 * n + 1));
                exponent = myPow(x, (2 * n + 1));
                result += (numerator * exponent) / denominator;
            }
            return result;

        }


//FACTORIAL METHOD **************************************************
        public static double myFactorial ( double n){
            int i;
            double result = 1;
            for (i = 1; i <= n; i++)
                result = result * i;
            return result;
        }


//POWER METHOD **************************************************
        public static double myPow ( double base, double power){
            double result = 1;
            if (power == 0) {
                return 1;
            }

            if (power < 0) {
                while (power < 0) {
                    result = result / base;
                    power++;
                }
            }


            if (power > 0) {
                while (power > 0) {
                    result = result * base;
                    --power;
                }
            }


            return result;
        }

        public static void myHeader (int labNum1, int quesNum1)
        {//void method that will have no return statement, (formal parameters defined where actual parameters will replace)
            System.out.println("**********************************************\nSarah Haniya" + "\nLab " + labNum1 + ", " +
                    "Question " + quesNum1 + "\n**********************************************");
        }

        public static void myFooter () {//void method that will have no return statement
            System.out.println("*** Goodbye from Sarah Haniya ***");
        }//myFooter void method with no return statement


    }





