package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = "1234 №567890";
        post.patronymic = "Сергеевич";
        post.phone = "+7(999)0011229";
        post.surname = "Петров";
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

    }
}