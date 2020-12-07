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
            "Gajo", "Gajos", "Diente", "Dientes", "Manojo", "Manojos", "Pieza", "y", "e", "de", "Crear", "lista", ":","medio",
            "media","Medio", "Media"
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
            "Crear lista:",
            "1 Coco",
            "Media Lechuga",
            "18 Melones",
            "1 Kilogramo de Tomates",
            "9 y medio Kilogramos de Cebolla",
            "700 Gramos de Almendra",
            "15 Rebanadas de Melon",
            "1 Gajo de Naranja",//jaja la neta lo reconozco, se escucha muy loco
            "15 Dientes de Ajo",
            "36 Manojos de Apio",
            "62 Piezas de Maiz"
    });
    public static String []expresiones={
        "Crear lista:",
        "^1 ([A-Z]{1})([a-z]{1,})",
        "^(Medio|Media) ([A-Z]{1})([a-z]{1,})",
        "^([0-9]{1,}) ([A-Z]{1})([a-z]{1,})[s]$",
        "^([0-9]{1,}) (Kilogramo|Kilogramos) de ([A-Z]{1})([a-z]{1,})[s]$",
        "^([0-9]{1,}) y medio (Kilogramo|Kilogramos) de ([A-Z]{1})([a-z]{1,})",
        "^([0-9]{1,}) (Gramo|Gramos) de ([A-Z]{1})([a-z]{1,})",
        "^([0-9]{1,}) (Rebana|Rebanadas) de ([A-Z]{1})([a-z]{1,})",
        "^([0-9]{1,}) (Gajo|Gajos) de ([A-Z]{1})([a-z]{1,})",
        "^([0-9]{1,}) (Diente|Dientes) de Ajo",
        "^([0-9]{1,}) (Manojo|Manojos) de ([A-Z]{1})([a-z]{1,})",
        "^([0-9]{1,}) (Pieza|Piezas) de ([A-Z]{1})([a-z]{1,})",
    };

}
