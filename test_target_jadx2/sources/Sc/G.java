package Sc;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class G {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ G[] $VALUES;
    public static final a Companion;
    private final String description;
    public static final G IGNORE = new G("IGNORE", 0, "ignore");
    public static final G WARN = new G("WARN", 1, "warn");
    public static final G STRICT = new G("STRICT", 2, "strict");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final /* synthetic */ G[] $values() {
        return new G[]{IGNORE, WARN, STRICT};
    }

    static {
        G[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private G(String str, int i10, String str2) {
        this.description = str2;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
