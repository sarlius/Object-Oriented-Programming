package domainPackage;

public class Vexana implements Warrior {
    private String warriorCode;
    private String weapon;
    private Integer bombsLeft;
    private Integer noOfKills;

    public Vexana (String warriorCode, Integer bombsLeft, Integer noOfKills){
        this.warriorCode = warriorCode;
        this.bombsLeft = bombsLeft;
        this.noOfKills = noOfKills;
    }

    public String getWarriorCode() {
        return warriorCode;
    }

    public void setWarriorCode(String warriorCode) {
        this.warriorCode = warriorCode;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Integer getBombsLeft() {
        return bombsLeft;
    }

    public void setBombsLeft(Integer bombsLeft) {
        this.bombsLeft = bombsLeft;
    }

    public Integer getNoOfKills() {
        return noOfKills;
    }

    public void setNoOfKills(Integer noOfKills) {
        this.noOfKills = noOfKills;
    }

    @Override
    public String showWarriorAndKills() {
        return ("Vexana is using Bombs! has " + this.bombsLeft + " bullets left and killed " + this.noOfKills);
    }
}
