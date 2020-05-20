package com.company.ComputerTasks;

import com.sun.xml.internal.ws.assembler.jaxws.ValidationTubeFactory;

public class ComputerPrice {
   final double VAT=0.23;
    double mb;
    double cpu;
    double ram;
    double hd;
    double disp;

    public ComputerPrice(double mb, double cpu, double ram, double hd, double disp) {
        this.mb = mb;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.disp = disp;
    }

    @Override
    public String toString() {
        return "ComputerPrice{" +
                "VAT=" + VAT +
                ", mb=" + mb +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", hd=" + hd +
                ", disp=" + disp +
                '}';
    }

    public double getCompPrice() {

        //System.out.println("Obliaczanie ceny zestawu komputerowego");
        double comp = mb + cpu + ram + hd;
        double compVat = comp * VAT;
        double wholeCompVat = compVat + comp;
        return wholeCompVat;
    }
    public double getDisplayPrice() {
        double dispVat = disp * VAT;
        double wholeDispVat = dispVat + disp;
        return wholeDispVat;
    }
    public double getWholeCompPrice(){

        double wholePC =  getCompPrice() + getDisplayPrice();

        return wholePC;
    }

    }

