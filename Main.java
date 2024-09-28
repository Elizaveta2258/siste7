class ChocolateCalculator {
    public static void main(String[] args) {
        int money = 15;
        int price = 1;
        int wrap = 3;

        int totalChocolates = TotalChocolates(money, price, wrap);
        System.out.println("Общее количество шоколадок: " + totalChocolates);
    }
    public static int TotalChocolates(int money, int price, int wrap) {
        int Chocolates = money / price;
        return Chocolate(Chocolates, wrap);
    }
    private static int Chocolate(int totalChocolates, int wrap) {
        int wrappers = totalChocolates;
        while (wrappers >= wrap) {
            int dopChocolates = wrappers / wrap;
            totalChocolates += dopChocolates;
            wrappers = dopChocolates + (wrappers % wrap); // Обновляем количество оберток
        }
        return totalChocolates;
    }
}
