package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j RENDER_OVERRIDE = new j("RENDER_OVERRIDE", 0);
    public static final j RENDER_OPEN = new j("RENDER_OPEN", 1);
    public static final j RENDER_OPEN_OVERRIDE = new j("RENDER_OPEN_OVERRIDE", 2);

    private static final /* synthetic */ j[] $values() {
        return new j[]{RENDER_OVERRIDE, RENDER_OPEN, RENDER_OPEN_OVERRIDE};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private j(String str, int i10) {
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
