public class Main {
    public static void main(String[] args) {
        long startAccountInKopecks = 50000;
        long amountInKopecks = 150000;
        int percent = 1;
        long bonusInKopecks = amountInKopecks * percent / 100;
        long finishAccountInKopecks = startAccountInKopecks + amountInKopecks + bonusInKopecks;
        long limit = 100000;
        if (amountInKopecks < limit) {
            bonusInKopecks = 0;
        }
        System.out.println(bonusInKopecks);
        System.out.println(finishAccountInKopecks);
    }
}
