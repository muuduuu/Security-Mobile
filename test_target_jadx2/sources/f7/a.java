package F7;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class a extends W6.a {
    public static final Parcelable.Creator<a> CREATOR = new F7.d();

    /* renamed from: a, reason: collision with root package name */
    public int f2566a;

    /* renamed from: b, reason: collision with root package name */
    public String f2567b;

    /* renamed from: c, reason: collision with root package name */
    public String f2568c;

    /* renamed from: d, reason: collision with root package name */
    public int f2569d;

    /* renamed from: e, reason: collision with root package name */
    public Point[] f2570e;

    /* renamed from: f, reason: collision with root package name */
    public f f2571f;

    /* renamed from: g, reason: collision with root package name */
    public i f2572g;

    /* renamed from: h, reason: collision with root package name */
    public j f2573h;

    /* renamed from: i, reason: collision with root package name */
    public l f2574i;

    /* renamed from: j, reason: collision with root package name */
    public k f2575j;

    /* renamed from: k, reason: collision with root package name */
    public g f2576k;

    /* renamed from: l, reason: collision with root package name */
    public c f2577l;

    /* renamed from: m, reason: collision with root package name */
    public d f2578m;

    /* renamed from: n, reason: collision with root package name */
    public e f2579n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f2580o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2581p;

    /* renamed from: F7.a$a, reason: collision with other inner class name */
    public static class C0056a extends W6.a {
        public static final Parcelable.Creator<C0056a> CREATOR = new F7.c();

        /* renamed from: a, reason: collision with root package name */
        public int f2582a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f2583b;

        public C0056a(int i10, String[] strArr) {
            this.f2582a = i10;
            this.f2583b = strArr;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.m(parcel, 2, this.f2582a);
            W6.c.v(parcel, 3, this.f2583b, false);
            W6.c.b(parcel, a10);
        }
    }

    public static class b extends W6.a {
        public static final Parcelable.Creator<b> CREATOR = new F7.f();

        /* renamed from: a, reason: collision with root package name */
        public int f2584a;

        /* renamed from: b, reason: collision with root package name */
        public int f2585b;

        /* renamed from: c, reason: collision with root package name */
        public int f2586c;

        /* renamed from: d, reason: collision with root package name */
        public int f2587d;

        /* renamed from: e, reason: collision with root package name */
        public int f2588e;

        /* renamed from: f, reason: collision with root package name */
        public int f2589f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2590g;

        /* renamed from: h, reason: collision with root package name */
        public String f2591h;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
            this.f2584a = i10;
            this.f2585b = i11;
            this.f2586c = i12;
            this.f2587d = i13;
            this.f2588e = i14;
            this.f2589f = i15;
            this.f2590g = z10;
            this.f2591h = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.m(parcel, 2, this.f2584a);
            W6.c.m(parcel, 3, this.f2585b);
            W6.c.m(parcel, 4, this.f2586c);
            W6.c.m(parcel, 5, this.f2587d);
            W6.c.m(parcel, 6, this.f2588e);
            W6.c.m(parcel, 7, this.f2589f);
            W6.c.c(parcel, 8, this.f2590g);
            W6.c.u(parcel, 9, this.f2591h, false);
            W6.c.b(parcel, a10);
        }
    }

    public static class c extends W6.a {
        public static final Parcelable.Creator<c> CREATOR = new F7.h();

        /* renamed from: a, reason: collision with root package name */
        public String f2592a;

        /* renamed from: b, reason: collision with root package name */
        public String f2593b;

        /* renamed from: c, reason: collision with root package name */
        public String f2594c;

        /* renamed from: d, reason: collision with root package name */
        public String f2595d;

        /* renamed from: e, reason: collision with root package name */
        public String f2596e;

        /* renamed from: f, reason: collision with root package name */
        public b f2597f;

        /* renamed from: g, reason: collision with root package name */
        public b f2598g;

        public c(String str, String str2, String str3, String str4, String str5, b bVar, b bVar2) {
            this.f2592a = str;
            this.f2593b = str2;
            this.f2594c = str3;
            this.f2595d = str4;
            this.f2596e = str5;
            this.f2597f = bVar;
            this.f2598g = bVar2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.u(parcel, 2, this.f2592a, false);
            W6.c.u(parcel, 3, this.f2593b, false);
            W6.c.u(parcel, 4, this.f2594c, false);
            W6.c.u(parcel, 5, this.f2595d, false);
            W6.c.u(parcel, 6, this.f2596e, false);
            W6.c.s(parcel, 7, this.f2597f, i10, false);
            W6.c.s(parcel, 8, this.f2598g, i10, false);
            W6.c.b(parcel, a10);
        }
    }

    public static class d extends W6.a {
        public static final Parcelable.Creator<d> CREATOR = new F7.g();

        /* renamed from: a, reason: collision with root package name */
        public h f2599a;

        /* renamed from: b, reason: collision with root package name */
        public String f2600b;

        /* renamed from: c, reason: collision with root package name */
        public String f2601c;

        /* renamed from: d, reason: collision with root package name */
        public i[] f2602d;

        /* renamed from: e, reason: collision with root package name */
        public f[] f2603e;

        /* renamed from: f, reason: collision with root package name */
        public String[] f2604f;

        /* renamed from: g, reason: collision with root package name */
        public C0056a[] f2605g;

        public d(h hVar, String str, String str2, i[] iVarArr, f[] fVarArr, String[] strArr, C0056a[] c0056aArr) {
            this.f2599a = hVar;
            this.f2600b = str;
            this.f2601c = str2;
            this.f2602d = iVarArr;
            this.f2603e = fVarArr;
            this.f2604f = strArr;
            this.f2605g = c0056aArr;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.s(parcel, 2, this.f2599a, i10, false);
            W6.c.u(parcel, 3, this.f2600b, false);
            W6.c.u(parcel, 4, this.f2601c, false);
            W6.c.x(parcel, 5, this.f2602d, i10, false);
            W6.c.x(parcel, 6, this.f2603e, i10, false);
            W6.c.v(parcel, 7, this.f2604f, false);
            W6.c.x(parcel, 8, this.f2605g, i10, false);
            W6.c.b(parcel, a10);
        }
    }

    public static class e extends W6.a {
        public static final Parcelable.Creator<e> CREATOR = new F7.j();

        /* renamed from: a, reason: collision with root package name */
        public String f2606a;

        /* renamed from: b, reason: collision with root package name */
        public String f2607b;

        /* renamed from: c, reason: collision with root package name */
        public String f2608c;

        /* renamed from: d, reason: collision with root package name */
        public String f2609d;

        /* renamed from: e, reason: collision with root package name */
        public String f2610e;

        /* renamed from: f, reason: collision with root package name */
        public String f2611f;

        /* renamed from: g, reason: collision with root package name */
        public String f2612g;

        /* renamed from: h, reason: collision with root package name */
        public String f2613h;

        /* renamed from: i, reason: collision with root package name */
        public String f2614i;

        /* renamed from: j, reason: collision with root package name */
        public String f2615j;

        /* renamed from: k, reason: collision with root package name */
        public String f2616k;

        /* renamed from: l, reason: collision with root package name */
        public String f2617l;

        /* renamed from: m, reason: collision with root package name */
        public String f2618m;

        /* renamed from: n, reason: collision with root package name */
        public String f2619n;

        public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.f2606a = str;
            this.f2607b = str2;
            this.f2608c = str3;
            this.f2609d = str4;
            this.f2610e = str5;
            this.f2611f = str6;
            this.f2612g = str7;
            this.f2613h = str8;
            this.f2614i = str9;
            this.f2615j = str10;
            this.f2616k = str11;
            this.f2617l = str12;
            this.f2618m = str13;
            this.f2619n = str14;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.u(parcel, 2, this.f2606a, false);
            W6.c.u(parcel, 3, this.f2607b, false);
            W6.c.u(parcel, 4, this.f2608c, false);
            W6.c.u(parcel, 5, this.f2609d, false);
            W6.c.u(parcel, 6, this.f2610e, false);
            W6.c.u(parcel, 7, this.f2611f, false);
            W6.c.u(parcel, 8, this.f2612g, false);
            W6.c.u(parcel, 9, this.f2613h, false);
            W6.c.u(parcel, 10, this.f2614i, false);
            W6.c.u(parcel, 11, this.f2615j, false);
            W6.c.u(parcel, 12, this.f2616k, false);
            W6.c.u(parcel, 13, this.f2617l, false);
            W6.c.u(parcel, 14, this.f2618m, false);
            W6.c.u(parcel, 15, this.f2619n, false);
            W6.c.b(parcel, a10);
        }
    }

    public static class f extends W6.a {
        public static final Parcelable.Creator<f> CREATOR = new F7.i();

        /* renamed from: a, reason: collision with root package name */
        public int f2620a;

        /* renamed from: b, reason: collision with root package name */
        public String f2621b;

        /* renamed from: c, reason: collision with root package name */
        public String f2622c;

        /* renamed from: d, reason: collision with root package name */
        public String f2623d;

        public f(int i10, String str, String str2, String str3) {
            this.f2620a = i10;
            this.f2621b = str;
            this.f2622c = str2;
            this.f2623d = str3;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.m(parcel, 2, this.f2620a);
            W6.c.u(parcel, 3, this.f2621b, false);
            W6.c.u(parcel, 4, this.f2622c, false);
            W6.c.u(parcel, 5, this.f2623d, false);
            W6.c.b(parcel, a10);
        }
    }

    public static class g extends W6.a {
        public static final Parcelable.Creator<g> CREATOR = new F7.l();

        /* renamed from: a, reason: collision with root package name */
        public double f2624a;

        /* renamed from: b, reason: collision with root package name */
        public double f2625b;

        public g(double d10, double d11) {
            this.f2624a = d10;
            this.f2625b = d11;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.h(parcel, 2, this.f2624a);
            W6.c.h(parcel, 3, this.f2625b);
            W6.c.b(parcel, a10);
        }
    }

    public static class h extends W6.a {
        public static final Parcelable.Creator<h> CREATOR = new F7.k();

        /* renamed from: a, reason: collision with root package name */
        public String f2626a;

        /* renamed from: b, reason: collision with root package name */
        public String f2627b;

        /* renamed from: c, reason: collision with root package name */
        public String f2628c;

        /* renamed from: d, reason: collision with root package name */
        public String f2629d;

        /* renamed from: e, reason: collision with root package name */
        public String f2630e;

        /* renamed from: f, reason: collision with root package name */
        public String f2631f;

        /* renamed from: g, reason: collision with root package name */
        public String f2632g;

        public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f2626a = str;
            this.f2627b = str2;
            this.f2628c = str3;
            this.f2629d = str4;
            this.f2630e = str5;
            this.f2631f = str6;
            this.f2632g = str7;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.u(parcel, 2, this.f2626a, false);
            W6.c.u(parcel, 3, this.f2627b, false);
            W6.c.u(parcel, 4, this.f2628c, false);
            W6.c.u(parcel, 5, this.f2629d, false);
            W6.c.u(parcel, 6, this.f2630e, false);
            W6.c.u(parcel, 7, this.f2631f, false);
            W6.c.u(parcel, 8, this.f2632g, false);
            W6.c.b(parcel, a10);
        }
    }

    public static class i extends W6.a {
        public static final Parcelable.Creator<i> CREATOR = new n();

        /* renamed from: a, reason: collision with root package name */
        public int f2633a;

        /* renamed from: b, reason: collision with root package name */
        public String f2634b;

        public i(int i10, String str) {
            this.f2633a = i10;
            this.f2634b = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.m(parcel, 2, this.f2633a);
            W6.c.u(parcel, 3, this.f2634b, false);
            W6.c.b(parcel, a10);
        }
    }

    public static class j extends W6.a {
        public static final Parcelable.Creator<j> CREATOR = new m();

        /* renamed from: a, reason: collision with root package name */
        public String f2635a;

        /* renamed from: b, reason: collision with root package name */
        public String f2636b;

        public j(String str, String str2) {
            this.f2635a = str;
            this.f2636b = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.u(parcel, 2, this.f2635a, false);
            W6.c.u(parcel, 3, this.f2636b, false);
            W6.c.b(parcel, a10);
        }
    }

    public static class k extends W6.a {
        public static final Parcelable.Creator<k> CREATOR = new p();

        /* renamed from: a, reason: collision with root package name */
        public String f2637a;

        /* renamed from: b, reason: collision with root package name */
        public String f2638b;

        public k(String str, String str2) {
            this.f2637a = str;
            this.f2638b = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.u(parcel, 2, this.f2637a, false);
            W6.c.u(parcel, 3, this.f2638b, false);
            W6.c.b(parcel, a10);
        }
    }

    public static class l extends W6.a {
        public static final Parcelable.Creator<l> CREATOR = new o();

        /* renamed from: a, reason: collision with root package name */
        public String f2639a;

        /* renamed from: b, reason: collision with root package name */
        public String f2640b;

        /* renamed from: c, reason: collision with root package name */
        public int f2641c;

        public l(String str, String str2, int i10) {
            this.f2639a = str;
            this.f2640b = str2;
            this.f2641c = i10;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = W6.c.a(parcel);
            W6.c.u(parcel, 2, this.f2639a, false);
            W6.c.u(parcel, 3, this.f2640b, false);
            W6.c.m(parcel, 4, this.f2641c);
            W6.c.b(parcel, a10);
        }
    }

    public a(int i10, String str, String str2, int i11, Point[] pointArr, f fVar, i iVar, j jVar, l lVar, k kVar, g gVar, c cVar, d dVar, e eVar, byte[] bArr, boolean z10) {
        this.f2566a = i10;
        this.f2567b = str;
        this.f2580o = bArr;
        this.f2568c = str2;
        this.f2569d = i11;
        this.f2570e = pointArr;
        this.f2581p = z10;
        this.f2571f = fVar;
        this.f2572g = iVar;
        this.f2573h = jVar;
        this.f2574i = lVar;
        this.f2575j = kVar;
        this.f2576k = gVar;
        this.f2577l = cVar;
        this.f2578m = dVar;
        this.f2579n = eVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f2566a);
        W6.c.u(parcel, 3, this.f2567b, false);
        W6.c.u(parcel, 4, this.f2568c, false);
        W6.c.m(parcel, 5, this.f2569d);
        W6.c.x(parcel, 6, this.f2570e, i10, false);
        W6.c.s(parcel, 7, this.f2571f, i10, false);
        W6.c.s(parcel, 8, this.f2572g, i10, false);
        W6.c.s(parcel, 9, this.f2573h, i10, false);
        W6.c.s(parcel, 10, this.f2574i, i10, false);
        W6.c.s(parcel, 11, this.f2575j, i10, false);
        W6.c.s(parcel, 12, this.f2576k, i10, false);
        W6.c.s(parcel, 13, this.f2577l, i10, false);
        W6.c.s(parcel, 14, this.f2578m, i10, false);
        W6.c.s(parcel, 15, this.f2579n, i10, false);
        W6.c.f(parcel, 16, this.f2580o, false);
        W6.c.c(parcel, 17, this.f2581p);
        W6.c.b(parcel, a10);
    }
}
