public class MaxBox {

    public static double findMax(Box<? extends Number>... boxes) {
        // Проверка на null входных данных
        if (boxes == null) {
            throw new IllegalArgumentException("Коробок нет!");
        }

        // начальное значение, чтобы
        // корректно обработать случай, когда все коробки пустые
        double max = Double.NEGATIVE_INFINITY;

        // Перебираем все переданные коробки
        for (Box<? extends Number> box : boxes) {
            // Пропускаем пустые коробки
            if (box.isEmpty()) {
                continue;
            }

            // Получаем значение из коробки и преобразуем к double
            double value = box.get().doubleValue();

            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}