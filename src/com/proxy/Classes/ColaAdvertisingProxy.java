package com.proxy.Classes;
import com.proxy.Classes.ColaAdvertising;

public class ColaAdvertisingProxy {
    private ColaAdvertising cola = new ColaAdvertising();

    private int CountAd = 0;

    public void showAd(){
        cola.showAd();
        CountAd++;
    }

    public void PrintCount(){
        System.out.println(CountAd);
    }

    public void ClearCache(){
        CountAd=0;
    }
}
