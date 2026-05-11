package Od;

import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class G {
    public static final int a(String str, int i10, int i11, int i12) {
        return (int) E.c(str, i10, i11, i12);
    }

    public static final long b(String str, long j10, long j11, long j12) {
        String d10 = E.d(str);
        if (d10 == null) {
            return j10;
        }
        Long l10 = StringsKt.l(d10);
        if (l10 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d10 + '\'').toString());
        }
        long longValue = l10.longValue();
        if (j11 <= longValue && longValue <= j12) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String d10 = E.d(str);
        return d10 == null ? str2 : d10;
    }

    public static final boolean d(String str, boolean z10) {
        String d10 = E.d(str);
        return d10 != null ? Boolean.parseBoolean(d10) : z10;
    }

    public static /* synthetic */ int e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return E.b(str, i10, i11, i12);
    }

    public static /* synthetic */ long f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return E.c(str, j10, j13, j12);
    }
}
