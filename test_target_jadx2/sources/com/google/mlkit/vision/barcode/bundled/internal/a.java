package com.google.mlkit.vision.barcode.bundled.internal;

import V6.AbstractC1287s;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2443f0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2453h0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2478m0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2492p;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2497q;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2506s;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2511t;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2516u;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2521v;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2526w;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2531x;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2536y;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2541z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.X;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e7.BinderC3090b;
import e7.InterfaceC3089a;
import f8.C3153a;
import f8.c;
import f8.d;
import f8.f;
import f8.g;
import f8.i;
import f8.j;
import f8.l;
import f8.n;
import f8.o;
import f9.C3157d;
import i9.C3337D;
import i9.C3339F;
import i9.C3341H;
import i9.C3343J;
import i9.C3344a;
import i9.C3348e;
import i9.C3349f;
import i9.C3350g;
import i9.C3352i;
import i9.C3355l;
import i9.O;
import i9.q;
import i9.s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes2.dex */
final class a extends M {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f28659i = {5, 7, 7, 7, 5, 5};

    /* renamed from: j, reason: collision with root package name */
    private static final double[][] f28660j;

    /* renamed from: f, reason: collision with root package name */
    private final Context f28661f;

    /* renamed from: g, reason: collision with root package name */
    private final RecognitionOptions f28662g;

    /* renamed from: h, reason: collision with root package name */
    private BarhopperV3 f28663h;

    static {
        double[] dArr = new double[2];
        // fill-array-data instruction
        dArr[0] = 0.5d;
        dArr[1] = 1.0d;
        f28660j = new double[][]{new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, dArr, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};
    }

    a(Context context, E e10) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f28662g = recognitionOptions;
        this.f28661f = context;
        recognitionOptions.a(e10.j());
        recognitionOptions.b(e10.u());
    }

    private static C2497q k1(C3337D c3337d, String str, String str2) {
        if (c3337d == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new C2497q(c3337d.L(), c3337d.J(), c3337d.G(), c3337d.H(), c3337d.I(), c3337d.K(), c3337d.O(), matcher.find() ? matcher.group(1) : null);
    }

    private final C3344a l1(ByteBuffer byteBuffer, X x10) {
        BarhopperV3 barhopperV3 = (BarhopperV3) AbstractC1287s.m(this.f28663h);
        if (((ByteBuffer) AbstractC1287s.m(byteBuffer)).isDirect()) {
            return barhopperV3.b(x10.I(), x10.j(), byteBuffer, this.f28662g);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.c(x10.I(), x10.j(), byteBuffer.array(), this.f28662g);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.c(x10.I(), x10.j(), bArr, this.f28662g);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N
    public final void a() {
        if (this.f28663h != null) {
            return;
        }
        this.f28663h = new BarhopperV3();
        i G10 = j.G();
        f G11 = g.G();
        int i10 = 16;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            c G12 = d.G();
            G12.p(i10);
            G12.q(i10);
            for (int i13 = 0; i13 < f28659i[i12]; i13++) {
                double[] dArr = f28660j[i11];
                double d10 = dArr[0] * 320.0d;
                float sqrt = (float) Math.sqrt(dArr[1]);
                float f10 = (float) d10;
                G12.n(f10 / sqrt);
                G12.o(f10 * sqrt);
                i11++;
            }
            i10 += i10;
            G11.n(G12);
        }
        G10.n(G11);
        try {
            InputStream open = this.f28661f.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream open2 = this.f28661f.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream open3 = this.f28661f.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) AbstractC1287s.m(this.f28663h);
                        l G13 = C3153a.G();
                        G10.o(E0.I(open));
                        G13.n(G10);
                        n G14 = o.G();
                        G14.n(E0.I(open2));
                        G14.o(E0.I(open3));
                        G13.o(G14);
                        barhopperV3.a((C3153a) G13.r());
                        if (open3 != null) {
                            open3.close();
                        }
                        if (open2 != null) {
                            open2.close();
                        }
                        if (open != null) {
                            open.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed to open Barcode models", e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N
    public final void f() {
        BarhopperV3 barhopperV3 = this.f28663h;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f28663h = null;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N
    public final List k(InterfaceC3089a interfaceC3089a, X x10) {
        C3344a d10;
        C2516u c2516u;
        C2531x c2531x;
        C2536y c2536y;
        A a10;
        C2541z c2541z;
        C2521v c2521v;
        r rVar;
        int i10;
        C2506s c2506s;
        C2511t c2511t;
        int i11;
        Point[] pointArr;
        int i12;
        int i13;
        C2531x[] c2531xArr;
        C2516u[] c2516uArr;
        C2492p[] c2492pArr;
        int u10 = x10.u();
        int i14 = -1;
        int i15 = 0;
        if (u10 != -1) {
            if (u10 != 17) {
                if (u10 == 35) {
                    d10 = l1(((Image) AbstractC1287s.m((Image) BinderC3090b.l1(interfaceC3089a))).getPlanes()[0].getBuffer(), x10);
                } else if (u10 != 842094169) {
                    throw new IllegalArgumentException("Unsupported image format: " + x10.u());
                }
            }
            d10 = l1((ByteBuffer) BinderC3090b.l1(interfaceC3089a), x10);
        } else {
            d10 = ((BarhopperV3) AbstractC1287s.m(this.f28663h)).d((Bitmap) BinderC3090b.l1(interfaceC3089a), this.f28662g);
        }
        ArrayList arrayList = new ArrayList();
        Matrix e10 = C3157d.b().e(x10.I(), x10.j(), x10.F());
        for (s sVar : d10.I()) {
            if (sVar.H() > 0 && e10 != null) {
                float[] fArr = new float[8];
                List U10 = sVar.U();
                int H10 = sVar.H();
                for (int i16 = i15; i16 < H10; i16++) {
                    int i17 = i16 + i16;
                    fArr[i17] = ((C3350g) U10.get(i16)).G();
                    fArr[i17 + 1] = ((C3350g) U10.get(i16)).H();
                }
                e10.mapPoints(fArr);
                int F10 = x10.F();
                for (int i18 = i15; i18 < H10; i18++) {
                    i9.r rVar2 = (i9.r) sVar.e();
                    int i19 = i18 + i18;
                    C3349f I10 = C3350g.I();
                    I10.n((int) fArr[i19]);
                    I10.o((int) fArr[i19 + 1]);
                    rVar2.n((i18 + F10) % H10, (C3350g) I10.r());
                    sVar = (s) rVar2.r();
                }
            }
            if (sVar.Z()) {
                O N10 = sVar.N();
                c2516u = new C2516u(N10.L() + i14, N10.I(), N10.K(), N10.J());
            } else {
                c2516u = null;
            }
            if (sVar.b0()) {
                C2478m0 I11 = sVar.I();
                c2531x = new C2531x(I11.J() + i14, I11.I());
            } else {
                c2531x = null;
            }
            if (sVar.c0()) {
                C3352i P10 = sVar.P();
                c2536y = new C2536y(P10.I(), P10.J());
            } else {
                c2536y = null;
            }
            if (sVar.e0()) {
                q R10 = sVar.R();
                a10 = new A(R10.J(), R10.I(), R10.K() + i14);
            } else {
                a10 = null;
            }
            if (sVar.d0()) {
                C3355l Q10 = sVar.Q();
                c2541z = new C2541z(Q10.I(), Q10.J());
            } else {
                c2541z = null;
            }
            if (sVar.a0()) {
                C3348e O10 = sVar.O();
                c2521v = new C2521v(O10.G(), O10.H());
            } else {
                c2521v = null;
            }
            if (sVar.W()) {
                C3339F K10 = sVar.K();
                rVar = new r(K10.O(), K10.K(), K10.L(), K10.M(), K10.N(), k1(K10.H(), sVar.S().B() ? sVar.S().L() : null, "DTSTART:([0-9TZ]*)"), k1(K10.G(), sVar.S().B() ? sVar.S().L() : null, "DTEND:([0-9TZ]*)"));
            } else {
                rVar = null;
            }
            if (sVar.X()) {
                C3341H L10 = sVar.L();
                C2453h0 G10 = L10.G();
                C2526w c2526w = G10 != null ? new C2526w(G10.J(), G10.N(), G10.M(), G10.I(), G10.L(), G10.K(), G10.O()) : null;
                String J10 = L10.J();
                String K11 = L10.K();
                List N11 = L10.N();
                if (N11.isEmpty()) {
                    c2531xArr = null;
                } else {
                    C2531x[] c2531xArr2 = new C2531x[N11.size()];
                    for (int i20 = 0; i20 < N11.size(); i20++) {
                        c2531xArr2[i20] = new C2531x(((C2478m0) N11.get(i20)).J() + i14, ((C2478m0) N11.get(i20)).I());
                    }
                    c2531xArr = c2531xArr2;
                }
                List M10 = L10.M();
                if (M10.isEmpty()) {
                    c2516uArr = null;
                } else {
                    C2516u[] c2516uArr2 = new C2516u[M10.size()];
                    int i21 = 0;
                    while (i21 < M10.size()) {
                        c2516uArr2[i21] = new C2516u(((O) M10.get(i21)).L() + i14, ((O) M10.get(i21)).I(), ((O) M10.get(i21)).K(), ((O) M10.get(i21)).J());
                        i21++;
                        i14 = -1;
                    }
                    c2516uArr = c2516uArr2;
                }
                String[] strArr = (String[]) L10.O().toArray(new String[0]);
                List L11 = L10.L();
                if (L11.isEmpty()) {
                    i10 = 0;
                    c2492pArr = null;
                } else {
                    C2492p[] c2492pArr2 = new C2492p[L11.size()];
                    for (int i22 = 0; i22 < L11.size(); i22++) {
                        c2492pArr2[i22] = new C2492p(((C2443f0) L11.get(i22)).I() - 1, (String[]) ((C2443f0) L11.get(i22)).H().toArray(new String[0]));
                    }
                    i10 = 0;
                    c2492pArr = c2492pArr2;
                }
                c2506s = new C2506s(c2526w, J10, K11, c2531xArr, c2516uArr, strArr, c2492pArr);
            } else {
                i10 = 0;
                c2506s = null;
            }
            if (sVar.Y()) {
                C3343J M11 = sVar.M();
                c2511t = new C2511t(M11.N(), M11.P(), M11.V(), M11.T(), M11.Q(), M11.K(), M11.I(), M11.J(), M11.L(), M11.U(), M11.R(), M11.O(), M11.M(), M11.S());
            } else {
                c2511t = null;
            }
            switch (sVar.f0() - 1) {
                case 0:
                    i11 = i10;
                    break;
                case 1:
                    i11 = 1;
                    break;
                case 2:
                    i11 = 2;
                    break;
                case 3:
                    i11 = 4;
                    break;
                case 4:
                    i11 = 8;
                    break;
                case 5:
                    i11 = 16;
                    break;
                case 6:
                    i11 = 32;
                    break;
                case 7:
                    i11 = 64;
                    break;
                case 8:
                    i11 = 128;
                    break;
                case 9:
                    i11 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i11 = 512;
                    break;
                case 11:
                    i11 = 1024;
                    break;
                case 12:
                    i11 = 2048;
                    break;
                case 13:
                    i11 = 4096;
                    break;
                default:
                    i11 = -1;
                    break;
            }
            String T10 = sVar.T();
            String L12 = sVar.S().B() ? sVar.S().L() : null;
            byte[] P11 = sVar.S().P();
            List U11 = sVar.U();
            if (U11.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[U11.size()];
                for (int i23 = i10; i23 < U11.size(); i23++) {
                    pointArr2[i23] = new Point(((C3350g) U11.get(i23)).G(), ((C3350g) U11.get(i23)).H());
                }
                pointArr = pointArr2;
            }
            switch (sVar.G() - 1) {
                case 1:
                    i12 = 1;
                    continue;
                case 2:
                    i12 = 2;
                    continue;
                case 3:
                    i13 = 3;
                    break;
                case 4:
                    i12 = 4;
                    continue;
                case 5:
                    i13 = 5;
                    break;
                case 6:
                    i13 = 6;
                    break;
                case 7:
                    i13 = 7;
                    break;
                case 8:
                    i12 = 8;
                    continue;
                case 9:
                    i13 = 9;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i13 = 10;
                    break;
                case 11:
                    i13 = 11;
                    break;
                case 12:
                    i13 = 12;
                    break;
                default:
                    i12 = i10;
                    continue;
            }
            i12 = i13;
            arrayList.add(new C(i11, T10, L12, P11, pointArr, i12, c2516u, c2531x, c2536y, a10, c2541z, c2521v, rVar, c2506s, c2511t));
            i14 = -1;
            i15 = i10;
        }
        return arrayList;
    }
}
