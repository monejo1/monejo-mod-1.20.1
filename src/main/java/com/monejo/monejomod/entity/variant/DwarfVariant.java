package com.monejo.monejomod.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum DwarfVariant {
    DEFAULT(0),
    DWARF_1(1),
    DWARF_2(2),
    DWARF_3(3);

    private static final DwarfVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(DwarfVariant::getId)).toArray(DwarfVariant[]::new);
    private final int id;

    DwarfVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static DwarfVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
