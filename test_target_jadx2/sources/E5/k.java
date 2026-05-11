package e5;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final a Companion;
    public static final k VISIBLE = new k("VISIBLE", 0);
    public static final k HIDDEN = new k("HIDDEN", 1);
    public static final k SCROLL = new k("SCROLL", 2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String overflow) {
            Intrinsics.checkNotNullParameter(overflow, "overflow");
            String lowerCase = overflow.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1217487446) {
                if (hashCode != -907680051) {
                    if (hashCode == 466743410 && lowerCase.equals("visible")) {
                        return k.VISIBLE;
                    }
                } else if (lowerCase.equals("scroll")) {
                    return k.SCROLL;
                }
            } else if (lowerCase.equals("hidden")) {
                return k.HIDDEN;
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ k[] $values() {
        return new k[]{VISIBLE, HIDDEN, SCROLL};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private k(String str, int i10) {
    }

    public static final k fromString(String str) {
        return Companion.a(str);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
