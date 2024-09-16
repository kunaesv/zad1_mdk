public class Main {
    public static void main(String[] args) {
        String pixelKcalDay = "43"; // столько калорий съел Пиксель до похода к бабушке
        String beefKcal = "30.2"; // калорийность говядины
        String chickenKcal = "23.8"; // калорийность курицы
        String creamKcal = "32.1"; // калорийность сливок
        String milkKcal = "13.5"; // калорийность молока

        int Z = Integer.parseInt(pixelKcalDay);
        float X = Float.parseFloat(beefKcal);
        float C = Float.parseFloat(chickenKcal);
        float A = Float.parseFloat(creamKcal);
        float B = Float.parseFloat(milkKcal);
        float pixelChoice = getMinKcalsSum(X, C, A, B);
        float totalKcal = Integer.parseInt(pixelKcalDay) + pixelChoice;
        checkKcal(totalKcal);
    }

    private static Float getMinKcalsSum(float firstDishKcal, float secondDishKcal, float firstDesert, float secondDesert) {

        float minDishKcal = Float.min(firstDishKcal,secondDishKcal); // вычислите минимальную калорийность основного блюда
        float minDesertKcal = Float.min(firstDesert,secondDesert); // вычислите минимальную калорийность десерта
        return minDishKcal + minDesertKcal;
    }

    private static void checkKcal(Float catKcal) {
        if (catKcal == null) {
            System.out.println("Что-то пошло не так");
        } else {
            System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
            if (catKcal > 100) {
                System.out.println("Пиксель сегодня не уложился в норму.");
            } else {
                System.out.println("Лимит не превышен!");
            }
        }
    }
}