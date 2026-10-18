public class SellerRatings {
	public static void main(String[] args) {
		Seller seller = new Seller("Mary");
		Seller seller2 = new Seller("John");

		seller.calcRating(4); // one value
		System.out.println(seller);

		seller.calcRating(5, 5); // two values
		System.out.println(seller);

		int[] arrayOfRatings = { 4, 4, 5 };
		seller.calcRating(arrayOfRatings); // array
		System.out.println(seller);
		
		int[]arrayOfRatings2 = { 3, 1, 5 };
		seller2.calcRating(arrayOfRatings2); // array
		System.out.println(seller2);

		seller.calcRating(); // no values
		System.out.println(seller);
	}
}