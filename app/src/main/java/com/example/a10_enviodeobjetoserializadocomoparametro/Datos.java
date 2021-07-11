package com.example.a10_enviodeobjetoserializadocomoparametro;

import java.io.Serializable;

public class Datos implements Serializable {
    private boolean Net;
    private boolean Oracle;
    private boolean Java;

    private String Schedule;

    public Datos(boolean net, boolean java, boolean oracle, String schedule) {
        Net = net;
        Java = java;
        Oracle = oracle;
        Schedule = schedule;
    }

    public Datos() {
    }

    public boolean isNet() {
        return this.Net;
    }

    public boolean isOracle() {
        return this.Oracle;
    }

    public boolean isJava() {
        return this.Java;
    }

    public String getSchedule() {
        return this.Schedule;
    }

    public void setNet(boolean net) {
        this.Net = net;
    }

    public void setOracle(boolean oracle) {
        this.Oracle = oracle;
    }

    public void setJava(boolean java) {
        this.Java = java;
    }


    public void setSchedule(String schedule) {
        this.Schedule = schedule;
    }
}

