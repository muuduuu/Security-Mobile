package za;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    private final String jsName;
    public static final f PLAIN_TEXT = new f("PLAIN_TEXT", 0, "plain-text");
    public static final f HTML = new f("HTML", 1, "html");
    public static final f IMAGE = new f("IMAGE", 2, "image");

    private static final /* synthetic */ f[] $values() {
        return new f[]{PLAIN_TEXT, HTML, IMAGE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private f(String str, int i10, String str2) {
        this.jsName = str2;
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

    public final String getJsName() {
        return this.jsName;
    }
}
