package markup;

import java.util.List;

public class Emphasis extends Paragraph {
    public Emphasis(List<Markup> strs) {
        super(strs);
    }

    public void toMarkdown(StringBuilder sb) {
        sb.append("*");
        super.toMarkdown(sb);
        sb.append("*");
    }

    public void toTex(StringBuilder sb) {
        sb.append("\\emph{");
        super.toTex(sb);
        sb.append("}");
    }
}
