public class Main {
    public static void main(String[] args) {

     public class Main {
    public static void main(String[] args) {

        Printer printerObject;
        printerObject = new Printer(50,false);
        System.out.println("Initial page count = " + printerObject.getPagesPrinted());

        int pagesPrinted = printerObject.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted,printerObject.getPagesPrinted());

        pagesPrinted = printerObject.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted,printerObject.getPagesPrinted());
    }
}
   Printer printerObject;
        printerObject = new Printer(50,false);
        System.out.println("Initial page count = " + printerObject.getPagesPrinted());

        int pagesPrinted = printerObject.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted,printerObject.getPagesPrinted());

        pagesPrinted = printerObject.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted,printerObject.getPagesPrinted());
    }
}
