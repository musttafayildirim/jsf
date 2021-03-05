package com.example.denemeJSF;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class GirisSayfasi {

    private String yerelDurum;
    private Map<String, Object> ulkelerHaritasi;

    public GirisSayfasi(){
        ulkelerHaritasi = new LinkedHashMap<String, Object>();
        ulkelerHaritasi.put("Türkçe", new Locale("tr", "TR"));
        ulkelerHaritasi.put("English", new Locale("en", "GB"));
        ulkelerHaritasi.put("русский", new Locale("ru", "RU"));
        ulkelerHaritasi.put("عربي", new Locale("ar", "AR"));
    }

    public Map<String, Object> getUlkelerHaritasi(){
        return ulkelerHaritasi;
    }

    public String getYerelDurum() {
        return yerelDurum;
    }

    public void setYerelDurum(String yerelDurum) {
        this.yerelDurum = yerelDurum;
    }

    public void yerelDurumDegisiminiKontrolEt(ValueChangeEvent valueChangeEvent){
        String localeStr = valueChangeEvent.getNewValue().toString();

        for(Map.Entry<String, Object> entry : ulkelerHaritasi.entrySet()){
            if (entry.getValue().toString().equals(localeStr)){
                Locale locale = (Locale) entry.getValue();
                FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
            }
        }
    }
}
