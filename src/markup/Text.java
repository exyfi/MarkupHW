package markup;

public class Text extends Markup {
    private String str;

    public Text(String str) {
        this.str = str;
    }

    public void toMarkdown(StringBuilder sb) {
        sb.append(str);
    }

    public void toTex(StringBuilder sb) {
        sb.append(str);
    }
}
