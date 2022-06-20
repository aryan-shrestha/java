package InheritanceLab4;

public class Student extends Person {
    private boolean freshman, junior, senior;

    public void setFreshman(boolean freshman) {
        this.freshman = freshman;
    }
    
    public boolean getFreshman() {
        return this.freshman;
    }

    public void setJunior(boolean junior) {
        this.junior = junior;
    }

    public boolean getJunior(){
        return this.junior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    public boolean getSenior(){
        return this.senior;
    }
}
