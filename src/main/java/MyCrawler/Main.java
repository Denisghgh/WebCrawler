package MyCrawler;

public class Main {

    public static void main(String[] args) {

        String start_url = "https://www.bravebird.de/";

        Bot bot = new Bot(start_url);
        bot.start();
    }
}
