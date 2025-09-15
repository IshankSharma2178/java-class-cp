interface Worker {
    void performDuties();
}

class PersonH {
    protected String name;
    protected int id;
    public PersonH(String name, int id) { this.name = name; this.id = id; }
}

class Chef extends PersonH implements Worker {
    public Chef(String name, int id) { super(name, id); }
    @Override public void performDuties() { System.out.println("Chef " + name + " cooks dishes and manages the kitchen."); }
}

class Waiter extends PersonH implements Worker {
    public Waiter(String name, int id) { super(name, id); }
    @Override public void performDuties() { System.out.println("Waiter " + name + " serves customers and takes orders."); }
}

class RestaurantHybridDemo {
    public static void main(String[] args) {
        Worker[] staff = new Worker[] { new Chef("Nina", 1), new Waiter("Omar", 2) };
        for (Worker w : staff) { w.performDuties(); }
    }
}
