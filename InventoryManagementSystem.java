import java.util.*;
import java.io.*;

class InventoryManagementSystem
{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> products = new ArrayList<Product>();
    static HashSet<Integer> productIds = new HashSet<Integer>();
    static HashMap<Integer, Product> productMap = new HashMap<Integer, Product>();
    static final String FILE_NAME = "inventory.txt";

    interface Stock
    {
        String getStockStatus();
    }

    static abstract class Item
    {
        protected int productId;
        protected String productName;

        Item(int productId, String productName)
        {
            this.productId = productId;
            this.productName = productName;
        }

        abstract void display();
    }

    static class Product extends Item implements Stock
    {
        private int quantity;
        private double price;

        Product(int productId, String productName, int quantity, double price)
        {
            super(productId, productName);
            this.quantity = quantity;
            this.price = price;
        }

        public int getProductId()
        {
            return productId;
        }

        public String getProductName()
        {
            return productName;
        }

        public int getQuantity()
        {
            return quantity;
        }

        public double getPrice()
        {
            return price;
        }

        public void setProductName(String productName)
        {
            this.productName = productName;
        }

        public void setQuantity(int quantity)
        {
            this.quantity = quantity;
        }

        public void setPrice(double price)
        {
            this.price = price;
        }

        public String getStockStatus()
        {
            if (quantity == 0)
                return "Out of Stock";
            else if (quantity <= 5)
                return "Low Stock";
            else
                return "Available";
        }

        void display()
        {
            System.out.println("--------------------------------------------");
            System.out.println("Product ID   : " + productId);
            System.out.println("Product Name : " + productName);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Price        : " + price);
            System.out.println("Stock Status : " + getStockStatus());
            System.out.println("--------------------------------------------");
        }
    }

    static int readInt(String message)
    {
        while (true)
        {
            try
            {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine().trim());
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input! Enter a valid integer.");
            }
        }
    }

    static double readDouble(String message)
    {
        while (true)
        {
            try
            {
                System.out.print(message);
                double value = Double.parseDouble(sc.nextLine().trim());

                if (Double.isFinite(value))
                    return value;

                System.out.println("Enter a valid finite number.");
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input! Enter a valid number.");
            }
        }
    }

    static String readString(String message)
    {
        while (true)
        {
            System.out.print(message);
            String value = sc.nextLine().trim();

            if (!value.isEmpty() && !value.contains("|"))
                return value;

            System.out.println("Input cannot be empty or contain |.");
        }
    }

    static Product searchProduct(int id)
    {
        return productMap.get(id);
    }

    static void addProduct()
    {
        int id = readInt("Enter Product ID: ");

        if (id <= 0)
        {
            System.out.println("Product ID must be positive.");
            return;
        }

        if (productIds.contains(id))
        {
            System.out.println("Product ID already exists!");
            return;
        }

        String name = readString("Enter Product Name: ");
        int quantity = readInt("Enter Quantity: ");
        double price = readDouble("Enter Price: ");

        if (quantity < 0 || price < 0)
        {
            System.out.println("Quantity and price cannot be negative.");
            return;
        }

        Product p = new Product(id, name, quantity, price);

        products.add(p);
        productIds.add(id);
        productMap.put(id, p);

        saveData();

        System.out.println("Product added successfully!");
    }

    static void viewProducts()
    {
        if (products.isEmpty())
        {
            System.out.println("No products available.");
            return;
        }

        for (Product p : products)
        {
            p.display();
        }
    }

    static void searchRecord()
    {
        int id = readInt("Enter Product ID to search: ");

        Product p = searchProduct(id);

        if (p != null)
            p.display();
        else
            System.out.println("Product not found!");
    }

    static void updateProduct()
    {
        int id = readInt("Enter Product ID to update: ");

        Product p = searchProduct(id);

        if (p == null)
        {
            System.out.println("Product not found!");
            return;
        }

        System.out.println("1. Update Product Name");
        System.out.println("2. Update Quantity");
        System.out.println("3. Update Price");
        System.out.println("4. Update All Details");

        int choice = readInt("Enter your choice: ");

        switch (choice)
        {
            case 1:
                p.setProductName(readString("Enter New Name: "));
                break;

            case 2:
            {
                int quantity = readInt("Enter New Quantity: ");

                if (quantity < 0)
                {
                    System.out.println("Quantity cannot be negative.");
                    return;
                }

                p.setQuantity(quantity);
                break;
            }

            case 3:
            {
                double price = readDouble("Enter New Price: ");

                if (price < 0)
                {
                    System.out.println("Price cannot be negative.");
                    return;
                }

                p.setPrice(price);
                break;
            }

            case 4:
            {
                String name = readString("Enter New Name: ");
                int quantity = readInt("Enter New Quantity: ");
                double price = readDouble("Enter New Price: ");

                if (quantity < 0 || price < 0)
                {
                    System.out.println("Quantity and price cannot be negative.");
                    return;
                }

                p.setProductName(name);
                p.setQuantity(quantity);
                p.setPrice(price);
                break;
            }

            default:
                System.out.println("Invalid choice!");
                return;
        }

        saveData();

        System.out.println("Product updated successfully!");
    }

    static void deleteProduct()
    {
        int id = readInt("Enter Product ID to delete: ");

        Product p = searchProduct(id);

        if (p == null)
        {
            System.out.println("Product not found!");
            return;
        }

        products.remove(p);
        productIds.remove(id);
        productMap.remove(id);

        saveData();

        System.out.println("Product deleted successfully!");
    }

    static void saveData()
    {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME)))
        {
            for (Product p : products)
            {
                pw.println(
                    p.getProductId() + "|" +
                    p.getProductName() + "|" +
                    p.getQuantity() + "|" +
                    p.getPrice()
                );
            }
        }
        catch (IOException e)
        {
            System.out.println("Error saving inventory: " + e.getMessage());
        }
    }

    static void loadData()
    {
        File file = new File(FILE_NAME);

        if (!file.exists())
            return;

        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;

            while ((line = br.readLine()) != null)
            {
                try
                {
                    String data[] = line.split("\\|", -1);

                    if (data.length != 4)
                        continue;

                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int quantity = Integer.parseInt(data[2]);
                    double price = Double.parseDouble(data[3]);

                    if (id <= 0 || name.trim().isEmpty()
                        || quantity < 0 || !Double.isFinite(price)
                        || price < 0 || productIds.contains(id))
                    {
                        continue;
                    }

                    Product p = new Product(id, name, quantity, price);

                    products.add(p);
                    productIds.add(id);
                    productMap.put(id, p);
                }
                catch (RuntimeException e)
                {
                    System.out.println("Skipping invalid inventory record.");
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error loading inventory: " + e.getMessage());
        }
    }

    static void stockReport()
    {
        Thread t = new Thread(() ->
        {
            System.out.println("\nGenerating Stock Report...");

            int available = 0;
            int lowStock = 0;
            int outOfStock = 0;

            for (Product p : products)
            {
                if (p.getQuantity() == 0)
                    outOfStock++;
                else if (p.getQuantity() <= 5)
                    lowStock++;
                else
                    available++;
            }

            System.out.println("\n========== STOCK REPORT ==========");
            System.out.println("Total Products : " + products.size());
            System.out.println("Available      : " + available);
            System.out.println("Low Stock      : " + lowStock);
            System.out.println("Out of Stock   : " + outOfStock);
            System.out.println("==================================");
        });

        t.start();

        try
        {
            t.join();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
            System.out.println("Report generation interrupted.");
        }
    }

    public static void main(String args[])
    {
        loadData();

        int choice;

        do
        {
            System.out.println("\n========== INVENTORY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Record");
            System.out.println("2. View All Records");
            System.out.println("3. Search Record");
            System.out.println("4. Update Record");
            System.out.println("5. Delete Record");
            System.out.println("6. Stock Report");
            System.out.println("7. Exit");

            choice = readInt("Enter your choice: ");

            switch (choice)
            {
                case 1:
                    addProduct();
                    break;

                case 2:
                    viewProducts();
                    break;

                case 3:
                    searchRecord();
                    break;

                case 4:
                    updateProduct();
                    break;

                case 5:
                    deleteProduct();
                    break;

                case 6:
                    stockReport();
                    break;

                case 7:
                    System.out.println("Thank you for using Inventory Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
