public class Main {
    public static void main(String[] args) {

        String[][] cities= new String[3][3];

        cities[0][0]="Istanbul";
        cities[0][1]="Ankara";
        cities[0][2]="Izmir";

        cities[1][0]="Urfa";
        cities[1][1]="Antep";
        cities[1][2]="Maras";

        cities[2][0]="Agri";
        cities[2][1]="Kars";
        cities[2][2]="Igdir";

        for(int i = 0;i<=2;i++) {
            System.out.println("_________");
            for(int j = 0;j<=2;j++) {
                System.out.println(cities[i][j]);
            }
        }
        System.out.println("_________");
    }
}