public class Printer {
    private int tonerLevel;
    private int numOfPagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public void fillToner(int fill) {
        int newTonerLevel = tonerLevel + fill;
        if (newTonerLevel > 0 && newTonerLevel <= 100) {
            tonerLevel = newTonerLevel;
            System.out.println("You filled " + fill + "of toner. " +
                    "The new toner level is " + tonerLevel);
        } else {
            System.out.println("Incorrect fill amount. " +
                    "The current toner level is " + tonerLevel);
        }
    }

    public void pagesPrinted(int pages, boolean duplex) {
        if (duplex) {
            pages = (pages / 2) + (pages % 2);
            numOfPagesPrinted += pages;
            System.out.println("Duplex Mode selected");
        } else {
            numOfPagesPrinted += pages;
            System.out.println("Duplex Mode disabled");
        }
        System.out.println("The total number of pages printer from this" +
                "printer is " + numOfPagesPrinted);
    }
}

