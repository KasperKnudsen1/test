import java.util.Random;

public class Terning {
    int MAX = 6;
    int faceValue;
    Random terning;

    public Terning(){
        terning = new Random();
        roll();
    }

    void roll() {
        this.faceValue = terning.nextInt(MAX) + 1;

    }
    public int fåFaceValue(){
        return faceValue;
    }

    }



