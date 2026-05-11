package e5;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3083e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC3083e[] $VALUES;
    public static final a Companion;
    public static final EnumC3083e SOLID = new EnumC3083e("SOLID", 0);
    public static final EnumC3083e DASHED = new EnumC3083e("DASHED", 1);
    public static final EnumC3083e DOTTED = new EnumC3083e("DOTTED", 2);

    /* renamed from: e5.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC3083e a(String borderStyle) {
            Intrinsics.checkNotNullParameter(borderStyle, "borderStyle");
            String lowerCase = borderStyle.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1338941519) {
                if (hashCode != -1325970902) {
                    if (hashCode == 109618859 && lowerCase.equals("solid")) {
                        return EnumC3083e.SOLID;
                    }
                } else if (lowerCase.equals("dotted")) {
                    return EnumC3083e.DOTTED;
                }
            } else if (lowerCase.equals("dashed")) {
                return EnumC3083e.DASHED;
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC3083e[] $values() {
        return new EnumC3083e[]{SOLID, DASHED, DOTTED};
    }

    static {
        EnumC3083e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private EnumC3083e(String str, int i10) {
    }

    public static final EnumC3083e fromString(String str) {
        return Companion.a(str);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EnumC3083e valueOf(String str) {
        return (EnumC3083e) Enum.valueOf(EnumC3083e.class, str);
    }

    public static EnumC3083e[] values() {
        return (EnumC3083e[]) $VALUES.clone();
    }
}
