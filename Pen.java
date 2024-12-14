public class Pen {
    private int symbols;
    private int maxSymbols;

    public Pen(int maxSymbols) {
        this.symbols = maxSymbols;
        this.maxSymbols = maxSymbols;
    }

    public Pen() {
        this(4096);
    }

    public String toString() {
        StringBuilder out = new StringBuilder();

        out.append("Pen: (");
        out.append(this.symbols);
        out.append("/");
        out.append(this.maxSymbols);
        out.append(")");

        return out.toString();
    }

    public void write(Paper paper, String message) {
        paper.addContent(message);
        this.symbols -= message.length();
    }

    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        System.out.println(pen);
        System.out.println(paper);

        pen.write(paper, "Hello, world!");
        paper.show();

        System.out.println(pen);
        System.out.println(paper);
    }
}