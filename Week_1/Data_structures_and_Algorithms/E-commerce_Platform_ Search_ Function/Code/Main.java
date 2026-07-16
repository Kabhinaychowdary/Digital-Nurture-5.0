public class Main {

    public static void printProduct(Product p) {
        if (p == null) {
            System.out.println("Product not found");
        } else {
            System.out.println("Name: " + p.getProductName() + ", Category: " + p.getCategory());
        }
    }

    public static void main(String[] args) {

        Store store = new Store();
        long start, end;

        System.out.println("Linear Search:");
        start = System.nanoTime();
        Product result1 = store.linearSearch(8);
        end = System.nanoTime();
        printProduct(result1);
        System.out.println("Time taken: " + (end - start) + " ns");

        System.out.println();

        System.out.println("Binary Search:");
        start = System.nanoTime();
        Product result2 = store.binarySearch(8);
        end = System.nanoTime();
        printProduct(result2);
        System.out.println("Time taken: " + (end - start) + " ns");
    }
}