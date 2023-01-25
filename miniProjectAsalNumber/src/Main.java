public class Main {
    public static void main(String[] args) {
        //bug
        // 1 is not Prime number
        int number = -2;
        int remainder= number%2;
      //  System.out.println(remainder);
        boolean isPrime=true;

        if(number<=1){
            System.out.println("Lütfen 1 den büyük herhangi bir sayı girin");
        }
        else {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        }


        if(number<=1){

        }
        else if(isPrime==true ) {
            System.out.println("Sayınız asaldır.");
        }
        else{
            System.out.println("Sayınız asal değildir.");
        }


    }
}