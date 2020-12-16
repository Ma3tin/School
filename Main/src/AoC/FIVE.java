package AoC;

public class FIVE {
    public static void main(String[] args) {
        String input = "FFBBFFFLLL\n" +
                "BFBFBFBLLR\n" +
                "BFFBBBBRRR\n" +
                "FBFBFFFLLL\n" +
                "FFFBFBBRRL\n" +
                "FBBFFBBLLR\n" +
                "FBBBFBFRRR\n" +
                "FBFBBFFLLL\n" +
                "FBFBFBFRRR\n" +
                "FFBFFFFLRL\n" +
                "FBFBFBBLRL\n" +
                "FBFFFBBLLR\n" +
                "FBBBBBFLLL\n" +
                "BBFBFFFLLL\n" +
                "FBBBBFBLRL\n" +
                "FBBBBFBRRR\n" +
                "FBFFBBBLLL\n" +
                "FBFFFFFLLR\n" +
                "BFBFFFFRRL\n" +
                "BFFFBBBLRL\n" +
                "FBBBBFBRLL\n" +
                "BFBFBBBRLR\n" +
                "BFBBFFFLRR\n" +
                "BBFFFFBRRR\n" +
                "FFBFBBFRRR\n" +
                "FFBFBFBLRR\n" +
                "BBFBBFBRRL\n" +
                "BBFBFBFLRR\n" +
                "FBBBBFFLRR\n" +
                "BFBFBBBLRL\n" +
                "BFBFFFFRLL\n" +
                "BBFFFBFRLR\n" +
                "BBFFFBBLRR\n" +
                "FBFBBBFRRL\n" +
                "BFBFBBFLRL\n" +
                "BBFFBBBRLL\n" +
                "BBFFBBBLRL\n" +
                "FBFFFFFRLR\n" +
                "FBFBFBFRRL\n" +
                "FBBFBFBLLR\n" +
                "BFBBFFBLLL\n" +
                "BFFFFBFRLR\n" +
                "FBBFFFFLRR\n" +
                "FFFBBFBRRR\n" +
                "FBFFBFFLRR\n" +
                "FFBBFBBLLR\n" +
                "FBFBBFBLLR\n" +
                "BFFBBFBRLR\n" +
                "FFBBBBBRRR\n" +
                "FBFFBBFRLL\n" +
                "BFFFBFFRLL\n" +
                "BBFFBFBLRR\n" +
                "BFFFBFBRLR\n" +
                "BFFBBBFRLR\n" +
                "BBFBFBFRLL\n" +
                "BFFFBFFRLR\n" +
                "FBFFFBFRLL\n" +
                "BBFBFFBRLR\n" +
                "BBFFBFBLRL\n" +
                "FBBBBBFLLR\n" +
                "FBBBFFBRLR\n" +
                "FFFBBBFRRL\n" +
                "BFBFBBBRRR\n" +
                "BBFBFBBLRL\n" +
                "FBFBBBFLRR\n" +
                "FBFBBFBLLL\n" +
                "FFBBFBFLLR\n" +
                "BFBFBBFRLR\n" +
                "FFBFBBBRRR\n" +
                "FFBFBFFRRR\n" +
                "BFBBFFFRRL\n" +
                "BFFBBBBRLR\n" +
                "BFFBFFFLRR\n" +
                "FBBFBFBLLL\n" +
                "FBFFBBBLRL\n" +
                "BFBBBBBLRR\n" +
                "BBFBFFFRRL\n" +
                "BFBFFFFLRL\n" +
                "BBFFBBFRLL\n" +
                "FBFBFFBLRR\n" +
                "BFBFBBFRLL\n" +
                "BBFFFBFLLR\n" +
                "BFBFBFFLRL\n" +
                "BFBFBFBLRR\n" +
                "BFFFFFFRRR\n" +
                "FFFBFBFRLR\n" +
                "BFFFFFBRLL\n" +
                "BFFFBFFLRL\n" +
                "BBFFBFFLRL\n" +
                "FFBBBFFLLL\n" +
                "FFFBFBBRLL\n" +
                "FBFFBBFLRR\n" +
                "BBFBFFFLRL\n" +
                "BBFBFFBRRR\n" +
                "FBFFFBFLRL\n" +
                "FFBFFBBRLR\n" +
                "FBBBFBBLRL\n" +
                "BFFFBBFRLR\n" +
                "BBFFBFBRLR\n" +
                "BFFFFBFRRL\n" +
                "FBFBBBBLLR\n" +
                "BFFBBFFLRL\n" +
                "FFBFFBFRLR\n" +
                "FBBFFFFLLL\n" +
                "FBFFBFFRLR\n" +
                "BFFBFBFLLL\n" +
                "BFFFBFFLLR\n" +
                "BFFBBFBLLR\n" +
                "FBBBBBBLRR\n" +
                "BFFFFBFRLL\n" +
                "BBFBBBFRLR\n" +
                "FFBBFFFRRL\n" +
                "FBBFFFBRRL\n" +
                "FBBFFBBRLR\n" +
                "BBFBFBBLLR\n" +
                "BBFFFBFRRL\n" +
                "BFFFBBFRRL\n" +
                "FBFBBBFLLL\n" +
                "BBFFFBFRRR\n" +
                "FBFBBFFRLR\n" +
                "BBFFFFFLRR\n" +
                "FFBFFFBRRR\n" +
                "BFBFBBFRRL\n" +
                "FBBFFBBLLL\n" +
                "FFFBBFBLRL\n" +
                "FBBFBBFLRR\n" +
                "FBBFBFBLRR\n" +
                "FBFFFBBRRR\n" +
                "BBFFBBFLRL\n" +
                "FBBFFBFLRR\n" +
                "BBFBBFFLRR\n" +
                "BFFFFFFLRL\n" +
                "FBFBFFFLLR\n" +
                "FBBFFFFRRR\n" +
                "BFBBFFBLRR\n" +
                "FFBFFFFLLR\n" +
                "FFBFBFFLRR\n" +
                "BBFFFBFLRR\n" +
                "FBBFBBBRLR\n" +
                "FBBFBFBRRR\n" +
                "FBFFBBFLLR\n" +
                "FFFBBFBRLR\n" +
                "BFFBBFFRRR\n" +
                "BFBFFBBLLR\n" +
                "BFFBBFFRLL\n" +
                "FBBFBFBLRL\n" +
                "BBFFBBFRLR\n" +
                "BFFBFBBLLL\n" +
                "FBBBBBBRRL\n" +
                "BBFFBFFLLL\n" +
                "FBFBFFFRRL\n" +
                "FBBBBFBRLR\n" +
                "FBBFFBBLRL\n" +
                "FBBFFFBRLR\n" +
                "FBFBFBFLRR\n" +
                "BFFFBBBRRL\n" +
                "FBFBBBFRLR\n" +
                "BFFBBFFRRL\n" +
                "FFFBFBBLRL\n" +
                "FBBFBBFRRL\n" +
                "FFBBBBFRRL\n" +
                "FFBBBFBLLL\n" +
                "FBFBBBFLRL\n" +
                "FBBFFBFLLL\n" +
                "FFBFFBFLLL\n" +
                "BBFBBFFRLL\n" +
                "FBBFBBBLRR\n" +
                "BFBBBFFRRR\n" +
                "BBFFBBFRRL\n" +
                "BFFBFFFLLR\n" +
                "BBFBBBBLRL\n" +
                "FFBBFBBLRR\n" +
                "BFFFFFFRLL\n" +
                "FBBFBFFLRL\n" +
                "BBFFFFBLRL\n" +
                "BFBFFFBRLL\n" +
                "FFBBBFBRRL\n" +
                "BBFBFBBRLR\n" +
                "FBBBFFBLRR\n" +
                "BFBBBFFLLR\n" +
                "BFBBBBFRLL\n" +
                "BFBBBFFLRL\n" +
                "FBFBFFBLLR\n" +
                "FFBFBBBLLR\n" +
                "BFBBFFFLLR\n" +
                "FBFFBBFRLR\n" +
                "FFBBFBFRRL\n" +
                "BFFBFFFRRL\n" +
                "BBFBFBBRRR\n" +
                "BFFBFFFRLR\n" +
                "BFFFBFFLLL\n" +
                "FBBBFBFLRR\n" +
                "FBFFFFFLLL\n" +
                "FBBBFFFLRL\n" +
                "BBFFBBBRLR\n" +
                "BBFFBFFRRL\n" +
                "FFBFFFBLLL\n" +
                "FFBBFFBRLR\n" +
                "FFBBBFFRRR\n" +
                "BFBBFBBLRR\n" +
                "BFBBBBFLLR\n" +
                "BFFFBFBRLL\n" +
                "FBBBBFFRRL\n" +
                "BFFBBBFLRL\n" +
                "BFFFFFFLLR\n" +
                "FFBBBBFLRL\n" +
                "BFBFBBBLLR\n" +
                "BBFFFFFRLR\n" +
                "FBBFBBFLLR\n" +
                "FFBBBBFLRR\n" +
                "BFFBFFBRRL\n" +
                "BFFFBBFLRL\n" +
                "FBBBFFFLRR\n" +
                "FBBFFBBRLL\n" +
                "FBFBFBBLRR\n" +
                "FFBBFFBLLL\n" +
                "FFBFBBFRRL\n" +
                "BFBBFFBRRL\n" +
                "BFBFFBBRRL\n" +
                "FFFBBFFLLL\n" +
                "FFFBFBBLRR\n" +
                "BFBBFBFLLL\n" +
                "BFFFBBBLRR\n" +
                "FBFBFFFRLL\n" +
                "FBBBFBFLRL\n" +
                "BFBFBFBRRL\n" +
                "FBFBBFFRLL\n" +
                "FBBBFBBRLR\n" +
                "FBFFBFBLLR\n" +
                "FFBFBFFLLR\n" +
                "BFFFBFBLLR\n" +
                "FFFBBBFLRL\n" +
                "BFFBFBFLRL\n" +
                "BFFBFBBRRL\n" +
                "FFBBBBBLRR\n" +
                "FBBBFBFRLR\n" +
                "BBFBBFFRLR\n" +
                "BFBFBFBLLL\n" +
                "BFBFFFBRRL\n" +
                "FFBBBBBRRL\n" +
                "BBFFFBBRLR\n" +
                "FBBBBFFLLL\n" +
                "FFBBFBFLRL\n" +
                "BFBFFBFLRR\n" +
                "BFBBBFBLRR\n" +
                "BFBBBBFLRR\n" +
                "FFFBFBBRRR\n" +
                "BBFBBFBRRR\n" +
                "FFFBBBFLRR\n" +
                "FBBFFFBLLR\n" +
                "BFFBFBBRRR\n" +
                "FFFBBBBLLL\n" +
                "FFFBBFBLLR\n" +
                "BFBBBFFRLL\n" +
                "FBBBFFFRRL\n" +
                "FFBFFFFRRR\n" +
                "BBFFFFBLLL\n" +
                "FBFFFFFLRR\n" +
                "BBFFBBFLRR\n" +
                "FFFBBBFRRR\n" +
                "BBFBBFBRLR\n" +
                "FBBFFBFLLR\n" +
                "FFBFBBFLLL\n" +
                "FFBBBFFLRR\n" +
                "FBBFFFBLRL\n" +
                "BFFFBFBRRL\n" +
                "FBBFFFFRRL\n" +
                "FFFBFBBLLR\n" +
                "FBBFFBFRLR\n" +
                "BFFBBBFLRR\n" +
                "FBFFBFFRRR\n" +
                "BFBFFBFRRR\n" +
                "BBFFBFFLLR\n" +
                "FFBBFBFLLL\n" +
                "BBFBBBFRRR\n" +
                "FBBBBFFRLL\n" +
                "BFBBBBFLRL\n" +
                "BBFBFFBLLL\n" +
                "FFBFBBFLLR\n" +
                "BBFFFFBLLR\n" +
                "BBFFFBBRRR\n" +
                "BFFFBFFRRL\n" +
                "FFBBFBBRLL\n" +
                "FBBBFBFLLR\n" +
                "BFBBFBFRRR\n" +
                "BBFBFFFRLR\n" +
                "FBFFFBBLRR\n" +
                "BBFFFFFRRL\n" +
                "FFBFFBBLLL\n" +
                "BFFBBFFLLR\n" +
                "FBFFFBFRLR\n" +
                "FBFFFBBLRL\n" +
                "BFBBBFBRLL\n" +
                "BFBFBFFRLL\n" +
                "BFBBFBFRLR\n" +
                "FBBFBBFRLL\n" +
                "FBBBBFBLRR\n" +
                "FBBBFBFRLL\n" +
                "BBFBFFFLLR\n" +
                "FBBFBBBRRL\n" +
                "FFBFBBFLRL\n" +
                "BFBBBBFRRL\n" +
                "BFFBBFFRLR\n" +
                "BFBBBFBRRL\n" +
                "FFBBFFBLRL\n" +
                "FFBBBFBLRL\n" +
                "FBBFBBBLLR\n" +
                "FFBFFFBRLL\n" +
                "BFFFFBBLRR\n" +
                "BFBBBBBRRL\n" +
                "BFFBBFBRRR\n" +
                "BFFBBBFLLR\n" +
                "BFBFBFFLLL\n" +
                "FBBBBBBRRR\n" +
                "BFBFBBFLLL\n" +
                "BFBBBFFRRL\n" +
                "BFBFBBFLLR\n" +
                "FBFBBBBRLL\n" +
                "FBFBFBBRLR\n" +
                "BBFBBFFLLR\n" +
                "BBFBBFBLRL\n" +
                "BBFFBBFLLR\n" +
                "BFBFFBBRLR\n" +
                "FFBFFFBRLR\n" +
                "FBBFBFFLLR\n" +
                "FBFBFBFLLR\n" +
                "FFBBBFBLLR\n" +
                "FFBBBFBRLR\n" +
                "BFFBFBFRLR\n" +
                "BBFFFBFRLL\n" +
                "FFFBFBBRLR\n" +
                "FFBFFFFRLL\n" +
                "BBFFFBBRRL\n" +
                "FBFFFFBRRR\n" +
                "BFBFBFFLRR\n" +
                "FBBFBFFRLR\n" +
                "BBFBBFBLLL\n" +
                "FBFFBBBRRL\n" +
                "FFBBBBBLLR\n" +
                "BBFBBBFLLR\n" +
                "FFBFBFFRRL\n" +
                "FBFFFBBRLR\n" +
                "FBFBBFBRLL\n" +
                "BBFFFFFLLL\n" +
                "FBBBBBFLRL\n" +
                "BBFBBBFLRR\n" +
                "FBBFBFFLLL\n" +
                "FFBFFFBLLR\n" +
                "BFFBBBFRRL\n" +
                "FFFBBBBLRL\n" +
                "FFBBFBFRLR\n" +
                "FBFFFBFRRL\n" +
                "FFBBFBBRLR\n" +
                "FBBFBFBRLR\n" +
                "FBBBFBBLRR\n" +
                "FBFFFFBRLR\n" +
                "BBFBBBFLLL\n" +
                "FBFFFFBLLR\n" +
                "FFFBBBFRLL\n" +
                "FFFBBFFRLR\n" +
                "BFBBBFBLLL\n" +
                "BBFBBFFLRL\n" +
                "BFBBFFBRLR\n" +
                "FFBFBBBRLL\n" +
                "BFFFFFFLLL\n" +
                "BFBBBFFLRR\n" +
                "BFBBFBFRRL\n" +
                "BFFFFFFLRR\n" +
                "BBFFBBFRRR\n" +
                "FFBBFBBLLL\n" +
                "BBFBBFBLRR\n" +
                "FBBBBBFRRL\n" +
                "FFFBBBBLLR\n" +
                "FFFBBBBRLR\n" +
                "BBFBFBBLLL\n" +
                "BBFBFBBRLL\n" +
                "FBFBBBFRLL\n" +
                "BFBFBFBRLR\n" +
                "BBFBFFFRRR\n" +
                "FFBBBBFLLR\n" +
                "BBFFBBBLRR\n" +
                "FBBFFBBRRL\n" +
                "FFFBBFFRLL\n" +
                "FBFBBFFLRL\n" +
                "BFFFFBBLLR\n" +
                "BFFBFFBRRR\n" +
                "BFBFFFBLLR\n" +
                "FFBBFFBRRL\n" +
                "FFFBBBFRLR\n" +
                "BFFFFFBLRR\n" +
                "BBFBBBFRRL\n" +
                "BFBFFFBLRL\n" +
                "FBBFBFBRLL\n" +
                "BFFBBBFRRR\n" +
                "FBBFFBBRRR\n" +
                "FBFBFBBLLL\n" +
                "FFBBBBFLLL\n" +
                "FFBFFBFLLR\n" +
                "BBFBBFFRRL\n" +
                "BFFBBBBLRR\n" +
                "FBFBFBFLRL\n" +
                "FBBFFFFRLR\n" +
                "BBFBFFBLRL\n" +
                "FFFBBFBLLL\n" +
                "FBBBFFFRLL\n" +
                "FBBBFBBRLL\n" +
                "FBBBFFBRRR\n" +
                "FBBBFFBLLL\n" +
                "BFBFFFFRRR\n" +
                "BFBBBBBLRL\n" +
                "FBFBBBBRLR\n" +
                "FBFBFFFLRR\n" +
                "BFBBBBBLLR\n" +
                "FFBFBFBLLR\n" +
                "BBFBBFFRRR\n" +
                "FFBBBBBRLL\n" +
                "BFFFFBBLRL\n" +
                "FFBBBFBRRR\n" +
                "FBFFFBFLLR\n" +
                "BBFFBFBLLL\n" +
                "FBBBBBBLLR\n" +
                "BBFBFBBRRL\n" +
                "BFFFFBFLLL\n" +
                "BFBFFFBRLR\n" +
                "FBBBBBFRLL\n" +
                "BFFFFFBRRR\n" +
                "BFBBFBFLRR\n" +
                "FBFBBBBLRR\n" +
                "FFBBFBFRLL\n" +
                "FBBFBBBLRL\n" +
                "BFBFBFFRLR\n" +
                "FBFBFFBLLL\n" +
                "BFBBFFFRLR\n" +
                "FBFBFBBRRL\n" +
                "FFBFFBFRRR\n" +
                "BFFBFBBLLR\n" +
                "BFBBFFBLRL\n" +
                "FBBFFFFLLR\n" +
                "BBFBFBFLRL\n" +
                "BFBBFBBRRL\n" +
                "BFBFBFFRRL\n" +
                "FBFBBFBLRL\n" +
                "BFBBFFBRLL\n" +
                "FFBFFBFRLL\n" +
                "FFBBFFFRLL\n" +
                "BBFFBBBRRR\n" +
                "FFBBBFFLLR\n" +
                "BBFFBFBLLR\n" +
                "FBFFBFFLLL\n" +
                "FBBFFFFRLL\n" +
                "BFBFFBFLLR\n" +
                "BBFFBFBRRL\n" +
                "BBFFFFBRRL\n" +
                "FFBFBFBLRL\n" +
                "FBFFFFBRRL\n" +
                "BBFFFFFLRL\n" +
                "BFFBFFBLLR\n" +
                "FFBFFFBLRL\n" +
                "BFBFBBFRRR\n" +
                "FBBBFFBRRL\n" +
                "FFBBFBBRRL\n" +
                "BFFBFFFLRL\n" +
                "BBFBFFFLRR\n" +
                "FFFBBFFRRR\n" +
                "BFFBFBFRRR\n" +
                "FBFFFBFLLL\n" +
                "FBFBBFFLRR\n" +
                "BFBFBFBRLL\n" +
                "FFBFFFFLRR\n" +
                "BFFFFFBLLR\n" +
                "FBFBBFFRRR\n" +
                "BFBBBBBLLL\n" +
                "FBFFFFBRLL\n" +
                "BFBBBFFLLL\n" +
                "FBBFFFBLRR\n" +
                "FFBFFFFRRL\n" +
                "BFFBBBBLLR\n" +
                "FBFFBBFRRL\n" +
                "FBBFBFBRRL\n" +
                "FBFBFFFRLR\n" +
                "BBFFFFFLLR\n" +
                "BFBBFFFLRL\n" +
                "FBBBFFBLLR\n" +
                "BFBBBFBRLR\n" +
                "FBBBBFBLLL\n" +
                "FBBBFBBRRR\n" +
                "BBFFBFFLRR\n" +
                "BFFFBBBLLR\n" +
                "FBBFFBFRLL\n" +
                "BBFBFFBLLR\n" +
                "BBFBFFFRLL\n" +
                "FFFBBBFLLL\n" +
                "FBFFFFBLLL\n" +
                "FBFBBFBLRR\n" +
                "FFBFBFBRRR\n" +
                "FBFFBBBRLR\n" +
                "BFFFFFBLRL\n" +
                "BBFFBFBRRR\n" +
                "BFFFFBFLRR\n" +
                "FFBBBBFRLR\n" +
                "FBFFBFBRRL\n" +
                "FBFFFFFLRL\n" +
                "FFBFFFBLRR\n" +
                "BFFBBFBLLL\n" +
                "FFBBFFBRRR\n" +
                "FFBBFBFLRR\n" +
                "BBFFBBFLLL\n" +
                "FBBBBBBRLL\n" +
                "FFBFFBFLRL\n" +
                "BBFFBFFRLR\n" +
                "BFFFBFBLRL\n" +
                "BFBBBBBRLL\n" +
                "BFBBFBFLLR\n" +
                "BBFFFFBRLL\n" +
                "FFFBBFFLLR\n" +
                "BFFBBBBRLL\n" +
                "FFBBFFFLLR\n" +
                "BBFBFBBLRR\n" +
                "FBFFFFFRLL\n" +
                "BBFBBBFLRL\n" +
                "BBFFBBBLLR\n" +
                "BFFFBFBRRR\n" +
                "FBFFFBBLLL\n" +
                "FBFBFBBRLL\n" +
                "FFBFBBFRLL\n" +
                "BFBBBBBRLR\n" +
                "BFBFFBBLRL\n" +
                "FFBBFBBLRL\n" +
                "BFBFFBFLRL\n" +
                "FBBFBFFLRR\n" +
                "BFBBFBFLRL\n" +
                "FBBFBBFLLL\n" +
                "FBFFFFBLRR\n" +
                "FBFBBFFRRL\n" +
                "FBFFBFFRLL\n" +
                "BBFBBBBLLR\n" +
                "BFBBFFBRRR\n" +
                "BBFFFBBLLR\n" +
                "FBFBFBBRRR\n" +
                "FBBFBBFLRL\n" +
                "BFFBBBBLRL\n" +
                "FBFFBBBRLL\n" +
                "FFBFFFFLLL\n" +
                "BBFBFBFRRL\n" +
                "BFBFBFBLRL\n" +
                "BBFFFBFLLL\n" +
                "FFFBBFFRRL\n" +
                "FFBFFBBLLR\n" +
                "BFBFFFFLRR\n" +
                "FFBFBBFRLR\n" +
                "FFBBFFBLLR\n" +
                "BFBFBFBRRR\n" +
                "FBBBFFFRLR\n" +
                "FBFBFFFRRR\n" +
                "FBFFBBBLRR\n" +
                "FBFFFBBRRL\n" +
                "BBFFFFFRRR\n" +
                "FFBFBFFLLL\n" +
                "FBBBBFFLRL\n" +
                "FBFBBBBRRL\n" +
                "FBFBBBBRRR\n" +
                "BFBBFBBRLR\n" +
                "FBFBFFBRLR\n" +
                "FBFFFFFRRL\n" +
                "FFBFBBBLLL\n" +
                "FBFFBBBRRR\n" +
                "FBBBFFBRLL\n" +
                "BFFBFBFRRL\n" +
                "FFFBBBFLLR\n" +
                "FBFFBFBRLR\n" +
                "FFBFBFBLLL\n" +
                "FBBFBFFRRL\n" +
                "FFBFFBBLRL\n" +
                "BFFBFBBLRR\n" +
                "BFFFFBFLLR\n" +
                "FBFFBFBLRL\n" +
                "BFBBFBBLLL\n" +
                "FFBFBFBRLL\n" +
                "BFFBBBFLLL\n" +
                "FBBBBBBRLR\n" +
                "FBBBBBBLLL\n" +
                "FFBFBBBRLR\n" +
                "BFFFBBFLRR\n" +
                "BFBBBFBLLR\n" +
                "FFFBFBFRRR\n" +
                "BFFFBBBRRR\n" +
                "FFBFFBBRLL\n" +
                "BFFBFBFLRR\n" +
                "FFBBBBFRLL\n" +
                "BFBBFFFRRR\n" +
                "FBBFBBFRRR\n" +
                "BFFBBBBLLL\n" +
                "FBFFBBFLRL\n" +
                "BBFBFFBRLL\n" +
                "BFFFBFFLRR\n" +
                "BFBBBBFRLR\n" +
                "BFFBFBFRLL\n" +
                "BFBFFBBLRR\n" +
                "BFFFBBBRLL\n" +
                "FBFBBBFLLR\n" +
                "BBFBFBFRLR\n" +
                "FFFBBFBRRL\n" +
                "BBFFBFFRRR\n" +
                "BFBFFFFLLL\n" +
                "FBBBFFFLLR\n" +
                "FBFBBBBLLL\n" +
                "BBFFFFFRLL\n" +
                "FBFFBFFLLR\n" +
                "BBFFBBBLLL\n" +
                "FFBBFBBRRR\n" +
                "BFBBBFBRRR\n" +
                "BFBBBBFRRR\n" +
                "FFFBFBBLLL\n" +
                "FBBFFBFLRL\n" +
                "BBFFBBBRRL\n" +
                "FBFBBBFRRR\n" +
                "BBFFFFBLRR\n" +
                "BFBBFBBRRR\n" +
                "BFFBFFBLRL\n" +
                "BFFFFFFRRL\n" +
                "BBFFFBBLLL\n" +
                "FBFFBFFLRL\n" +
                "FBFFFBFLRR\n" +
                "FBFBFBFLLL\n" +
                "BFFBBFBRRL\n" +
                "FBBFFFBLLL\n" +
                "BFBBBFBLRL\n" +
                "FBFBBFBRLR\n" +
                "FBBBFFFRRR\n" +
                "FFBFFBBRRR\n" +
                "FFBBFFBRLL\n" +
                "FFBFBBFLRR\n" +
                "BFFFBFBLLL\n" +
                "BFFFFBBRLL\n" +
                "FFBFBFFRLL\n" +
                "BFFBFBFLLR\n" +
                "FFBBBFFRRL\n" +
                "BFFBFFFRLL\n" +
                "BBFFBFBRLL\n" +
                "FFBBFBFRRR\n" +
                "BFBFBBFLRR\n" +
                "FBFBFFBLRL\n" +
                "FBBBBFBLLR\n" +
                "FFFBBFFLRR\n" +
                "FBFBFFBRRL\n" +
                "BFFFFBBRRR\n" +
                "FBBFBBFRLR\n" +
                "BFFBBBFRLL\n" +
                "BBFBBBBLLL\n" +
                "FFBBFFFRLR\n" +
                "BFBBBBBRRR\n" +
                "FBFFBFBRRR\n" +
                "FBFBBFBRRL\n" +
                "FBFFFFFRRR\n" +
                "BFFFFBFRRR\n" +
                "BFFBBFBLRR\n" +
                "FBBBFBFRRL\n" +
                "BBFFFBBLRL\n" +
                "BFBFFFBRRR\n" +
                "FFBBFFFLRL\n" +
                "FFBFBFBRLR\n" +
                "BFBFBBBRLL\n" +
                "FBBBFFBLRL\n" +
                "BFBFFBBLLL\n" +
                "FFBFFBFLRR\n" +
                "FFFBFBFRRL\n" +
                "FBBBBFFRRR\n" +
                "BBFFFFBRLR\n" +
                "FBFBFFBRLL\n" +
                "BFBBFBFRLL\n" +
                "BFFFFBBLLL\n" +
                "FBFFBFBLRR\n" +
                "BFFFFFFRLR\n" +
                "FBFBFBBLLR\n" +
                "FFBBBFFLRL\n" +
                "FFBFBBBRRL\n" +
                "FBBFBBBRLL\n" +
                "BFFBFFFLLL\n" +
                "FFBBFFBLRR\n" +
                "FBBBFBBLLL\n" +
                "FBBFBFFRLL\n" +
                "FBFBBFBRRR\n" +
                "BFFBBFBLRL\n" +
                "BFBFBFFRRR\n" +
                "FFBBBBBLLL\n" +
                "FFBFBFFLRL\n" +
                "FFBBBFBRLL\n" +
                "FBBBFBFLLL\n" +
                "FBBBBBFRRR\n" +
                "BFBFFBBRLL\n" +
                "FBBFFFBRLL\n" +
                "FFBBBFFRLL\n" +
                "FFBFFBBLRR\n" +
                "FBFFBFBRLL\n" +
                "BBFBFBFLLL\n" +
                "BFFFBFBLRR\n" +
                "FBBBBBFRLR\n" +
                "FFBBBBFRRR\n" +
                "BFFBFBBRLL\n" +
                "FFFBBFFLRL\n" +
                "BFBBFFBLLR\n" +
                "BFFFFBBRRL\n" +
                "FFBFFBBRRL\n" +
                "FBFFBFFRRL\n" +
                "FBBBBBBLRL\n" +
                "BFFFBBBLLL\n" +
                "BBFBFFBLRR\n" +
                "FBBFFFFLRL\n" +
                "FBBBBBFLRR\n" +
                "BBFBBFBLLR\n" +
                "BFFFFBFLRL\n" +
                "FBBBFBBLLR\n" +
                "BBFBFBFRRR\n" +
                "FFBBFFFRRR\n" +
                "BBFFFBFLRL\n" +
                "BFBFFFBLLL\n" +
                "FFBBBBBLRL\n" +
                "BBFBFBFLLR\n" +
                "BFBFBBBLRR\n" +
                "BFBBFFFLLL\n" +
                "BFFFFFBLLL\n" +
                "FBFFBBBLLR\n" +
                "BBFBBFFLLL\n" +
                "BFBBFFFRLL\n" +
                "BFBFFBFLLL\n" +
                "BFFBBFFLRR\n" +
                "FFBBBFFRLR\n" +
                "BFFFBBFLLR\n" +
                "BFFBFBBLRL\n" +
                "FFFBBBBRRL\n" +
                "BFFFBBFLLL\n" +
                "FBFBBFFLLR\n" +
                "FBFFBBFRRR\n" +
                "FBFBFBFRLL\n" +
                "BFBBFBBLRL\n" +
                "FFBBBBBRLR\n" +
                "FFBFBBBLRL\n" +
                "FFBFBBBLRR\n" +
                "BBFFBFFRLL\n" +
                "BFFFFBBRLR\n" +
                "FFBFFBFRRL\n" +
                "FBFFFBFRRR\n" +
                "FBBBBFBRRL\n" +
                "FBFFBFBLLL\n" +
                "BFBFFBFRRL\n" +
                "FFBFFFFRLR\n" +
                "BFBFBBBRRL\n" +
                "FFBBBFBLRR\n" +
                "BFFFFFBRLR\n" +
                "BFFBBFBRLL\n" +
                "BFFFBFFRRR\n" +
                "FBFFBBFLLL\n" +
                "BFFFBBBRLR\n" +
                "FBFBFFBRRR\n" +
                "FFFBBBBRLL\n" +
                "FBFBFBFRLR\n" +
                "BBFBBFBRLL\n" +
                "FBBBFFFLLL\n" +
                "BFFFFFBRRL\n" +
                "FBBFFBFRRR\n" +
                "FBFBBBBLRL\n" +
                "BFBFFFFLLR\n" +
                "BFFBFFBRLR\n" +
                "FFBFBFBRRL\n" +
                "BFBFBBBLLL\n" +
                "BFFFBBFRLL\n" +
                "BBFBFFBRRL\n" +
                "BFBFBFFLLR\n" +
                "FBFBFFFLRL\n" +
                "BFBBBBFLLL\n" +
                "FBBFFFBRRR\n" +
                "FBBBBFFRLR\n" +
                "BFFBFBBRLR\n" +
                "FFBBFFFLRR\n" +
                "FBBFBFFRRR\n" +
                "FBFFFFBLRL\n" +
                "FBBBFBBRRL\n" +
                "FBBFFBFRRL\n" +
                "FBBFFBBLRR\n" +
                "FFFBBFBLRR\n" +
                "FBFFFBBRLL\n" +
                "BFBFFBFRLR\n" +
                "FBBBBFFLLR\n" +
                "BFBBFBBLLR\n" +
                "FFBFFFBRRL\n" +
                "BFBFFBBRRR\n" +
                "BFBBBFFRLR\n" +
                "FBBFBBBLLL\n" +
                "BFFBFFBLRR\n" +
                "FFFBBBBRRR\n" +
                "FFFBBFBRLL\n" +
                "BFFBFFBLLL\n" +
                "BFFBFFBRLL\n" +
                "BFFBBFFLLL\n" +
                "FBBFBBBRRR\n" +
                "BFFBFFFRRR\n" +
                "BFFBBBBRRL\n" +
                "BBFBBBFRLL\n" +
                "BBFFFBBRLL\n" +
                "BFFFBBFRRR\n" +
                "FFBFBFFRLR\n" +
                "BFBFFFFRLR\n" +
                "BFBFFBFRLL\n" +
                "BFBBFBBRLL\n" +
                "FFFBBBBLRR";
        String[] row = input.split("\n");
        int max = 0;
        int id;
        boolean[] ids = new boolean[1024];

        for (int i = 0; i < ids.length; i++) {
            ids[i] = false;
        }
        for (int i = 0; i < row.length; i++) {
            id = getId(row[i]);
            if (max < id) max = id;
            ids[id] = true;
        }
        for (int i = 0; i < ids.length; i++) {
            if (!ids[i]) System.out.println(i);
        }
        System.out.println(max);
    }
    protected static int getColumn(String borderPass) {
        int row = 0;
        if (borderPass.charAt(0) == 'R') {
            row += 4;
        }
        if (borderPass.charAt(1) == 'R') {
            row += 2;
        }
        if (borderPass.charAt(2) == 'R') {
            row += 1;
        }
        return row;
    }

    protected static int getRow(String borderPass) {
        int row = 0;
        if (borderPass.charAt(0) == 'B') {
            row += 64;
        }
        if (borderPass.charAt(1) == 'B') {
            row += 32;
        }
        if (borderPass.charAt(2) == 'B') {
            row += 16;
        }
        if (borderPass.charAt(3) == 'B') {
            row += 8;
        }
        if (borderPass.charAt(4) == 'B') {
            row += 4;
        }
        if (borderPass.charAt(5) == 'B') {
            row += 2;
        }
        if (borderPass.charAt(6) == 'B') {
            row += 1;
        }
        return row;
    }

    protected static int getId(String borderPass) {
        String row = borderPass.substring(0 , 7);
        String column = borderPass.substring(7 , 10);
        int row1 = getRow(row);
        int column1 = getColumn(column);
        int id = row1 * 8 + column1;
        return id;
    }
}