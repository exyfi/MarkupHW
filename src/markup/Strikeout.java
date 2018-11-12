package markup;

import java.util.List;

public class Strikeout extends Paragraph {
    public Strikeout(List<Markup> strs) {
        super(strs);
    }

    public void toMarkdown(StringBuilder sb) {
        sb.append("~");
        super.toMarkdown(sb);
        sb.append("~");
    }

    public void toTex(StringBuilder sb) {
        sb.append("\\textst{");
        super.toTex(sb);
        sb.append("}");
    }
}
