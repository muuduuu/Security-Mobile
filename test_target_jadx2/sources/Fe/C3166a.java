package fe;

import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC3878f;

/* renamed from: fe.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3166a {

    /* renamed from: a, reason: collision with root package name */
    private final String f33046a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33047b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33048c;

    public C3166a(String sections, String ranges, String mappings) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        this.f33046a = sections;
        this.f33047b = ranges;
        this.f33048c = mappings;
    }

    private final int a(int i10, int i11, int i12) {
        int i13;
        int i14 = i10 & 127;
        int i15 = i12 - 1;
        while (true) {
            if (i11 > i15) {
                i13 = (-i11) - 1;
                break;
            }
            i13 = (i11 + i15) / 2;
            int g10 = Intrinsics.g(i14, this.f33047b.charAt(i13 * 4));
            if (g10 >= 0) {
                if (g10 <= 0) {
                    break;
                }
                i11 = i13 + 1;
            } else {
                i15 = i13 - 1;
            }
        }
        return i13 >= 0 ? i13 * 4 : ((-i13) - 2) * 4;
    }

    private final int b(int i10) {
        int i11;
        int i12 = (i10 & 2097024) >> 7;
        int length = (this.f33046a.length() / 4) - 1;
        int i13 = 0;
        while (true) {
            if (i13 > length) {
                i11 = (-i13) - 1;
                break;
            }
            i11 = (i13 + length) / 2;
            int g10 = Intrinsics.g(i12, AbstractC3168c.a(this.f33046a, i11 * 4));
            if (g10 >= 0) {
                if (g10 <= 0) {
                    break;
                }
                i13 = i11 + 1;
            } else {
                length = i11 - 1;
            }
        }
        return i11 >= 0 ? i11 * 4 : ((-i11) - 2) * 4;
    }

    public final boolean c(int i10, InterfaceC3878f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int b10 = b(i10);
        int a10 = a(i10, AbstractC3168c.a(this.f33046a, b10 + 2), b10 + 4 < this.f33046a.length() ? AbstractC3168c.a(this.f33046a, b10 + 6) : this.f33047b.length() / 4);
        char charAt = this.f33047b.charAt(a10 + 1);
        if (charAt >= 0 && charAt < '@') {
            int a11 = AbstractC3168c.a(this.f33047b, a10 + 2);
            sink.e1(this.f33048c, a11, charAt + a11);
            return true;
        }
        if ('@' <= charAt && charAt < 'P') {
            sink.g0(i10 - (this.f33047b.charAt(a10 + 3) | (((charAt & 15) << 14) | (this.f33047b.charAt(a10 + 2) << 7))));
            return true;
        }
        if ('P' <= charAt && charAt < '`') {
            sink.g0(i10 + (this.f33047b.charAt(a10 + 3) | ((charAt & 15) << 14) | (this.f33047b.charAt(a10 + 2) << 7)));
            return true;
        }
        if (charAt == 'w') {
            return true;
        }
        if (charAt == 'x') {
            sink.g0(i10);
            return true;
        }
        if (charAt == 'y') {
            sink.g0(i10);
            return false;
        }
        if (charAt == 'z') {
            sink.q0(this.f33047b.charAt(a10 + 2));
            return true;
        }
        if (charAt == '{') {
            sink.q0(this.f33047b.charAt(a10 + 2) | 128);
            return true;
        }
        if (charAt == '|') {
            sink.q0(this.f33047b.charAt(a10 + 2));
            sink.q0(this.f33047b.charAt(a10 + 3));
            return true;
        }
        if (charAt == '}') {
            sink.q0(this.f33047b.charAt(a10 + 2) | 128);
            sink.q0(this.f33047b.charAt(a10 + 3));
            return true;
        }
        if (charAt == '~') {
            sink.q0(this.f33047b.charAt(a10 + 2));
            sink.q0(this.f33047b.charAt(a10 + 3) | 128);
            return true;
        }
        if (charAt == 127) {
            sink.q0(this.f33047b.charAt(a10 + 2) | 128);
            sink.q0(this.f33047b.charAt(a10 + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + i10).toString());
    }
}
