state("newNode_13") {
    activators {
        regex("старт|начать|меню|.*")
    }
    reactions {
        say("Добро пожаловать в Северные Деликатесы!\nВыберите категорию товара.")
        buttons(
            "Рыба слабосолёная филе" to "/newNode_fish"
        )
    }
}

state("newNode_fish") {
    activators {
        regex(".*")
    }
    reactions {
        say("Выберите товар:")
        buttons(
            "Чир филе" to "/newNode_chir",
            "Нельма филе" to "/newNode_nelma",
            "Вернуться в меню" to "/newNode_13"
        )
    }
}

state("newNode_chir") {
    activators { regex(".*") }
    reactions {
        image("https://raw.githubusercontent.com/kamushken/imgtest/master/chir.jpg")
        say("Чир филе слабосолёный\nДеликатесное слабосолёное филе северного Чира.")
        buttons(
            "Заказать" to "/newNode_order_chir",
            "Назад" to "/newNode_fish",
            "В меню" to "/newNode_13"
        )
    }
}

state("newNode_nelma") {
    activators { regex(".*") }
    reactions {
        image("https://raw.githubusercontent.com/kamushken/imgtest/master/nelma.jpg")
        say("Нельма филе слабосолёная\nПремиальное филе Нельмы слабой соли.")
        buttons(
            "Выбрать количество" to "/newNode_nelma_qty",
            "Назад" to "/newNode_fish",
            "В меню" to "/newNode_13"
        )
    }
}

state("newNode_nelma_qty") {
    activators { regex(".*") }
    reactions {
        say("Выберите количество:")
        buttons(
            "1 шт" to "/newNode_order_nelma_1",
            "2 шт" to "/newNode_order_nelma_2",
            "3 шт" to "/newNode_order_nelma_3",
            "4 шт" to "/newNode_order_nelma_4",
            "Назад" to "/newNode_nelma",
            "В меню" to "/newNode_13"
        )
    }
}

state("newNode_order_chir") {
    activators { regex(".*") }
    reactions {
        say("Ваш заказ: Чир филе. Мы скоро свяжемся с вами!")
        go("/newNode_13")
    }
}

state("newNode_order_nelma_1") {
    activators { regex(".*") }
    reactions {
        say("Ваш заказ: Нельма — 1 шт. Мы скоро свяжемся с вами!")
        go("/newNode_13")
    }
}

state("newNode_order_nelma_2") {
    activators { regex(".*") }
    reactions {
        say("Ваш заказ: Нельма — 2 шт. Мы скоро свяжемся с вами!")
        go("/newNode_13")
    }
}

state("newNode_order_nelma_3") {
    activators { regex(".*") }
    reactions {
        say("Ваш заказ: Нельма — 3 шт. Мы скоро свяжемся с вами!")
        go("/newNode_13")
    }
}

state("newNode_order_nelma_4") {
    activators { regex(".*") }
    reactions {
        say("Ваш заказ: Нельма — 4 шт. Мы скоро свяжемся с вами!")
        go("/newNode_13")
    }
}
