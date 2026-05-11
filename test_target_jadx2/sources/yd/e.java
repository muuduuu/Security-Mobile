package Yd;

import Wd.p;
import ge.n;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lc.AbstractC3622a;
import pe.AbstractC3884l;
import pe.AbstractC3885m;
import pe.AbstractC3887o;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import pe.M;
import pe.S;
import pe.Z;
import pe.b0;
import xc.m;

/* loaded from: classes3.dex */
public final class e implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    private final S f12227a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12228b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12229c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3884l f12230d;

    /* renamed from: e, reason: collision with root package name */
    private long f12231e;

    /* renamed from: f, reason: collision with root package name */
    private final S f12232f;

    /* renamed from: g, reason: collision with root package name */
    private final S f12233g;

    /* renamed from: h, reason: collision with root package name */
    private final S f12234h;

    /* renamed from: i, reason: collision with root package name */
    private long f12235i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC3878f f12236j;

    /* renamed from: k, reason: collision with root package name */
    private final LinkedHashMap f12237k;

    /* renamed from: l, reason: collision with root package name */
    private int f12238l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12239m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12240n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12241o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12242p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12243q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f12244r;

    /* renamed from: s, reason: collision with root package name */
    private long f12245s;

    /* renamed from: t, reason: collision with root package name */
    private final Zd.c f12246t;

    /* renamed from: u, reason: collision with root package name */
    private final C0227e f12247u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f12222v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final String f12223w = "journal";

    /* renamed from: x, reason: collision with root package name */
    public static final String f12224x = "journal.tmp";

    /* renamed from: y, reason: collision with root package name */
    public static final String f12225y = "journal.bkp";

    /* renamed from: z, reason: collision with root package name */
    public static final String f12226z = "libcore.io.DiskLruCache";

    /* renamed from: A, reason: collision with root package name */
    public static final String f12215A = "1";

    /* renamed from: B, reason: collision with root package name */
    public static final long f12216B = -1;

    /* renamed from: C, reason: collision with root package name */
    public static final Regex f12217C = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: D, reason: collision with root package name */
    public static final String f12218D = "CLEAN";

    /* renamed from: E, reason: collision with root package name */
    public static final String f12219E = "DIRTY";

    /* renamed from: F, reason: collision with root package name */
    public static final String f12220F = "REMOVE";

    /* renamed from: G, reason: collision with root package name */
    public static final String f12221G = "READ";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f12248a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f12249b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f12250c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f12251d;

        static final class a extends m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f12252a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f12253b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, b bVar) {
                super(1);
                this.f12252a = eVar;
                this.f12253b = bVar;
            }

            public final void a(IOException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                e eVar = this.f12252a;
                b bVar = this.f12253b;
                synchronized (eVar) {
                    bVar.c();
                    Unit unit = Unit.f36324a;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((IOException) obj);
                return Unit.f36324a;
            }
        }

        public b(e eVar, c entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f12251d = eVar;
            this.f12248a = entry;
            this.f12249b = entry.g() ? null : new boolean[eVar.x()];
        }

        public final void a() {
            e eVar = this.f12251d;
            synchronized (eVar) {
                try {
                    if (this.f12250c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.b(this.f12248a.b(), this)) {
                        eVar.n(this, false);
                    }
                    this.f12250c = true;
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            e eVar = this.f12251d;
            synchronized (eVar) {
                try {
                    if (this.f12250c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.b(this.f12248a.b(), this)) {
                        eVar.n(this, true);
                    }
                    this.f12250c = true;
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (Intrinsics.b(this.f12248a.b(), this)) {
                if (this.f12251d.f12240n) {
                    this.f12251d.n(this, false);
                } else {
                    this.f12248a.q(true);
                }
            }
        }

        public final c d() {
            return this.f12248a;
        }

        public final boolean[] e() {
            return this.f12249b;
        }

        public final Z f(int i10) {
            e eVar = this.f12251d;
            synchronized (eVar) {
                if (this.f12250c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.b(this.f12248a.b(), this)) {
                    return M.a();
                }
                if (!this.f12248a.g()) {
                    boolean[] zArr = this.f12249b;
                    Intrinsics.d(zArr);
                    zArr[i10] = true;
                }
                try {
                    return new Yd.f(eVar.u().o((S) this.f12248a.c().get(i10)), new a(eVar, this));
                } catch (FileNotFoundException unused) {
                    return M.a();
                }
            }
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f12254a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f12255b;

        /* renamed from: c, reason: collision with root package name */
        private final List f12256c;

        /* renamed from: d, reason: collision with root package name */
        private final List f12257d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f12258e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f12259f;

        /* renamed from: g, reason: collision with root package name */
        private b f12260g;

        /* renamed from: h, reason: collision with root package name */
        private int f12261h;

        /* renamed from: i, reason: collision with root package name */
        private long f12262i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f12263j;

        public static final class a extends AbstractC3887o {

            /* renamed from: b, reason: collision with root package name */
            private boolean f12264b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f12265c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f12266d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, e eVar, c cVar) {
                super(b0Var);
                this.f12265c = eVar;
                this.f12266d = cVar;
            }

            @Override // pe.AbstractC3887o, pe.b0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f12264b) {
                    return;
                }
                this.f12264b = true;
                e eVar = this.f12265c;
                c cVar = this.f12266d;
                synchronized (eVar) {
                    try {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            eVar.Q(cVar);
                        }
                        Unit unit = Unit.f36324a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(e eVar, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f12263j = eVar;
            this.f12254a = key;
            this.f12255b = new long[eVar.x()];
            this.f12256c = new ArrayList();
            this.f12257d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int x10 = eVar.x();
            for (int i10 = 0; i10 < x10; i10++) {
                sb2.append(i10);
                List list = this.f12256c;
                S t10 = this.f12263j.t();
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                list.add(t10.s(sb3));
                sb2.append(".tmp");
                List list2 = this.f12257d;
                S t11 = this.f12263j.t();
                String sb4 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                list2.add(t11.s(sb4));
                sb2.setLength(length);
            }
        }

        private final Void j(List list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final b0 k(int i10) {
            b0 q10 = this.f12263j.u().q((S) this.f12256c.get(i10));
            if (this.f12263j.f12240n) {
                return q10;
            }
            this.f12261h++;
            return new a(q10, this.f12263j, this);
        }

        public final List a() {
            return this.f12256c;
        }

        public final b b() {
            return this.f12260g;
        }

        public final List c() {
            return this.f12257d;
        }

        public final String d() {
            return this.f12254a;
        }

        public final long[] e() {
            return this.f12255b;
        }

        public final int f() {
            return this.f12261h;
        }

        public final boolean g() {
            return this.f12258e;
        }

        public final long h() {
            return this.f12262i;
        }

        public final boolean i() {
            return this.f12259f;
        }

        public final void l(b bVar) {
            this.f12260g = bVar;
        }

        public final void m(List strings) {
            Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.f12263j.x()) {
                j(strings);
                throw new lc.e();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f12255b[i10] = Long.parseLong((String) strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new lc.e();
            }
        }

        public final void n(int i10) {
            this.f12261h = i10;
        }

        public final void o(boolean z10) {
            this.f12258e = z10;
        }

        public final void p(long j10) {
            this.f12262i = j10;
        }

        public final void q(boolean z10) {
            this.f12259f = z10;
        }

        public final d r() {
            e eVar = this.f12263j;
            if (p.f11601e && !Thread.holdsLock(eVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + eVar);
            }
            if (!this.f12258e) {
                return null;
            }
            if (!this.f12263j.f12240n && (this.f12260g != null || this.f12259f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f12255b.clone();
            try {
                int x10 = this.f12263j.x();
                for (int i10 = 0; i10 < x10; i10++) {
                    arrayList.add(k(i10));
                }
                return new d(this.f12263j, this.f12254a, this.f12262i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Wd.m.f((b0) it.next());
                }
                try {
                    this.f12263j.Q(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(InterfaceC3878f writer) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j10 : this.f12255b) {
                writer.q0(32).V1(j10);
            }
        }
    }

    public final class d implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f12267a;

        /* renamed from: b, reason: collision with root package name */
        private final long f12268b;

        /* renamed from: c, reason: collision with root package name */
        private final List f12269c;

        /* renamed from: d, reason: collision with root package name */
        private final long[] f12270d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f12271e;

        public d(e eVar, String key, long j10, List sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.f12271e = eVar;
            this.f12267a = key;
            this.f12268b = j10;
            this.f12269c = sources;
            this.f12270d = lengths;
        }

        public final b a() {
            return this.f12271e.p(this.f12267a, this.f12268b);
        }

        public final b0 b(int i10) {
            return (b0) this.f12269c.get(i10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f12269c.iterator();
            while (it.hasNext()) {
                Wd.m.f((b0) it.next());
            }
        }
    }

    /* renamed from: Yd.e$e, reason: collision with other inner class name */
    public static final class C0227e extends Zd.a {
        C0227e(String str) {
            super(str, false, 2, null);
        }

        @Override // Zd.a
        public long f() {
            e eVar = e.this;
            synchronized (eVar) {
                if (!eVar.f12241o || eVar.s()) {
                    return -1L;
                }
                try {
                    eVar.o0();
                } catch (IOException unused) {
                    eVar.f12243q = true;
                }
                try {
                    if (eVar.z()) {
                        eVar.K();
                        eVar.f12238l = 0;
                    }
                } catch (IOException unused2) {
                    eVar.f12244r = true;
                    InterfaceC3878f interfaceC3878f = eVar.f12236j;
                    if (interfaceC3878f != null) {
                        Wd.m.f(interfaceC3878f);
                    }
                    eVar.f12236j = M.b(M.a());
                }
                return -1L;
            }
        }
    }

    public static final class f extends AbstractC3885m {
        f(AbstractC3884l abstractC3884l) {
            super(abstractC3884l);
        }

        @Override // pe.AbstractC3885m, pe.AbstractC3884l
        public Z p(S file, boolean z10) {
            Intrinsics.checkNotNullParameter(file, "file");
            S q10 = file.q();
            if (q10 != null) {
                d(q10);
            }
            return super.p(file, z10);
        }
    }

    static final class g extends m implements Function1 {
        g() {
            super(1);
        }

        public final void a(IOException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            e eVar = e.this;
            if (!p.f11601e || Thread.holdsLock(eVar)) {
                e.this.f12239m = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + eVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IOException) obj);
            return Unit.f36324a;
        }
    }

    public e(AbstractC3884l fileSystem, S directory, int i10, int i11, long j10, Zd.d taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f12227a = directory;
        this.f12228b = i10;
        this.f12229c = i11;
        this.f12230d = new f(fileSystem);
        this.f12231e = j10;
        this.f12237k = new LinkedHashMap(0, 0.75f, true);
        this.f12246t = taskRunner.k();
        this.f12247u = new C0227e(p.f11602f + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f12232f = directory.s(f12223w);
        this.f12233g = directory.s(f12224x);
        this.f12234h = directory.s(f12225y);
    }

    private final InterfaceC3878f C() {
        return M.b(new Yd.f(this.f12230d.a(this.f12232f), new g()));
    }

    private final void F() {
        Wd.m.i(this.f12230d, this.f12233g);
        Iterator it = this.f12237k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            c cVar = (c) next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f12229c;
                while (i10 < i11) {
                    this.f12235i += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f12229c;
                while (i10 < i12) {
                    Wd.m.i(this.f12230d, (S) cVar.a().get(i10));
                    Wd.m.i(this.f12230d, (S) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void H() {
        InterfaceC3879g c10 = M.c(this.f12230d.q(this.f12232f));
        try {
            String u12 = c10.u1();
            String u13 = c10.u1();
            String u14 = c10.u1();
            String u15 = c10.u1();
            String u16 = c10.u1();
            if (!Intrinsics.b(f12226z, u12) || !Intrinsics.b(f12215A, u13) || !Intrinsics.b(String.valueOf(this.f12228b), u14) || !Intrinsics.b(String.valueOf(this.f12229c), u15) || u16.length() > 0) {
                throw new IOException("unexpected journal header: [" + u12 + ", " + u13 + ", " + u15 + ", " + u16 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    I(c10.u1());
                    i10++;
                } catch (EOFException unused) {
                    this.f12238l = i10 - this.f12237k.size();
                    if (c10.p0()) {
                        InterfaceC3878f interfaceC3878f = this.f12236j;
                        if (interfaceC3878f != null) {
                            Wd.m.f(interfaceC3878f);
                        }
                        this.f12236j = C();
                    } else {
                        K();
                    }
                    Unit unit = Unit.f36324a;
                    if (c10 != null) {
                        try {
                            c10.close();
                        } catch (Throwable th) {
                            th = th;
                            if (th != null) {
                                throw th;
                            }
                            return;
                        }
                    }
                    th = null;
                    if (th != null) {
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c10 != null) {
                try {
                    c10.close();
                } catch (Throwable th3) {
                    AbstractC3622a.a(th, th3);
                }
            }
            if (th != null) {
            }
        }
    }

    private final void I(String str) {
        String substring;
        int W10 = StringsKt.W(str, ' ', 0, false, 6, null);
        if (W10 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = W10 + 1;
        int W11 = StringsKt.W(str, ' ', i10, false, 4, null);
        if (W11 == -1) {
            substring = str.substring(i10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String str2 = f12220F;
            if (W10 == str2.length() && StringsKt.F(str, str2, false, 2, null)) {
                this.f12237k.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i10, W11);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        c cVar = (c) this.f12237k.get(substring);
        if (cVar == null) {
            cVar = new c(this, substring);
            this.f12237k.put(substring, cVar);
        }
        if (W11 != -1) {
            String str3 = f12218D;
            if (W10 == str3.length() && StringsKt.F(str, str3, false, 2, null)) {
                String substring2 = str.substring(W11 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                List x02 = StringsKt.x0(substring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(x02);
                return;
            }
        }
        if (W11 == -1) {
            String str4 = f12219E;
            if (W10 == str4.length() && StringsKt.F(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (W11 == -1) {
            String str5 = f12221G;
            if (W10 == str5.length() && StringsKt.F(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean i0() {
        for (c cVar : this.f12237k.values()) {
            if (!cVar.i()) {
                Intrinsics.d(cVar);
                Q(cVar);
                return true;
            }
        }
        return false;
    }

    private final synchronized void l() {
        if (this.f12242p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ b q(e eVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = f12216B;
        }
        return eVar.p(str, j10);
    }

    private final void y0(String str) {
        if (f12217C.d(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z() {
        int i10 = this.f12238l;
        return i10 >= 2000 && i10 >= this.f12237k.size();
    }

    public final synchronized void K() {
        Throwable th;
        try {
            InterfaceC3878f interfaceC3878f = this.f12236j;
            if (interfaceC3878f != null) {
                interfaceC3878f.close();
            }
            InterfaceC3878f b10 = M.b(this.f12230d.p(this.f12233g, false));
            try {
                b10.T0(f12226z).q0(10);
                b10.T0(f12215A).q0(10);
                b10.V1(this.f12228b).q0(10);
                b10.V1(this.f12229c).q0(10);
                b10.q0(10);
                for (c cVar : this.f12237k.values()) {
                    if (cVar.b() != null) {
                        b10.T0(f12219E).q0(32);
                        b10.T0(cVar.d());
                        b10.q0(10);
                    } else {
                        b10.T0(f12218D).q0(32);
                        b10.T0(cVar.d());
                        cVar.s(b10);
                        b10.q0(10);
                    }
                }
                Unit unit = Unit.f36324a;
                if (b10 != null) {
                    try {
                        b10.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                th = null;
            } catch (Throwable th3) {
                if (b10 != null) {
                    try {
                        b10.close();
                    } catch (Throwable th4) {
                        AbstractC3622a.a(th3, th4);
                    }
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            if (this.f12230d.j(this.f12232f)) {
                this.f12230d.c(this.f12232f, this.f12234h);
                this.f12230d.c(this.f12233g, this.f12232f);
                Wd.m.i(this.f12230d, this.f12234h);
            } else {
                this.f12230d.c(this.f12233g, this.f12232f);
            }
            InterfaceC3878f interfaceC3878f2 = this.f12236j;
            if (interfaceC3878f2 != null) {
                Wd.m.f(interfaceC3878f2);
            }
            this.f12236j = C();
            this.f12239m = false;
            this.f12244r = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized boolean N(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        y();
        l();
        y0(key);
        c cVar = (c) this.f12237k.get(key);
        if (cVar == null) {
            return false;
        }
        boolean Q10 = Q(cVar);
        if (Q10 && this.f12235i <= this.f12231e) {
            this.f12243q = false;
        }
        return Q10;
    }

    public final boolean Q(c entry) {
        InterfaceC3878f interfaceC3878f;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.f12240n) {
            if (entry.f() > 0 && (interfaceC3878f = this.f12236j) != null) {
                interfaceC3878f.T0(f12219E);
                interfaceC3878f.q0(32);
                interfaceC3878f.T0(entry.d());
                interfaceC3878f.q0(10);
                interfaceC3878f.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b b10 = entry.b();
        if (b10 != null) {
            b10.c();
        }
        int i10 = this.f12229c;
        for (int i11 = 0; i11 < i10; i11++) {
            Wd.m.i(this.f12230d, (S) entry.a().get(i11));
            this.f12235i -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f12238l++;
        InterfaceC3878f interfaceC3878f2 = this.f12236j;
        if (interfaceC3878f2 != null) {
            interfaceC3878f2.T0(f12220F);
            interfaceC3878f2.q0(32);
            interfaceC3878f2.T0(entry.d());
            interfaceC3878f2.q0(10);
        }
        this.f12237k.remove(entry.d());
        if (z()) {
            Zd.c.m(this.f12246t, this.f12247u, 0L, 2, null);
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b b10;
        try {
            if (this.f12241o && !this.f12242p) {
                Collection values = this.f12237k.values();
                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                for (c cVar : (c[]) values.toArray(new c[0])) {
                    if (cVar.b() != null && (b10 = cVar.b()) != null) {
                        b10.c();
                    }
                }
                o0();
                InterfaceC3878f interfaceC3878f = this.f12236j;
                if (interfaceC3878f != null) {
                    Wd.m.f(interfaceC3878f);
                }
                this.f12236j = null;
                this.f12242p = true;
                return;
            }
            this.f12242p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f12241o) {
            l();
            o0();
            InterfaceC3878f interfaceC3878f = this.f12236j;
            Intrinsics.d(interfaceC3878f);
            interfaceC3878f.flush();
        }
    }

    public final synchronized void n(b editor, boolean z10) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        c d10 = editor.d();
        if (!Intrinsics.b(d10.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !d10.g()) {
            int i10 = this.f12229c;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] e10 = editor.e();
                Intrinsics.d(e10);
                if (!e10[i11]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.f12230d.j((S) d10.c().get(i11))) {
                    editor.a();
                    return;
                }
            }
        }
        int i12 = this.f12229c;
        for (int i13 = 0; i13 < i12; i13++) {
            S s10 = (S) d10.c().get(i13);
            if (!z10 || d10.i()) {
                Wd.m.i(this.f12230d, s10);
            } else if (this.f12230d.j(s10)) {
                S s11 = (S) d10.a().get(i13);
                this.f12230d.c(s10, s11);
                long j10 = d10.e()[i13];
                Long c10 = this.f12230d.l(s11).c();
                long longValue = c10 != null ? c10.longValue() : 0L;
                d10.e()[i13] = longValue;
                this.f12235i = (this.f12235i - j10) + longValue;
            }
        }
        d10.l(null);
        if (d10.i()) {
            Q(d10);
            return;
        }
        this.f12238l++;
        InterfaceC3878f interfaceC3878f = this.f12236j;
        Intrinsics.d(interfaceC3878f);
        if (!d10.g() && !z10) {
            this.f12237k.remove(d10.d());
            interfaceC3878f.T0(f12220F).q0(32);
            interfaceC3878f.T0(d10.d());
            interfaceC3878f.q0(10);
            interfaceC3878f.flush();
            if (this.f12235i <= this.f12231e || z()) {
                Zd.c.m(this.f12246t, this.f12247u, 0L, 2, null);
            }
        }
        d10.o(true);
        interfaceC3878f.T0(f12218D).q0(32);
        interfaceC3878f.T0(d10.d());
        d10.s(interfaceC3878f);
        interfaceC3878f.q0(10);
        if (z10) {
            long j11 = this.f12245s;
            this.f12245s = 1 + j11;
            d10.p(j11);
        }
        interfaceC3878f.flush();
        if (this.f12235i <= this.f12231e) {
        }
        Zd.c.m(this.f12246t, this.f12247u, 0L, 2, null);
    }

    public final void o() {
        close();
        Wd.m.h(this.f12230d, this.f12227a);
    }

    public final void o0() {
        while (this.f12235i > this.f12231e) {
            if (!i0()) {
                return;
            }
        }
        this.f12243q = false;
    }

    public final synchronized b p(String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        y();
        l();
        y0(key);
        c cVar = (c) this.f12237k.get(key);
        if (j10 != f12216B && (cVar == null || cVar.h() != j10)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f12243q && !this.f12244r) {
            InterfaceC3878f interfaceC3878f = this.f12236j;
            Intrinsics.d(interfaceC3878f);
            interfaceC3878f.T0(f12219E).q0(32).T0(key).q0(10);
            interfaceC3878f.flush();
            if (this.f12239m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f12237k.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        Zd.c.m(this.f12246t, this.f12247u, 0L, 2, null);
        return null;
    }

    public final synchronized d r(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        y();
        l();
        y0(key);
        c cVar = (c) this.f12237k.get(key);
        if (cVar == null) {
            return null;
        }
        d r10 = cVar.r();
        if (r10 == null) {
            return null;
        }
        this.f12238l++;
        InterfaceC3878f interfaceC3878f = this.f12236j;
        Intrinsics.d(interfaceC3878f);
        interfaceC3878f.T0(f12221G).q0(32).T0(key).q0(10);
        if (z()) {
            Zd.c.m(this.f12246t, this.f12247u, 0L, 2, null);
        }
        return r10;
    }

    public final boolean s() {
        return this.f12242p;
    }

    public final S t() {
        return this.f12227a;
    }

    public final AbstractC3884l u() {
        return this.f12230d;
    }

    public final int x() {
        return this.f12229c;
    }

    public final synchronized void y() {
        try {
            if (p.f11601e && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f12241o) {
                return;
            }
            if (this.f12230d.j(this.f12234h)) {
                if (this.f12230d.j(this.f12232f)) {
                    this.f12230d.h(this.f12234h);
                } else {
                    this.f12230d.c(this.f12234h, this.f12232f);
                }
            }
            this.f12240n = Wd.m.A(this.f12230d, this.f12234h);
            if (this.f12230d.j(this.f12232f)) {
                try {
                    H();
                    F();
                    this.f12241o = true;
                    return;
                } catch (IOException e10) {
                    n.f33789a.g().k("DiskLruCache " + this.f12227a + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        o();
                        this.f12242p = false;
                    } catch (Throwable th) {
                        this.f12242p = false;
                        throw th;
                    }
                }
            }
            K();
            this.f12241o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
