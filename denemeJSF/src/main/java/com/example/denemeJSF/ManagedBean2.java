package com.example.denemeJSF;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

//Deprecated
@ManagedBean(name = "managedBean2")
@RequestScoped
public class ManagedBean2 {

        private String adi;
        private String soyadi;

        public String getAdi() {
            return adi;
        }

        public void setAdi(String adi) {
            this.adi = adi;
        }

        public String getSoyadi() {
            return soyadi;
        }

        public void setSoyadi(String soyadi) {
            this.soyadi = soyadi;
        }

        @Override
        public String toString() {
            System.out.println("Adı Soyadı: " + getAdi() + " " + getSoyadi());
            return getAdi() + " " + getSoyadi();
        }
}
