package utills.enums;

public enum EMainScrollBarSize {
    BROKER(14);

    private int size;

    EMainScrollBarSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
