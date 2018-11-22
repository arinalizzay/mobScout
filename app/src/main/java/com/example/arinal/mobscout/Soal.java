package com.example.arinal.mobscout;

/**
 * Created by Arinal on 20/11/2017.
 */

public class Soal {
    private String soal;
    private String [] jawaban;
    private int cek;

    public Soal(){
        cek = 0;
        soal = "";
        jawaban = new String [4];
    }

    public void setSoal(String soal){
        this.soal = soal;
    }

    public String getSoal(){
        return soal;
    }

    public void setJawaban(int index, String jawaban){
        this.jawaban[index] = jawaban;
    }

    public String getJawaban(int index){
        return this.jawaban[index];
    }

    public void setCek(int cek){
        this.cek = cek;
    }

    public int getCek(){
        return this.cek;
    }
}