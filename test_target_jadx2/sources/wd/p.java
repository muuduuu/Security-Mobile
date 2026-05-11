package Wd;

import Td.B;
import Td.E;
import Td.F;
import Td.G;
import Td.InterfaceC1229e;
import Td.s;
import Td.v;
import Td.w;
import de.C3047d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.D;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import pe.C3877e;
import pe.InterfaceC3879g;
import pe.b0;
import xc.C5146G;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final v f11597a = m.m();

    /* renamed from: b, reason: collision with root package name */
    public static final E f11598b = m.n();

    /* renamed from: c, reason: collision with root package name */
    public static final G f11599c = m.o();

    /* renamed from: d, reason: collision with root package name */
    public static final TimeZone f11600d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f11601e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f11602f;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.d(timeZone);
        f11600d = timeZone;
        f11601e = false;
        String name = B.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f11602f = StringsKt.p0(StringsKt.o0(name, "okhttp3."), "Client");
    }

    public static final s.c c(final s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return new s.c() { // from class: Wd.n
            @Override // Td.s.c
            public final s a(InterfaceC1229e interfaceC1229e) {
                s d10;
                d10 = p.d(s.this, interfaceC1229e);
                return d10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s d(s this_asFactory, InterfaceC1229e it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final boolean e(w wVar, w other) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.b(wVar.h(), other.h()) && wVar.n() == other.n() && Intrinsics.b(wVar.u(), other.u());
    }

    public static final int f(String name, long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        long millis = unit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small").toString());
    }

    public static final void g(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean h(b0 b0Var, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return n(b0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        C5146G c5146g = C5146G.f44966a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public static final long j(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        String c10 = f10.p().c("Content-Length");
        if (c10 != null) {
            return m.G(c10, -1L);
        }
        return -1L;
    }

    public static final List k(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.m(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final boolean l(Socket socket, InterfaceC3879g source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !source.p0();
                socket.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final Charset m(InterfaceC3879g interfaceC3879g, Charset charset) {
        Intrinsics.checkNotNullParameter(interfaceC3879g, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int k12 = interfaceC3879g.k1(m.p());
        if (k12 == -1) {
            return charset;
        }
        if (k12 == 0) {
            return Charsets.UTF_8;
        }
        if (k12 == 1) {
            return Charsets.UTF_16BE;
        }
        if (k12 == 2) {
            return Charsets.UTF_16LE;
        }
        if (k12 == 3) {
            return Charsets.f36792a.a();
        }
        if (k12 == 4) {
            return Charsets.f36792a.b();
        }
        throw new AssertionError();
    }

    public static final boolean n(b0 b0Var, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c10 = b0Var.A().e() ? b0Var.A().c() - nanoTime : Long.MAX_VALUE;
        b0Var.A().d(Math.min(c10, timeUnit.toNanos(i10)) + nanoTime);
        try {
            C3877e c3877e = new C3877e();
            while (b0Var.b2(c3877e, 8192L) != -1) {
                c3877e.a();
            }
            if (c10 == Long.MAX_VALUE) {
                b0Var.A().a();
            } else {
                b0Var.A().d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c10 == Long.MAX_VALUE) {
                b0Var.A().a();
            } else {
                b0Var.A().d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th) {
            if (c10 == Long.MAX_VALUE) {
                b0Var.A().a();
            } else {
                b0Var.A().d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static final ThreadFactory o(final String name, final boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: Wd.o
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread p10;
                p10 = p.p(name, z10, runnable);
                return p10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread p(String name, boolean z10, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List q(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        IntRange p10 = kotlin.ranges.d.p(0, vVar.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.u(p10, 10));
        Iterator it = p10.iterator();
        while (it.hasNext()) {
            int a10 = ((D) it).a();
            arrayList.add(new C3047d(vVar.h(a10), vVar.v(a10)));
        }
        return arrayList;
    }

    public static final v r(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        v.a aVar = new v.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3047d c3047d = (C3047d) it.next();
            aVar.d(c3047d.a().R(), c3047d.b().R());
        }
        return aVar.f();
    }

    public static final String s(int i10) {
        String hexString = Integer.toHexString(i10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        return hexString;
    }

    public static final String t(long j10) {
        String hexString = Long.toHexString(j10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        return hexString;
    }

    public static final String u(w wVar, boolean z10) {
        String h10;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (StringsKt.K(wVar.h(), ":", false, 2, null)) {
            h10 = '[' + wVar.h() + ']';
        } else {
            h10 = wVar.h();
        }
        if (!z10 && wVar.n() == w.f10220j.b(wVar.u())) {
            return h10;
        }
        return h10 + ':' + wVar.n();
    }

    public static /* synthetic */ String v(w wVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return u(wVar, z10);
    }

    public static final List w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.Q0(list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}
