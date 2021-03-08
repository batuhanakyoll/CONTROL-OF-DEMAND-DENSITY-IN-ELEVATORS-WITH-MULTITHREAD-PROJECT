
package yazlab2;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Yazlab2{


     public static boolean ac2 = false;
     public static boolean ac3 = false;
     public static boolean ac4 = false;
     public static boolean ac5 = false;
     public static int tmp0 = 1;
     public static int tmp1 = 1;
     public static int tmp2 = 1;
     public static int tmp3 = 1;
     public static int tmp4 = 1;
     public static int limit = 20;
     public static int limit1 = 20;
     public static int limit2 = 20;
     public static int limit3 = 20;
     public static int limit4 = 20;
     public static int alt = 1000000;
     public static int alt1 = 1000000;
     public static int alt2 = 1000000;
     public static int alt3 = 1000000;
     public static int alt4 = 1000000;     
     public static int Atmp1=0;
     public static int Atmp2=0;
     public static int Atmp3=0;
     public static int Atmp4=0;
     public static int Atmp5=0;     
     public static int destinate=0;
     public static int destinate1=0;
     public static int destinate2=0;
     public static int destinate3=0;
     public static int destinate4=0;  
     public static int direction=0;
     public static int direction1=0;
     public static int direction2=0;
     public static int direction3=0;
     public static int direction4=0;     
     public static int customernumber = 0;
     public static int customercome = 0;
     public static int customerexit = 0;
     public static int  capacity = 10;
     public static Random random = new Random();
     public static int randomnumber1;
     public static int sayac = 1;
     public static int Elevatoraddition=0;
     public static int Elevatoraddition1=0;
     public static int Elevatoraddition2=0;
     public static int Elevatoraddition3=0;
     public static int Elevatoraddition4=0;
     public static Lock lock= new ReentrantLock();
     public static Lock lock2= new ReentrantLock();
     public static Lock lock3= new ReentrantLock();
     public static Lock lock4= new ReentrantLock();   
     public static int[] qqdeclare = new int[5];
     public static int[] wantgo = new int[5];     
     public static int[] floorcount = new int[5];

     public static void indir(int i){
      
                        if(wantgo[i]>0 )
                        {  
                                destinate=i;
                                
                            if(destinate-Atmp1<0)
                            {
                                direction=-1;
                            }
                            else if(destinate-Atmp1>0)
                            {
                                direction=1;
                            }
                            else
                            {
                                direction=0;
                            }
                                
                            try {
                        Thread.sleep(Math.abs(Atmp1-i)*200);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                            Atmp1=i;
                            
                            if(wantgo[i]>10 && Elevatoraddition==10 && floorcount[i]>10)
                            {
                                floorcount[i]+=10;
                                wantgo[i]-=10;
                                Elevatoraddition=0;
                            }
                            else if(wantgo[i]>10 && Elevatoraddition<10)
                            {
                                floorcount[i]+=Elevatoraddition;
                                wantgo[i]-=Elevatoraddition;
                                Elevatoraddition=0;
                            }
                            else if(wantgo[i]<10 && Elevatoraddition==10)
                             {
                                floorcount[i]+=wantgo[i];
                                wantgo[i]-=0;
                                Elevatoraddition-=wantgo[i];
                            } 
                            else if(wantgo[i]<10 && Elevatoraddition<10 && Elevatoraddition<wantgo[i])
                            {
                                floorcount[i]+=Elevatoraddition;
                                wantgo[i]-=Elevatoraddition;
                                Elevatoraddition=wantgo[i]-Elevatoraddition;
                            }
                            else if(wantgo[i]<10 && Elevatoraddition<10 && Elevatoraddition>=wantgo[i])
                            {
                                floorcount[i]+=wantgo[i];
                                wantgo[i]-=wantgo[i];
                                Elevatoraddition=Elevatoraddition-wantgo[i];
                            }
                           
                        }
                        
         
     }
     public static void bindir(int i){
           
                       
                        //bindirme işlemi
                        if(qqdeclare[i]+Elevatoraddition<=10 && qqdeclare[i]>0 && floorcount[i]>0 && floorcount[i]>=qqdeclare[i])
                        { 
                          
                            Elevatoraddition+=qqdeclare[i];
                            floorcount[i]-=qqdeclare[i]; 
                            qqdeclare[i]-=0;
                            
                        }
                        else if(qqdeclare[i]+Elevatoraddition>10 && qqdeclare[i]>0 && floorcount[i]>0 && floorcount[i]>=qqdeclare[i])
                        {

                            qqdeclare[i]-=(10-Elevatoraddition);
                            floorcount[i]-=(10-Elevatoraddition);
                            Elevatoraddition=10;
                        }
                        

     }
     public static void indir2(int i){
          //indirme
                        if(wantgo[i]>0 )
                        {  
                             try {
                        Thread.sleep(Math.abs(Atmp2-i)*200);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                            Atmp2=i;
                            
                            if(wantgo[i]>10 && Elevatoraddition1==10 && floorcount[i]>10)
                            {
                                floorcount[i]+=10;
                                wantgo[i]-=10;
                                Elevatoraddition1=0;
                            }
                            else if(wantgo[i]>10 && Elevatoraddition1<10)
                            {
                                floorcount[i]+=Elevatoraddition1;
                                wantgo[i]-=Elevatoraddition1;
                                Elevatoraddition1=0;
                            }
                            else if(wantgo[i]<10 && Elevatoraddition1==10)
                             {
                                floorcount[i]+=wantgo[i];
                                wantgo[i]-=0;
                                Elevatoraddition1-=wantgo[i];
                            } 
                            else if(wantgo[i]<10 && Elevatoraddition1<10 && Elevatoraddition1<wantgo[i])
                            {
                                floorcount[i]+=Elevatoraddition1;
                                wantgo[i]-=Elevatoraddition1;
                                Elevatoraddition1=wantgo[i]-Elevatoraddition1;
                            }
                            else if(wantgo[i]<10 && Elevatoraddition1<10 && Elevatoraddition1>=wantgo[i])
                            {
                                floorcount[i]+=wantgo[i];
                                wantgo[i]-=wantgo[i];
                                Elevatoraddition1=Elevatoraddition1-wantgo[i];
                            }
                           
                        }
      }
     public static void bindir2(int i){
          //bindirme işlemi
                        if(qqdeclare[i]+Elevatoraddition1<=10 && qqdeclare[i]>0 && floorcount[i]>0 && floorcount[i]>=qqdeclare[i])
                        { 
                           
                             
                            Elevatoraddition1+=qqdeclare[i];
                            floorcount[i]-=qqdeclare[i]; 
                            qqdeclare[i]-=0;
                        }
                        else if(qqdeclare[i]+Elevatoraddition1>10 && qqdeclare[i]>0 && floorcount[i]>0 && floorcount[i]>=qqdeclare[i])
                        {

                            qqdeclare[i]-=(10-Elevatoraddition1);
                            floorcount[i]-=(10-Elevatoraddition1);
                            Elevatoraddition1=10;
                        }
                        
                        
     }
     public static void indir3(int i){
                   //indirme
                        if(wantgo[i]>0 )
                        {  
                             try {
                        Thread.sleep(Math.abs(Atmp3-i)*200);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                            Atmp3=i;
                            
                            if(wantgo[i]>10 && Elevatoraddition2==10 && floorcount[i]>10)
                            {
                                floorcount[i]+=10;
                                wantgo[i]-=10;
                                Elevatoraddition2=0;
                            }
                            else if(wantgo[i]>10 && Elevatoraddition2<10)
                            {
                                floorcount[i]+=Elevatoraddition2;
                                wantgo[i]-=Elevatoraddition2;
                                Elevatoraddition2=0;
                            }
                            else if(wantgo[i]<10 && Elevatoraddition2==10)
                             {
                                floorcount[i]+=wantgo[i];
                                wantgo[i]-=0;
                                Elevatoraddition2-=wantgo[i];
                            } 
                            else if(wantgo[i]<10 && Elevatoraddition2<10 && Elevatoraddition2<wantgo[i])
                            {
                                floorcount[i]+=Elevatoraddition2;
                                wantgo[i]-=Elevatoraddition2;
                                Elevatoraddition2=wantgo[i]-Elevatoraddition2;
                            }
                            else if(wantgo[i]<10 && Elevatoraddition2<10 && Elevatoraddition2>=wantgo[i])
                            {
                                floorcount[i]+=wantgo[i];
                                wantgo[i]-=wantgo[i];
                                Elevatoraddition2=Elevatoraddition2-wantgo[i];
                            }
                           
                        }
                        
               }
     public static void bindir3(int i){
         //bindirme işlemi
                        if(qqdeclare[i]+Elevatoraddition2<=10 && qqdeclare[i]>0 && floorcount[i]>0 && floorcount[i]>=qqdeclare[i])
                        { 
                           
                          
                            Elevatoraddition2+=qqdeclare[i];
                            floorcount[i]-=qqdeclare[i]; 
                            qqdeclare[i]-=0;
                        }
                        else if(qqdeclare[i]+Elevatoraddition2>10 && qqdeclare[i]>0 && floorcount[i]>0 && floorcount[i]>=qqdeclare[i])
                        {
                       
                            qqdeclare[i]-=(10-Elevatoraddition2);
                            floorcount[i]-=(10-Elevatoraddition2);
                            Elevatoraddition2=10;
                        }
     }
     public static void indir4(int i){
                         //indirme
                        if(wantgo[i]>0 )
                        {  
                             try {
                        Thread.sleep(Math.abs(Atmp4-i)*200);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                            Atmp4=i;
                            
                            if(wantgo[i]>10 && Elevatoraddition3==10 && floorcount[i]>10)
                            {
                                floorcount[i]+=10;
                                wantgo[i]-=10;
                                Elevatoraddition3=0;
                            }
                            else if(wantgo[i]>10 && Elevatoraddition3<10)
                            {
                                floorcount[i]+=Elevatoraddition3;
                                wantgo[i]-=Elevatoraddition3;
                                Elevatoraddition3=0;
                            }
                            else if(wantgo[i]<10 && Elevatoraddition3==10)
                             {
                                floorcount[i]+=wantgo[i];
                                wantgo[i]-=0;
                                Elevatoraddition3-=wantgo[i];
                            } 
                            else if(wantgo[i]<10 && Elevatoraddition3<10 && Elevatoraddition3<wantgo[i])
                            {
                                floorcount[i]+=Elevatoraddition3;
                                wantgo[i]-=Elevatoraddition3;
                                Elevatoraddition3=wantgo[i]-Elevatoraddition3;
                            }
                            else if(wantgo[i]<10 && Elevatoraddition3<10 && Elevatoraddition3>=wantgo[i])
                            {
                                floorcount[i]+=wantgo[i];
                                wantgo[i]-=wantgo[i];
                                Elevatoraddition3=Elevatoraddition3-wantgo[i];
                            }
                           
                        }   
                        }
     public static void bindir4(int i){
                        //bindirme işlemi
                        if(qqdeclare[i]+Elevatoraddition3<=10 && qqdeclare[i]>0 && floorcount[i]>0 && floorcount[i]>=qqdeclare[i])
                        { 
                           

                            Elevatoraddition3+=qqdeclare[i];
                            floorcount[i]-=qqdeclare[i]; 
                            qqdeclare[i]-=0;
                        }
                        else if(qqdeclare[i]+Elevatoraddition3>10 && qqdeclare[i]>0 && floorcount[i]>0 && floorcount[i]>=qqdeclare[i])
                        {

                            qqdeclare[i]-=(10-Elevatoraddition3);
                            floorcount[i]-=(10-Elevatoraddition3);
                            Elevatoraddition3=10;
                        }
                        
                       
     }
     public static void indir5(int i){
                       //indirme
                        if(wantgo[i]>0 )
                        {  
                             try {
                        Thread.sleep(Math.abs(Atmp5-i)*200);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                            Atmp5=i;
                            
                            if(wantgo[i]>10 && Elevatoraddition4==10 && floorcount[i]>10)
                            {
                                floorcount[i]+=10;
                                wantgo[i]-=10;
                                Elevatoraddition4=0;
                            }
                            else if(wantgo[i]>10 && Elevatoraddition4<10)
                            {
                                floorcount[i]+=Elevatoraddition4;
                                wantgo[i]-=Elevatoraddition4;
                                Elevatoraddition4=0;
                            }
                            else if(wantgo[i]<10 && Elevatoraddition4==10)
                             {
                                floorcount[i]+=wantgo[i];
                                wantgo[i]-=0;
                                Elevatoraddition4-=wantgo[i];
                            } 
                            else if(wantgo[i]<10 && Elevatoraddition4<10 && Elevatoraddition4<wantgo[i])
                            {
                                floorcount[i]+=Elevatoraddition4;
                                wantgo[i]-=Elevatoraddition4;
                                Elevatoraddition4=wantgo[i]-Elevatoraddition4;
                            }
                            else if(wantgo[i]<10 && Elevatoraddition4<10 && Elevatoraddition4>=wantgo[i])
                            {
                                floorcount[i]+=wantgo[i];
                                wantgo[i]-=wantgo[i];
                                Elevatoraddition4=Elevatoraddition4-wantgo[i];
                            }
                           
                        }              
                                 }
     public static void bindir5(int i){
                        //bindirme işlemi
                        if(qqdeclare[i]+Elevatoraddition4<=10 && qqdeclare[i]>0 && floorcount[i]>0 && floorcount[i]>=qqdeclare[i])
                        { 
                           
                            Elevatoraddition4+=qqdeclare[i];
                            floorcount[i]-=qqdeclare[i]; 
                            qqdeclare[i]-=0;
                        }
                        else if(qqdeclare[i]+Elevatoraddition4>10 && qqdeclare[i]>0 && floorcount[i]>0 && floorcount[i]>=qqdeclare[i])
                        {
                            qqdeclare[i]-=(10-Elevatoraddition4);
                            floorcount[i]-=(10-Elevatoraddition4);
                            Elevatoraddition4=10;
                        }
                        
                  
     }

     
     
      
    
       
     public static void main(String[] args) {
         
                   
         
         
         for(int i : qqdeclare)
         {
             qqdeclare[i]=0;
         }
         
          for(int i : wantgo)
         {
             wantgo[i]=0;
         }
          for(int i : floorcount)
         {
             floorcount[i]=0;
         }
          
        Thread AvmGiriş = new Thread(new Runnable() {

            @Override
            public  void run() {   
                while(true)
                {
                try {
                    Thread.sleep(500); // threadi yarım saniye uyut
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
                }
                    customercome=1+random.nextInt(9); // 1 ile 10 arasında insan al
                    floorcount[0]+=customercome; // 0. kata alacağın için bu katta ata.
                    customernumber+=customercome; // toplam müşteri sayısını alınan müşteri kadar yap
                    int i=0;
                    while(i<customercome) // tüm alunan müşteriler için bir defa
                    {
                        randomnumber1=1+random.nextInt(4); //1 ile 4 arasında (4 dahil) random değer ata
                        qqdeclare[0]++;//0. katta olduğu için 0. kat kuyruğuna ata
                        wantgo[randomnumber1]++; // gitmek istenilen kattaki insanları 1 arttır.
                        i++;
                    }
                    
                    
              }
            }
        });
        
        Thread Avmçıkış = new Thread(new Runnable() {

            @Override
            public void run() {
                while(true)
                {
                try {
                    Thread.sleep(1000); // 1 saniyede bir çalışsın
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                customerexit = 1+random.nextInt(4); // 1 ile 4 arasındaki insanları çıkartmak için random belirle
                
                int i=0;
                  while(i<customerexit) // çımak isteyen tüm müşteriler için
                    {
                        randomnumber1=random.nextInt(5); // hangi kattan çıkarmak istediğini yazdır. 1 ile 5 arasında
                        if(floorcount[randomnumber1]>qqdeclare[randomnumber1]) // eğer kattaki kişi sayısı kuyruktaki kişi sayısından fazla ise
                        {
                            qqdeclare[randomnumber1]++; // o kattaki insanı, o katın kuyruğuna sok kuyruğa sok
                            wantgo[0]++; // çıkacakları için 0. kata gitmek isteyecekler.
                            
                        }
                        else
                        {
                           i--;
                        }
                        i++;
                    }
                  if(customerexit<=floorcount[0]) // çıkması gereken müşteri sayısı hali hazırda 0. katta varsa, bu müşterileri çıkart
                  {   
                      floorcount[0]-=customerexit;
                      customernumber-=customerexit;
                      
                  }
                }
            }
        });
        
        Thread kontrol = new Thread(new Runnable() {
                   
            @Override
            public void run() {
                int sayac=0;
                lock.lock();
                lock2.lock();
                lock3.lock();
                lock4.lock(); 
               while(true)
               {   

                   
                   try {
                       Thread.sleep(400);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
                   
                   
                   System.out.println(" 0.floor :"+(floorcount[0]+qqdeclare[0])+" queue: "+qqdeclare[0]);
                   System.out.println(" 1.floor :"+(floorcount[1]+qqdeclare[1])+" queue: "+qqdeclare[1]);
                   System.out.println(" 2.floor :"+(floorcount[2]+qqdeclare[2])+" queue: "+qqdeclare[2]);
                   System.out.println(" 3.floor :"+(floorcount[3]+qqdeclare[3])+" queue: "+qqdeclare[3]);
                   System.out.println(" 4.floor :"+(floorcount[4]+qqdeclare[4])+" queue: "+qqdeclare[4]);
                   System.out.println("exit count : "+customerexit);
                   customerexit=0;
                   
                   ///////////////////ASANSÖR 1 İÇİN
                   System.out.println("Active : TRUE ");
                   System.out.println("                           mode : working");
                   System.out.println("                           floor :"+Atmp1);
                   System.out.println("                           destination :"+destinate);
                   if(direction==-1)
                   {
                       System.out.println("                           direction : DOWN");
                   }
                   else if(direction==1)
                   {
                       System.out.println("                           direction : UP");
                   }
                   else if(direction==0)
                   {
                       System.out.println("                           direction : SAME FLOOR");
                   }
                   System.out.println("                           capacity : 10");
                   System.out.println("                           count_inside : "+Elevatoraddition);
                   
                    ///////////////////ASANSÖR 2 İÇİN
                   if(sayac>=1)
                   {
                   System.out.println("Active : TRUE ");
                   System.out.println("                           mode : working");
                   }
                   else if(sayac==0)
                   {
                       System.out.println("Active : FALSE ");
                       System.out.println("                           mode : idle");
                   }
                   System.out.println("                           floor :"+Atmp2);
                   System.out.println("                           destination :"+destinate1);
                   if(direction1==-1)
                   {
                       System.out.println("                           direction : DOWN");
                   }
                   else if(direction1==1)
                   {
                       System.out.println("                           direction : UP");
                   }
                   else if(direction1==0)
                   {
                       System.out.println("                           direction : SAME FLOOR");
                   }
                   System.out.println("                           capacity : 10");
                   System.out.println("                           count_inside : "+Elevatoraddition1);
                   
                   ///////////////////ASANSÖR 3 İÇİN
                   if(sayac>=2)
                   {
                   System.out.println("Active : TRUE ");
                   System.out.println("                           mode : working");
                   }
                   else if(sayac==1 || sayac==0)
                   {
                       System.out.println("Active : FALSE ");
                       System.out.println("                           mode : idle");
                   }
                   System.out.println("                           floor :"+Atmp3);
                   System.out.println("                           destination :"+destinate2);
                   if(direction2==-1)
                   {
                       System.out.println("                           direction : DOWN");
                   }
                   else if(direction2==1)
                   {
                       System.out.println("                           direction : UP");
                   }
                   else if(direction2==0)
                   {
                       System.out.println("                           direction : SAME FLOOR");
                   }
                   System.out.println("                           capacity : 10");
                   System.out.println("                           count_inside : "+Elevatoraddition2);
                   
                    ///////////////////ASANSÖR 4 İÇİN
                   if(sayac>=3)
                   {
                   System.out.println("Active : TRUE ");
                   System.out.println("                           mode : working");
                   }
                   else if(sayac==2 || sayac==1 || sayac==0)
                   {
                       System.out.println("Active : FALSE ");
                       System.out.println("                           mode : idle");
                   }
                   System.out.println("                           floor :"+Atmp4);
                   System.out.println("                           destination :"+destinate3);
                   if(direction3==-1)
                   {
                       System.out.println("                           direction : DOWN");
                   }
                   else if(direction3==1)
                   {
                       System.out.println("                           direction : UP");
                   }
                   else if(direction3==0)
                   {
                       System.out.println("                           direction : SAME FLOOR");
                   }
                   System.out.println("                           capacity : 10");
                   System.out.println("                           count_inside : "+Elevatoraddition3);
                   
                   ///////////////////ASANSÖR 5 İÇİN
                   if(sayac>=4)
                   {
                   System.out.println("Active : TRUE ");
                   System.out.println("                           mode : working");
                   }
                   else if(sayac==3 || sayac==2 || sayac==1 || sayac==0)
                   {
                       System.out.println("Active : FALSE ");
                       System.out.println("                           mode : idle");
                   }
                   System.out.println("                           floor :"+Atmp5);
                   System.out.println("                           destination :"+destinate4);
                   if(direction4==-1)
                   {
                       System.out.println("                           direction : DOWN");
                   }
                   else if(direction4==1)
                   {
                       System.out.println("                           direction : UP");
                   }
                   else if(direction4==0)
                   {
                       System.out.println("                           direction : SAME FLOOR");
                   }
                   System.out.println("                           capacity : 10");
                   System.out.println("                           count_inside : "+Elevatoraddition4);
                   ////////////////////////////////////////////////////////////

                   if(qqdeclare[0]+ qqdeclare[1]+qqdeclare[2]+ qqdeclare[3]+ qqdeclare[4]>=20&& sayac==0)
                           {
                       System.out.println("--------------------------->  Asansör 2 açılıyor.");
                       lock.unlock();
                       sayac++;
                       ac2=true;
                       
                       if(qqdeclare[0]>=limit)
                       {
                           tmp0++;
                           limit+=limit;
                           alt=10;         
                       }
                       else if(qqdeclare[1]>=limit1)
                       {
                           tmp1++;
                           limit1+=limit1;
                           alt1=10;
                       }
                       else if(qqdeclare[2]>=limit2)
                       {
                           tmp2++;
                           limit2+=limit2;
                           alt2=10;
                       }
                       else if(qqdeclare[3]>=limit3)
                       {
                           tmp3++;
                           limit3+=limit3;
                           alt3=10;
                       }
                       else if(qqdeclare[4]>=limit4)
                       {
                           tmp4++;
                           limit4+=limit4;
                           alt4=10;
                       }
                   }
                   
                  else if(qqdeclare[0]+ qqdeclare[1]+qqdeclare[2]+ qqdeclare[3]+ qqdeclare[4]>=40&& sayac==1)
                   {    System.out.println("--------------------------->  Asansör 3 açılıyor.");
                       lock2.unlock();
                       sayac++;
                       ac3=true;
                       if(qqdeclare[0]>=limit)
                       {
                           tmp0++;
                           limit+=limit;
                           alt=10;         
                       }
                       else if(qqdeclare[1]>=limit1)
                       {
                           tmp1++;
                           limit1+=limit1;
                           alt1=10;
                       }
                       else if(qqdeclare[2]>=limit2)
                       {
                           tmp2++;
                           limit2+=limit2;
                           alt2=10;
                       }
                       else if(qqdeclare[3]>=limit3)
                       {
                           tmp3++;
                           limit3+=limit3;
                           alt3=10;
                       }
                       else if(qqdeclare[4]>=limit4)
                       {
                           tmp4++;
                           limit4+=limit4;
                           alt4=10;
                       } limit4+=limit4;
                       
                   }
                  else if(qqdeclare[0]+ qqdeclare[1]+qqdeclare[2]+ qqdeclare[3]+ qqdeclare[4]>=60&& sayac==2)
                   { System.out.println("--------------------------->  Asansör 4 açılıyor.");
                       lock3.unlock();
                       sayac++;
                       ac4=true;
                       if(qqdeclare[0]>=limit)
                       {
                           tmp0++;
                           
                           limit+=limit;
                           alt=10;         
                       }
                       else if(qqdeclare[1]>=limit1)
                       {
                           tmp1++;
                           limit1+=limit1;
                           alt1=10;
                       }
                       else if(qqdeclare[2]>=limit2)
                       {
                           tmp2++;
                           limit2+=limit2;
                           alt2=10;
                       }
                       else if(qqdeclare[3]>=limit3)
                       {
                           tmp3++;
                           limit3+=limit3;
                           alt3=10;
                       }
                       else if(qqdeclare[4]>=limit4)
                       {
                           tmp4++;
                           limit4+=limit4;
                           alt4=10;
                       }
                        
                   }
                 else  if(qqdeclare[0]+ qqdeclare[1]+qqdeclare[2]+ qqdeclare[3]+ qqdeclare[4]>=80&& sayac==3)
                   {  System.out.println("--------------------------->  Asansör 5 açılıyor.");
                   
                       lock4.unlock();
                       sayac++;
                       ac5=true;
                      
                       if(qqdeclare[0]>=limit)
                       {
                           tmp0++;
                           limit+=limit;
                           alt=10;         
                       }
                       else if(qqdeclare[1]>=limit1)
                       {
                           tmp1++;
                           limit1+=limit1;
                           alt1=10;
                       }
                       else if(qqdeclare[2]>=limit2)
                       {
                           tmp2++;
                           limit2+=limit2;
                           alt2=10;
                       }
                       else if(qqdeclare[3]>=limit3)
                       {
                           tmp3++;
                           limit3+=limit3;
                           alt3=10;
                       }
                       else if(qqdeclare[4]>=limit4)
                       {
                           tmp4++;
                           limit4+=limit4;
                           alt4=10;
                       }
                        
                   } 
                   ///////////////////////////////////////////
                    if(qqdeclare[0]+ qqdeclare[1]+qqdeclare[2]+ qqdeclare[3]+ qqdeclare[4]<50){
                       lock4.lock();
                   }
                   if(qqdeclare[0]+ qqdeclare[1]+qqdeclare[2]+ qqdeclare[3]+ qqdeclare[4]<40){
                       lock3.lock();
                   }
                   if(qqdeclare[0]+ qqdeclare[1]+qqdeclare[2]+ qqdeclare[3]+ qqdeclare[4]<30){
                       lock2.lock();
                   }
                   if(qqdeclare[0]+ qqdeclare[1]+qqdeclare[2]+ qqdeclare[3]+ qqdeclare[4]<20){
                       lock.lock();
                   }
               }
            }
        });
        
        Thread Asansör1 = new Thread(new Runnable() {
           
            @Override
            public void run() {
                
               while(true)
         {   int i=0;       
             while( i<5){
                    indir(i);
                    bindir(i);    
                    i++;
         }
             }  
            }
        });
        
        Thread Asansör2 = new Thread(new Runnable() {

            @Override
            public void run() {
                
                 synchronized(lock)
        {
                while(true)
                { 
                    //1 den 4. kata
                    int i=0;
                    while( i<5)// asansör
                    {   
                        destinate1=i;
                                
                            if(destinate1-Atmp2<0)
                            {
                                direction1=-1;
                            }
                            else if(destinate1-Atmp1>0)
                            {
                                direction1=1;
                            }
                            else
                            {
                                direction1=0;
                            }
                        
                        
                        indir2(i);
                        bindir2(i);
                        i++;
                    }
                    
                }
        }
            }
        });
        
        Thread Asansör3 = new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized(lock2)
        {
                 while(true)
                { 
                    //1 den 4. kata
                    int i=0;
                    while( i<5)// asansör
                    {   
                        destinate2=i;
                                
                            if(destinate2-Atmp3<0)
                            {
                                direction2=-1;
                            }
                            else if(destinate2-Atmp3>0)
                            {
                                direction2=1;
                            }
                            else
                            {
                                direction2=0;
                            }
                        
                        indir3(i);
                        bindir3(i);
                        i++;
                    }
                    
                }
        }
            }
        });
         
        Thread Asansör4 = new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized(lock3)
        {
                 while(true)
                { 
                    //1 den 4. kata
                    int i=0;
                    while( i<5) // asansör
                    {   
                        
                        destinate3=i;
                                
                            if(destinate3-Atmp4<0)
                            {
                                direction3=-1;
                            }
                            else if(destinate3-Atmp4>0)
                            {
                                direction3=1;
                            }
                            else
                            {
                                direction3=0;
                            }
                        indir4(i);
                        bindir4(i);
                        i++;
                    }
                    
                    }
        }
            }
        });

        Thread Asansör5 = new Thread(new Runnable() {

            @Override
            public void run() {
                 synchronized(lock4)
        {
                while(true)
                { 
                    //1 den 4. kata
                    int i=0;
                    while( i<5) // asansör
                    {   
                        destinate4=i;
                                
                            if(destinate4-Atmp1<0)
                            {
                                direction4=-1;
                            }
                            else if(destinate4-Atmp5>0)
                            {
                                direction4=1;
                            }
                            else
                            {
                                direction4=0;
                            }
                        
                        indir5(i);
                        bindir5(i);
                        i++;
                    }
                    
                }
        }
            }
        });
        
        AvmGiriş.start();
        
        Avmçıkış.start();
        
        kontrol.start();
        
        Asansör1.start();
        
        Asansör2.start();
        
        Asansör3.start();
        
        Asansör4.start();
        
        Asansör5.start();
        
        
    }
    
}