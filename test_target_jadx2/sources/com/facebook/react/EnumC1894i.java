package com.facebook.react;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.react.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1894i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC1894i[] $VALUES;
    public static final EnumC1894i JSC = new EnumC1894i("JSC", 0);
    public static final EnumC1894i HERMES = new EnumC1894i("HERMES", 1);

    private static final /* synthetic */ EnumC1894i[] $values() {
        return new EnumC1894i[]{JSC, HERMES};
    }

    static {
        EnumC1894i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC1894i(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EnumC1894i valueOf(String str) {
        return (EnumC1894i) Enum.valueOf(EnumC1894i.class, str);
    }

    public static EnumC1894i[] values() {
        return (EnumC1894i[]) $VALUES.clone();
    }
}
