public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 444444";
        post.patronymic = "Иванович";
        post.phone = "+7-912-77-81-92";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 16;
        post.birthday.month = "september";
        post.birthday.year = 87;

    }
}
