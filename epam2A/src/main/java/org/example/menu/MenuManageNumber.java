package org.example.menu;

public class MenuManageNumber extends Menu{
    public void game() {
        while (true) {
            System.out.println("""
                    Выбирите действие:
                    1 - Добавить цифру.
                    2 - Добавить список цифр.
                    3 - Удалить по id цифру
                    4 - Удалить весь список
                    5 - Показать список
                    """);
        }
    }
}
