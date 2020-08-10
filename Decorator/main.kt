fun main() {
    val b1: Display = StringDisplay("Hello World!");
    val b2: Display = SideBorder(b1, '#');
    val b3: Display = FullBorder(b2);
    b1.show();
    b2.show();
    b3.show();

    val b4: Display =
        SideBorder(
            FullBorder(
                FullBorder(
                    SideBorder(
                        FullBorder(
                            StringDisplay("Good Morning!")
                        ),
                        '*'
                    )
                )
            ),
            '/'
        );
    b4.show();

    // UpBottomBorder
    val b12_1_1 = UpBottomBorder(b1, '~');
    b12_1_1.show();
    val b12_1_2 =
        SideBorder(
            UpBottomBorder(
                FullBorder(
                    SideBorder(
                        UpBottomBorder(
                            StringDisplay("Good Morning!"),
                            '@'
                        ),
                        '*'
                    )
                ),
                '\\'
            ),
            '/'
        );
    b12_1_2.show();

    // MultiDisplay
    val b12_2 = MultiDisplay();
    b12_2.add("Good Morning!");
    b12_2.add("Hello");
    b12_2.add("Good Night zzzzz");
    b12_2.show();
    FullBorder(b12_2).show();
    SideBorder(b12_2, '_').show();

}