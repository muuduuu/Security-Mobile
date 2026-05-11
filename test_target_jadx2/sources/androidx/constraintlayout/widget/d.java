package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import m0.C3635a;
import org.conscrypt.BuildConfig;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q0.AbstractC3899a;
import q0.AbstractC3900b;

/* loaded from: classes.dex */
public class d {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f15080f = {0, 4, 8};

    /* renamed from: g, reason: collision with root package name */
    private static SparseIntArray f15081g = new SparseIntArray();

    /* renamed from: h, reason: collision with root package name */
    private static SparseIntArray f15082h = new SparseIntArray();

    /* renamed from: a, reason: collision with root package name */
    public String f15083a = BuildConfig.FLAVOR;

    /* renamed from: b, reason: collision with root package name */
    public int f15084b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f15085c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f15086d = true;

    /* renamed from: e, reason: collision with root package name */
    private HashMap f15087e = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f15088a;

        /* renamed from: b, reason: collision with root package name */
        String f15089b;

        /* renamed from: c, reason: collision with root package name */
        public final C0256d f15090c = new C0256d();

        /* renamed from: d, reason: collision with root package name */
        public final c f15091d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f15092e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final e f15093f = new e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap f15094g = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        C0255a f15095h;

        /* renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        static class C0255a {

            /* renamed from: a, reason: collision with root package name */
            int[] f15096a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            int[] f15097b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            int f15098c = 0;

            /* renamed from: d, reason: collision with root package name */
            int[] f15099d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            float[] f15100e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            int f15101f = 0;

            /* renamed from: g, reason: collision with root package name */
            int[] f15102g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            String[] f15103h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            int f15104i = 0;

            /* renamed from: j, reason: collision with root package name */
            int[] f15105j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            boolean[] f15106k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            int f15107l = 0;

            C0255a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f15101f;
                int[] iArr = this.f15099d;
                if (i11 >= iArr.length) {
                    this.f15099d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f15100e;
                    this.f15100e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f15099d;
                int i12 = this.f15101f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f15100e;
                this.f15101f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f15098c;
                int[] iArr = this.f15096a;
                if (i12 >= iArr.length) {
                    this.f15096a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f15097b;
                    this.f15097b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f15096a;
                int i13 = this.f15098c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f15097b;
                this.f15098c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f15104i;
                int[] iArr = this.f15102g;
                if (i11 >= iArr.length) {
                    this.f15102g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f15103h;
                    this.f15103h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f15102g;
                int i12 = this.f15104i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f15103h;
                this.f15104i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f15107l;
                int[] iArr = this.f15105j;
                if (i11 >= iArr.length) {
                    this.f15105j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f15106k;
                    this.f15106k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f15105j;
                int i12 = this.f15107l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f15106k;
                this.f15107l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i10, ConstraintLayout.b bVar) {
            this.f15088a = i10;
            b bVar2 = this.f15092e;
            bVar2.f15153j = bVar.f14996e;
            bVar2.f15155k = bVar.f14998f;
            bVar2.f15157l = bVar.f15000g;
            bVar2.f15159m = bVar.f15002h;
            bVar2.f15161n = bVar.f15004i;
            bVar2.f15163o = bVar.f15006j;
            bVar2.f15165p = bVar.f15008k;
            bVar2.f15167q = bVar.f15010l;
            bVar2.f15169r = bVar.f15012m;
            bVar2.f15170s = bVar.f15014n;
            bVar2.f15171t = bVar.f15016o;
            bVar2.f15172u = bVar.f15024s;
            bVar2.f15173v = bVar.f15026t;
            bVar2.f15174w = bVar.f15028u;
            bVar2.f15175x = bVar.f15030v;
            bVar2.f15176y = bVar.f14968G;
            bVar2.f15177z = bVar.f14969H;
            bVar2.f15109A = bVar.f14970I;
            bVar2.f15110B = bVar.f15018p;
            bVar2.f15111C = bVar.f15020q;
            bVar2.f15112D = bVar.f15022r;
            bVar2.f15113E = bVar.f14985X;
            bVar2.f15114F = bVar.f14986Y;
            bVar2.f15115G = bVar.f14987Z;
            bVar2.f15149h = bVar.f14992c;
            bVar2.f15145f = bVar.f14988a;
            bVar2.f15147g = bVar.f14990b;
            bVar2.f15141d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f15143e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f15116H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f15117I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f15118J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f15119K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f15122N = bVar.f14965D;
            bVar2.f15130V = bVar.f14974M;
            bVar2.f15131W = bVar.f14973L;
            bVar2.f15133Y = bVar.f14976O;
            bVar2.f15132X = bVar.f14975N;
            bVar2.f15162n0 = bVar.f14989a0;
            bVar2.f15164o0 = bVar.f14991b0;
            bVar2.f15134Z = bVar.f14977P;
            bVar2.f15136a0 = bVar.f14978Q;
            bVar2.f15138b0 = bVar.f14981T;
            bVar2.f15140c0 = bVar.f14982U;
            bVar2.f15142d0 = bVar.f14979R;
            bVar2.f15144e0 = bVar.f14980S;
            bVar2.f15146f0 = bVar.f14983V;
            bVar2.f15148g0 = bVar.f14984W;
            bVar2.f15160m0 = bVar.f14993c0;
            bVar2.f15124P = bVar.f15034x;
            bVar2.f15126R = bVar.f15036z;
            bVar2.f15123O = bVar.f15032w;
            bVar2.f15125Q = bVar.f15035y;
            bVar2.f15128T = bVar.f14962A;
            bVar2.f15127S = bVar.f14963B;
            bVar2.f15129U = bVar.f14964C;
            bVar2.f15168q0 = bVar.f14995d0;
            bVar2.f15120L = bVar.getMarginEnd();
            this.f15092e.f15121M = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f15092e;
            bVar.f14996e = bVar2.f15153j;
            bVar.f14998f = bVar2.f15155k;
            bVar.f15000g = bVar2.f15157l;
            bVar.f15002h = bVar2.f15159m;
            bVar.f15004i = bVar2.f15161n;
            bVar.f15006j = bVar2.f15163o;
            bVar.f15008k = bVar2.f15165p;
            bVar.f15010l = bVar2.f15167q;
            bVar.f15012m = bVar2.f15169r;
            bVar.f15014n = bVar2.f15170s;
            bVar.f15016o = bVar2.f15171t;
            bVar.f15024s = bVar2.f15172u;
            bVar.f15026t = bVar2.f15173v;
            bVar.f15028u = bVar2.f15174w;
            bVar.f15030v = bVar2.f15175x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f15116H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f15117I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f15118J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f15119K;
            bVar.f14962A = bVar2.f15128T;
            bVar.f14963B = bVar2.f15127S;
            bVar.f15034x = bVar2.f15124P;
            bVar.f15036z = bVar2.f15126R;
            bVar.f14968G = bVar2.f15176y;
            bVar.f14969H = bVar2.f15177z;
            bVar.f15018p = bVar2.f15110B;
            bVar.f15020q = bVar2.f15111C;
            bVar.f15022r = bVar2.f15112D;
            bVar.f14970I = bVar2.f15109A;
            bVar.f14985X = bVar2.f15113E;
            bVar.f14986Y = bVar2.f15114F;
            bVar.f14974M = bVar2.f15130V;
            bVar.f14973L = bVar2.f15131W;
            bVar.f14976O = bVar2.f15133Y;
            bVar.f14975N = bVar2.f15132X;
            bVar.f14989a0 = bVar2.f15162n0;
            bVar.f14991b0 = bVar2.f15164o0;
            bVar.f14977P = bVar2.f15134Z;
            bVar.f14978Q = bVar2.f15136a0;
            bVar.f14981T = bVar2.f15138b0;
            bVar.f14982U = bVar2.f15140c0;
            bVar.f14979R = bVar2.f15142d0;
            bVar.f14980S = bVar2.f15144e0;
            bVar.f14983V = bVar2.f15146f0;
            bVar.f14984W = bVar2.f15148g0;
            bVar.f14987Z = bVar2.f15115G;
            bVar.f14992c = bVar2.f15149h;
            bVar.f14988a = bVar2.f15145f;
            bVar.f14990b = bVar2.f15147g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f15141d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f15143e;
            String str = bVar2.f15160m0;
            if (str != null) {
                bVar.f14993c0 = str;
            }
            bVar.f14995d0 = bVar2.f15168q0;
            bVar.setMarginStart(bVar2.f15121M);
            bVar.setMarginEnd(this.f15092e.f15120L);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f15092e.a(this.f15092e);
            aVar.f15091d.a(this.f15091d);
            aVar.f15090c.a(this.f15090c);
            aVar.f15093f.a(this.f15093f);
            aVar.f15088a = this.f15088a;
            aVar.f15095h = this.f15095h;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: r0, reason: collision with root package name */
        private static SparseIntArray f15108r0;

        /* renamed from: d, reason: collision with root package name */
        public int f15141d;

        /* renamed from: e, reason: collision with root package name */
        public int f15143e;

        /* renamed from: k0, reason: collision with root package name */
        public int[] f15156k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f15158l0;

        /* renamed from: m0, reason: collision with root package name */
        public String f15160m0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f15135a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15137b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f15139c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f15145f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f15147g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f15149h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public boolean f15151i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f15153j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f15155k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f15157l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f15159m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f15161n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f15163o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f15165p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f15167q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f15169r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f15170s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f15171t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f15172u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f15173v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f15174w = -1;

        /* renamed from: x, reason: collision with root package name */
        public int f15175x = -1;

        /* renamed from: y, reason: collision with root package name */
        public float f15176y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public float f15177z = 0.5f;

        /* renamed from: A, reason: collision with root package name */
        public String f15109A = null;

        /* renamed from: B, reason: collision with root package name */
        public int f15110B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f15111C = 0;

        /* renamed from: D, reason: collision with root package name */
        public float f15112D = 0.0f;

        /* renamed from: E, reason: collision with root package name */
        public int f15113E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f15114F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f15115G = -1;

        /* renamed from: H, reason: collision with root package name */
        public int f15116H = 0;

        /* renamed from: I, reason: collision with root package name */
        public int f15117I = 0;

        /* renamed from: J, reason: collision with root package name */
        public int f15118J = 0;

        /* renamed from: K, reason: collision with root package name */
        public int f15119K = 0;

        /* renamed from: L, reason: collision with root package name */
        public int f15120L = 0;

        /* renamed from: M, reason: collision with root package name */
        public int f15121M = 0;

        /* renamed from: N, reason: collision with root package name */
        public int f15122N = 0;

        /* renamed from: O, reason: collision with root package name */
        public int f15123O = Integer.MIN_VALUE;

        /* renamed from: P, reason: collision with root package name */
        public int f15124P = Integer.MIN_VALUE;

        /* renamed from: Q, reason: collision with root package name */
        public int f15125Q = Integer.MIN_VALUE;

        /* renamed from: R, reason: collision with root package name */
        public int f15126R = Integer.MIN_VALUE;

        /* renamed from: S, reason: collision with root package name */
        public int f15127S = Integer.MIN_VALUE;

        /* renamed from: T, reason: collision with root package name */
        public int f15128T = Integer.MIN_VALUE;

        /* renamed from: U, reason: collision with root package name */
        public int f15129U = Integer.MIN_VALUE;

        /* renamed from: V, reason: collision with root package name */
        public float f15130V = -1.0f;

        /* renamed from: W, reason: collision with root package name */
        public float f15131W = -1.0f;

        /* renamed from: X, reason: collision with root package name */
        public int f15132X = 0;

        /* renamed from: Y, reason: collision with root package name */
        public int f15133Y = 0;

        /* renamed from: Z, reason: collision with root package name */
        public int f15134Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f15136a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f15138b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f15140c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f15142d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public int f15144e0 = 0;

        /* renamed from: f0, reason: collision with root package name */
        public float f15146f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public float f15148g0 = 1.0f;

        /* renamed from: h0, reason: collision with root package name */
        public int f15150h0 = -1;

        /* renamed from: i0, reason: collision with root package name */
        public int f15152i0 = 0;

        /* renamed from: j0, reason: collision with root package name */
        public int f15154j0 = -1;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f15162n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f15164o0 = false;

        /* renamed from: p0, reason: collision with root package name */
        public boolean f15166p0 = true;

        /* renamed from: q0, reason: collision with root package name */
        public int f15168q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15108r0 = sparseIntArray;
            sparseIntArray.append(g.f15616w5, 24);
            f15108r0.append(g.f15624x5, 25);
            f15108r0.append(g.f15640z5, 28);
            f15108r0.append(g.f15219A5, 29);
            f15108r0.append(g.f15259F5, 35);
            f15108r0.append(g.f15251E5, 34);
            f15108r0.append(g.f15481g5, 4);
            f15108r0.append(g.f15472f5, 3);
            f15108r0.append(g.f15454d5, 1);
            f15108r0.append(g.f15307L5, 6);
            f15108r0.append(g.f15315M5, 7);
            f15108r0.append(g.f15544n5, 17);
            f15108r0.append(g.f15552o5, 18);
            f15108r0.append(g.f15560p5, 19);
            f15108r0.append(g.f15418Z4, 90);
            f15108r0.append(g.f15306L4, 26);
            f15108r0.append(g.f15227B5, 31);
            f15108r0.append(g.f15235C5, 32);
            f15108r0.append(g.f15535m5, 10);
            f15108r0.append(g.f15526l5, 9);
            f15108r0.append(g.f15339P5, 13);
            f15108r0.append(g.f15363S5, 16);
            f15108r0.append(g.f15347Q5, 14);
            f15108r0.append(g.f15323N5, 11);
            f15108r0.append(g.f15355R5, 15);
            f15108r0.append(g.f15331O5, 12);
            f15108r0.append(g.f15283I5, 38);
            f15108r0.append(g.f15600u5, 37);
            f15108r0.append(g.f15592t5, 39);
            f15108r0.append(g.f15275H5, 40);
            f15108r0.append(g.f15584s5, 20);
            f15108r0.append(g.f15267G5, 36);
            f15108r0.append(g.f15517k5, 5);
            f15108r0.append(g.f15608v5, 91);
            f15108r0.append(g.f15243D5, 91);
            f15108r0.append(g.f15632y5, 91);
            f15108r0.append(g.f15463e5, 91);
            f15108r0.append(g.f15445c5, 91);
            f15108r0.append(g.f15330O4, 23);
            f15108r0.append(g.f15346Q4, 27);
            f15108r0.append(g.f15362S4, 30);
            f15108r0.append(g.f15370T4, 8);
            f15108r0.append(g.f15338P4, 33);
            f15108r0.append(g.f15354R4, 2);
            f15108r0.append(g.f15314M4, 22);
            f15108r0.append(g.f15322N4, 21);
            f15108r0.append(g.f15291J5, 41);
            f15108r0.append(g.f15568q5, 42);
            f15108r0.append(g.f15436b5, 41);
            f15108r0.append(g.f15427a5, 42);
            f15108r0.append(g.f15371T5, 76);
            f15108r0.append(g.f15490h5, 61);
            f15108r0.append(g.f15508j5, 62);
            f15108r0.append(g.f15499i5, 63);
            f15108r0.append(g.f15299K5, 69);
            f15108r0.append(g.f15576r5, 70);
            f15108r0.append(g.f15402X4, 71);
            f15108r0.append(g.f15386V4, 72);
            f15108r0.append(g.f15394W4, 73);
            f15108r0.append(g.f15410Y4, 74);
            f15108r0.append(g.f15378U4, 75);
        }

        public void a(b bVar) {
            this.f15135a = bVar.f15135a;
            this.f15141d = bVar.f15141d;
            this.f15137b = bVar.f15137b;
            this.f15143e = bVar.f15143e;
            this.f15145f = bVar.f15145f;
            this.f15147g = bVar.f15147g;
            this.f15149h = bVar.f15149h;
            this.f15151i = bVar.f15151i;
            this.f15153j = bVar.f15153j;
            this.f15155k = bVar.f15155k;
            this.f15157l = bVar.f15157l;
            this.f15159m = bVar.f15159m;
            this.f15161n = bVar.f15161n;
            this.f15163o = bVar.f15163o;
            this.f15165p = bVar.f15165p;
            this.f15167q = bVar.f15167q;
            this.f15169r = bVar.f15169r;
            this.f15170s = bVar.f15170s;
            this.f15171t = bVar.f15171t;
            this.f15172u = bVar.f15172u;
            this.f15173v = bVar.f15173v;
            this.f15174w = bVar.f15174w;
            this.f15175x = bVar.f15175x;
            this.f15176y = bVar.f15176y;
            this.f15177z = bVar.f15177z;
            this.f15109A = bVar.f15109A;
            this.f15110B = bVar.f15110B;
            this.f15111C = bVar.f15111C;
            this.f15112D = bVar.f15112D;
            this.f15113E = bVar.f15113E;
            this.f15114F = bVar.f15114F;
            this.f15115G = bVar.f15115G;
            this.f15116H = bVar.f15116H;
            this.f15117I = bVar.f15117I;
            this.f15118J = bVar.f15118J;
            this.f15119K = bVar.f15119K;
            this.f15120L = bVar.f15120L;
            this.f15121M = bVar.f15121M;
            this.f15122N = bVar.f15122N;
            this.f15123O = bVar.f15123O;
            this.f15124P = bVar.f15124P;
            this.f15125Q = bVar.f15125Q;
            this.f15126R = bVar.f15126R;
            this.f15127S = bVar.f15127S;
            this.f15128T = bVar.f15128T;
            this.f15129U = bVar.f15129U;
            this.f15130V = bVar.f15130V;
            this.f15131W = bVar.f15131W;
            this.f15132X = bVar.f15132X;
            this.f15133Y = bVar.f15133Y;
            this.f15134Z = bVar.f15134Z;
            this.f15136a0 = bVar.f15136a0;
            this.f15138b0 = bVar.f15138b0;
            this.f15140c0 = bVar.f15140c0;
            this.f15142d0 = bVar.f15142d0;
            this.f15144e0 = bVar.f15144e0;
            this.f15146f0 = bVar.f15146f0;
            this.f15148g0 = bVar.f15148g0;
            this.f15150h0 = bVar.f15150h0;
            this.f15152i0 = bVar.f15152i0;
            this.f15154j0 = bVar.f15154j0;
            this.f15160m0 = bVar.f15160m0;
            int[] iArr = bVar.f15156k0;
            if (iArr == null || bVar.f15158l0 != null) {
                this.f15156k0 = null;
            } else {
                this.f15156k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f15158l0 = bVar.f15158l0;
            this.f15162n0 = bVar.f15162n0;
            this.f15164o0 = bVar.f15164o0;
            this.f15166p0 = bVar.f15166p0;
            this.f15168q0 = bVar.f15168q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f15298K4);
            this.f15137b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f15108r0.get(index);
                switch (i11) {
                    case 1:
                        this.f15169r = d.p(obtainStyledAttributes, index, this.f15169r);
                        break;
                    case 2:
                        this.f15119K = obtainStyledAttributes.getDimensionPixelSize(index, this.f15119K);
                        break;
                    case 3:
                        this.f15167q = d.p(obtainStyledAttributes, index, this.f15167q);
                        break;
                    case 4:
                        this.f15165p = d.p(obtainStyledAttributes, index, this.f15165p);
                        break;
                    case 5:
                        this.f15109A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f15113E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f15113E);
                        break;
                    case 7:
                        this.f15114F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f15114F);
                        break;
                    case 8:
                        this.f15120L = obtainStyledAttributes.getDimensionPixelSize(index, this.f15120L);
                        break;
                    case 9:
                        this.f15175x = d.p(obtainStyledAttributes, index, this.f15175x);
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        this.f15174w = d.p(obtainStyledAttributes, index, this.f15174w);
                        break;
                    case 11:
                        this.f15126R = obtainStyledAttributes.getDimensionPixelSize(index, this.f15126R);
                        break;
                    case 12:
                        this.f15127S = obtainStyledAttributes.getDimensionPixelSize(index, this.f15127S);
                        break;
                    case 13:
                        this.f15123O = obtainStyledAttributes.getDimensionPixelSize(index, this.f15123O);
                        break;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        this.f15125Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f15125Q);
                        break;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        this.f15128T = obtainStyledAttributes.getDimensionPixelSize(index, this.f15128T);
                        break;
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        this.f15124P = obtainStyledAttributes.getDimensionPixelSize(index, this.f15124P);
                        break;
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        this.f15145f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f15145f);
                        break;
                    case 18:
                        this.f15147g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f15147g);
                        break;
                    case 19:
                        this.f15149h = obtainStyledAttributes.getFloat(index, this.f15149h);
                        break;
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        this.f15176y = obtainStyledAttributes.getFloat(index, this.f15176y);
                        break;
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        this.f15143e = obtainStyledAttributes.getLayoutDimension(index, this.f15143e);
                        break;
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        this.f15141d = obtainStyledAttributes.getLayoutDimension(index, this.f15141d);
                        break;
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                        this.f15116H = obtainStyledAttributes.getDimensionPixelSize(index, this.f15116H);
                        break;
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        this.f15153j = d.p(obtainStyledAttributes, index, this.f15153j);
                        break;
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                        this.f15155k = d.p(obtainStyledAttributes, index, this.f15155k);
                        break;
                    case 26:
                        this.f15115G = obtainStyledAttributes.getInt(index, this.f15115G);
                        break;
                    case 27:
                        this.f15117I = obtainStyledAttributes.getDimensionPixelSize(index, this.f15117I);
                        break;
                    case 28:
                        this.f15157l = d.p(obtainStyledAttributes, index, this.f15157l);
                        break;
                    case 29:
                        this.f15159m = d.p(obtainStyledAttributes, index, this.f15159m);
                        break;
                    case 30:
                        this.f15121M = obtainStyledAttributes.getDimensionPixelSize(index, this.f15121M);
                        break;
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                        this.f15172u = d.p(obtainStyledAttributes, index, this.f15172u);
                        break;
                    case 32:
                        this.f15173v = d.p(obtainStyledAttributes, index, this.f15173v);
                        break;
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                        this.f15118J = obtainStyledAttributes.getDimensionPixelSize(index, this.f15118J);
                        break;
                    case 34:
                        this.f15163o = d.p(obtainStyledAttributes, index, this.f15163o);
                        break;
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                        this.f15161n = d.p(obtainStyledAttributes, index, this.f15161n);
                        break;
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                        this.f15177z = obtainStyledAttributes.getFloat(index, this.f15177z);
                        break;
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                        this.f15131W = obtainStyledAttributes.getFloat(index, this.f15131W);
                        break;
                    case 38:
                        this.f15130V = obtainStyledAttributes.getFloat(index, this.f15130V);
                        break;
                    case 39:
                        this.f15132X = obtainStyledAttributes.getInt(index, this.f15132X);
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        this.f15133Y = obtainStyledAttributes.getInt(index, this.f15133Y);
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        d.q(this, obtainStyledAttributes, index, 0);
                        break;
                    case HVError.CONSENT_DENIED /* 42 */:
                        d.q(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f15110B = d.p(obtainStyledAttributes, index, this.f15110B);
                                break;
                            case 62:
                                this.f15111C = obtainStyledAttributes.getDimensionPixelSize(index, this.f15111C);
                                break;
                            case 63:
                                this.f15112D = obtainStyledAttributes.getFloat(index, this.f15112D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f15146f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f15148g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f15150h0 = obtainStyledAttributes.getInt(index, this.f15150h0);
                                        break;
                                    case 73:
                                        this.f15152i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f15152i0);
                                        break;
                                    case 74:
                                        this.f15158l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f15166p0 = obtainStyledAttributes.getBoolean(index, this.f15166p0);
                                        break;
                                    case com.swmansion.reanimated.BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                                        this.f15168q0 = obtainStyledAttributes.getInt(index, this.f15168q0);
                                        break;
                                    case 77:
                                        this.f15170s = d.p(obtainStyledAttributes, index, this.f15170s);
                                        break;
                                    case 78:
                                        this.f15171t = d.p(obtainStyledAttributes, index, this.f15171t);
                                        break;
                                    case 79:
                                        this.f15129U = obtainStyledAttributes.getDimensionPixelSize(index, this.f15129U);
                                        break;
                                    case 80:
                                        this.f15122N = obtainStyledAttributes.getDimensionPixelSize(index, this.f15122N);
                                        break;
                                    case 81:
                                        this.f15134Z = obtainStyledAttributes.getInt(index, this.f15134Z);
                                        break;
                                    case 82:
                                        this.f15136a0 = obtainStyledAttributes.getInt(index, this.f15136a0);
                                        break;
                                    case 83:
                                        this.f15140c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f15140c0);
                                        break;
                                    case 84:
                                        this.f15138b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f15138b0);
                                        break;
                                    case 85:
                                        this.f15144e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f15144e0);
                                        break;
                                    case 86:
                                        this.f15142d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f15142d0);
                                        break;
                                    case AppConstants.REQUEST_CODE /* 87 */:
                                        this.f15162n0 = obtainStyledAttributes.getBoolean(index, this.f15162n0);
                                        break;
                                    case 88:
                                        this.f15164o0 = obtainStyledAttributes.getBoolean(index, this.f15164o0);
                                        break;
                                    case 89:
                                        this.f15160m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f15151i = obtainStyledAttributes.getBoolean(index, this.f15151i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f15108r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f15108r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f15178o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f15179a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f15180b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f15181c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f15182d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f15183e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f15184f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f15185g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f15186h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f15187i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f15188j = Float.NaN;

        /* renamed from: k, reason: collision with root package name */
        public int f15189k = -1;

        /* renamed from: l, reason: collision with root package name */
        public String f15190l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f15191m = -3;

        /* renamed from: n, reason: collision with root package name */
        public int f15192n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15178o = sparseIntArray;
            sparseIntArray.append(g.f15473f6, 1);
            f15178o.append(g.f15491h6, 2);
            f15178o.append(g.f15527l6, 3);
            f15178o.append(g.f15464e6, 4);
            f15178o.append(g.f15455d6, 5);
            f15178o.append(g.f15446c6, 6);
            f15178o.append(g.f15482g6, 7);
            f15178o.append(g.f15518k6, 8);
            f15178o.append(g.f15509j6, 9);
            f15178o.append(g.f15500i6, 10);
        }

        public void a(c cVar) {
            this.f15179a = cVar.f15179a;
            this.f15180b = cVar.f15180b;
            this.f15182d = cVar.f15182d;
            this.f15183e = cVar.f15183e;
            this.f15184f = cVar.f15184f;
            this.f15187i = cVar.f15187i;
            this.f15185g = cVar.f15185g;
            this.f15186h = cVar.f15186h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f15437b6);
            this.f15179a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f15178o.get(index)) {
                    case 1:
                        this.f15187i = obtainStyledAttributes.getFloat(index, this.f15187i);
                        break;
                    case 2:
                        this.f15183e = obtainStyledAttributes.getInt(index, this.f15183e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f15182d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f15182d = C3635a.f37260c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f15184f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f15180b = d.p(obtainStyledAttributes, index, this.f15180b);
                        break;
                    case 6:
                        this.f15181c = obtainStyledAttributes.getInteger(index, this.f15181c);
                        break;
                    case 7:
                        this.f15185g = obtainStyledAttributes.getFloat(index, this.f15185g);
                        break;
                    case 8:
                        this.f15189k = obtainStyledAttributes.getInteger(index, this.f15189k);
                        break;
                    case 9:
                        this.f15188j = obtainStyledAttributes.getFloat(index, this.f15188j);
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f15192n = resourceId;
                            if (resourceId != -1) {
                                this.f15191m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i11 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f15190l = string;
                            if (string.indexOf("/") > 0) {
                                this.f15192n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f15191m = -2;
                                break;
                            } else {
                                this.f15191m = -1;
                                break;
                            }
                        } else {
                            this.f15191m = obtainStyledAttributes.getInteger(index, this.f15192n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0256d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15193a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f15194b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f15195c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f15196d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f15197e = Float.NaN;

        public void a(C0256d c0256d) {
            this.f15193a = c0256d.f15193a;
            this.f15194b = c0256d.f15194b;
            this.f15196d = c0256d.f15196d;
            this.f15197e = c0256d.f15197e;
            this.f15195c = c0256d.f15195c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f15617w6);
            this.f15193a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f15633y6) {
                    this.f15196d = obtainStyledAttributes.getFloat(index, this.f15196d);
                } else if (index == g.f15625x6) {
                    this.f15194b = obtainStyledAttributes.getInt(index, this.f15194b);
                    this.f15194b = d.f15080f[this.f15194b];
                } else if (index == g.f15220A6) {
                    this.f15195c = obtainStyledAttributes.getInt(index, this.f15195c);
                } else if (index == g.f15641z6) {
                    this.f15197e = obtainStyledAttributes.getFloat(index, this.f15197e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f15198o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f15199a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f15200b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f15201c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f15202d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f15203e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f15204f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f15205g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f15206h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f15207i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f15208j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f15209k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f15210l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f15211m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f15212n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f15198o = sparseIntArray;
            sparseIntArray.append(g.f15388V6, 1);
            f15198o.append(g.f15396W6, 2);
            f15198o.append(g.f15404X6, 3);
            f15198o.append(g.f15372T6, 4);
            f15198o.append(g.f15380U6, 5);
            f15198o.append(g.f15340P6, 6);
            f15198o.append(g.f15348Q6, 7);
            f15198o.append(g.f15356R6, 8);
            f15198o.append(g.f15364S6, 9);
            f15198o.append(g.f15412Y6, 10);
            f15198o.append(g.f15420Z6, 11);
            f15198o.append(g.f15429a7, 12);
        }

        public void a(e eVar) {
            this.f15199a = eVar.f15199a;
            this.f15200b = eVar.f15200b;
            this.f15201c = eVar.f15201c;
            this.f15202d = eVar.f15202d;
            this.f15203e = eVar.f15203e;
            this.f15204f = eVar.f15204f;
            this.f15205g = eVar.f15205g;
            this.f15206h = eVar.f15206h;
            this.f15207i = eVar.f15207i;
            this.f15208j = eVar.f15208j;
            this.f15209k = eVar.f15209k;
            this.f15210l = eVar.f15210l;
            this.f15211m = eVar.f15211m;
            this.f15212n = eVar.f15212n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f15332O6);
            this.f15199a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f15198o.get(index)) {
                    case 1:
                        this.f15200b = obtainStyledAttributes.getFloat(index, this.f15200b);
                        break;
                    case 2:
                        this.f15201c = obtainStyledAttributes.getFloat(index, this.f15201c);
                        break;
                    case 3:
                        this.f15202d = obtainStyledAttributes.getFloat(index, this.f15202d);
                        break;
                    case 4:
                        this.f15203e = obtainStyledAttributes.getFloat(index, this.f15203e);
                        break;
                    case 5:
                        this.f15204f = obtainStyledAttributes.getFloat(index, this.f15204f);
                        break;
                    case 6:
                        this.f15205g = obtainStyledAttributes.getDimension(index, this.f15205g);
                        break;
                    case 7:
                        this.f15206h = obtainStyledAttributes.getDimension(index, this.f15206h);
                        break;
                    case 8:
                        this.f15208j = obtainStyledAttributes.getDimension(index, this.f15208j);
                        break;
                    case 9:
                        this.f15209k = obtainStyledAttributes.getDimension(index, this.f15209k);
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        this.f15210l = obtainStyledAttributes.getDimension(index, this.f15210l);
                        break;
                    case 11:
                        this.f15211m = true;
                        this.f15212n = obtainStyledAttributes.getDimension(index, this.f15212n);
                        break;
                    case 12:
                        this.f15207i = d.p(obtainStyledAttributes, index, this.f15207i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f15081g.append(g.f15214A0, 25);
        f15081g.append(g.f15222B0, 26);
        f15081g.append(g.f15238D0, 29);
        f15081g.append(g.f15246E0, 30);
        f15081g.append(g.f15294K0, 36);
        f15081g.append(g.f15286J0, 35);
        f15081g.append(g.f15485h0, 4);
        f15081g.append(g.f15476g0, 3);
        f15081g.append(g.f15440c0, 1);
        f15081g.append(g.f15458e0, 91);
        f15081g.append(g.f15449d0, 92);
        f15081g.append(g.f15366T0, 6);
        f15081g.append(g.f15374U0, 7);
        f15081g.append(g.f15547o0, 17);
        f15081g.append(g.f15555p0, 18);
        f15081g.append(g.f15563q0, 19);
        f15081g.append(g.f15405Y, 99);
        f15081g.append(g.f15594u, 27);
        f15081g.append(g.f15254F0, 32);
        f15081g.append(g.f15262G0, 33);
        f15081g.append(g.f15539n0, 10);
        f15081g.append(g.f15530m0, 9);
        f15081g.append(g.f15398X0, 13);
        f15081g.append(g.f15423a1, 16);
        f15081g.append(g.f15406Y0, 14);
        f15081g.append(g.f15382V0, 11);
        f15081g.append(g.f15414Z0, 15);
        f15081g.append(g.f15390W0, 12);
        f15081g.append(g.f15318N0, 40);
        f15081g.append(g.f15627y0, 39);
        f15081g.append(g.f15619x0, 41);
        f15081g.append(g.f15310M0, 42);
        f15081g.append(g.f15611w0, 20);
        f15081g.append(g.f15302L0, 37);
        f15081g.append(g.f15521l0, 5);
        f15081g.append(g.f15635z0, 87);
        f15081g.append(g.f15278I0, 87);
        f15081g.append(g.f15230C0, 87);
        f15081g.append(g.f15467f0, 87);
        f15081g.append(g.f15431b0, 87);
        f15081g.append(g.f15634z, 24);
        f15081g.append(g.f15221B, 28);
        f15081g.append(g.f15317N, 31);
        f15081g.append(g.f15325O, 8);
        f15081g.append(g.f15213A, 34);
        f15081g.append(g.f15229C, 2);
        f15081g.append(g.f15618x, 23);
        f15081g.append(g.f15626y, 21);
        f15081g.append(g.f15326O0, 95);
        f15081g.append(g.f15571r0, 96);
        f15081g.append(g.f15610w, 22);
        f15081g.append(g.f15237D, 43);
        f15081g.append(g.f15341Q, 44);
        f15081g.append(g.f15301L, 45);
        f15081g.append(g.f15309M, 46);
        f15081g.append(g.f15293K, 60);
        f15081g.append(g.f15277I, 47);
        f15081g.append(g.f15285J, 48);
        f15081g.append(g.f15245E, 49);
        f15081g.append(g.f15253F, 50);
        f15081g.append(g.f15261G, 51);
        f15081g.append(g.f15269H, 52);
        f15081g.append(g.f15333P, 53);
        f15081g.append(g.f15334P0, 54);
        f15081g.append(g.f15579s0, 55);
        f15081g.append(g.f15342Q0, 56);
        f15081g.append(g.f15587t0, 57);
        f15081g.append(g.f15350R0, 58);
        f15081g.append(g.f15595u0, 59);
        f15081g.append(g.f15494i0, 61);
        f15081g.append(g.f15512k0, 62);
        f15081g.append(g.f15503j0, 63);
        f15081g.append(g.f15349R, 64);
        f15081g.append(g.f15513k1, 65);
        f15081g.append(g.f15397X, 66);
        f15081g.append(g.f15522l1, 67);
        f15081g.append(g.f15450d1, 79);
        f15081g.append(g.f15602v, 38);
        f15081g.append(g.f15441c1, 68);
        f15081g.append(g.f15358S0, 69);
        f15081g.append(g.f15603v0, 70);
        f15081g.append(g.f15432b1, 97);
        f15081g.append(g.f15381V, 71);
        f15081g.append(g.f15365T, 72);
        f15081g.append(g.f15373U, 73);
        f15081g.append(g.f15389W, 74);
        f15081g.append(g.f15357S, 75);
        f15081g.append(g.f15459e1, 76);
        f15081g.append(g.f15270H0, 77);
        f15081g.append(g.f15531m1, 78);
        f15081g.append(g.f15422a0, 80);
        f15081g.append(g.f15413Z, 81);
        f15081g.append(g.f15468f1, 82);
        f15081g.append(g.f15504j1, 83);
        f15081g.append(g.f15495i1, 84);
        f15081g.append(g.f15486h1, 85);
        f15081g.append(g.f15477g1, 86);
        f15082h.append(g.f15337P3, 6);
        f15082h.append(g.f15337P3, 7);
        f15082h.append(g.f15296K2, 27);
        f15082h.append(g.f15361S3, 13);
        f15082h.append(g.f15385V3, 16);
        f15082h.append(g.f15369T3, 14);
        f15082h.append(g.f15345Q3, 11);
        f15082h.append(g.f15377U3, 15);
        f15082h.append(g.f15353R3, 12);
        f15082h.append(g.f15289J3, 40);
        f15082h.append(g.f15233C3, 39);
        f15082h.append(g.f15225B3, 41);
        f15082h.append(g.f15281I3, 42);
        f15082h.append(g.f15217A3, 20);
        f15082h.append(g.f15273H3, 37);
        f15082h.append(g.f15598u3, 5);
        f15082h.append(g.f15241D3, 87);
        f15082h.append(g.f15265G3, 87);
        f15082h.append(g.f15249E3, 87);
        f15082h.append(g.f15574r3, 87);
        f15082h.append(g.f15566q3, 87);
        f15082h.append(g.f15336P2, 24);
        f15082h.append(g.f15352R2, 28);
        f15082h.append(g.f15452d3, 31);
        f15082h.append(g.f15461e3, 8);
        f15082h.append(g.f15344Q2, 34);
        f15082h.append(g.f15360S2, 2);
        f15082h.append(g.f15320N2, 23);
        f15082h.append(g.f15328O2, 21);
        f15082h.append(g.f15297K3, 95);
        f15082h.append(g.f15606v3, 96);
        f15082h.append(g.f15312M2, 22);
        f15082h.append(g.f15368T2, 43);
        f15082h.append(g.f15479g3, 44);
        f15082h.append(g.f15434b3, 45);
        f15082h.append(g.f15443c3, 46);
        f15082h.append(g.f15425a3, 60);
        f15082h.append(g.f15408Y2, 47);
        f15082h.append(g.f15416Z2, 48);
        f15082h.append(g.f15376U2, 49);
        f15082h.append(g.f15384V2, 50);
        f15082h.append(g.f15392W2, 51);
        f15082h.append(g.f15400X2, 52);
        f15082h.append(g.f15470f3, 53);
        f15082h.append(g.f15305L3, 54);
        f15082h.append(g.f15614w3, 55);
        f15082h.append(g.f15313M3, 56);
        f15082h.append(g.f15622x3, 57);
        f15082h.append(g.f15321N3, 58);
        f15082h.append(g.f15630y3, 59);
        f15082h.append(g.f15590t3, 62);
        f15082h.append(g.f15582s3, 63);
        f15082h.append(g.f15488h3, 64);
        f15082h.append(g.f15480g4, 65);
        f15082h.append(g.f15542n3, 66);
        f15082h.append(g.f15489h4, 67);
        f15082h.append(g.f15409Y3, 79);
        f15082h.append(g.f15304L2, 38);
        f15082h.append(g.f15417Z3, 98);
        f15082h.append(g.f15401X3, 68);
        f15082h.append(g.f15329O3, 69);
        f15082h.append(g.f15638z3, 70);
        f15082h.append(g.f15524l3, 71);
        f15082h.append(g.f15506j3, 72);
        f15082h.append(g.f15515k3, 73);
        f15082h.append(g.f15533m3, 74);
        f15082h.append(g.f15497i3, 75);
        f15082h.append(g.f15426a4, 76);
        f15082h.append(g.f15257F3, 77);
        f15082h.append(g.f15498i4, 78);
        f15082h.append(g.f15558p3, 80);
        f15082h.append(g.f15550o3, 81);
        f15082h.append(g.f15435b4, 82);
        f15082h.append(g.f15471f4, 83);
        f15082h.append(g.f15462e4, 84);
        f15082h.append(g.f15453d4, 85);
        f15082h.append(g.f15444c4, 86);
        f15082h.append(g.f15393W3, 97);
    }

    private int[] k(View view, String str) {
        int i10;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = f.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i10 = ((Integer) designInformation).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    private a l(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? g.f15288J2 : g.f15586t);
        t(context, aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a m(int i10) {
        if (!this.f15087e.containsKey(Integer.valueOf(i10))) {
            this.f15087e.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f15087e.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void q(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        boolean z10;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 == 3) {
            r(obj, typedArray.getString(i10), i11);
            return;
        }
        int i13 = 0;
        if (i12 != 5) {
            dimensionPixelSize = typedArray.getInt(i10, 0);
            if (dimensionPixelSize == -4) {
                z10 = true;
                i13 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z10 = false;
            }
            if (!(obj instanceof ConstraintLayout.b)) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = i13;
                    bVar.f14989a0 = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar).height = i13;
                    bVar.f14991b0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (i11 == 0) {
                    bVar2.f15141d = i13;
                    bVar2.f15162n0 = z10;
                    return;
                } else {
                    bVar2.f15143e = i13;
                    bVar2.f15164o0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0255a) {
                a.C0255a c0255a = (a.C0255a) obj;
                if (i11 == 0) {
                    c0255a.b(23, i13);
                    c0255a.d(80, z10);
                    return;
                } else {
                    c0255a.b(21, i13);
                    c0255a.d(81, z10);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        i13 = dimensionPixelSize;
        z10 = false;
        if (!(obj instanceof ConstraintLayout.b)) {
        }
    }

    static void r(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    s(bVar, trim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f15109A = trim2;
                    return;
                } else {
                    if (obj instanceof a.C0255a) {
                        ((a.C0255a) obj).c(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.f14973L = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.f14974M = parseFloat;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f15141d = 0;
                            bVar3.f15131W = parseFloat;
                        } else {
                            bVar3.f15143e = 0;
                            bVar3.f15130V = parseFloat;
                        }
                    } else if (obj instanceof a.C0255a) {
                        a.C0255a c0255a = (a.C0255a) obj;
                        if (i10 == 0) {
                            c0255a.b(23, 0);
                            c0255a.a(39, parseFloat);
                        } else {
                            c0255a.b(21, 0);
                            c0255a.a(40, parseFloat);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(trim)) {
                        return;
                    }
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.f14983V = max;
                            bVar4.f14977P = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.f14984W = max;
                            bVar4.f14978Q = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f15141d = 0;
                            bVar5.f15146f0 = max;
                            bVar5.f15134Z = 2;
                        } else {
                            bVar5.f15143e = 0;
                            bVar5.f15148g0 = max;
                            bVar5.f15136a0 = 2;
                        }
                    } else if (obj instanceof a.C0255a) {
                        a.C0255a c0255a2 = (a.C0255a) obj;
                        if (i10 == 0) {
                            c0255a2.b(23, 0);
                            c0255a2.b(54, 2);
                        } else {
                            c0255a2.b(21, 0);
                            c0255a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void s(ConstraintLayout.b bVar, String str) {
        float f10 = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i11);
                    if (substring2.length() > 0) {
                        f10 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i11, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f10 = i10 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f14970I = str;
        bVar.f14971J = f10;
        bVar.f14972K = i10;
    }

    private void t(Context context, a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            u(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != g.f15602v && g.f15317N != index && g.f15325O != index) {
                aVar.f15091d.f15179a = true;
                aVar.f15092e.f15137b = true;
                aVar.f15090c.f15193a = true;
                aVar.f15093f.f15199a = true;
            }
            switch (f15081g.get(index)) {
                case 1:
                    b bVar = aVar.f15092e;
                    bVar.f15169r = p(typedArray, index, bVar.f15169r);
                    break;
                case 2:
                    b bVar2 = aVar.f15092e;
                    bVar2.f15119K = typedArray.getDimensionPixelSize(index, bVar2.f15119K);
                    break;
                case 3:
                    b bVar3 = aVar.f15092e;
                    bVar3.f15167q = p(typedArray, index, bVar3.f15167q);
                    break;
                case 4:
                    b bVar4 = aVar.f15092e;
                    bVar4.f15165p = p(typedArray, index, bVar4.f15165p);
                    break;
                case 5:
                    aVar.f15092e.f15109A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f15092e;
                    bVar5.f15113E = typedArray.getDimensionPixelOffset(index, bVar5.f15113E);
                    break;
                case 7:
                    b bVar6 = aVar.f15092e;
                    bVar6.f15114F = typedArray.getDimensionPixelOffset(index, bVar6.f15114F);
                    break;
                case 8:
                    b bVar7 = aVar.f15092e;
                    bVar7.f15120L = typedArray.getDimensionPixelSize(index, bVar7.f15120L);
                    break;
                case 9:
                    b bVar8 = aVar.f15092e;
                    bVar8.f15175x = p(typedArray, index, bVar8.f15175x);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    b bVar9 = aVar.f15092e;
                    bVar9.f15174w = p(typedArray, index, bVar9.f15174w);
                    break;
                case 11:
                    b bVar10 = aVar.f15092e;
                    bVar10.f15126R = typedArray.getDimensionPixelSize(index, bVar10.f15126R);
                    break;
                case 12:
                    b bVar11 = aVar.f15092e;
                    bVar11.f15127S = typedArray.getDimensionPixelSize(index, bVar11.f15127S);
                    break;
                case 13:
                    b bVar12 = aVar.f15092e;
                    bVar12.f15123O = typedArray.getDimensionPixelSize(index, bVar12.f15123O);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    b bVar13 = aVar.f15092e;
                    bVar13.f15125Q = typedArray.getDimensionPixelSize(index, bVar13.f15125Q);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    b bVar14 = aVar.f15092e;
                    bVar14.f15128T = typedArray.getDimensionPixelSize(index, bVar14.f15128T);
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    b bVar15 = aVar.f15092e;
                    bVar15.f15124P = typedArray.getDimensionPixelSize(index, bVar15.f15124P);
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    b bVar16 = aVar.f15092e;
                    bVar16.f15145f = typedArray.getDimensionPixelOffset(index, bVar16.f15145f);
                    break;
                case 18:
                    b bVar17 = aVar.f15092e;
                    bVar17.f15147g = typedArray.getDimensionPixelOffset(index, bVar17.f15147g);
                    break;
                case 19:
                    b bVar18 = aVar.f15092e;
                    bVar18.f15149h = typedArray.getFloat(index, bVar18.f15149h);
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    b bVar19 = aVar.f15092e;
                    bVar19.f15176y = typedArray.getFloat(index, bVar19.f15176y);
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    b bVar20 = aVar.f15092e;
                    bVar20.f15143e = typedArray.getLayoutDimension(index, bVar20.f15143e);
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    C0256d c0256d = aVar.f15090c;
                    c0256d.f15194b = typedArray.getInt(index, c0256d.f15194b);
                    C0256d c0256d2 = aVar.f15090c;
                    c0256d2.f15194b = f15080f[c0256d2.f15194b];
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    b bVar21 = aVar.f15092e;
                    bVar21.f15141d = typedArray.getLayoutDimension(index, bVar21.f15141d);
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    b bVar22 = aVar.f15092e;
                    bVar22.f15116H = typedArray.getDimensionPixelSize(index, bVar22.f15116H);
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    b bVar23 = aVar.f15092e;
                    bVar23.f15153j = p(typedArray, index, bVar23.f15153j);
                    break;
                case 26:
                    b bVar24 = aVar.f15092e;
                    bVar24.f15155k = p(typedArray, index, bVar24.f15155k);
                    break;
                case 27:
                    b bVar25 = aVar.f15092e;
                    bVar25.f15115G = typedArray.getInt(index, bVar25.f15115G);
                    break;
                case 28:
                    b bVar26 = aVar.f15092e;
                    bVar26.f15117I = typedArray.getDimensionPixelSize(index, bVar26.f15117I);
                    break;
                case 29:
                    b bVar27 = aVar.f15092e;
                    bVar27.f15157l = p(typedArray, index, bVar27.f15157l);
                    break;
                case 30:
                    b bVar28 = aVar.f15092e;
                    bVar28.f15159m = p(typedArray, index, bVar28.f15159m);
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    b bVar29 = aVar.f15092e;
                    bVar29.f15121M = typedArray.getDimensionPixelSize(index, bVar29.f15121M);
                    break;
                case 32:
                    b bVar30 = aVar.f15092e;
                    bVar30.f15172u = p(typedArray, index, bVar30.f15172u);
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    b bVar31 = aVar.f15092e;
                    bVar31.f15173v = p(typedArray, index, bVar31.f15173v);
                    break;
                case 34:
                    b bVar32 = aVar.f15092e;
                    bVar32.f15118J = typedArray.getDimensionPixelSize(index, bVar32.f15118J);
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    b bVar33 = aVar.f15092e;
                    bVar33.f15163o = p(typedArray, index, bVar33.f15163o);
                    break;
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    b bVar34 = aVar.f15092e;
                    bVar34.f15161n = p(typedArray, index, bVar34.f15161n);
                    break;
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    b bVar35 = aVar.f15092e;
                    bVar35.f15177z = typedArray.getFloat(index, bVar35.f15177z);
                    break;
                case 38:
                    aVar.f15088a = typedArray.getResourceId(index, aVar.f15088a);
                    break;
                case 39:
                    b bVar36 = aVar.f15092e;
                    bVar36.f15131W = typedArray.getFloat(index, bVar36.f15131W);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    b bVar37 = aVar.f15092e;
                    bVar37.f15130V = typedArray.getFloat(index, bVar37.f15130V);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    b bVar38 = aVar.f15092e;
                    bVar38.f15132X = typedArray.getInt(index, bVar38.f15132X);
                    break;
                case HVError.CONSENT_DENIED /* 42 */:
                    b bVar39 = aVar.f15092e;
                    bVar39.f15133Y = typedArray.getInt(index, bVar39.f15133Y);
                    break;
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    C0256d c0256d3 = aVar.f15090c;
                    c0256d3.f15196d = typedArray.getFloat(index, c0256d3.f15196d);
                    break;
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    e eVar = aVar.f15093f;
                    eVar.f15211m = true;
                    eVar.f15212n = typedArray.getDimension(index, eVar.f15212n);
                    break;
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    e eVar2 = aVar.f15093f;
                    eVar2.f15201c = typedArray.getFloat(index, eVar2.f15201c);
                    break;
                case 46:
                    e eVar3 = aVar.f15093f;
                    eVar3.f15202d = typedArray.getFloat(index, eVar3.f15202d);
                    break;
                case 47:
                    e eVar4 = aVar.f15093f;
                    eVar4.f15203e = typedArray.getFloat(index, eVar4.f15203e);
                    break;
                case 48:
                    e eVar5 = aVar.f15093f;
                    eVar5.f15204f = typedArray.getFloat(index, eVar5.f15204f);
                    break;
                case 49:
                    e eVar6 = aVar.f15093f;
                    eVar6.f15205g = typedArray.getDimension(index, eVar6.f15205g);
                    break;
                case 50:
                    e eVar7 = aVar.f15093f;
                    eVar7.f15206h = typedArray.getDimension(index, eVar7.f15206h);
                    break;
                case 51:
                    e eVar8 = aVar.f15093f;
                    eVar8.f15208j = typedArray.getDimension(index, eVar8.f15208j);
                    break;
                case 52:
                    e eVar9 = aVar.f15093f;
                    eVar9.f15209k = typedArray.getDimension(index, eVar9.f15209k);
                    break;
                case 53:
                    e eVar10 = aVar.f15093f;
                    eVar10.f15210l = typedArray.getDimension(index, eVar10.f15210l);
                    break;
                case 54:
                    b bVar40 = aVar.f15092e;
                    bVar40.f15134Z = typedArray.getInt(index, bVar40.f15134Z);
                    break;
                case 55:
                    b bVar41 = aVar.f15092e;
                    bVar41.f15136a0 = typedArray.getInt(index, bVar41.f15136a0);
                    break;
                case 56:
                    b bVar42 = aVar.f15092e;
                    bVar42.f15138b0 = typedArray.getDimensionPixelSize(index, bVar42.f15138b0);
                    break;
                case 57:
                    b bVar43 = aVar.f15092e;
                    bVar43.f15140c0 = typedArray.getDimensionPixelSize(index, bVar43.f15140c0);
                    break;
                case 58:
                    b bVar44 = aVar.f15092e;
                    bVar44.f15142d0 = typedArray.getDimensionPixelSize(index, bVar44.f15142d0);
                    break;
                case 59:
                    b bVar45 = aVar.f15092e;
                    bVar45.f15144e0 = typedArray.getDimensionPixelSize(index, bVar45.f15144e0);
                    break;
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    e eVar11 = aVar.f15093f;
                    eVar11.f15200b = typedArray.getFloat(index, eVar11.f15200b);
                    break;
                case 61:
                    b bVar46 = aVar.f15092e;
                    bVar46.f15110B = p(typedArray, index, bVar46.f15110B);
                    break;
                case 62:
                    b bVar47 = aVar.f15092e;
                    bVar47.f15111C = typedArray.getDimensionPixelSize(index, bVar47.f15111C);
                    break;
                case 63:
                    b bVar48 = aVar.f15092e;
                    bVar48.f15112D = typedArray.getFloat(index, bVar48.f15112D);
                    break;
                case 64:
                    c cVar = aVar.f15091d;
                    cVar.f15180b = p(typedArray, index, cVar.f15180b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f15091d.f15182d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f15091d.f15182d = C3635a.f37260c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f15091d.f15184f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f15091d;
                    cVar2.f15187i = typedArray.getFloat(index, cVar2.f15187i);
                    break;
                case 68:
                    C0256d c0256d4 = aVar.f15090c;
                    c0256d4.f15197e = typedArray.getFloat(index, c0256d4.f15197e);
                    break;
                case 69:
                    aVar.f15092e.f15146f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f15092e.f15148g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f15092e;
                    bVar49.f15150h0 = typedArray.getInt(index, bVar49.f15150h0);
                    break;
                case 73:
                    b bVar50 = aVar.f15092e;
                    bVar50.f15152i0 = typedArray.getDimensionPixelSize(index, bVar50.f15152i0);
                    break;
                case 74:
                    aVar.f15092e.f15158l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f15092e;
                    bVar51.f15166p0 = typedArray.getBoolean(index, bVar51.f15166p0);
                    break;
                case com.swmansion.reanimated.BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                    c cVar3 = aVar.f15091d;
                    cVar3.f15183e = typedArray.getInt(index, cVar3.f15183e);
                    break;
                case 77:
                    aVar.f15092e.f15160m0 = typedArray.getString(index);
                    break;
                case 78:
                    C0256d c0256d5 = aVar.f15090c;
                    c0256d5.f15195c = typedArray.getInt(index, c0256d5.f15195c);
                    break;
                case 79:
                    c cVar4 = aVar.f15091d;
                    cVar4.f15185g = typedArray.getFloat(index, cVar4.f15185g);
                    break;
                case 80:
                    b bVar52 = aVar.f15092e;
                    bVar52.f15162n0 = typedArray.getBoolean(index, bVar52.f15162n0);
                    break;
                case 81:
                    b bVar53 = aVar.f15092e;
                    bVar53.f15164o0 = typedArray.getBoolean(index, bVar53.f15164o0);
                    break;
                case 82:
                    c cVar5 = aVar.f15091d;
                    cVar5.f15181c = typedArray.getInteger(index, cVar5.f15181c);
                    break;
                case 83:
                    e eVar12 = aVar.f15093f;
                    eVar12.f15207i = p(typedArray, index, eVar12.f15207i);
                    break;
                case 84:
                    c cVar6 = aVar.f15091d;
                    cVar6.f15189k = typedArray.getInteger(index, cVar6.f15189k);
                    break;
                case 85:
                    c cVar7 = aVar.f15091d;
                    cVar7.f15188j = typedArray.getFloat(index, cVar7.f15188j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f15091d.f15192n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f15091d;
                        if (cVar8.f15192n != -1) {
                            cVar8.f15191m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f15091d.f15190l = typedArray.getString(index);
                        if (aVar.f15091d.f15190l.indexOf("/") > 0) {
                            aVar.f15091d.f15192n = typedArray.getResourceId(index, -1);
                            aVar.f15091d.f15191m = -2;
                            break;
                        } else {
                            aVar.f15091d.f15191m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f15091d;
                        cVar9.f15191m = typedArray.getInteger(index, cVar9.f15192n);
                        break;
                    }
                case AppConstants.REQUEST_CODE /* 87 */:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f15081g.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f15081g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f15092e;
                    bVar54.f15170s = p(typedArray, index, bVar54.f15170s);
                    break;
                case 92:
                    b bVar55 = aVar.f15092e;
                    bVar55.f15171t = p(typedArray, index, bVar55.f15171t);
                    break;
                case 93:
                    b bVar56 = aVar.f15092e;
                    bVar56.f15122N = typedArray.getDimensionPixelSize(index, bVar56.f15122N);
                    break;
                case 94:
                    b bVar57 = aVar.f15092e;
                    bVar57.f15129U = typedArray.getDimensionPixelSize(index, bVar57.f15129U);
                    break;
                case 95:
                    q(aVar.f15092e, typedArray, index, 0);
                    break;
                case 96:
                    q(aVar.f15092e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f15092e;
                    bVar58.f15168q0 = typedArray.getInt(index, bVar58.f15168q0);
                    break;
            }
        }
        b bVar59 = aVar.f15092e;
        if (bVar59.f15158l0 != null) {
            bVar59.f15156k0 = null;
        }
    }

    private static void u(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0255a c0255a = new a.C0255a();
        aVar.f15095h = c0255a;
        aVar.f15091d.f15179a = false;
        aVar.f15092e.f15137b = false;
        aVar.f15090c.f15193a = false;
        aVar.f15093f.f15199a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f15082h.get(index)) {
                case 2:
                    c0255a.b(2, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15119K));
                    break;
                case 3:
                case 4:
                case 9:
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case 26:
                case 29:
                case 30:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f15081g.get(index));
                    break;
                case 5:
                    c0255a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0255a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f15092e.f15113E));
                    break;
                case 7:
                    c0255a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f15092e.f15114F));
                    break;
                case 8:
                    c0255a.b(8, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15120L));
                    break;
                case 11:
                    c0255a.b(11, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15126R));
                    break;
                case 12:
                    c0255a.b(12, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15127S));
                    break;
                case 13:
                    c0255a.b(13, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15123O));
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    c0255a.b(14, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15125Q));
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    c0255a.b(15, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15128T));
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    c0255a.b(16, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15124P));
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    c0255a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f15092e.f15145f));
                    break;
                case 18:
                    c0255a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f15092e.f15147g));
                    break;
                case 19:
                    c0255a.a(19, typedArray.getFloat(index, aVar.f15092e.f15149h));
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    c0255a.a(20, typedArray.getFloat(index, aVar.f15092e.f15176y));
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    c0255a.b(21, typedArray.getLayoutDimension(index, aVar.f15092e.f15143e));
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    c0255a.b(22, f15080f[typedArray.getInt(index, aVar.f15090c.f15194b)]);
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    c0255a.b(23, typedArray.getLayoutDimension(index, aVar.f15092e.f15141d));
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    c0255a.b(24, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15116H));
                    break;
                case 27:
                    c0255a.b(27, typedArray.getInt(index, aVar.f15092e.f15115G));
                    break;
                case 28:
                    c0255a.b(28, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15117I));
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    c0255a.b(31, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15121M));
                    break;
                case 34:
                    c0255a.b(34, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15118J));
                    break;
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    c0255a.a(37, typedArray.getFloat(index, aVar.f15092e.f15177z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f15088a);
                    aVar.f15088a = resourceId;
                    c0255a.b(38, resourceId);
                    break;
                case 39:
                    c0255a.a(39, typedArray.getFloat(index, aVar.f15092e.f15131W));
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    c0255a.a(40, typedArray.getFloat(index, aVar.f15092e.f15130V));
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    c0255a.b(41, typedArray.getInt(index, aVar.f15092e.f15132X));
                    break;
                case HVError.CONSENT_DENIED /* 42 */:
                    c0255a.b(42, typedArray.getInt(index, aVar.f15092e.f15133Y));
                    break;
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    c0255a.a(43, typedArray.getFloat(index, aVar.f15090c.f15196d));
                    break;
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    c0255a.d(44, true);
                    c0255a.a(44, typedArray.getDimension(index, aVar.f15093f.f15212n));
                    break;
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    c0255a.a(45, typedArray.getFloat(index, aVar.f15093f.f15201c));
                    break;
                case 46:
                    c0255a.a(46, typedArray.getFloat(index, aVar.f15093f.f15202d));
                    break;
                case 47:
                    c0255a.a(47, typedArray.getFloat(index, aVar.f15093f.f15203e));
                    break;
                case 48:
                    c0255a.a(48, typedArray.getFloat(index, aVar.f15093f.f15204f));
                    break;
                case 49:
                    c0255a.a(49, typedArray.getDimension(index, aVar.f15093f.f15205g));
                    break;
                case 50:
                    c0255a.a(50, typedArray.getDimension(index, aVar.f15093f.f15206h));
                    break;
                case 51:
                    c0255a.a(51, typedArray.getDimension(index, aVar.f15093f.f15208j));
                    break;
                case 52:
                    c0255a.a(52, typedArray.getDimension(index, aVar.f15093f.f15209k));
                    break;
                case 53:
                    c0255a.a(53, typedArray.getDimension(index, aVar.f15093f.f15210l));
                    break;
                case 54:
                    c0255a.b(54, typedArray.getInt(index, aVar.f15092e.f15134Z));
                    break;
                case 55:
                    c0255a.b(55, typedArray.getInt(index, aVar.f15092e.f15136a0));
                    break;
                case 56:
                    c0255a.b(56, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15138b0));
                    break;
                case 57:
                    c0255a.b(57, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15140c0));
                    break;
                case 58:
                    c0255a.b(58, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15142d0));
                    break;
                case 59:
                    c0255a.b(59, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15144e0));
                    break;
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    c0255a.a(60, typedArray.getFloat(index, aVar.f15093f.f15200b));
                    break;
                case 62:
                    c0255a.b(62, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15111C));
                    break;
                case 63:
                    c0255a.a(63, typedArray.getFloat(index, aVar.f15092e.f15112D));
                    break;
                case 64:
                    c0255a.b(64, p(typedArray, index, aVar.f15091d.f15180b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0255a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0255a.c(65, C3635a.f37260c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0255a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0255a.a(67, typedArray.getFloat(index, aVar.f15091d.f15187i));
                    break;
                case 68:
                    c0255a.a(68, typedArray.getFloat(index, aVar.f15090c.f15197e));
                    break;
                case 69:
                    c0255a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0255a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0255a.b(72, typedArray.getInt(index, aVar.f15092e.f15150h0));
                    break;
                case 73:
                    c0255a.b(73, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15152i0));
                    break;
                case 74:
                    c0255a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0255a.d(75, typedArray.getBoolean(index, aVar.f15092e.f15166p0));
                    break;
                case com.swmansion.reanimated.BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                    c0255a.b(76, typedArray.getInt(index, aVar.f15091d.f15183e));
                    break;
                case 77:
                    c0255a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0255a.b(78, typedArray.getInt(index, aVar.f15090c.f15195c));
                    break;
                case 79:
                    c0255a.a(79, typedArray.getFloat(index, aVar.f15091d.f15185g));
                    break;
                case 80:
                    c0255a.d(80, typedArray.getBoolean(index, aVar.f15092e.f15162n0));
                    break;
                case 81:
                    c0255a.d(81, typedArray.getBoolean(index, aVar.f15092e.f15164o0));
                    break;
                case 82:
                    c0255a.b(82, typedArray.getInteger(index, aVar.f15091d.f15181c));
                    break;
                case 83:
                    c0255a.b(83, p(typedArray, index, aVar.f15093f.f15207i));
                    break;
                case 84:
                    c0255a.b(84, typedArray.getInteger(index, aVar.f15091d.f15189k));
                    break;
                case 85:
                    c0255a.a(85, typedArray.getFloat(index, aVar.f15091d.f15188j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f15091d.f15192n = typedArray.getResourceId(index, -1);
                        c0255a.b(89, aVar.f15091d.f15192n);
                        c cVar = aVar.f15091d;
                        if (cVar.f15192n != -1) {
                            cVar.f15191m = -2;
                            c0255a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f15091d.f15190l = typedArray.getString(index);
                        c0255a.c(90, aVar.f15091d.f15190l);
                        if (aVar.f15091d.f15190l.indexOf("/") > 0) {
                            aVar.f15091d.f15192n = typedArray.getResourceId(index, -1);
                            c0255a.b(89, aVar.f15091d.f15192n);
                            aVar.f15091d.f15191m = -2;
                            c0255a.b(88, -2);
                            break;
                        } else {
                            aVar.f15091d.f15191m = -1;
                            c0255a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f15091d;
                        cVar2.f15191m = typedArray.getInteger(index, cVar2.f15192n);
                        c0255a.b(88, aVar.f15091d.f15191m);
                        break;
                    }
                case AppConstants.REQUEST_CODE /* 87 */:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f15081g.get(index));
                    break;
                case 93:
                    c0255a.b(93, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15122N));
                    break;
                case 94:
                    c0255a.b(94, typedArray.getDimensionPixelSize(index, aVar.f15092e.f15129U));
                    break;
                case 95:
                    q(c0255a, typedArray, index, 0);
                    break;
                case 96:
                    q(c0255a, typedArray, index, 1);
                    break;
                case 97:
                    c0255a.b(97, typedArray.getInt(index, aVar.f15092e.f15168q0));
                    break;
                case 98:
                    if (AbstractC3900b.f38733a) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f15088a);
                        aVar.f15088a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f15089b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f15089b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f15088a = typedArray.getResourceId(index, aVar.f15088a);
                        break;
                    }
                case 99:
                    c0255a.d(99, typedArray.getBoolean(index, aVar.f15092e.f15151i));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f15087e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f15087e.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC3899a.a(childAt));
            } else {
                if (this.f15086d && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f15087e.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = (a) this.f15087e.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f15092e.f15154j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f15092e.f15150h0);
                                barrier.setMargin(aVar.f15092e.f15152i0);
                                barrier.setAllowsGoneWidget(aVar.f15092e.f15166p0);
                                b bVar = aVar.f15092e;
                                int[] iArr = bVar.f15156k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f15158l0;
                                    if (str != null) {
                                        bVar.f15156k0 = k(barrier, str);
                                        barrier.setReferencedIds(aVar.f15092e.f15156k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.b(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.c(childAt, aVar.f15094g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0256d c0256d = aVar.f15090c;
                            if (c0256d.f15195c == 0) {
                                childAt.setVisibility(c0256d.f15194b);
                            }
                            childAt.setAlpha(aVar.f15090c.f15196d);
                            childAt.setRotation(aVar.f15093f.f15200b);
                            childAt.setRotationX(aVar.f15093f.f15201c);
                            childAt.setRotationY(aVar.f15093f.f15202d);
                            childAt.setScaleX(aVar.f15093f.f15203e);
                            childAt.setScaleY(aVar.f15093f.f15204f);
                            e eVar = aVar.f15093f;
                            if (eVar.f15207i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f15093f.f15207i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f15205g)) {
                                    childAt.setPivotX(aVar.f15093f.f15205g);
                                }
                                if (!Float.isNaN(aVar.f15093f.f15206h)) {
                                    childAt.setPivotY(aVar.f15093f.f15206h);
                                }
                            }
                            childAt.setTranslationX(aVar.f15093f.f15208j);
                            childAt.setTranslationY(aVar.f15093f.f15209k);
                            childAt.setTranslationZ(aVar.f15093f.f15210l);
                            e eVar2 = aVar.f15093f;
                            if (eVar2.f15211m) {
                                childAt.setElevation(eVar2.f15212n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f15087e.get(num);
            if (aVar2 != null) {
                if (aVar2.f15092e.f15154j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f15092e;
                    int[] iArr2 = bVar3.f15156k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f15158l0;
                        if (str2 != null) {
                            bVar3.f15156k0 = k(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f15092e.f15156k0);
                        }
                    }
                    barrier2.setType(aVar2.f15092e.f15150h0);
                    barrier2.setMargin(aVar2.f15092e.f15152i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.o();
                    aVar2.b(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f15092e.f15135a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.b(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).f(constraintLayout);
            }
        }
    }

    public void e(int i10, int i11) {
        a aVar;
        if (!this.f15087e.containsKey(Integer.valueOf(i10)) || (aVar = (a) this.f15087e.get(Integer.valueOf(i10))) == null) {
            return;
        }
        switch (i11) {
            case 1:
                b bVar = aVar.f15092e;
                bVar.f15155k = -1;
                bVar.f15153j = -1;
                bVar.f15116H = -1;
                bVar.f15123O = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f15092e;
                bVar2.f15159m = -1;
                bVar2.f15157l = -1;
                bVar2.f15117I = -1;
                bVar2.f15125Q = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f15092e;
                bVar3.f15163o = -1;
                bVar3.f15161n = -1;
                bVar3.f15118J = 0;
                bVar3.f15124P = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f15092e;
                bVar4.f15165p = -1;
                bVar4.f15167q = -1;
                bVar4.f15119K = 0;
                bVar4.f15126R = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f15092e;
                bVar5.f15169r = -1;
                bVar5.f15170s = -1;
                bVar5.f15171t = -1;
                bVar5.f15122N = 0;
                bVar5.f15129U = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f15092e;
                bVar6.f15172u = -1;
                bVar6.f15173v = -1;
                bVar6.f15121M = 0;
                bVar6.f15128T = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f15092e;
                bVar7.f15174w = -1;
                bVar7.f15175x = -1;
                bVar7.f15120L = 0;
                bVar7.f15127S = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f15092e;
                bVar8.f15112D = -1.0f;
                bVar8.f15111C = -1;
                bVar8.f15110B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void f(Context context, int i10) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f15087e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f15086d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f15087e.containsKey(Integer.valueOf(id2))) {
                this.f15087e.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f15087e.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f15094g = androidx.constraintlayout.widget.a.a(this.f15085c, childAt);
                aVar.d(id2, bVar);
                aVar.f15090c.f15194b = childAt.getVisibility();
                aVar.f15090c.f15196d = childAt.getAlpha();
                aVar.f15093f.f15200b = childAt.getRotation();
                aVar.f15093f.f15201c = childAt.getRotationX();
                aVar.f15093f.f15202d = childAt.getRotationY();
                aVar.f15093f.f15203e = childAt.getScaleX();
                aVar.f15093f.f15204f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f15093f;
                    eVar.f15205g = pivotX;
                    eVar.f15206h = pivotY;
                }
                aVar.f15093f.f15208j = childAt.getTranslationX();
                aVar.f15093f.f15209k = childAt.getTranslationY();
                aVar.f15093f.f15210l = childAt.getTranslationZ();
                e eVar2 = aVar.f15093f;
                if (eVar2.f15211m) {
                    eVar2.f15212n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f15092e.f15166p0 = barrier.getAllowsGoneWidget();
                    aVar.f15092e.f15156k0 = barrier.getReferencedIds();
                    aVar.f15092e.f15150h0 = barrier.getType();
                    aVar.f15092e.f15152i0 = barrier.getMargin();
                }
            }
        }
    }

    public void h(int i10, int i11, int i12, float f10) {
        b bVar = m(i10).f15092e;
        bVar.f15110B = i11;
        bVar.f15111C = i12;
        bVar.f15112D = f10;
    }

    public void i(int i10, int i11) {
        m(i10).f15092e.f15143e = i11;
    }

    public void j(int i10, int i11) {
        m(i10).f15092e.f15141d = i11;
    }

    public void n(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a l10 = l(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        l10.f15092e.f15135a = true;
                    }
                    this.f15087e.put(Integer.valueOf(l10.f15088a), l10);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cf, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlPullParser.getName()) {
                            case "Constraint":
                                aVar = l(context, Xml.asAttributeSet(xmlPullParser), false);
                                break;
                            case "ConstraintOverride":
                                aVar = l(context, Xml.asAttributeSet(xmlPullParser), true);
                                break;
                            case "Guideline":
                                aVar = l(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVar.f15092e;
                                bVar.f15135a = true;
                                bVar.f15137b = true;
                                break;
                            case "Barrier":
                                aVar = l(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVar.f15092e.f15154j0 = 1;
                                break;
                            case "PropertySet":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f15090c.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "Transform":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f15093f.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "Layout":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f15092e.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "Motion":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f15091d.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "CustomAttribute":
                            case "CustomMethod":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                androidx.constraintlayout.widget.a.b(context, xmlPullParser, aVar.f15094g);
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    break;
                                }
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    break;
                                }
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    break;
                                }
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    break;
                                }
                                break;
                        }
                        if (r4 == 0) {
                            return;
                        }
                        if (r4 == 1 || r4 == 2 || r4 == 3) {
                            this.f15087e.put(Integer.valueOf(aVar.f15088a), aVar);
                            aVar = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
