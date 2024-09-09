package org.example.day49;

public class Kata49 {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attacker = firstAttacker.equals(fighter1.name) ? fighter1 : fighter2;
        Fighter defender = firstAttacker.equals(fighter1.name) ? fighter2 : fighter1;

        while (true) {
            defender.health -= attacker.damagePerAttack;
            if (defender.health <= 0) {
                return attacker.name;
            }
            Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }

    class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

}
