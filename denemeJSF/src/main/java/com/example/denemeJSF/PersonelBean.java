package com.example.denemeJSF;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonelBean implements Serializable{

    private static final ArrayList<Personel> personelListesi = new ArrayList<Personel>(Arrays.asList(
            new Personel("555", "Mustafa YILDIRIM", new BigDecimal("1000.00"), 23),
            new Personel("154", "Ahmet ŞİMŞEK", new BigDecimal("4541.33"), 35),
            new Personel("74984", "Mehmet DURAL", new BigDecimal("1554.00"), 42),
            new Personel("484", "Aslı SERDENGEÇTİ", new BigDecimal("7894.00"), 55),
            new Personel("9748", "Leyla MUTLU", new BigDecimal("4585.00"), 22)
    ));

    public ArrayList<Personel> getPersonelListesi() {
        return personelListesi;
    }

    private boolean artanSiralama = true;
    public String siralaPersonelAdiSoyadi(){
        if (artanSiralama){
            personelListesi.sort((o1, o2) -> o1.getAdiSoyadi().compareTo(o2.getAdiSoyadi()));
            artanSiralama = false;
        }else {
            personelListesi.sort((o1, o2) -> o2.getAdiSoyadi().compareTo(o1.getAdiSoyadi()));
            artanSiralama = true;
        }
        return null;
    }

}

