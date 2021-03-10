import java.util.Random;

public class Generator {
    static Random random = new Random();
    private static final String[] things = { "popbob", "Pyrobyte", "xcc2", "chezhead", "ITristan", "Fit", "Jared2013", "policemike55", "Hausemaster",
            "TheCampingRusher", "georgebush420", "Jacktherippa", "Valkyria", "Facepunch Republic", "Team Rusher",
            "Team Veteran", "The Book Club", "TeamNoTrees", "Emperium", "Vortex Coalition", "NFE", "The Lands",
            "Ziggy Base", "Space Valkyria", "Asgard II", "Mu Megabase", "Hitlerwood", "Plugin Town", "2b2t", "Impact",
            "KAMI Blue", "Future", "Phobos", "Pyro", "RusherHack", "SalHack", "Wurst", "BarrenDome", "AntVenom",
            "TheJudgeHolden", "The Valley of Wheat", "1.12", "1.13", "1.14", "1.15", "1.16", "1.17" };
    private static final String[] actions = { "%1 %v как %2 на 2b2t", "Вся правда о %1 на 2b2t", "%1 %v 24 часа на %2",
            "Война %1 против %2 на 2b2t", "Как %1 %v 5 лет на %2", "Как %1 %v %2 на 2b2t",
            "%1 пытался УБИТЬ %2 на 2b2t", "Как %1 %v %2", "%1 на %2 на самом деле %v?",
            "%1 %v ВОЙНУ на 2b2t", "%1 %v в секрете", "Великий %1 на 2b2t",
            "Как %1 %v историю на 2b2t", "\"Бесполезный\" %1, который на самом деле безумен",
            "%1 и %2 были взломаны", "Как %1 стал БЕСПОЛЕЗНЫМ на 2b2t", "БИТВА НА 2B2T: %1 VS. %2",
            "Обновление %1 %v %2 навсегда", "Загадка \"запрещённого\" %1 на 2b2t", "Сможет ли %1 пережить %2",
            "\"Бесполезный\" %1, который на самом деле %2", "%1 использован как оружие на 2b2t",
            "Как %1 %v историю 2b2t", "Обновление 2b2t %v %1 навсегда", "%1 %v ВОЙНУ на %2",
            "Как я %v мой собственный %1 на 2b2t", "Как %1 СЛОМАН на 2b2t", "Как найти %1 на 2b2t",
            "2b2t - эксплоит с %1", "2b2t - текущее состояние %1" };
    private static final String[] verbs = { "использовал", "уничтожил", "взломал", "придумал", "нашёл", "создаёт", "делает", "уничтожает",
            "перестраивает", "защищает", "находит", "использует", "объявляет", "изменит", "выжил", "перестроен" };

    public static String Gen() {
        return actions[random.nextInt(actions.length)].replace("%1", things[random.nextInt(things.length)]).replace("%2", things[random.nextInt(things.length)]).replace("%v", verbs[random.nextInt(verbs.length)]);
    }
}
