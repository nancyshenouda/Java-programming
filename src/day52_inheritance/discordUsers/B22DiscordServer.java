package day52_inheritance.discordUsers;

public class B22DiscordServer {
    public static void main(String[] args) {
        System.out.println("---- user1 object-----");
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Nancy");
        user1.setRole("Teacher");
        System.out.println(user1);

        System.out.println("---- admin1 object-----");
        Admin admin1 = new Admin();
        admin1.setId(1111);
        admin1.setName("Mariam");
        admin1.setRole("instructor");
        System.out.println(admin1);
        System.out.println("---- admin2 object-----");
        Admin admin2 = new Admin("Heaven",4123);
        System.out.println(admin2);

    }
}
