public class ProductDemo {
    public static void main(String[] args) {


        Product p1 = new Product("iPhone 15 (128GB)", "Apple", "Smartphone", 799.00, 8, 12);
        Product p2 = new Product("Galaxy A15 (128GB)", "Samsung", "Smartphone", 179.99, 15, 12);
        Product p3 = new Product("Inspiron 15 Laptop (Core i5, 16GB, 512GB SSD)", "Dell", "Laptop", 649.00, 6, 12);
        Product p4 = new Product("Pavilion 14 Laptop (Ryzen 5, 16GB, 512GB SSD)", "HP", "Laptop", 599.00, 5, 12);
        Product p5 = new Product("AirPods Pro", "Apple", "Audio", 249.00, 20, 12);
        Product p6 = new Product("WH-1000XM5", "Sony", "Audio", 349.99, 7, 12);
        Product p7 = new Product("MX Master 3S", "Logitech", "Accessory", 99.99, 18, 12);
        Product p8 = new Product("K380 Bluetooth Keyboard", "Logitech", "Accessory", 39.99, 25, 12);
        Product p9 = new Product("T7 Shield 1TB SSD", "Samsung", "Storage", 89.99, 14, 36);
        Product p10 = new Product("Kindle Paperwhite", "Amazon", "E-Reader", 149.99, 9, 12);

        Product productList[]=new Product[20];
        productList[0]=new Product(p1);
        productList[1]=new Product(p2);
        productList[2]=new Product(p3);
        productList[3]=new Product(p4);
        productList[4]=new Product(p5);
        productList[5]=new Product(p6);

        productList[6]=new Product(p7);
        productList[7]=new Product(p8);
        productList[8]=new Product(p9);
        productList[9]=new Product(p10);


        productList[15]=new Product(p10);

        for(Product temp:productList)
            if(temp!=null)
            System.out.println(temp.getName());





    }
}