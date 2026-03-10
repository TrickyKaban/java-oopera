public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Смирнова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Олег", "Иванов", Gender.MALE, 175);

        Director director1 = new Director("Мария", "Орлова", Gender.FEMALE, 10);
        Director director2 = new Director("Сергей", "Волков", Gender.MALE, 7);

        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Юрий", "Громов", Gender.MALE);

        Show show = new Show("Ревизор", 120, director1);
        Opera opera = new Opera("Пиковая дама", 150, director2, musicAuthor,
                "История о страсти, тайне трёх карт и трагической судьбе Германа.", 30);
        Ballet ballet = new Ballet("Щелкунчик", 140, director1, musicAuthor,
                "Сказочная история о Щелкунчике и путешествии в волшебный мир.", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        show.printActors();
        System.out.println();

        opera.printActors();
        System.out.println();

        ballet.printActors();
        System.out.println();

        show.replaceActor(actor3, "Смирнова");
        show.printActors();
        System.out.println();

        opera.replaceActor(actor1, "Кузнецов");
        System.out.println();

        opera.printLibretto();
        System.out.println();

        ballet.printLibretto();
    }
}