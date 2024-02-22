    public class Billetaoutomat {
    private int pris;
    private int saldo;
    private int total;

    public Billetaoutomat(int billetpris){
        pris =  billetpris;
        saldo = 0;
        total = 0;

    }
    public int getPris(){
        return pris;
    }

    public int getSaldo() {
        return saldo;
    }
    public void indbetal(int kroner){
        saldo += kroner;
        if(kroner > 0 ){

        } else{
            System.out.println("Du skal indsætte et beløb større end 0 idiot");
        }
    }
    public void printBillet(){
        if(saldo >= pris){
        System.out.println("##############");
        System.out.println("Tillykke du kan købe en billet ");
        System.out.println("##############");
        System.out.println("Billet " + pris + " dadler");
        System.out.println();


        total += saldo;
        saldo = 0;

    } else{
            int differncen = pris - saldo;
           System.out.println(" differncen er " + differncen);
           System.out.println(" Du skal mindst betale mere " + differncen + " kr for at kunne købe billet her makker");
        }
}}
