public class KassaHesablamasi {
    public static void main(String[] args){
        float productPrice=250.50f; int discount=20;

        float finalPrice=productPrice-(productPrice*discount/100.0f);

        System.out.println("Original Price: "+productPrice+" | Discount: "+discount+"%"+" | Final Price: "+finalPrice);
    }
}
