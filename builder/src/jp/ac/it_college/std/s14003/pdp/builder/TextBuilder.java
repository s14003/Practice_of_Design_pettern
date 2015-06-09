package jp.ac.it_college.std.s14003.pdp.builder;

/**
 * Created by s14003 on 15/06/09.
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public Builder makeTitle(String title) {
        buffer.append("===================================\n")
                .append('『')
                .append(title)
                .append('』')
                .append("\n\n");
        return this;
    }

    @Override
    public Builder makeString(String str) {
        buffer.append('■')
                .append(str)
                .append("\n\n");
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        for (String item : items) {
            buffer.append(" ・")
                    .append(item)
                    .append("\n");
        }
        buffer.append("\n");
        return this;
    }

    @Override
    public void close() {
        buffer.append("===================================\n");

    }

    public String getResult() {
        return buffer.toString();
    }
}
