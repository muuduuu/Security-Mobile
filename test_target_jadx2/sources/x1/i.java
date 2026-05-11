package X1;

import O1.B;
import O1.C1038i;
import O1.J;
import R1.o;
import U1.b;
import V1.k;
import V1.l;
import V1.m;
import W1.q;
import W1.u;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import c2.C1720c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class i extends X1.b {

    /* renamed from: E, reason: collision with root package name */
    private final StringBuilder f11706E;

    /* renamed from: F, reason: collision with root package name */
    private final RectF f11707F;

    /* renamed from: G, reason: collision with root package name */
    private final Matrix f11708G;

    /* renamed from: H, reason: collision with root package name */
    private final Paint f11709H;

    /* renamed from: I, reason: collision with root package name */
    private final Paint f11710I;

    /* renamed from: J, reason: collision with root package name */
    private final Map f11711J;

    /* renamed from: K, reason: collision with root package name */
    private final j0.f f11712K;

    /* renamed from: L, reason: collision with root package name */
    private final List f11713L;

    /* renamed from: M, reason: collision with root package name */
    private final o f11714M;

    /* renamed from: N, reason: collision with root package name */
    private final com.airbnb.lottie.o f11715N;

    /* renamed from: O, reason: collision with root package name */
    private final C1038i f11716O;

    /* renamed from: P, reason: collision with root package name */
    private u f11717P;

    /* renamed from: Q, reason: collision with root package name */
    private R1.a f11718Q;

    /* renamed from: R, reason: collision with root package name */
    private R1.a f11719R;

    /* renamed from: S, reason: collision with root package name */
    private R1.a f11720S;

    /* renamed from: T, reason: collision with root package name */
    private R1.a f11721T;

    /* renamed from: U, reason: collision with root package name */
    private R1.a f11722U;

    /* renamed from: V, reason: collision with root package name */
    private R1.a f11723V;

    /* renamed from: W, reason: collision with root package name */
    private R1.a f11724W;

    /* renamed from: X, reason: collision with root package name */
    private R1.a f11725X;

    /* renamed from: Y, reason: collision with root package name */
    private R1.a f11726Y;

    /* renamed from: Z, reason: collision with root package name */
    private R1.a f11727Z;

    /* renamed from: a0, reason: collision with root package name */
    private R1.a f11728a0;

    /* renamed from: b0, reason: collision with root package name */
    private R1.a f11729b0;

    /* renamed from: c0, reason: collision with root package name */
    private R1.a f11730c0;

    /* renamed from: d0, reason: collision with root package name */
    private R1.a f11731d0;

    class a extends Paint {
        a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11734a;

        static {
            int[] iArr = new int[b.a.values().length];
            f11734a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11734a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11734a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    i(com.airbnb.lottie.o oVar, e eVar) {
        super(oVar, eVar);
        l lVar;
        l lVar2;
        V1.d dVar;
        l lVar3;
        V1.d dVar2;
        l lVar4;
        V1.d dVar3;
        m mVar;
        V1.d dVar4;
        m mVar2;
        V1.b bVar;
        m mVar3;
        V1.b bVar2;
        m mVar4;
        V1.a aVar;
        m mVar5;
        V1.a aVar2;
        this.f11706E = new StringBuilder(2);
        this.f11707F = new RectF();
        this.f11708G = new Matrix();
        this.f11709H = new a(1);
        this.f11710I = new b(1);
        this.f11711J = new HashMap();
        this.f11712K = new j0.f();
        this.f11713L = new ArrayList();
        this.f11717P = u.INDEX;
        this.f11715N = oVar;
        this.f11716O = eVar.c();
        o p10 = eVar.t().p();
        this.f11714M = p10;
        p10.a(this);
        i(p10);
        k u10 = eVar.u();
        if (u10 != null && (mVar5 = u10.f10765a) != null && (aVar2 = mVar5.f10771a) != null) {
            R1.a p11 = aVar2.p();
            this.f11718Q = p11;
            p11.a(this);
            i(this.f11718Q);
        }
        if (u10 != null && (mVar4 = u10.f10765a) != null && (aVar = mVar4.f10772b) != null) {
            R1.a p12 = aVar.p();
            this.f11720S = p12;
            p12.a(this);
            i(this.f11720S);
        }
        if (u10 != null && (mVar3 = u10.f10765a) != null && (bVar2 = mVar3.f10773c) != null) {
            R1.d p13 = bVar2.p();
            this.f11722U = p13;
            p13.a(this);
            i(this.f11722U);
        }
        if (u10 != null && (mVar2 = u10.f10765a) != null && (bVar = mVar2.f10774d) != null) {
            R1.d p14 = bVar.p();
            this.f11724W = p14;
            p14.a(this);
            i(this.f11724W);
        }
        if (u10 != null && (mVar = u10.f10765a) != null && (dVar4 = mVar.f10775e) != null) {
            R1.a p15 = dVar4.p();
            this.f11726Y = p15;
            p15.a(this);
            i(this.f11726Y);
        }
        if (u10 != null && (lVar4 = u10.f10766b) != null && (dVar3 = lVar4.f10767a) != null) {
            R1.a p16 = dVar3.p();
            this.f11729b0 = p16;
            p16.a(this);
            i(this.f11729b0);
        }
        if (u10 != null && (lVar3 = u10.f10766b) != null && (dVar2 = lVar3.f10768b) != null) {
            R1.a p17 = dVar2.p();
            this.f11730c0 = p17;
            p17.a(this);
            i(this.f11730c0);
        }
        if (u10 != null && (lVar2 = u10.f10766b) != null && (dVar = lVar2.f10769c) != null) {
            R1.a p18 = dVar.p();
            this.f11731d0 = p18;
            p18.a(this);
            i(this.f11731d0);
        }
        if (u10 == null || (lVar = u10.f10766b) == null) {
            return;
        }
        this.f11717P = lVar.f10770d;
    }

    private String Q(String str, int i10) {
        int codePointAt = str.codePointAt(i10);
        int charCount = Character.charCount(codePointAt) + i10;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!f0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j10 = codePointAt;
        if (this.f11712K.d(j10)) {
            return (String) this.f11712K.h(j10);
        }
        this.f11706E.setLength(0);
        while (i10 < charCount) {
            int codePointAt3 = str.codePointAt(i10);
            this.f11706E.appendCodePoint(codePointAt3);
            i10 += Character.charCount(codePointAt3);
        }
        String sb2 = this.f11706E.toString();
        this.f11712K.l(j10, sb2);
        return sb2;
    }

    private void R(U1.b bVar, int i10, int i11) {
        R1.a aVar = this.f11719R;
        if (aVar != null) {
            this.f11709H.setColor(((Integer) aVar.h()).intValue());
        } else if (this.f11718Q == null || !e0(i11)) {
            this.f11709H.setColor(bVar.f10304h);
        } else {
            this.f11709H.setColor(((Integer) this.f11718Q.h()).intValue());
        }
        R1.a aVar2 = this.f11721T;
        if (aVar2 != null) {
            this.f11710I.setColor(((Integer) aVar2.h()).intValue());
        } else if (this.f11720S == null || !e0(i11)) {
            this.f11710I.setColor(bVar.f10305i);
        } else {
            this.f11710I.setColor(((Integer) this.f11720S.h()).intValue());
        }
        int i12 = 100;
        int intValue = this.f11652x.h() == null ? 100 : ((Integer) this.f11652x.h().h()).intValue();
        if (this.f11726Y != null && e0(i11)) {
            i12 = ((Integer) this.f11726Y.h()).intValue();
        }
        int round = Math.round(((((intValue * 255.0f) / 100.0f) * (i12 / 100.0f)) * i10) / 255.0f);
        this.f11709H.setAlpha(round);
        this.f11710I.setAlpha(round);
        R1.a aVar3 = this.f11723V;
        if (aVar3 != null) {
            this.f11710I.setStrokeWidth(((Float) aVar3.h()).floatValue());
        } else if (this.f11722U == null || !e0(i11)) {
            this.f11710I.setStrokeWidth(bVar.f10306j * b2.l.e());
        } else {
            this.f11710I.setStrokeWidth(((Float) this.f11722U.h()).floatValue());
        }
    }

    private void S(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void T(U1.d dVar, float f10, U1.b bVar, Canvas canvas, int i10, int i11) {
        R(bVar, i11, i10);
        List b02 = b0(dVar);
        for (int i12 = 0; i12 < b02.size(); i12++) {
            Path J10 = ((Q1.d) b02.get(i12)).J();
            J10.computeBounds(this.f11707F, false);
            this.f11708G.reset();
            this.f11708G.preTranslate(0.0f, (-bVar.f10303g) * b2.l.e());
            this.f11708G.preScale(f10, f10);
            J10.transform(this.f11708G);
            if (bVar.f10307k) {
                W(J10, this.f11709H, canvas);
                W(J10, this.f11710I, canvas);
            } else {
                W(J10, this.f11710I, canvas);
                W(J10, this.f11709H, canvas);
            }
        }
    }

    private void U(String str, U1.b bVar, Canvas canvas, int i10, int i11) {
        R(bVar, i11, i10);
        if (bVar.f10307k) {
            S(str, this.f11709H, canvas);
            S(str, this.f11710I, canvas);
        } else {
            S(str, this.f11710I, canvas);
            S(str, this.f11709H, canvas);
        }
    }

    private void V(String str, U1.b bVar, Canvas canvas, float f10, int i10, int i11) {
        int i12 = 0;
        while (i12 < str.length()) {
            String Q10 = Q(str, i12);
            U(Q10, bVar, canvas, i10 + i12, i11);
            canvas.translate(this.f11709H.measureText(Q10) + f10, 0.0f);
            i12 += Q10.length();
        }
    }

    private void W(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void X(String str, U1.b bVar, U1.c cVar, Canvas canvas, float f10, float f11, float f12, int i10) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            U1.d dVar = (U1.d) this.f11716O.c().i(U1.d.c(str.charAt(i11), cVar.a(), cVar.c()));
            if (dVar != null) {
                T(dVar, f11, bVar, canvas, i11, i10);
                canvas.translate((((float) dVar.b()) * f11 * b2.l.e()) + f12, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Y(U1.b bVar, U1.c cVar, Canvas canvas, int i10) {
        float floatValue;
        int size;
        int i11;
        int i12;
        List list;
        Typeface d02 = d0(cVar);
        if (d02 == null) {
            return;
        }
        String str = bVar.f10297a;
        J b02 = this.f11715N.b0();
        if (b02 != null) {
            str = b02.c(getName(), str);
        }
        this.f11709H.setTypeface(d02);
        R1.a aVar = this.f11727Z;
        float floatValue2 = aVar != null ? ((Float) aVar.h()).floatValue() : bVar.f10299c;
        this.f11709H.setTextSize(b2.l.e() * floatValue2);
        this.f11710I.setTypeface(this.f11709H.getTypeface());
        this.f11710I.setTextSize(this.f11709H.getTextSize());
        float f10 = bVar.f10301e / 10.0f;
        R1.a aVar2 = this.f11725X;
        if (aVar2 == null) {
            R1.a aVar3 = this.f11724W;
            if (aVar3 != null) {
                floatValue = ((Float) aVar3.h()).floatValue();
            }
            float e10 = ((f10 * b2.l.e()) * floatValue2) / 100.0f;
            List c02 = c0(str);
            size = c02.size();
            int i13 = -1;
            int i14 = 0;
            for (i11 = 0; i11 < size; i11++) {
                String str2 = (String) c02.get(i11);
                PointF pointF = bVar.f10309m;
                List h02 = h0(str2, pointF == null ? 0.0f : pointF.x, cVar, 0.0f, e10, false);
                int i15 = 0;
                while (i15 < h02.size()) {
                    d dVar = (d) h02.get(i15);
                    i13++;
                    canvas.save();
                    if (g0(canvas, bVar, i13, dVar.f11736b)) {
                        i12 = i15;
                        list = h02;
                        V(dVar.f11735a, bVar, canvas, e10, i14, i10);
                    } else {
                        i12 = i15;
                        list = h02;
                    }
                    i14 += dVar.f11735a.length();
                    canvas.restore();
                    i15 = i12 + 1;
                    h02 = list;
                }
            }
        }
        floatValue = ((Float) aVar2.h()).floatValue();
        f10 += floatValue;
        float e102 = ((f10 * b2.l.e()) * floatValue2) / 100.0f;
        List c022 = c0(str);
        size = c022.size();
        int i132 = -1;
        int i142 = 0;
        while (i11 < size) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Z(U1.b bVar, Matrix matrix, U1.c cVar, Canvas canvas, int i10) {
        float floatValue;
        int i11;
        int i12;
        List list;
        int i13;
        int i14;
        R1.a aVar = this.f11727Z;
        float floatValue2 = (aVar != null ? ((Float) aVar.h()).floatValue() : bVar.f10299c) / 100.0f;
        float g10 = b2.l.g(matrix);
        List c02 = c0(bVar.f10297a);
        int size = c02.size();
        float f10 = bVar.f10301e / 10.0f;
        R1.a aVar2 = this.f11725X;
        if (aVar2 == null) {
            R1.a aVar3 = this.f11724W;
            if (aVar3 != null) {
                floatValue = ((Float) aVar3.h()).floatValue();
            }
            float f11 = f10;
            int i15 = -1;
            i11 = 0;
            while (i11 < size) {
                String str = (String) c02.get(i11);
                PointF pointF = bVar.f10309m;
                List h02 = h0(str, pointF == null ? 0.0f : pointF.x, cVar, floatValue2, f11, true);
                int i16 = 0;
                while (i16 < h02.size()) {
                    d dVar = (d) h02.get(i16);
                    int i17 = i15 + 1;
                    canvas.save();
                    if (g0(canvas, bVar, i17, dVar.f11736b)) {
                        i12 = i16;
                        list = h02;
                        i13 = i17;
                        i14 = i11;
                        X(dVar.f11735a, bVar, cVar, canvas, g10, floatValue2, f11, i10);
                    } else {
                        i12 = i16;
                        list = h02;
                        i13 = i17;
                        i14 = i11;
                    }
                    canvas.restore();
                    i16 = i12 + 1;
                    h02 = list;
                    i15 = i13;
                    i11 = i14;
                }
                i11++;
            }
        }
        floatValue = ((Float) aVar2.h()).floatValue();
        f10 += floatValue;
        float f112 = f10;
        int i152 = -1;
        i11 = 0;
        while (i11 < size) {
        }
    }

    private d a0(int i10) {
        for (int size = this.f11713L.size(); size < i10; size++) {
            this.f11713L.add(new d(null));
        }
        return (d) this.f11713L.get(i10 - 1);
    }

    private List b0(U1.d dVar) {
        if (this.f11711J.containsKey(dVar)) {
            return (List) this.f11711J.get(dVar);
        }
        List a10 = dVar.a();
        int size = a10.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new Q1.d(this.f11715N, this, (q) a10.get(i10), this.f11716O));
        }
        this.f11711J.put(dVar, arrayList);
        return arrayList;
    }

    private List c0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface d0(U1.c cVar) {
        Typeface typeface;
        R1.a aVar = this.f11728a0;
        if (aVar != null && (typeface = (Typeface) aVar.h()) != null) {
            return typeface;
        }
        Typeface c02 = this.f11715N.c0(cVar);
        return c02 != null ? c02 : cVar.d();
    }

    private boolean e0(int i10) {
        int length = ((U1.b) this.f11714M.h()).f10297a.length();
        R1.a aVar = this.f11729b0;
        if (aVar == null || this.f11730c0 == null) {
            return true;
        }
        int min = Math.min(((Integer) aVar.h()).intValue(), ((Integer) this.f11730c0.h()).intValue());
        int max = Math.max(((Integer) this.f11729b0.h()).intValue(), ((Integer) this.f11730c0.h()).intValue());
        R1.a aVar2 = this.f11731d0;
        if (aVar2 != null) {
            int intValue = ((Integer) aVar2.h()).intValue();
            min += intValue;
            max += intValue;
        }
        if (this.f11717P == u.INDEX) {
            return i10 >= min && i10 < max;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) min) && f10 < ((float) max);
    }

    private boolean f0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    private boolean g0(Canvas canvas, U1.b bVar, int i10, float f10) {
        PointF pointF = bVar.f10308l;
        PointF pointF2 = bVar.f10309m;
        float e10 = b2.l.e();
        float f11 = (i10 * bVar.f10302f * e10) + (pointF == null ? 0.0f : (bVar.f10302f * e10) + pointF.y);
        if (this.f11715N.I() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f10299c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.f11734a[bVar.f10300d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
        return true;
    }

    private List h0(String str, float f10, U1.c cVar, float f11, float f12, boolean z10) {
        float measureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (z10) {
                U1.d dVar = (U1.d) this.f11716O.c().i(U1.d.c(charAt, cVar.a(), cVar.c()));
                if (dVar != null) {
                    measureText = ((float) dVar.b()) * f11 * b2.l.e();
                }
            } else {
                measureText = this.f11709H.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = measureText + f12;
            if (charAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && charAt != ' ') {
                i10++;
                d a02 = a0(i10);
                if (i12 == i11) {
                    a02.c(str.substring(i11, i13).trim(), (f13 - f16) - ((r9.length() - r7.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    a02.c(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            a0(i10).c(str.substring(i11), f13);
        }
        return this.f11713L.subList(0, i10);
    }

    @Override // X1.b, Q1.e
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.f11716O.b().width(), this.f11716O.b().height());
    }

    @Override // X1.b, U1.f
    public void h(Object obj, C1720c c1720c) {
        super.h(obj, c1720c);
        if (obj == B.f6869a) {
            R1.a aVar = this.f11719R;
            if (aVar != null) {
                H(aVar);
            }
            if (c1720c == null) {
                this.f11719R = null;
                return;
            }
            R1.q qVar = new R1.q(c1720c);
            this.f11719R = qVar;
            qVar.a(this);
            i(this.f11719R);
            return;
        }
        if (obj == B.f6870b) {
            R1.a aVar2 = this.f11721T;
            if (aVar2 != null) {
                H(aVar2);
            }
            if (c1720c == null) {
                this.f11721T = null;
                return;
            }
            R1.q qVar2 = new R1.q(c1720c);
            this.f11721T = qVar2;
            qVar2.a(this);
            i(this.f11721T);
            return;
        }
        if (obj == B.f6887s) {
            R1.a aVar3 = this.f11723V;
            if (aVar3 != null) {
                H(aVar3);
            }
            if (c1720c == null) {
                this.f11723V = null;
                return;
            }
            R1.q qVar3 = new R1.q(c1720c);
            this.f11723V = qVar3;
            qVar3.a(this);
            i(this.f11723V);
            return;
        }
        if (obj == B.f6888t) {
            R1.a aVar4 = this.f11725X;
            if (aVar4 != null) {
                H(aVar4);
            }
            if (c1720c == null) {
                this.f11725X = null;
                return;
            }
            R1.q qVar4 = new R1.q(c1720c);
            this.f11725X = qVar4;
            qVar4.a(this);
            i(this.f11725X);
            return;
        }
        if (obj == B.f6858F) {
            R1.a aVar5 = this.f11727Z;
            if (aVar5 != null) {
                H(aVar5);
            }
            if (c1720c == null) {
                this.f11727Z = null;
                return;
            }
            R1.q qVar5 = new R1.q(c1720c);
            this.f11727Z = qVar5;
            qVar5.a(this);
            i(this.f11727Z);
            return;
        }
        if (obj != B.f6865M) {
            if (obj == B.f6867O) {
                this.f11714M.r(c1720c);
                return;
            }
            return;
        }
        R1.a aVar6 = this.f11728a0;
        if (aVar6 != null) {
            H(aVar6);
        }
        if (c1720c == null) {
            this.f11728a0 = null;
            return;
        }
        R1.q qVar6 = new R1.q(c1720c);
        this.f11728a0 = qVar6;
        qVar6.a(this);
        i(this.f11728a0);
    }

    @Override // X1.b
    void t(Canvas canvas, Matrix matrix, int i10) {
        U1.b bVar = (U1.b) this.f11714M.h();
        U1.c cVar = (U1.c) this.f11716O.g().get(bVar.f10298b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        R(bVar, i10, 0);
        if (this.f11715N.p1()) {
            Z(bVar, matrix, cVar, canvas, i10);
        } else {
            Y(bVar, cVar, canvas, i10);
        }
        canvas.restore();
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private String f11735a;

        /* renamed from: b, reason: collision with root package name */
        private float f11736b;

        private d() {
            this.f11735a = BuildConfig.FLAVOR;
            this.f11736b = 0.0f;
        }

        void c(String str, float f10) {
            this.f11735a = str;
            this.f11736b = f10;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
