package W1;

import O1.C1038i;
import android.graphics.Paint;
import java.util.List;

/* loaded from: classes.dex */
public class s implements W1.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11245a;

    /* renamed from: b, reason: collision with root package name */
    private final V1.b f11246b;

    /* renamed from: c, reason: collision with root package name */
    private final List f11247c;

    /* renamed from: d, reason: collision with root package name */
    private final V1.a f11248d;

    /* renamed from: e, reason: collision with root package name */
    private final V1.d f11249e;

    /* renamed from: f, reason: collision with root package name */
    private final V1.b f11250f;

    /* renamed from: g, reason: collision with root package name */
    private final b f11251g;

    /* renamed from: h, reason: collision with root package name */
    private final c f11252h;

    /* renamed from: i, reason: collision with root package name */
    private final float f11253i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f11254j;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11255a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11256b;

        static {
            int[] iArr = new int[c.values().length];
            f11256b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11256b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11256b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f11255a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11255a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11255a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i10 = a.f11255a[ordinal()];
            return i10 != 1 ? i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i10 = a.f11256b[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public s(String str, V1.b bVar, List list, V1.a aVar, V1.d dVar, V1.b bVar2, b bVar3, c cVar, float f10, boolean z10) {
        this.f11245a = str;
        this.f11246b = bVar;
        this.f11247c = list;
        this.f11248d = aVar;
        this.f11249e = dVar;
        this.f11250f = bVar2;
        this.f11251g = bVar3;
        this.f11252h = cVar;
        this.f11253i = f10;
        this.f11254j = z10;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.t(oVar, bVar, this);
    }

    public b b() {
        return this.f11251g;
    }

    public V1.a c() {
        return this.f11248d;
    }

    public V1.b d() {
        return this.f11246b;
    }

    public c e() {
        return this.f11252h;
    }

    public List f() {
        return this.f11247c;
    }

    public float g() {
        return this.f11253i;
    }

    public String h() {
        return this.f11245a;
    }

    public V1.d i() {
        return this.f11249e;
    }

    public V1.b j() {
        return this.f11250f;
    }

    public boolean k() {
        return this.f11254j;
    }
}
