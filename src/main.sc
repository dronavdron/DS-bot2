theme: /

state: newNode_13
    a: Добро пожаловать в Северные Деликатесы!\nВыберите категорию товара.
    buttons:
        "Рыба слабосолёная филе" -> {inline: true, goto: /newNode_fish}

state: newNode_fish
    a: Выберите товар:
    buttons:
        "Чир филе" -> {inline: true, goto: /newNode_chir}
        "Нельма филе" -> {inline: true, goto: /newNode_nelma}
        "Вернуться в меню" -> {inline: true, goto: /newNode_13}

state: newNode_chir
    a: Чир филе слабосолёный\nДеликатесное слабосолёное филе северного Чира.
    image: https://raw.githubusercontent.com/kamushken/imgtest/master/chir.jpg
    buttons:
        "Заказать" -> {inline: true, goto: /newNode_order_chir}
        "Назад" -> {inline: true, goto: /newNode_fish}
        "В меню" -> {inline: true, goto: /newNode_13}

state: newNode_nelma
    a: Нельма филе слабосолёная\nПремиальное филе Нельмы слабой соли.
    image: https://raw.githubusercontent.com/kamushken/imgtest/master/nelma.jpg
    buttons:
        "Выбрать количество" -> {inline: true, goto: /newNode_nelma_qty}
        "Назад" -> {inline: true, goto: /newNode_fish}
        "В меню" -> {inline: true, goto: /newNode_13}

state: newNode_nelma_qty
    a: Выберите количество:\n
    buttons:
        "1 шт" -> {inline: true, goto: /newNode_order_nelma_1}
        "2 шт" -> {inline: true, goto: /newNode_order_nelma_2}
        "3 шт" -> {inline: true, goto: /newNode_order_nelma_3}
        "4 шт" -> {inline: true, goto: /newNode_order_nelma_4}
        "Назад" -> {inline: true, goto: /newNode_nelma}
        "В меню" -> {inline: true, goto: /newNode_13}

state: newNode_order_chir
    a: Ваш заказ: Чир филе. Мы скоро свяжемся с вами!
    go!: /newNode_13

state: newNode_order_nelma_1
    a: Ваш заказ: Нельма — 1 шт. Мы скоро свяжемся с вами!
    go!: /newNode_13

state: newNode_order_nelma_2
    a: Ваш заказ: Нельма — 2 шт. Мы скоро свяжемся с вами!
    go!: /newNode_13

state: newNode_order_nelma_3
    a: Ваш заказ: Нельма — 3 шт. Мы скоро свяжемся с вами!
    go!: /newNode_13

state: newNode_order_nelma_4
    a: Ваш заказ: Нельма — 4 шт. Мы скоро свяжемся с вами!
    go!: /newNode_13
