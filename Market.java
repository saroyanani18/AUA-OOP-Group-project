package stocksimulator;

import java.util.Random;

import static stocksimulator.StockSimulator.stocks;

public class Market extends Thread {
    @Override
    public void run() {
        while (true) {
            int stockIndex = randInt(0, stocks.length - 1);
            Stock currentStock = stocks[stockIndex];
            double currentPrice = currentStock.getPrice();
            double max = currentPrice + (currentPrice * 0.002);
            double min = currentPrice - (currentPrice * 0.002);
            currentStock.setPrice(randDouble(min, max));

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static double randDouble(double min, double max) {
        Random r = new Random();
        double randomValue = min + (max - min) * r.nextDouble();
        return randomValue;
    }
}  
