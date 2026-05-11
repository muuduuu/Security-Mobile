package com.facebook.react.uimanager;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.react.uimanager.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1934b0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC1934b0[] $VALUES;
    public static final EnumC1934b0 PARENT = new EnumC1934b0("PARENT", 0);
    public static final EnumC1934b0 LEAF = new EnumC1934b0("LEAF", 1);
    public static final EnumC1934b0 NONE = new EnumC1934b0("NONE", 2);

    private static final /* synthetic */ EnumC1934b0[] $values() {
        return new EnumC1934b0[]{PARENT, LEAF, NONE};
    }

    static {
        EnumC1934b0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC1934b0(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EnumC1934b0 valueOf(String str) {
        return (EnumC1934b0) Enum.valueOf(EnumC1934b0.class, str);
    }

    public static EnumC1934b0[] values() {
        return (EnumC1934b0[]) $VALUES.clone();
    }
}
