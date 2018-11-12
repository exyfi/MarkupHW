package markup;

import java.util.List;

public class Strong extends Paragraph {
    public Strong(List<Markup> strs) {
        super(strs);
    }

    public void toMarkdown(StringBuilder sb) {
        sb.append("__");
        super.toMarkdown(sb);
        sb.append("__");
    }

    public void toTex(StringBuilder sb) {
        sb.append("\\textbf{");
        super.toTex(sb);
        sb.append("}");
    }
}
