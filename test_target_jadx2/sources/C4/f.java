package C4;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f JS = new f("JS", 0, "JS");
    public static final f NATIVE = new f("NATIVE", 1, "Native");
    private final String displayName;

    private static final /* synthetic */ f[] $values() {
        return new f[]{JS, NATIVE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private f(String str, int i10, String str2) {
        this.displayName = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.displayName;
    }
}
