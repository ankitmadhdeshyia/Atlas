package com.constructorinjection;

public class Person {
    private String name;
    private int persionId;
    private Certi certi;
    public Person() {
    }
    
    @Override
    public String toString() {
        return this.name+" : " +this.persionId+ " {" +this.certi.name+"}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersionId() {
        return persionId;
    }

    public void setPersionId(int persionId) {
        this.persionId = persionId;
    }

    public Certi getCerti() {
        return certi;
    }

    public void setCerti(Certi certi) {
        this.certi = certi;
    }

 
    
}
