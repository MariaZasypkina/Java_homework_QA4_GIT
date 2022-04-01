public class HW6_1_kata_7kyu_BuildingBlocks {
    private int width;
    private int length;
    private int height;
    private int volume;
    private int surfaceArea;

    public Block(int [] dimentions) {
        width = dimentions[0];
        length = dimentions[1];
        height = dimentions[2];
        volume = dimentions[0] * dimentions[1] * dimentions[2];
        surfaceArea = 2 * (dimentions[2] * dimentions[1] + dimentions[0] * dimentions[2] + dimentions[0] * dimentions[1]);
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }
    public int getVolume() {
        return volume;
    }
    public int getSurfaceArea() {
        return surfaceArea;
    }


}
