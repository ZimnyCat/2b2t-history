# -*- coding: utf-8 -*-

from random import randrange

_things = ["popbob", "Pyrobyte", "xcc2", "chezhead", "ITristan", "Fit", "Jared2013", "policemike55", "Hausemaster",
           "TheCampingRusher", "georgebush420", "Jacktherippa", "Valkyria", "Facepunch Republic", "Team Rusher",
           "Team Veteran", "The Book Club", "TeamNoTrees", "Emperium", "Vortex Coalition", "NFE", "The Lands",
           "Ziggy Base", "Space Valkyria", "Asgard II", "Mu Megabase", "Hitlerwood", "Plugin Town", "2b2t", "Impact",
           "KAMI Blue", "Future", "Phobos", "Pyro", "RusherHack", "SalHack", "Wurst", "BarrenDome", "AntVenom",
           "TheJudgeHolden", "The Valley of Wheat"]

_actions = ["%1 ипользован как %2 на 2b2t", "Вся правда о %1 на 2b2t", "%1 выжил 24 часа на %2",
            "Война %1 против %2 на 2b2t", "Как %1 выжил 5 лет на %2", "Как %1 защищает %2 на 2b2t",
            "%1 пытался УБИТЬ %2 на 2b2t", "Как %1 уничтожил %2", "%1 на %2 на самом деле работает?",
            "Файл мира %1 повреждается", "%1 перестроен в секрете", "Великий %1 на 2b2t (14,000 %2)",
            "Как %1 защащиет историю на 2b2t", "\"Бесполезный\" %1, который на самом деле безумен",
            "%1 и %2 были взломаны", "Как %1 стал БЕСПОЛЕЗНЫМ на 2b2t"]


def gen():
    return _actions[randrange(1, len(_actions), 1)].replace("%1", _things[_rand()]).replace("%2", _things[_rand()])


def _rand():
    return randrange(0, len(_things), 1)
