public class TerningSpil {
    public static void main(String[] args) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();
       while(true){
        terning2.roll();
        terning1.roll();
        System.out.println(terning1.fåFaceValue());
        System.out.println(terning2.fåFaceValue());


        if (terning1.fåFaceValue() == 1 && terning2.fåFaceValue() == 1){

            System.out.println("Snake eyes!");
            break;
        }


    }}}