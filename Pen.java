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

    public void write(Paper paper, String message) throws OutOfInkException, OutOfSpaceException
    {
        if ( this.symbols == 0 ) {
            throw new OutOfInkException();
        }
        if ( message.length() > this.symbols ) {
            paper.addContent(message.substring(0, this.symbols));
            this.symbols = 0;
            throw new OutOfInkException();
        }
        paper.addContent(message);
        this.symbols -= message.length();
    }

    public static void main(String[] args) throws OutOfInkException, OutOfSpaceException
    {
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