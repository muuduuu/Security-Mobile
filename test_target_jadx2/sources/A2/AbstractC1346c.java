package a2;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import pe.P;

/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1346c implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f12548g = new String[128];

    /* renamed from: a, reason: collision with root package name */
    int f12549a;

    /* renamed from: b, reason: collision with root package name */
    int[] f12550b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    String[] f12551c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    int[] f12552d = new int[32];

    /* renamed from: e, reason: collision with root package name */
    boolean f12553e;

    /* renamed from: f, reason: collision with root package name */
    boolean f12554f;

    /* renamed from: a2.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String[] f12555a;

        /* renamed from: b, reason: collision with root package name */
        final P f12556b;

        private a(String[] strArr, P p10) {
            this.f12555a = strArr;
            this.f12556b = p10;
        }

        public static a a(String... strArr) {
            try {
                C3880h[] c3880hArr = new C3880h[strArr.length];
                C3877e c3877e = new C3877e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    AbstractC1346c.u(c3877e, strArr[i10]);
                    c3877e.readByte();
                    c3880hArr[i10] = c3877e.K();
                }
                return new a((String[]) strArr.clone(), P.u(c3880hArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* renamed from: a2.c$b */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f12548g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f12548g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    AbstractC1346c() {
    }

    public static AbstractC1346c o(InterfaceC3879g interfaceC3879g) {
        return new e(interfaceC3879g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void u(InterfaceC3878f interfaceC3878f, String str) {
        int i10;
        String str2;
        String[] strArr = f12548g;
        interfaceC3878f.q0(34);
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i10 = str2 == null ? i10 + 1 : 0;
                if (i11 < i10) {
                    interfaceC3878f.e1(str, i11, i10);
                }
                interfaceC3878f.T0(str2);
                i11 = i10 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                }
                interfaceC3878f.T0(str2);
                i11 = i10 + 1;
            }
        }
        if (i11 < length) {
            interfaceC3878f.e1(str, i11, length);
        }
        interfaceC3878f.q0(34);
    }

    public final String J() {
        return AbstractC1347d.a(this.f12549a, this.f12550b, this.f12551c, this.f12552d);
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract double i();

    public abstract int j();

    public abstract String l();

    public abstract String n();

    public abstract b p();

    final void q(int i10) {
        int i11 = this.f12549a;
        int[] iArr = this.f12550b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new C1344a("Nesting too deep at " + J());
            }
            this.f12550b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f12551c;
            this.f12551c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f12552d;
            this.f12552d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f12550b;
        int i12 = this.f12549a;
        this.f12549a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int r(a aVar);

    public abstract void s();

    public abstract void t();

    final C1345b x(String str) {
        throw new C1345b(str + " at path " + J());
    }
}
