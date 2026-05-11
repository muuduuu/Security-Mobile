package com.facebook.react.uimanager;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Y[] $VALUES;
    public static final Y POINT = new Y("POINT", 0);
    public static final Y PERCENT = new Y("PERCENT", 1);

    private static final /* synthetic */ Y[] $values() {
        return new Y[]{POINT, PERCENT};
    }

    static {
        Y[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private Y(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) $VALUES.clone();
    }
}
