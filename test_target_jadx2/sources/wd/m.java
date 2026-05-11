package Wd;

import Td.E;
import Td.G;
import Td.v;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lc.AbstractC3622a;
import pe.AbstractC3884l;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import pe.P;
import pe.S;
import pe.Z;
import xc.AbstractC5149b;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f11589a;

    /* renamed from: b, reason: collision with root package name */
    private static final P f11590b;

    /* renamed from: c, reason: collision with root package name */
    private static final v f11591c;

    /* renamed from: d, reason: collision with root package name */
    private static final E f11592d;

    /* renamed from: e, reason: collision with root package name */
    private static final G f11593e;

    static {
        byte[] bArr = new byte[0];
        f11589a = bArr;
        P.a aVar = P.f38606d;
        C3880h.a aVar2 = C3880h.f38683d;
        f11590b = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        f11591c = v.f10217b.b(new String[0]);
        f11592d = E.a.r(E.Companion, bArr, null, 0, 0, 7, null);
        f11593e = G.b.g(G.f9918b, bArr, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean A(AbstractC3884l abstractC3884l, S file) {
        Throwable th;
        Intrinsics.checkNotNullParameter(abstractC3884l, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        Z o10 = abstractC3884l.o(file);
        try {
            try {
                abstractC3884l.h(file);
                if (o10 == null) {
                    return true;
                }
                try {
                    o10.close();
                    return true;
                } catch (Throwable unused) {
                    return true;
                }
            } catch (IOException unused2) {
                Unit unit = Unit.f36324a;
                if (o10 != null) {
                    try {
                        o10.close();
                    } catch (Throwable th2) {
                        th = th2;
                        if (th != null) {
                        }
                    }
                }
                th = null;
                if (th != null) {
                    throw th;
                }
                abstractC3884l.h(file);
                return false;
            }
        } catch (Throwable th3) {
            if (o10 != null) {
                try {
                    o10.close();
                } catch (Throwable th4) {
                    AbstractC3622a.a(th3, th4);
                }
            }
            th = th3;
            if (th != null) {
            }
        }
    }

    public static final boolean B(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.r(name, "Authorization", true) || StringsKt.r(name, "Cookie", true) || StringsKt.r(name, "Proxy-Authorization", true) || StringsKt.r(name, "Set-Cookie", true);
    }

    public static final MatchResult C(Regex regex, CharSequence input, int i10) {
        Intrinsics.checkNotNullParameter(regex, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        MatchResult a10 = regex.a(input, i10);
        if (a10 != null && a10.d().c() == i10) {
            return a10;
        }
        return null;
    }

    public static final int D(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final int E(InterfaceC3879g interfaceC3879g) {
        Intrinsics.checkNotNullParameter(interfaceC3879g, "<this>");
        return b(interfaceC3879g.readByte(), 255) | (b(interfaceC3879g.readByte(), 255) << 16) | (b(interfaceC3879g.readByte(), 255) << 8);
    }

    public static final int F(C3877e c3877e, byte b10) {
        Intrinsics.checkNotNullParameter(c3877e, "<this>");
        int i10 = 0;
        while (!c3877e.p0() && c3877e.p(0L) == b10) {
            i10++;
            c3877e.readByte();
        }
        return i10;
    }

    public static final long G(String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int H(String str, int i10) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String I(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int t10 = t(str, i10, i11);
        String substring = str.substring(t10, v(str, t10, i11));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String J(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return I(str, i10, i11);
    }

    public static final Throwable K(Exception exc, List suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC3622a.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void L(InterfaceC3878f interfaceC3878f, int i10) {
        Intrinsics.checkNotNullParameter(interfaceC3878f, "<this>");
        interfaceC3878f.q0((i10 >>> 16) & 255);
        interfaceC3878f.q0((i10 >>> 8) & 255);
        interfaceC3878f.q0(i10 & 255);
    }

    public static final void a(List list, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s10, int i10) {
        return s10 & i10;
    }

    public static final long d(int i10, long j10) {
        return i10 & j10;
    }

    public static final void e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=" + j11 + ", count=" + j11);
        }
    }

    public static final void f(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String[] g(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[AbstractC3574i.D(strArr2)] = value;
        return strArr2;
    }

    public static final void h(AbstractC3884l abstractC3884l, S directory) {
        Intrinsics.checkNotNullParameter(abstractC3884l, "<this>");
        Intrinsics.checkNotNullParameter(directory, "directory");
        try {
            IOException iOException = null;
            for (S s10 : abstractC3884l.k(directory)) {
                try {
                    if (abstractC3884l.l(s10).e()) {
                        h(abstractC3884l, s10);
                    }
                    abstractC3884l.h(s10);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void i(AbstractC3884l abstractC3884l, S path) {
        Intrinsics.checkNotNullParameter(abstractC3884l, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            abstractC3884l.h(path);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int j(String str, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int k(String str, String delimiters, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt.J(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int l(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return j(str, c10, i10, i11);
    }

    public static final v m() {
        return f11591c;
    }

    public static final E n() {
        return f11592d;
    }

    public static final G o() {
        return f11593e;
    }

    public static final P p() {
        return f11590b;
    }

    public static final boolean q(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator a10 = AbstractC5149b.a(strArr2);
                while (a10.hasNext()) {
                    if (comparator.compare(str, (String) a10.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int r(String[] strArr, String value, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int s(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Intrinsics.g(charAt, 31) <= 0 || Intrinsics.g(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int t(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int u(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return t(str, i10, i11);
    }

    public static final int v(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int w(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return v(str, i10, i11);
    }

    public static final int x(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final List y(Iterable a10, Iterable b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Iterator it = a10.iterator();
        Iterator it2 = b10.iterator();
        List c10 = CollectionsKt.c();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return CollectionsKt.a(c10);
            }
            if (it.hasNext()) {
                c10.add(it.next());
            }
            if (it2.hasNext()) {
                c10.add(it2.next());
            }
        }
    }

    public static final String[] z(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
