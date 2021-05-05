package com.example.cardviewrecyclerview;

import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

public class Customword {

    String txt;
    int mimageid;


    public Customword(String txt, int mimageid) {
        this.txt = txt;
        this.mimageid = mimageid;
    }


    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getMimageid() {
        return mimageid;
    }

    public void setMimageid(int mimageid) {
        this.mimageid = mimageid;
    }
}