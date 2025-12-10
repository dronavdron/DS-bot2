theme: /

state: newNode_13
    a: |
        Добро пожаловать в Северные Деликатесы! 
        Выберите категорию товара.
    inline_buttons:
        - ["Рыба слабосолёная филе", "/newNode_fish"]

state: newNode_fish
    a: |
        Выберите товар:
    inline_buttons:
        - ["Чир филе", "/newNode_chir"]
        - ["Нельма филе", "/newNode_nelma"]
        - ["Вернуться в меню", "/newNode_13"]

state: newNode_chir
    a: |
        Чир филе слабосолёный 
        Деликатесное слабосолёное филе северного Чира.
    image: https://raw.githubusercontent.com/kamushken/imgtest/master/chir.jpg
    inline_buttons:
        - ["Заказать", "/newNode_order_chir"]
        - ["Назад", "/newNode_fish"]
        - ["В меню", "/newNode_13"]

state: newNode_nelma
    a: |
        Нельма филе слабосолёная 
        Премиальное филе Нельмы слабой соли.
    image: https://raw.githubusercontent.com/kamushken/imgtest/master/nelma.jpg
    inline_buttons:
        - ["Выбрать количество", "/newNode_nelma_qty"]
        - ["Назад", "/newNode_fish"]
        - ["В меню", "/newNode_13"]

state: newNode_nelma_qty
    a: |
        Выберите количество:
    inline_buttons:
        - ["1 шт", "/newNode_order_nelma_1"]
        - ["2 шт", "/newNode_order_nelma_2"]
        - ["3 шт", "/newNode_order_nelma_3"]
        - ["4 шт", "/newNode_order_nelma_4"]
        - ["Назад", "/newNode_nelma"]
        - ["В меню", "/newNode_13"]

state: newNode_order_chir
    a: |
        Ваш заказ: Чир филе. Мы скоро свяжемся с вами!
    go!: /newNode_13

state: newNode_order_nelma_1
    a: |
        Ваш заказ: Нельма — 1 шт. Мы скоро свяжемся с вами!
    go!: /newNode_13

state: newNode_order_nelma_2
    a: |
        Ваш заказ: Нельма — 2 шт. Мы скоро свяжемся с вами!
    go!: /newNode_13

state: newNode_order_nelma_3
    a: |
        Ваш заказ: Нельма — 3 шт. Мы скоро свяжемся с вами!
    go!: /newNode_13

state: newNode_order_nelma_4
    a: |
        Ваш заказ: Нельма — 4 шт. Мы скоро свяжемся с вами!
    go!: /newNode_13
