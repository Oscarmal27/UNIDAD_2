package sample.Configs;

import java.util.regex.Pattern;

public class Configs {
    public static final String[] KEYWORDS = new String[] {
            "Apio", "Perejil", "Zanahoria", "Berenjena", "Patata", "Pimiento", "Tomate", "Acelga", "Espinaca", "Remolacha",
            "Ajo", "Cebolla", "Esparrago", "Puerro", "Lechuga", "Perejil", "Champiñon", "Maiz", "Guisante", "Haba", "Judia verde",
            "Calabacin", "Calabaza", "Pepino", "Alcachofa", "Brocoli", "Col", "Coliflor", "Rabano", "Almendra", "Avellana",
            "Cacahuate", "Nuez", "Pistacho", "Albaricoque", "Cereza", "Ciruela", "Higo", "Manzana", "Pera", "Uva", "Aguacate",
            "Coco", "Kiwi", "Mango", "Papaya", "Piña", "Platano", "Melon", "Sandia", "Limon", "Mandarina", "Naranja", "Arandano",
            "Frambuesa", "Fresa", "Grosella", "Zarzamora", "Gramos", "Gramo", "Kilogramos", "Kilogramo", "Rebanada", "Rebanadas",
            "Gajo", "Gajos", "Diente", "Dientes", "Manojo", "Manojos", "Pieza", "y", "e", "de", "crear", "lista", ":","medio",
            "media","Medio", "Media", "print", "declarar", "llevar", "comprar", "vaciar", "carrito", "partir", "comer", "oler",
            "golpear", "mostrar", "la", "el"
    };

    public static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    public static final String PAREN_PATTERN = "\\(|\\)";
    public static final String BRACE_PATTERN = "\\{|\\}";
    public static final String BRACKET_PATTERN = "\\[|\\]";
    public static final String SEMICOLON_PATTERN = "\\;";
    public static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    public static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";

    public static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
                    + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );
    public static final String sampleCode = String.join("\n", new String[] {
            "print(10)",
            "declarar x como Apio",
            //"crear lista: x, x y x",
            "llevar(x)",
            "comprar(x)",
            "partir(x)",
            "oler(x)",
            "comer(x)",
            "golpear(x)",
            //"vaciar(x) en la bolsa",



    });
    public static String []expresiones={
        "print[(][A-Za-z0-9]{1,}[)]",
        "declarar [A-Za-z]{1,} como (Apio|Perejil)",
        //"[crear lista:]([A-Za-z]{1,})[, ]([A-Za-z]{1,})[ y ]([A-Za-z]{1,})",
        "llevar[(][A-Z0-9a-z]{1,}[)]",
        "comprar[(][A-Z0-9a-z]{1,}[)]",
        "partir[(][A-Z0-9a-z]{1,}[)]",
        "oler[(][A-Z0-9a-z]{1,}[)]",
        "comer[(][0-9A-Za-z]{1,}[)]",
        "golpear[(][A-Za-z]{1,}[)]",
        //"vaciar[(][0-9A-Za-z]{1,}[)][ en ]([la bolsa]|[el carrito])"
    };

}
