package d5;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2980b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC2980b[] $VALUES;
    public static final a Companion;
    public static final EnumC2980b OPACITY = new EnumC2980b("OPACITY", 0);
    public static final EnumC2980b SCALE_X = new EnumC2980b("SCALE_X", 1);
    public static final EnumC2980b SCALE_Y = new EnumC2980b("SCALE_Y", 2);
    public static final EnumC2980b SCALE_XY = new EnumC2980b("SCALE_XY", 3);

    /* renamed from: d5.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final EnumC2980b a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            switch (name.hashCode()) {
                case -1267206133:
                    if (name.equals("opacity")) {
                        return EnumC2980b.OPACITY;
                    }
                    break;
                case -908189618:
                    if (name.equals("scaleX")) {
                        return EnumC2980b.SCALE_X;
                    }
                    break;
                case -908189617:
                    if (name.equals("scaleY")) {
                        return EnumC2980b.SCALE_Y;
                    }
                    break;
                case 1910893003:
                    if (name.equals("scaleXY")) {
                        return EnumC2980b.SCALE_XY;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported animated property: " + name);
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC2980b[] $values() {
        return new EnumC2980b[]{OPACITY, SCALE_X, SCALE_Y, SCALE_XY};
    }

    static {
        EnumC2980b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private EnumC2980b(String str, int i10) {
    }

    public static final EnumC2980b fromString(String str) {
        return Companion.a(str);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EnumC2980b valueOf(String str) {
        return (EnumC2980b) Enum.valueOf(EnumC2980b.class, str);
    }

    public static EnumC2980b[] values() {
        return (EnumC2980b[]) $VALUES.clone();
    }
}
