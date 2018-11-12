package markup;

import java.util.List;

public class Paragraph extends Markup {
    private List<Markup> strs;

    public Paragraph(List<Markup> strs) {
        this.strs = strs;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        for (Markup item : strs) {
            item.toMarkdown(sb);
        }
    }

    @Override
    public void toTex(StringBuilder sb) {
        for (Markup item : strs) {
            item.toTex(sb);
        }
    }
}
