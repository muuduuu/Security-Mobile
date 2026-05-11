package qe;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import lc.AbstractC3622a;
import lc.t;
import nc.AbstractC3728a;
import pe.AbstractC3882j;
import pe.AbstractC3884l;
import pe.InterfaceC3879g;
import pe.M;
import pe.S;
import pe.e0;
import xc.C5140A;
import xc.C5141B;
import xc.m;
import xc.y;

/* loaded from: classes3.dex */
public abstract class j {

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC3728a.a(((i) obj).b(), ((i) obj2).b());
        }
    }

    static final class b extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f38924a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f38925b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5140A f38926c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3879g f38927d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5140A f38928e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5140A f38929f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5141B f38930g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C5141B f38931h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C5141B f38932i;

        static final class a extends m implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5141B f38933a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3879g f38934b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C5141B f38935c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C5141B f38936d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5141B c5141b, InterfaceC3879g interfaceC3879g, C5141B c5141b2, C5141B c5141b3) {
                super(2);
                this.f38933a = c5141b;
                this.f38934b = interfaceC3879g;
                this.f38935c = c5141b2;
                this.f38936d = c5141b3;
            }

            public final void a(int i10, long j10) {
                if (i10 == 1) {
                    C5141B c5141b = this.f38933a;
                    if (c5141b.f44962a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (j10 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    c5141b.f44962a = Long.valueOf(this.f38934b.L1());
                    this.f38935c.f44962a = Long.valueOf(this.f38934b.L1());
                    this.f38936d.f44962a = Long.valueOf(this.f38934b.L1());
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).intValue(), ((Number) obj2).longValue());
                return Unit.f36324a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y yVar, long j10, C5140A c5140a, InterfaceC3879g interfaceC3879g, C5140A c5140a2, C5140A c5140a3, C5141B c5141b, C5141B c5141b2, C5141B c5141b3) {
            super(2);
            this.f38924a = yVar;
            this.f38925b = j10;
            this.f38926c = c5140a;
            this.f38927d = interfaceC3879g;
            this.f38928e = c5140a2;
            this.f38929f = c5140a3;
            this.f38930g = c5141b;
            this.f38931h = c5141b2;
            this.f38932i = c5141b3;
        }

        public final void a(int i10, long j10) {
            if (i10 != 1) {
                if (i10 != 10) {
                    return;
                }
                if (j10 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                this.f38927d.skip(4L);
                InterfaceC3879g interfaceC3879g = this.f38927d;
                j.i(interfaceC3879g, (int) (j10 - 4), new a(this.f38930g, interfaceC3879g, this.f38931h, this.f38932i));
                return;
            }
            y yVar = this.f38924a;
            if (yVar.f44999a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            yVar.f44999a = true;
            if (j10 < this.f38925b) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            C5140A c5140a = this.f38926c;
            long j11 = c5140a.f44961a;
            if (j11 == 4294967295L) {
                j11 = this.f38927d.L1();
            }
            c5140a.f44961a = j11;
            C5140A c5140a2 = this.f38928e;
            c5140a2.f44961a = c5140a2.f44961a == 4294967295L ? this.f38927d.L1() : 0L;
            C5140A c5140a3 = this.f38929f;
            c5140a3.f44961a = c5140a3.f44961a == 4294967295L ? this.f38927d.L1() : 0L;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return Unit.f36324a;
        }
    }

    static final class c extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3879g f38937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5141B f38938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5141B f38939c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C5141B f38940d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3879g interfaceC3879g, C5141B c5141b, C5141B c5141b2, C5141B c5141b3) {
            super(2);
            this.f38937a = interfaceC3879g;
            this.f38938b = c5141b;
            this.f38939c = c5141b2;
            this.f38940d = c5141b3;
        }

        public final void a(int i10, long j10) {
            if (i10 == 21589) {
                if (j10 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte readByte = this.f38937a.readByte();
                boolean z10 = (readByte & 1) == 1;
                boolean z11 = (readByte & 2) == 2;
                boolean z12 = (readByte & 4) == 4;
                InterfaceC3879g interfaceC3879g = this.f38937a;
                long j11 = z10 ? 5L : 1L;
                if (z11) {
                    j11 += 4;
                }
                if (z12) {
                    j11 += 4;
                }
                if (j10 < j11) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z10) {
                    this.f38938b.f44962a = Integer.valueOf(interfaceC3879g.w1());
                }
                if (z11) {
                    this.f38939c.f44962a = Integer.valueOf(this.f38937a.w1());
                }
                if (z12) {
                    this.f38940d.f44962a = Integer.valueOf(this.f38937a.w1());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return Unit.f36324a;
        }
    }

    private static final Map b(List list) {
        S e10 = S.a.e(S.f38611b, "/", false, 1, null);
        Map l10 = G.l(t.a(e10, new i(e10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        Iterator it = CollectionsKt.F0(list, new a()).iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (((i) l10.put(iVar.b(), iVar)) == null) {
                while (true) {
                    S q10 = iVar.b().q();
                    if (q10 != null) {
                        i iVar2 = (i) l10.get(q10);
                        if (iVar2 != null) {
                            iVar2.c().add(iVar.b());
                            break;
                        }
                        i iVar3 = new i(q10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        l10.put(q10, iVar3);
                        iVar3.c().add(iVar.b());
                        iVar = iVar3;
                        it = it;
                    }
                }
            }
        }
        return l10;
    }

    public static final Long c(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(k.a(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long d(long j10) {
        return (j10 / ModuleDescriptor.MODULE_VERSION) - 11644473600000L;
    }

    private static final String e(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String num = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        sb2.append(num);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0019, B:5:0x0027, B:6:0x0030, B:19:0x004e, B:21:0x005a, B:61:0x0109, B:67:0x00fd, B:79:0x010a, B:99:0x016a, B:106:0x0179, B:120:0x0165, B:10:0x017c, B:14:0x0188, B:15:0x018f, B:124:0x0190, B:125:0x0193, B:126:0x0194, B:127:0x01ae, B:116:0x015f, B:81:0x011b, B:84:0x0123, B:86:0x0133, B:88:0x013f, B:90:0x0146, B:93:0x014a, B:94:0x0151, B:96:0x0152, B:8:0x0038, B:18:0x0041, B:63:0x00f7), top: B:2:0x0019, inners: #1, #2, #10, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e0 f(S zipPath, AbstractC3884l fileSystem, Function1 predicate) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        int w12;
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        AbstractC3882j n10 = fileSystem.n(zipPath);
        try {
            long size = n10.size() - 22;
            if (size < 0) {
                throw new IOException("not a zip: size=" + n10.size());
            }
            long max = Math.max(size - 65536, 0L);
            do {
                InterfaceC3879g c10 = M.c(n10.l(size));
                try {
                    if (c10.w1() == 101010256) {
                        f h10 = h(c10);
                        String R10 = c10.R(h10.b());
                        c10.close();
                        long j10 = size - 20;
                        Throwable th4 = null;
                        if (j10 > 0) {
                            InterfaceC3879g c11 = M.c(n10.l(j10));
                            try {
                                if (c11.w1() == 117853008) {
                                    int w13 = c11.w1();
                                    long L12 = c11.L1();
                                    if (c11.w1() != 1 || w13 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    InterfaceC3879g c12 = M.c(n10.l(L12));
                                    try {
                                        w12 = c12.w1();
                                    } catch (Throwable th5) {
                                        if (c12 != null) {
                                            try {
                                                c12.close();
                                            } catch (Throwable th6) {
                                                try {
                                                    AbstractC3622a.a(th5, th6);
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    h10 = h10;
                                                    if (c11 != null) {
                                                        try {
                                                            c11.close();
                                                        } catch (Throwable th8) {
                                                            AbstractC3622a.a(th, th8);
                                                        }
                                                    }
                                                    th2 = th;
                                                    if (th2 == null) {
                                                    }
                                                }
                                            }
                                        }
                                        th3 = th5;
                                        h10 = h10;
                                    }
                                    if (w12 != 101075792) {
                                        throw new IOException("bad zip: expected " + e(101075792) + " but was " + e(w12));
                                    }
                                    h10 = l(c12, h10);
                                    Unit unit = Unit.f36324a;
                                    if (c12 != null) {
                                        try {
                                            c12.close();
                                        } catch (Throwable th9) {
                                            th3 = th9;
                                        }
                                    }
                                    th3 = null;
                                    if (th3 != null) {
                                        throw th3;
                                    }
                                }
                                Unit unit2 = Unit.f36324a;
                                if (c11 != null) {
                                    try {
                                        c11.close();
                                    } catch (Throwable th10) {
                                        th2 = th10;
                                    }
                                }
                                th2 = null;
                            } catch (Throwable th11) {
                                th = th11;
                            }
                            if (th2 == null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        InterfaceC3879g c13 = M.c(n10.l(h10.a()));
                        try {
                            long c14 = h10.c();
                            for (long j11 = 0; j11 < c14; j11++) {
                                i g10 = g(c13);
                                if (g10.i() >= h10.a()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) predicate.invoke(g10)).booleanValue()) {
                                    arrayList.add(g10);
                                }
                            }
                            Unit unit3 = Unit.f36324a;
                            if (c13 != null) {
                                try {
                                    c13.close();
                                } catch (Throwable th12) {
                                    th4 = th12;
                                }
                            }
                        } catch (Throwable th13) {
                            th4 = th13;
                            if (c13 != null) {
                                try {
                                    c13.close();
                                } catch (Throwable th14) {
                                    AbstractC3622a.a(th4, th14);
                                }
                            }
                        }
                        if (th4 != null) {
                            throw th4;
                        }
                        e0 e0Var = new e0(zipPath, fileSystem, b(arrayList), R10);
                        if (n10 != null) {
                            try {
                                n10.close();
                            } catch (Throwable unused) {
                            }
                        }
                        return e0Var;
                    }
                    c10.close();
                    size--;
                } finally {
                    c10.close();
                }
            } while (size >= max);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    public static final i g(InterfaceC3879g interfaceC3879g) {
        Intrinsics.checkNotNullParameter(interfaceC3879g, "<this>");
        int w12 = interfaceC3879g.w1();
        if (w12 != 33639248) {
            throw new IOException("bad zip: expected " + e(33639248) + " but was " + e(w12));
        }
        interfaceC3879g.skip(4L);
        short I12 = interfaceC3879g.I1();
        int i10 = I12 & 65535;
        if ((I12 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i10));
        }
        int I13 = interfaceC3879g.I1() & 65535;
        int I14 = interfaceC3879g.I1() & 65535;
        int I15 = interfaceC3879g.I1() & 65535;
        long w13 = interfaceC3879g.w1() & 4294967295L;
        C5140A c5140a = new C5140A();
        c5140a.f44961a = interfaceC3879g.w1() & 4294967295L;
        C5140A c5140a2 = new C5140A();
        c5140a2.f44961a = interfaceC3879g.w1() & 4294967295L;
        int I16 = interfaceC3879g.I1() & 65535;
        int I17 = interfaceC3879g.I1() & 65535;
        int I18 = interfaceC3879g.I1() & 65535;
        interfaceC3879g.skip(8L);
        C5140A c5140a3 = new C5140A();
        c5140a3.f44961a = interfaceC3879g.w1() & 4294967295L;
        String R10 = interfaceC3879g.R(I16);
        if (StringsKt.J(R10, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = c5140a2.f44961a == 4294967295L ? 8 : 0L;
        if (c5140a.f44961a == 4294967295L) {
            j10 += 8;
        }
        if (c5140a3.f44961a == 4294967295L) {
            j10 += 8;
        }
        long j11 = j10;
        C5141B c5141b = new C5141B();
        C5141B c5141b2 = new C5141B();
        C5141B c5141b3 = new C5141B();
        y yVar = new y();
        i(interfaceC3879g, I17, new b(yVar, j11, c5140a2, interfaceC3879g, c5140a, c5140a3, c5141b, c5141b2, c5141b3));
        if (j11 <= 0 || yVar.f44999a) {
            return new i(S.a.e(S.f38611b, "/", false, 1, null).s(R10), StringsKt.q(R10, "/", false, 2, null), interfaceC3879g.R(I18), w13, c5140a.f44961a, c5140a2.f44961a, I13, c5140a3.f44961a, I15, I14, (Long) c5141b.f44962a, (Long) c5141b2.f44962a, (Long) c5141b3.f44962a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final f h(InterfaceC3879g interfaceC3879g) {
        int I12 = interfaceC3879g.I1() & 65535;
        int I13 = interfaceC3879g.I1() & 65535;
        long I14 = interfaceC3879g.I1() & 65535;
        if (I14 != (interfaceC3879g.I1() & 65535) || I12 != 0 || I13 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC3879g.skip(4L);
        return new f(I14, 4294967295L & interfaceC3879g.w1(), interfaceC3879g.I1() & 65535);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC3879g interfaceC3879g, int i10, Function2 function2) {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int I12 = interfaceC3879g.I1() & 65535;
            long I13 = interfaceC3879g.I1() & 65535;
            long j11 = j10 - 4;
            if (j11 < I13) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC3879g.S1(I13);
            long size = interfaceC3879g.m().size();
            function2.invoke(Integer.valueOf(I12), Long.valueOf(I13));
            long size2 = (interfaceC3879g.m().size() + I13) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + I12);
            }
            if (size2 > 0) {
                interfaceC3879g.m().skip(size2);
            }
            j10 = j11 - I13;
        }
    }

    public static final i j(InterfaceC3879g interfaceC3879g, i centralDirectoryZipEntry) {
        Intrinsics.checkNotNullParameter(interfaceC3879g, "<this>");
        Intrinsics.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        i k10 = k(interfaceC3879g, centralDirectoryZipEntry);
        Intrinsics.d(k10);
        return k10;
    }

    private static final i k(InterfaceC3879g interfaceC3879g, i iVar) {
        int w12 = interfaceC3879g.w1();
        if (w12 != 67324752) {
            throw new IOException("bad zip: expected " + e(67324752) + " but was " + e(w12));
        }
        interfaceC3879g.skip(2L);
        short I12 = interfaceC3879g.I1();
        int i10 = I12 & 65535;
        if ((I12 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i10));
        }
        interfaceC3879g.skip(18L);
        int I13 = interfaceC3879g.I1() & 65535;
        interfaceC3879g.skip(interfaceC3879g.I1() & 65535);
        if (iVar == null) {
            interfaceC3879g.skip(I13);
            return null;
        }
        C5141B c5141b = new C5141B();
        C5141B c5141b2 = new C5141B();
        C5141B c5141b3 = new C5141B();
        i(interfaceC3879g, I13, new c(interfaceC3879g, c5141b, c5141b2, c5141b3));
        return iVar.a((Integer) c5141b.f44962a, (Integer) c5141b2.f44962a, (Integer) c5141b3.f44962a);
    }

    private static final f l(InterfaceC3879g interfaceC3879g, f fVar) {
        interfaceC3879g.skip(12L);
        int w12 = interfaceC3879g.w1();
        int w13 = interfaceC3879g.w1();
        long L12 = interfaceC3879g.L1();
        if (L12 != interfaceC3879g.L1() || w12 != 0 || w13 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC3879g.skip(8L);
        return new f(L12, interfaceC3879g.L1(), fVar.b());
    }

    public static final void m(InterfaceC3879g interfaceC3879g) {
        Intrinsics.checkNotNullParameter(interfaceC3879g, "<this>");
        k(interfaceC3879g, null);
    }
}
