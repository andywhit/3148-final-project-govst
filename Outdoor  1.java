

import java.util.Scanner;

import java.text.DecimalFormat;





public class shoppingDriver{

    //This is the driver class the collobarates all the other class.

    

    public static void main(String[] args){

        Product p2 = new Product(" TIKI 4-Pack 57-in Bamboo Garden Torch " , " Natural flame outdoor torches help set the mood and add fun, decor and ambiance to your backyard or patio. Easy-to-use bamboo torches bring a touch of relaxed style and flare to any outdoor patio space. \n"  + 
  15.99, 3," TIKI ","Outdoor");

       

        System.out.println("Product Name : " + p1.getName() + "\n");

        System.out.println("Desciption : " + p1.getDescription() + "\n");

        System.out.println("Size : " + p1.getSize() + "\n");

        System.out.println("Price : $" + p1.getPrice() + "\n");

        System.out.println("Quantity : " + p1.getQuantity() + "\n");

        System.out.println("Seller : " + p1.getSellerName());

        System.out.println("Category : " + p1.getCategory());

            

        Scanner Scan = new Scanner(System.in);

        

        System.out.print("Enter your shipping address : ");

        

        String shippingAddress;

        

        shippingAddress = Scan.nextLine();

        

        Cart c1 = new Cart(p1.getName(),shippingAddress, p1.getQuantity(), p1.getPrice());

        

        System.out.println("\n\nName of product in cart : " + c1.getName());

        System.out.println("Shipping Address : " + c1.getShippingAdress());

        System.out.println("=============================================");

        System.out.println("Quantity : " + p1.getQuantity());

        System.out.println("Price : " + p1.getPrice());

        System.out.println("Shipping Cost : $3");

        System.out.println("Tax : 10%");

        System.err.println("---------------------------------------------");

        

        // Round the output to two decimal places

      DecimalFormat fmt = new DecimalFormat("0.##");

        System.err.println("Final amount due : $" + fmt.format(c1.finalPrice()));

        System.err.println("---------------------------------------------");

        

        

    }

}