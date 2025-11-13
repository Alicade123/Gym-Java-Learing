package Threading;

public class MyRunnable implements Runnable {
    @Override
    public void run(){
        for(int i =1 ; i<=5; i++){
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){
                System.out.println("The thread was interrupted");
            }
            if(i==5){
                System.out.println();
                System.out.println("Thank you, Time is up Kid!");
                System.exit(0); // To exit the program as well as the time is up.
            }
        }
    }
}
