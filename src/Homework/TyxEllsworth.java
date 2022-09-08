package Homework;

class TyxEllsworth {
    public static void main(String[] args) {
        String line1 = "换行符号是\n";
        String line2 = "双引号是\"";
        String quote = line1 + line2;
        String title = "Interface Implementation Tool";
        String speaker = "Custom document types.";
        String text = "Bean properties Tool.";
        System.out.println(quote);
        System.out.println('\u0C00' + title + '\u0C00');
        System.out.println("\t" + speaker);
        System.out.println("\t" + text);
    }
}
