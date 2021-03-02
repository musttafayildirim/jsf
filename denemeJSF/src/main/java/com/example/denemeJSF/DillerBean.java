package com.example.denemeJSF;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class DillerBean implements Serializable {

    private String yerelKod;
    private static Map<String, Object> ulkeler;

    static {
        ulkeler = new LinkedHashMap<String, Object>();
        ulkeler.put("English", Locale.ENGLISH);
        ulkeler.put("Deutsch", Locale.GERMANY);
        ulkeler.put("中国人", Locale.SIMPLIFIED_CHINESE);
    }

    public Map<String, Object> getUlkelerinHaritasi(){
        return ulkeler;
    }

    public String getYerelKod() {
        return yerelKod;
    }

    public void setYerelKod(String yerelKod) {
        this.yerelKod = yerelKod;
    }

   public void ulkeninYerelKoduDegisti(ValueChangeEvent event){
        String yeniYerelKodDegeri = event.getNewValue().toString();

        //ulkelerin yerel kodunu karşılaştırmak için döngü haritası
       for (Map.Entry<String, Object> entry : ulkeler.entrySet()){
           if (entry.getValue().toString().equals(yeniYerelKodDegeri)){
               FacesContext.getCurrentInstance().
                       getViewRoot().
                       setLocale((Locale) entry.getValue());
           }
       }
   }
}
