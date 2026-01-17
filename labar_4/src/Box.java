public class Box<type> {
    // Хранимый объект. Может быть null, что означает пустую коробку.
    private type item;

    public Box(type item) {
        this.item = item;
    }

    public void put(type item) {
        // Проверяем, что коробка пустая перед добавлением нового объекта
        if (this.item != null) {
            throw new IllegalArgumentException("Коробка не пустая!");
        }
        this.item = item;
    }

    public type get() {
        // Проверяем наличие объекта перед извлечением
        if (item == null) {
            throw new IllegalArgumentException("Коробка пустая!");
        }

        // Сохраняем объект во временную переменную
        type item2 = item;
        // Очищаем коробку
        item = null;
        return item2;
    }

    public boolean isEmpty() { //Проверяет, пустая ли коробк
        return item == null;
    }

    public String toString() {
        if (item == null) {
            return "Коробка пустая.";
        } else {
            return "Коробка содержит " + item.toString();
        }
    }
}