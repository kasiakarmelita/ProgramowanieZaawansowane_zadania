package task8;

public class Parcel {
    private int xLenght;
    private int yLenght;
    private int zLenght;
    private float weight;
    private boolean isExpress;


    public Parcel(int xLenght, int yLenght, int zLenght, float weight, boolean isExpress) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        this.zLenght = zLenght;
        this.weight = weight;
        this.isExpress = isExpress;
    }








    public int getxLenght() {
        return xLenght;
    }

    public void setxLenght(int xLenght) {
        this.xLenght = xLenght;
    }

    public int getyLenght() {
        return yLenght;
    }

    public void setyLenght(int yLenght) {
        this.yLenght = yLenght;
    }

    public int getzLenght() {
        return zLenght;
    }

    public void setzLenght(int zLenght) {
        this.zLenght = zLenght;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }


}
