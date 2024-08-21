package bookstore_project;

import java.util.*;

class Order {
    private int index;
    private int bookIndex;
    private int accountIndex;
    private int amount;
    private int totalPrice;
    private String address;

    public Order(int index, int bookIndex, int accountIndex, int amount, int totalPrice, String address) {
        this.index = index;
        this.bookIndex = bookIndex;
        this.accountIndex = accountIndex;
        this.amount = amount;
        this.totalPrice = totalPrice;
        this.address = address;
    }

    public int getIndex() { return index; }
    public int getBookIndex() { return bookIndex; }
    public int getAccountIndex() { return accountIndex; }
    public int getAmount() { return amount; }
    public int getTotalPrice() { return totalPrice; }
    public String getAddress() { return address; }

    public static int getNextOrderIndex() {
        List<Order> orders = getAllOrders();
        return orders.size(); // 마지막 인덱스 + 1 반환
    }

    public static void addOrder(Order order) {
        String orderData = order.getIndex() + "," + order.getBookIndex() + "," + order.getAccountIndex() + "," + order.getAmount() + "," + order.getTotalPrice() + "," + order.getAddress();
        DBUtil.create("order", orderData);
    }

    public static List<Order> getAllOrders() {
        // 모든 주문 데이터를 가져옴
        List<String> orderData = DBUtil.read("order");
        List<Order> orders = new ArrayList<>();
        
        for (String data : orderData) {
            String[] fields = data.split(",");
            Order order = new Order(
        		Integer.parseInt(fields[0]),
                Integer.parseInt(fields[1]),
                Integer.parseInt(fields[2]),
                Integer.parseInt(fields[3]),
                Integer.parseInt(fields[4]),
                fields[5]
            );
            orders.add(order);
        }
        return orders;
    }

    public static List<Order> getOrders(int accountIndex) {
        List<String> ordersData = DBUtil.read("order");
        List<Order> orders = new ArrayList<>();
        for (String orderData : ordersData) {
            String[] data = orderData.split(",");
            if (Integer.parseInt(data[2]) == accountIndex) {
                orders.add(new Order(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5]));
            }
        }
        return orders;
    }
}
