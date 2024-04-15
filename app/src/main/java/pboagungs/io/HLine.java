package pboagungs.io;

public class HLine {
    private int width;

    public HLine(int width) {
        this.width = width;
    }

    public void draw() {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < width; i++) {
            line.append("=");
        }

        System.out.println("+" + line + "+");
    }
}
