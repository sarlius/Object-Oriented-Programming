package domainPackage;

public class Clint implements Warrior{
    private String warriorCode;
    private String weapon;
    private Integer bulletsLeft;
    private Integer noOfKills;

    public Clint(String warriorCode) {
    }

    public Clint(String warriorCode, Integer bulletsLeft, Integer noOfKills) {
        this.warriorCode = warriorCode;
        this.bulletsLeft = bulletsLeft;
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

    public Integer getBulletsLeft() {
        return bulletsLeft;
    }

    public void setBulletsLeft(Integer bulletsLeft) {
        this.bulletsLeft = bulletsLeft;
    }

    public Integer getNoOfKills() {
        return noOfKills;
    }

    public void setNoOfKills(Integer noOfKills) {
        this.noOfKills = noOfKills;
    }

    @Override
    public String showWarriorAndKills() {
        return ("\n\tClint is using Guns! has " + this.bulletsLeft + " bullets left and killed " + this.noOfKills);
    }
}

