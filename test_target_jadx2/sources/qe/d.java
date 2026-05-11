package qe;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.C3880h;
import pe.S;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final C3880h f38889a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3880h f38890b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3880h f38891c;

    /* renamed from: d, reason: collision with root package name */
    private static final C3880h f38892d;

    /* renamed from: e, reason: collision with root package name */
    private static final C3880h f38893e;

    static {
        C3880h.a aVar = C3880h.f38683d;
        f38889a = aVar.d("/");
        f38890b = aVar.d("\\");
        f38891c = aVar.d("/\\");
        f38892d = aVar.d(".");
        f38893e = aVar.d("..");
    }

    public static final S j(S s10, S child, boolean z10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.n() || child.x() != null) {
            return child;
        }
        C3880h m10 = m(s10);
        if (m10 == null && (m10 = m(child)) == null) {
            m10 = s(S.f38612c);
        }
        C3877e c3877e = new C3877e();
        c3877e.Q1(s10.c());
        if (c3877e.size() > 0) {
            c3877e.Q1(m10);
        }
        c3877e.Q1(child.c());
        return q(c3877e, z10);
    }

    public static final S k(String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return q(new C3877e().T0(str), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(S s10) {
        int C10 = C3880h.C(s10.c(), f38889a, 0, 2, null);
        return C10 != -1 ? C10 : C3880h.C(s10.c(), f38890b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3880h m(S s10) {
        C3880h c10 = s10.c();
        C3880h c3880h = f38889a;
        if (C3880h.x(c10, c3880h, 0, 2, null) != -1) {
            return c3880h;
        }
        C3880h c11 = s10.c();
        C3880h c3880h2 = f38890b;
        if (C3880h.x(c11, c3880h2, 0, 2, null) != -1) {
            return c3880h2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(S s10) {
        return s10.c().o(f38893e) && (s10.c().L() == 2 || s10.c().F(s10.c().L() + (-3), f38889a, 0, 1) || s10.c().F(s10.c().L() + (-3), f38890b, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(S s10) {
        if (s10.c().L() == 0) {
            return -1;
        }
        if (s10.c().p(0) == 47) {
            return 1;
        }
        if (s10.c().p(0) == 92) {
            if (s10.c().L() <= 2 || s10.c().p(1) != 92) {
                return 1;
            }
            int v10 = s10.c().v(f38890b, 2);
            return v10 == -1 ? s10.c().L() : v10;
        }
        if (s10.c().L() > 2 && s10.c().p(1) == 58 && s10.c().p(2) == 92) {
            char p10 = (char) s10.c().p(0);
            if ('a' <= p10 && p10 < '{') {
                return 3;
            }
            if ('A' <= p10 && p10 < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(C3877e c3877e, C3880h c3880h) {
        if (!Intrinsics.b(c3880h, f38890b) || c3877e.size() < 2 || c3877e.p(1L) != 58) {
            return false;
        }
        char p10 = (char) c3877e.p(0L);
        return ('a' <= p10 && p10 < '{') || ('A' <= p10 && p10 < '[');
    }

    public static final S q(C3877e c3877e, boolean z10) {
        C3880h c3880h;
        C3880h Y10;
        Intrinsics.checkNotNullParameter(c3877e, "<this>");
        C3877e c3877e2 = new C3877e();
        C3880h c3880h2 = null;
        int i10 = 0;
        while (true) {
            if (!c3877e.D0(0L, f38889a)) {
                c3880h = f38890b;
                if (!c3877e.D0(0L, c3880h)) {
                    break;
                }
            }
            byte readByte = c3877e.readByte();
            if (c3880h2 == null) {
                c3880h2 = r(readByte);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && Intrinsics.b(c3880h2, c3880h);
        if (z11) {
            Intrinsics.d(c3880h2);
            c3877e2.Q1(c3880h2);
            c3877e2.Q1(c3880h2);
        } else if (i10 > 0) {
            Intrinsics.d(c3880h2);
            c3877e2.Q1(c3880h2);
        } else {
            long W02 = c3877e.W0(f38891c);
            if (c3880h2 == null) {
                c3880h2 = W02 == -1 ? s(S.f38612c) : r(c3877e.p(W02));
            }
            if (p(c3877e, c3880h2)) {
                if (W02 == 2) {
                    c3877e2.N0(c3877e, 3L);
                } else {
                    c3877e2.N0(c3877e, 2L);
                }
            }
        }
        boolean z12 = c3877e2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c3877e.p0()) {
            long W03 = c3877e.W0(f38891c);
            if (W03 == -1) {
                Y10 = c3877e.K();
            } else {
                Y10 = c3877e.Y(W03);
                c3877e.readByte();
            }
            C3880h c3880h3 = f38893e;
            if (Intrinsics.b(Y10, c3880h3)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || Intrinsics.b(CollectionsKt.n0(arrayList), c3880h3)))) {
                        arrayList.add(Y10);
                    } else if (!z11 || arrayList.size() != 1) {
                        CollectionsKt.G(arrayList);
                    }
                }
            } else if (!Intrinsics.b(Y10, f38892d) && !Intrinsics.b(Y10, C3880h.f38684e)) {
                arrayList.add(Y10);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                c3877e2.Q1(c3880h2);
            }
            c3877e2.Q1((C3880h) arrayList.get(i11));
        }
        if (c3877e2.size() == 0) {
            c3877e2.Q1(f38892d);
        }
        return new S(c3877e2.K());
    }

    private static final C3880h r(byte b10) {
        if (b10 == 47) {
            return f38889a;
        }
        if (b10 == 92) {
            return f38890b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3880h s(String str) {
        if (Intrinsics.b(str, "/")) {
            return f38889a;
        }
        if (Intrinsics.b(str, "\\")) {
            return f38890b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
