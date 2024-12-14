public class Paper {
    private int maxSymbols;
    private StringBuilder content;

    public Paper(int maxSymbols) {
        this.maxSymbols = maxSymbols;
        this.content = new StringBuilder();
    }

    public Paper() {
        this(1024);
    }

    public String toString() {
        StringBuilder out = new StringBuilder();

        out.append("Paper (");
        out.append(this.content.length());
        out.append("/");
        out.append(this.maxSymbols);
        out.append(")");

        return out.toString();
    }

    public void addContent(String message) {
        this.content.append(message);
    }

    public void show() {
        System.out.println(this.content);
    }

    public static void main(String[] args) {
        Paper paper = new Paper();

        System.out.println(paper);
        paper.addContent("Hello, paper!");
        System.out.println(paper);
    } 
}
