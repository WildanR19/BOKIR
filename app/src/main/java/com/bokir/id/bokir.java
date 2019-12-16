package com.bokir.id;



public class bokir {
    String jdl,alamt,waktu,freeint;

    public bokir(String judul,String alamat,String waktu,String freeint){
        this.jdl=judul;
        this.alamt=alamat;
        this.waktu=waktu;
        this.freeint=freeint;
    }

    public String getJdl() {
        return jdl;
    }

    public void setJdl(String jdl) {
        this.jdl = jdl;
    }

    public String getAlamt() {
        return alamt;
    }

    public void setAlamt(String alamt) {
        this.alamt = alamt;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }


    public String getFreeint() {
        return freeint;
    }

    public void setFreeint(String freeint) {
        this.freeint = freeint;
    }
}
