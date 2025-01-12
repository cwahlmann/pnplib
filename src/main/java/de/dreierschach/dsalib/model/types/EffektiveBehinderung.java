package de.dreierschach.dsalib.model.types;

import java.nio.file.WatchEvent;

public class EffektiveBehinderung {
    private final int faktor;
    private final int bonus;

    public EffektiveBehinderung(int faktor, int bonus) {
        this.faktor = faktor;
        this.bonus = bonus;
    }

    public static EffektiveBehinderung eBE(int faktor, int bonus) {
        return new EffektiveBehinderung(faktor, bonus);
    }

    public static EffektiveBehinderung eBE(int bonus) {
        return new EffektiveBehinderung(1, bonus);
    }

    public int getFaktor() {
        return faktor;
    }

    public int getBonus() {
        return bonus;
    }

    public int getEBE(int be) {
        return be * faktor + bonus;
    }

    public String toString() {
        var result = new StringBuilder("BE");
        if (faktor > 1) {
            result.append("x").append(faktor);
        }
        if (bonus != 0) {
            result.append(String.format("%+d", bonus));
        }
        return result.toString();
    }
}
