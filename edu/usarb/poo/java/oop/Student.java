package usarb.poo.java.oop;

public class Student {
   
private String name;
private String idnp;
private char sex;
private double avg;
private boolean admitedState;

    void greatting() {
        System.out.println("Hello. I am "+name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
     public String getIdnp() {
        return idnp;
    }
    public void setIdnp(String idnp) {
        this.idnp=idnp;
    }
     public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex=sex;
    }
     public double getAvg() {
        return avg;
    }
    public void setAvg(double avg) {
        this.avg=avg;
    }
     public boolean getAdmitedState() {
        return admitedState;
    }
    public void setAdmitedState(double avg) {
        this.admitedState=admitedState;
    }
    @Override 
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", idnp='" + idnp + '\'' +
                ", sex=" + sex +    
                '}';
    }
    

     public Human(String name, String idnp, char sex) {
        this.name = name;
        this.idnp = idnp;
        this.sex = sex;
    }
     public Human(String name, String idnp) {
        this.name = name;
        this.idnp = idnp;
    }
     public Human(String name) {
        this.name = name;
}
}