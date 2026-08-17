
class Conducter {

    void collect(Money m) {
        System.out.println("Money collected by conducter");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket provided");
        return t;
    }

    static class Money {
    }

    static class Ticket {

        @Override
        public String toString() {
            return "Ticket";
        }
    }

    public static void main(String[] args) {

        Conducter c = new Conducter();

        Money m = new Money();
        c.collect(m);

        Ticket t = c.give();

        System.out.println(t);

        if (t != null) {
            System.out.println("Ticket collected by passenger");
        }
    }
}
