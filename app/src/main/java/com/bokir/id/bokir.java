package com.bokir.id;



public class bokir {
    String jdl,alamt,waktu;
    int gbr;

    public bokir(String judul,String alamat,String waktu,int gambar){
        this.jdl=judul;
        this.alamt=alamat;
        this.waktu=waktu;
        this.gbr=gambar;
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

    public int getGbr() {
        return gbr;
    }

    public void setGbr(int gbr) {
        this.gbr = gbr;
    }
}
