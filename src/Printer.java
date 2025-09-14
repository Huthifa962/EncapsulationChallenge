public class Printer {

    private int tonerlevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerlevel, boolean duplex){
        this.pagesPrinted = 0;
        this.tonerlevel = (tonerlevel >= 0 && tonerlevel <= 100) ? tonerlevel : -1;//if the condition is true return tonerlevel , otherwise return -1
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        int tempAmount = tonerAmount + tonerlevel;
        if (tempAmount > 100 || tempAmount < 0){
            return -1;
        }
        tonerlevel += tonerAmount;
        return tonerlevel;
    }

    public int printPages(int pages){
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted(){
        return pagesPrinted;//To return printed page
    }
}
