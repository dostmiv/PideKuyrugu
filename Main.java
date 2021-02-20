
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void kuyrugugoster(Queue<String> kuyruk){
         System.out.println(kuyruk);
     }
     public static void main(String [] args){
         
         //bir kuyruk olusturulacak. bu kuyrugun icinde musteriler pide almak uzere siralanacak.
         //her musterinin sirasi geldiginde 1 tane pide alip kuyruktan ayrilacak.
         //pide sayisi program basladiginda random olarak 1-10 arasinda degisecek.
         //siradaki musteriler icin yeterli olmacak kadar pide uretilirse eger, pidenin bittigi yerden 
         //sonraki musteriler pideyi alamamis olacaklar.
         
         Queue<String> pide_kuyrugu = new LinkedList<>();
         pide_kuyrugu.add("mert");
         pide_kuyrugu.add("hakjan");
         pide_kuyrugu.add("koskhaw");
         pide_kuyrugu.add("durdub");
         pide_kuyrugu.add("zaman");
         pide_kuyrugu.add("kullak");
         pide_kuyrugu.add("jale");
         pide_kuyrugu.add("alev");
         pide_kuyrugu.add("nigar");
         pide_kuyrugu.add("kulaksiz");
         pide_kuyrugu.add("meteliksiz");
         pide_kuyrugu.add("gudubet");
         pide_kuyrugu.add("garabet");
         pide_kuyrugu.add("anan");
         
         Random rand = new Random();
         int pide_sayisi = 1 + rand.nextInt(10);
         System.out.println(pide_sayisi + "tane pide cikti...");    
         try {
             kuyrugugoster(pide_kuyrugu);
             Thread.sleep(3000);
         } catch (InterruptedException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
         for(int i = 0; i <pide_sayisi;i++){
             try {
                 
                 System.out.println(pide_kuyrugu.poll() + " pidesini aldi ve ayriliyor...");
                 kuyrugugoster(pide_kuyrugu);
                 Thread.sleep(3000);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         System.out.println("!!!!! hic pide kalmadi !!!!!!");
         try {
             Thread.sleep(2000);
         } catch (InterruptedException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
         System.out.println("kuyrugun geri kalani pidelerini alamadilar...");
         try {
             Thread.sleep(500);
         } catch (InterruptedException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
         System.out.print("Alamadan ayrilanlar " + pide_kuyrugu.size() + " kisi: " );
         
         while (!pide_kuyrugu.isEmpty())
             System.out.print(pide_kuyrugu.poll() + ", ");
     }
     
}
