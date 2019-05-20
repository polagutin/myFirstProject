package lesson13;

public class Table {
    private int height;
    private int length;
    private int widht;

    public Table() {
    }

    public Table(int height, int length, int widht) {
        this.height = height;
        this.length = length;
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table)) return false;

        Table table = (Table) o;

        if (getHeight() != table.getHeight()) return false;
        if (getLength() != table.getLength()) return false;
        return getWidht() == table.getWidht();
    }

    @Override
    public int hashCode() {
        int result = getHeight();
        result = 31 * result + getLength();
        result = 31 * result + getWidht();
        return result;
    }

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", length=" + length +
                ", widht=" + widht +
                '}';
    }
}
