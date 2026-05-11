package W1;

import O1.C1038i;

/* loaded from: classes.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11206a;

    /* renamed from: b, reason: collision with root package name */
    private final a f11207b;

    /* renamed from: c, reason: collision with root package name */
    private final V1.b f11208c;

    /* renamed from: d, reason: collision with root package name */
    private final V1.o f11209d;

    /* renamed from: e, reason: collision with root package name */
    private final V1.b f11210e;

    /* renamed from: f, reason: collision with root package name */
    private final V1.b f11211f;

    /* renamed from: g, reason: collision with root package name */
    private final V1.b f11212g;

    /* renamed from: h, reason: collision with root package name */
    private final V1.b f11213h;

    /* renamed from: i, reason: collision with root package name */
    private final V1.b f11214i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f11215j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f11216k;

    public enum a {
        STAR(1),
        POLYGON(2);

        private final int value;

        a(int i10) {
            this.value = i10;
        }

        public static a forValue(int i10) {
            for (a aVar : values()) {
                if (aVar.value == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, V1.b bVar, V1.o oVar, V1.b bVar2, V1.b bVar3, V1.b bVar4, V1.b bVar5, V1.b bVar6, boolean z10, boolean z11) {
        this.f11206a = str;
        this.f11207b = aVar;
        this.f11208c = bVar;
        this.f11209d = oVar;
        this.f11210e = bVar2;
        this.f11211f = bVar3;
        this.f11212g = bVar4;
        this.f11213h = bVar5;
        this.f11214i = bVar6;
        this.f11215j = z10;
        this.f11216k = z11;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.n(oVar, bVar, this);
    }

    public V1.b b() {
        return this.f11211f;
    }

    public V1.b c() {
        return this.f11213h;
    }

    public String d() {
        return this.f11206a;
    }

    public V1.b e() {
        return this.f11212g;
    }

    public V1.b f() {
        return this.f11214i;
    }

    public V1.b g() {
        return this.f11208c;
    }

    public V1.o h() {
        return this.f11209d;
    }

    public V1.b i() {
        return this.f11210e;
    }

    public a j() {
        return this.f11207b;
    }

    public boolean k() {
        return this.f11215j;
    }

    public boolean l() {
        return this.f11216k;
    }
}
