package domainPackage;

public class Miya implements Warrior{
    private String warriorCode;
    private String weapon;
    private Integer arrowsLeft;
    private Integer noOfKills;

    public Miya(String warriorCode, Integer arrowsLeft, Integer noOfKills) {
        this.warriorCode = warriorCode;
        this.arrowsLeft = arrowsLeft;
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

    public Integer getArrowsLeft() {
        return arrowsLeft;
    }

    public void setArrowsLeft(Integer arrowsLeft) {
        this.arrowsLeft = arrowsLeft;
    }

    public Integer getNoOfKills() {
        return noOfKills;
    }

    public void setNoOfKills(Integer noOfKills) {
        this.noOfKills = noOfKills;
    }

    @Override
    public String showWarriorAndKills() {
        return ("Miya is using Archery! has " + this.arrowsLeft + " bullets left and killed " + this.noOfKills);
    }
}
