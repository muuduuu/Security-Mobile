package md;

import Kc.G;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import yd.M;

/* renamed from: md.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3678e extends AbstractC3688o {
    public C3678e(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        return c10 == '\b' ? "\\b" : c10 == '\t' ? "\\t" : c10 == '\n' ? "\\n" : c10 == '\f' ? "\\f" : c10 == '\r' ? "\\r" : e(c10) ? String.valueOf(c10) : "?";
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // md.AbstractC3680g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        M u10 = module.v().u();
        Intrinsics.checkNotNullExpressionValue(u10, "getCharType(...)");
        return u10;
    }

    @Override // md.AbstractC3680g
    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) b()).charValue()), c(((Character) b()).charValue())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
