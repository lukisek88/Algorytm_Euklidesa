class Algorytm{

    public  int nWD_dz(int a, int b) {
        int reszta;
        while (b != 0) {
            reszta = a % b;
            a = b;
            b = reszta;
        }
        return a;
    }
  public int nWD_odj(int a,int b){

        while (a!=b){

         if (a > b){
             a -=b;
         }   else{
             b-=a;
         }
        }
        return a;
  }

}
public class Kodilla{


    public static void main(String[] args) {
        Algorytm algorytm = new Algorytm();
        System.out.println("Wynik: "+algorytm.nWD_dz(548,86));
        System.out.println("Wynik: "+algorytm.nWD_odj(548,86));


    }


}