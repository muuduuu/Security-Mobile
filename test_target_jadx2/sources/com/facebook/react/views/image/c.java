package com.facebook.react.views.image;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AUTO = new c("AUTO", 0);
    public static final c RESIZE = new c("RESIZE", 1);
    public static final c SCALE = new c("SCALE", 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{AUTO, RESIZE, SCALE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private c(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
