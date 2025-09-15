class Order {
    protected String orderId;
    protected String orderDate;
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderStatus() { return "Order Placed"; }
}

class ShippedOrder extends Order {
    protected String trackingNumber;
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override public String getOrderStatus() { return "Shipped"; }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override public String getOrderStatus() { return "Delivered"; }
}

class OrderMultilevelDemo {
    public static void main(String[] args) {
        Order o1 = new Order("O1001", "2025-09-15");
        Order o2 = new ShippedOrder("O1002", "2025-09-14", "TRK123");
        Order o3 = new DeliveredOrder("O1003", "2025-09-13", "TRK456", "2025-09-15");
        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
