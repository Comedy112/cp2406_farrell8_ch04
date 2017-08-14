public class Billing {

   public static void main(String[] args) {
      double photoBookPrice = 10;
      int photoBookQuantity = 5;
      double couponValue = 28;



      computeBill(photoBookPrice);
      computeBill(photoBookPrice, photoBookQuantity);
      computeBill(photoBookPrice, photoBookQuantity, couponValue);

   }

   //receives single parameter which represents the price of one photo book ordered.
   //Adds 8% tax and returns the total due
   public static double computeBill(double photoBookPrice) {

      double tax = .08;
      double totalDue = photoBookPrice + (photoBookPrice * tax);
      return totalDue;

   }

   //receives two parameters, which represent the price of the photo book and the quantity ordered.
   //Multiplies the two, adds 8% tax and returns value
   public static double computeBill(double photoBookPrice, int photoBookQuantity) {

      double tax = 0.8;
      double totalDue = photoBookPrice * photoBookQuantity;
      double totalDue1 = totalDue + (totalDue * tax);
      return totalDue1;
   }

   //receices three parameters, which represent price of book, quantity ordered, and a coupon value.
   //Multiplies the quantity and price, reduce that result by the coupon value
   //Then add 8% tax and return total value
   public static double computeBill(double photoBookPrice, int photoBookQuantity, double couponValue) {

      double tax = 0.8;
      double totalDue = (photoBookPrice * photoBookQuantity) - couponValue;
      double totalDue1 = totalDue + (totalDue * tax);
      return totalDue1;
   }
}
