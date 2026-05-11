package expo.modules.kotlin.views;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p SIMPLE = new p("SIMPLE", 0);
    public static final p GROUP = new p("GROUP", 1);

    private static final /* synthetic */ p[] $values() {
        return new p[]{SIMPLE, GROUP};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private p(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
