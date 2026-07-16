public class Store {
    Product[] unsortedProducts = new Product[10];

    Product[] sortedProducts = new Product[10];

    public Store() {
        unsortedProducts[0] = new Product(5, "Stove", "Kitchen");
        unsortedProducts[1] = new Product(2, "Laptop", "Electronics");
        unsortedProducts[2] = new Product(9, "Kadalai", "Grocery");
        unsortedProducts[3] = new Product(1, "Phone", "Electronics");
        unsortedProducts[4] = new Product(7, "Football", "Sports");
        unsortedProducts[5] = new Product(4, "Shoes", "Fashion");
        unsortedProducts[6] = new Product(10, "Fan", "Electronics");
        unsortedProducts[7] = new Product(3, "Shirt", "Fashion");
        unsortedProducts[8] = new Product(8, "Maida", "Grocery");
        unsortedProducts[9] = new Product(6, "Bat", "Sports");

        sortedProducts[0] = new Product(1, "Phone", "Electronics");
        sortedProducts[1] = new Product(2, "Laptop", "Electronics");
        sortedProducts[2] = new Product(3, "Shirt", "Fashion");
        sortedProducts[3] = new Product(4, "Shoes", "Fashion");
        sortedProducts[4] = new Product(5, "Stove", "Kitchen");
        sortedProducts[5] = new Product(6, "Bat", "Sports");
        sortedProducts[6] = new Product(7, "Football", "Sports");
        sortedProducts[7] = new Product(8, "Maida", "Grocery");
        sortedProducts[8] = new Product(9, "Kadalai", "Grocery");
        sortedProducts[9] = new Product(10, "Fan", "Electronics");
    }

    public Product linearSearch(int productId) {
        for (Product p : unsortedProducts) {
            if (p.getProductId() == productId) {
                return p;
            }
        }
        return null;
    }

    public Product binarySearch(int productId) {
        int low = 0;
        int high = sortedProducts.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sortedProducts[mid].getProductId() == productId) {
                return sortedProducts[mid];
            } else if (sortedProducts[mid].getProductId() > productId) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}