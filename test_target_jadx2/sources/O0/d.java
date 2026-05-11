package o0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l0.C3591c;
import l0.C3597i;
import p0.o;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f37663b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37664c;

    /* renamed from: d, reason: collision with root package name */
    public final e f37665d;

    /* renamed from: e, reason: collision with root package name */
    public final b f37666e;

    /* renamed from: f, reason: collision with root package name */
    public d f37667f;

    /* renamed from: i, reason: collision with root package name */
    C3597i f37670i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet f37662a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f37668g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f37669h = Integer.MIN_VALUE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37671a;

        static {
            int[] iArr = new int[b.values().length];
            f37671a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37671a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37671a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37671a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37671a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37671a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37671a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37671a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37671a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f37665d = eVar;
        this.f37666e = bVar;
    }

    public boolean a(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z10 && !o(dVar)) {
            return false;
        }
        this.f37667f = dVar;
        if (dVar.f37662a == null) {
            dVar.f37662a = new HashSet();
        }
        HashSet hashSet = this.f37667f.f37662a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f37668g = i10;
        this.f37669h = i11;
        return true;
    }

    public void b(int i10, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f37662a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                p0.i.a(((d) it.next()).f37665d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet c() {
        return this.f37662a;
    }

    public int d() {
        if (this.f37664c) {
            return this.f37663b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f37665d.T() == 8) {
            return 0;
        }
        return (this.f37669h == Integer.MIN_VALUE || (dVar = this.f37667f) == null || dVar.f37665d.T() != 8) ? this.f37668g : this.f37669h;
    }

    public final d f() {
        switch (a.f37671a[this.f37666e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f37665d.f37698Q;
            case 3:
                return this.f37665d.f37696O;
            case 4:
                return this.f37665d.f37699R;
            case 5:
                return this.f37665d.f37697P;
            default:
                throw new AssertionError(this.f37666e.name());
        }
    }

    public e g() {
        return this.f37665d;
    }

    public C3597i h() {
        return this.f37670i;
    }

    public d i() {
        return this.f37667f;
    }

    public b j() {
        return this.f37666e;
    }

    public boolean k() {
        HashSet hashSet = this.f37662a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet hashSet = this.f37662a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f37664c;
    }

    public boolean n() {
        return this.f37667f != null;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b j10 = dVar.j();
        b bVar = this.f37666e;
        if (j10 == bVar) {
            return bVar != b.BASELINE || (dVar.g().X() && g().X());
        }
        switch (a.f37671a[bVar.ordinal()]) {
            case 1:
                return (j10 == b.BASELINE || j10 == b.CENTER_X || j10 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = j10 == b.LEFT || j10 == b.RIGHT;
                if (dVar.g() instanceof g) {
                    return z10 || j10 == b.CENTER_X;
                }
                return z10;
            case 4:
            case 5:
                boolean z11 = j10 == b.TOP || j10 == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    return z11 || j10 == b.CENTER_Y;
                }
                return z11;
            case 6:
                return (j10 == b.LEFT || j10 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f37666e.name());
        }
    }

    public void p() {
        HashSet hashSet;
        d dVar = this.f37667f;
        if (dVar != null && (hashSet = dVar.f37662a) != null) {
            hashSet.remove(this);
            if (this.f37667f.f37662a.size() == 0) {
                this.f37667f.f37662a = null;
            }
        }
        this.f37662a = null;
        this.f37667f = null;
        this.f37668g = 0;
        this.f37669h = Integer.MIN_VALUE;
        this.f37664c = false;
        this.f37663b = 0;
    }

    public void q() {
        this.f37664c = false;
        this.f37663b = 0;
    }

    public void r(C3591c c3591c) {
        C3597i c3597i = this.f37670i;
        if (c3597i == null) {
            this.f37670i = new C3597i(C3597i.a.UNRESTRICTED, null);
        } else {
            c3597i.n();
        }
    }

    public void s(int i10) {
        this.f37663b = i10;
        this.f37664c = true;
    }

    public String toString() {
        return this.f37665d.r() + ":" + this.f37666e.toString();
    }
}
