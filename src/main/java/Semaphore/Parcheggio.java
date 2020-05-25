package Semaphore;

import java.util.concurrent.Semaphore;

public class Parcheggio {
    //Proprieta
    private int postiDisponibili  = 10;
    private Semaphore postiDisp;
    private Semaphore postiOcc;
    
    //Costruttore
    public Parcheggio() {
        postiDisp = new Semaphore(postiDisponibili, true);
        postiOcc = new Semaphore(0, true);
    }
    
    //Get
    public int getPostiDisponibili() {
        return postiDisponibili;
    }
    
    //
    public void ingresso()
    {
        try
        {
            postiDisp.acquire();
            postiDisponibili--;
        } catch (InterruptedException e) {}       
        postiOcc.release();       
    }
    
    public  void uscita()
    {
        try
        {
            postiOcc.acquire();
            postiDisponibili++;
        } catch (InterruptedException e) {}      
        postiDisp.release();
    }
}
