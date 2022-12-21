package com.proxy;

import com.proxy.Classes.ColaAdvertisingProxy;

public class Main {
    public static void main(String[] args) {

        ColaAdvertisingProxy cola = new ColaAdvertisingProxy();

        cola.PrintCount();

        cola.showAd();
        cola.showAd();
        cola.showAd();

        cola.PrintCount();

        cola.ClearCache();
        cola.PrintCount();
    }
}