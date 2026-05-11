package d5;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2982d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC2982d[] $VALUES;
    public static final a Companion;
    public static final EnumC2982d LINEAR = new EnumC2982d("LINEAR", 0);
    public static final EnumC2982d EASE_IN = new EnumC2982d("EASE_IN", 1);
    public static final EnumC2982d EASE_OUT = new EnumC2982d("EASE_OUT", 2);
    public static final EnumC2982d EASE_IN_EASE_OUT = new EnumC2982d("EASE_IN_EASE_OUT", 3);
    public static final EnumC2982d SPRING = new EnumC2982d("SPRING", 4);

    /* renamed from: d5.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final EnumC2982d a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -1965056864:
                    if (lowerCase.equals("easeout")) {
                        return EnumC2982d.EASE_OUT;
                    }
                    break;
                case -1310315117:
                    if (lowerCase.equals("easein")) {
                        return EnumC2982d.EASE_IN;
                    }
                    break;
                case -1102672091:
                    if (lowerCase.equals("linear")) {
                        return EnumC2982d.LINEAR;
                    }
                    break;
                case -895679987:
                    if (lowerCase.equals("spring")) {
                        return EnumC2982d.SPRING;
                    }
                    break;
                case 1164546989:
                    if (lowerCase.equals("easeineaseout")) {
                        return EnumC2982d.EASE_IN_EASE_OUT;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported interpolation type : " + name);
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC2982d[] $values() {
        return new EnumC2982d[]{LINEAR, EASE_IN, EASE_OUT, EASE_IN_EASE_OUT, SPRING};
    }

    static {
        EnumC2982d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private EnumC2982d(String str, int i10) {
    }

    public static final EnumC2982d fromString(String str) {
        return Companion.a(str);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EnumC2982d valueOf(String str) {
        return (EnumC2982d) Enum.valueOf(EnumC2982d.class, str);
    }

    public static EnumC2982d[] values() {
        return (EnumC2982d[]) $VALUES.clone();
    }
}
