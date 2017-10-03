package muzi.scrum.thread;

/**
 * Created by muzi on 2017/10/3.
 */
class SellTicketDemo {
    public static void main(String[] args) {
        //方式1
        SellTicket sellTicket1 = new SellTicket();
        SellTicket sellTicket2 = new SellTicket();
        SellTicket sellTicket3 = new SellTicket();

        sellTicket1.setName("窗口1");
        sellTicket2.setName("窗口2");
        sellTicket3.setName("窗口3");

        //sellTicket1.start();
        //sellTicket2.start();
        //sellTicket3.start();

        System.out.println("----------------");

        //方式二
        SellTicketRunnable sellTicketRunnable = new SellTicketRunnable();
        Thread thread1 = new Thread(sellTicketRunnable, "窗口1");
        Thread thread2 = new Thread(sellTicketRunnable, "窗口2");
        Thread thread3 = new Thread(sellTicketRunnable, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
