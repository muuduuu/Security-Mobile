package pe;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class S implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f38611b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f38612c;

    /* renamed from: a, reason: collision with root package name */
    private final C3880h f38613a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ S d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ S e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ S f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final S a(File file, boolean z10) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String file2 = file.toString();
            Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
            return b(file2, z10);
        }

        public final S b(String str, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return qe.d.k(str, z10);
        }

        public final S c(Path path, boolean z10) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return b(path.toString(), z10);
        }

        private a() {
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f38612c = separator;
    }

    public S(C3880h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f38613a = bytes;
    }

    public static /* synthetic */ S u(S s10, S s11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s10.t(s11, z10);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(S other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c().compareTo(other.c());
    }

    public final C3880h c() {
        return this.f38613a;
    }

    public final S d() {
        int o10;
        o10 = qe.d.o(this);
        if (o10 == -1) {
            return null;
        }
        return new S(c().N(0, o10));
    }

    public final List e() {
        int o10;
        ArrayList arrayList = new ArrayList();
        o10 = qe.d.o(this);
        if (o10 == -1) {
            o10 = 0;
        } else if (o10 < c().L() && c().p(o10) == 92) {
            o10++;
        }
        int L10 = c().L();
        int i10 = o10;
        while (o10 < L10) {
            if (c().p(o10) == 47 || c().p(o10) == 92) {
                arrayList.add(c().N(i10, o10));
                i10 = o10 + 1;
            }
            o10++;
        }
        if (i10 < c().L()) {
            arrayList.add(c().N(i10, c().L()));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof S) && Intrinsics.b(((S) obj).c(), c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    public final boolean n() {
        int o10;
        o10 = qe.d.o(this);
        return o10 != -1;
    }

    public final String o() {
        return p().R();
    }

    public final C3880h p() {
        int l10;
        l10 = qe.d.l(this);
        return l10 != -1 ? C3880h.O(c(), l10 + 1, 0, 2, null) : (x() == null || c().L() != 2) ? c() : C3880h.f38684e;
    }

    public final S q() {
        C3880h c3880h;
        C3880h c3880h2;
        C3880h c3880h3;
        boolean n10;
        int l10;
        S s10;
        C3880h c3880h4;
        C3880h c3880h5;
        C3880h c10 = c();
        c3880h = qe.d.f38892d;
        if (Intrinsics.b(c10, c3880h)) {
            return null;
        }
        C3880h c11 = c();
        c3880h2 = qe.d.f38889a;
        if (Intrinsics.b(c11, c3880h2)) {
            return null;
        }
        C3880h c12 = c();
        c3880h3 = qe.d.f38890b;
        if (Intrinsics.b(c12, c3880h3)) {
            return null;
        }
        n10 = qe.d.n(this);
        if (n10) {
            return null;
        }
        l10 = qe.d.l(this);
        if (l10 != 2 || x() == null) {
            if (l10 == 1) {
                C3880h c13 = c();
                c3880h5 = qe.d.f38890b;
                if (c13.M(c3880h5)) {
                    return null;
                }
            }
            if (l10 != -1 || x() == null) {
                if (l10 == -1) {
                    c3880h4 = qe.d.f38892d;
                    return new S(c3880h4);
                }
                if (l10 != 0) {
                    return new S(C3880h.O(c(), 0, l10, 1, null));
                }
                s10 = new S(C3880h.O(c(), 0, 1, 1, null));
            } else {
                if (c().L() == 2) {
                    return null;
                }
                s10 = new S(C3880h.O(c(), 0, 2, 1, null));
            }
        } else {
            if (c().L() == 3) {
                return null;
            }
            s10 = new S(C3880h.O(c(), 0, 3, 1, null));
        }
        return s10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r9 = qe.d.m(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final S r(S other) {
        C3880h c3880h;
        C3880h m10;
        C3880h c3880h2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.b(d(), other.d())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List e10 = e();
        List e11 = other.e();
        int min = Math.min(e10.size(), e11.size());
        int i10 = 0;
        while (i10 < min && Intrinsics.b(e10.get(i10), e11.get(i10))) {
            i10++;
        }
        if (i10 == min && c().L() == other.c().L()) {
            return a.e(f38611b, ".", false, 1, null);
        }
        List subList = e11.subList(i10, e11.size());
        c3880h = qe.d.f38893e;
        if (subList.indexOf(c3880h) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        C3877e c3877e = new C3877e();
        m10 = qe.d.m(other);
        if (m10 == null && m10 == null) {
            m10 = qe.d.s(f38612c);
        }
        int size = e11.size();
        for (int i11 = i10; i11 < size; i11++) {
            c3880h2 = qe.d.f38893e;
            c3877e.Q1(c3880h2);
            c3877e.Q1(m10);
        }
        int size2 = e10.size();
        while (i10 < size2) {
            c3877e.Q1((C3880h) e10.get(i10));
            c3877e.Q1(m10);
            i10++;
        }
        return qe.d.q(c3877e, false);
    }

    public final S s(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return qe.d.j(this, qe.d.q(new C3877e().T0(child), false), false);
    }

    public final S t(S child, boolean z10) {
        Intrinsics.checkNotNullParameter(child, "child");
        return qe.d.j(this, child, z10);
    }

    public String toString() {
        return c().R();
    }

    public final File v() {
        return new File(toString());
    }

    public final Path w() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public final Character x() {
        C3880h c3880h;
        C3880h c10 = c();
        c3880h = qe.d.f38889a;
        if (C3880h.x(c10, c3880h, 0, 2, null) != -1 || c().L() < 2 || c().p(1) != 58) {
            return null;
        }
        char p10 = (char) c().p(0);
        if (('a' > p10 || p10 >= '{') && ('A' > p10 || p10 >= '[')) {
            return null;
        }
        return Character.valueOf(p10);
    }
}
