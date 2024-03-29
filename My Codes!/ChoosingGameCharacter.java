public abstract class Player {
    private String name;
    private int level;
    private int healthPoints;
    private int attackPoints;

    public Player(String name, int level, int healthPoints, int attackPoints) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void takeDamage(int damage) {
        if (damage < 0) {
            System.out.println(getName() + " has been healed for " + Math.abs(damage) + " points.");
            healthPoints += Math.abs(damage);
        } else {
            healthPoints -= damage;
            if (healthPoints <= 0) {
                System.out.println(getName() + " has been defeated!");
                levelDown();
            }
        }
    }

    public void levelUp() {
        level++;
        healthPoints += 10;
        attackPoints += 5;
        System.out.println(getName() + " has leveled up to level " + getLevel() + "!");
    }

    public void levelDown() {
        level--;
        healthPoints -= 5;
        attackPoints -= 2;
        System.out.println(getName() + " has been demoted to level " + getLevel() + ".");
    }

    public abstract void specialAbility();
}

public class Warrior extends Player {
    public Warrior(String name, int level, int healthPoints, int attackPoints) {
        super(name, level, healthPoints, attackPoints);
    }

    public void specialAbility() {
        System.out.println(getName() + " uses special ability: Charge!");
        setAttackPoints(getAttackPoints() + 10);
    }
}

public class Mage extends Player {
    public Mage(String name, int level, int healthPoints, int attackPoints) {
        super(name, level, healthPoints, attackPoints);
    }

    public void specialAbility() {
        System.out.println(getName() + " uses special ability: Fireball!");
        setAttackPoints(getAttackPoints() + 20);
    }
}
