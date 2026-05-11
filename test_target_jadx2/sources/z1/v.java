package Z1;

import O1.C1038i;
import X1.e;
import a2.AbstractC1346c;
import android.graphics.Color;
import android.graphics.Rect;
import c2.C1718a;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collections;
import u5.C4870a;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1346c.a f12340a = AbstractC1346c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1346c.a f12341b = AbstractC1346c.a.a("d", C4870a.f43493a);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC1346c.a f12342c = AbstractC1346c.a.a("ty", "nm");

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12343a;

        static {
            int[] iArr = new int[e.b.values().length];
            f12343a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12343a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static X1.e a(C1038i c1038i) {
        Rect b10 = c1038i.b();
        return new X1.e(Collections.emptyList(), c1038i, "__container", -1L, e.a.PRE_COMP, -1L, null, Collections.emptyList(), new V1.n(), 0, 0, 0, 0.0f, 0.0f, b10.width(), b10.height(), null, null, Collections.emptyList(), e.b.NONE, null, false, null, null, W1.h.NORMAL);
    }

    public static X1.e b(AbstractC1346c abstractC1346c, C1038i c1038i) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        e.b bVar = e.b.NONE;
        W1.h hVar = W1.h.NORMAL;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        abstractC1346c.c();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        e.b bVar2 = bVar;
        W1.h hVar2 = hVar;
        e.a aVar = null;
        String str = null;
        V1.j jVar = null;
        V1.k kVar = null;
        V1.b bVar3 = null;
        W1.a aVar2 = null;
        C1319j c1319j = null;
        long j10 = 0;
        boolean z11 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        long j11 = -1;
        float f16 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        V1.n nVar = null;
        while (abstractC1346c.f()) {
            switch (abstractC1346c.r(f12340a)) {
                case 0:
                    str2 = abstractC1346c.n();
                    break;
                case 1:
                    j10 = abstractC1346c.j();
                    break;
                case 2:
                    str = abstractC1346c.n();
                    break;
                case 3:
                    int j12 = abstractC1346c.j();
                    aVar = e.a.UNKNOWN;
                    if (j12 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[j12];
                        break;
                    }
                case 4:
                    j11 = abstractC1346c.j();
                    break;
                case 5:
                    i10 = (int) (abstractC1346c.j() * b2.l.e());
                    break;
                case 6:
                    i11 = (int) (abstractC1346c.j() * b2.l.e());
                    break;
                case 7:
                    i12 = Color.parseColor(abstractC1346c.n());
                    break;
                case 8:
                    nVar = AbstractC1312c.g(abstractC1346c, c1038i);
                    break;
                case 9:
                    int j13 = abstractC1346c.j();
                    if (j13 < e.b.values().length) {
                        bVar2 = e.b.values()[j13];
                        int i13 = a.f12343a[bVar2.ordinal()];
                        if (i13 == 1) {
                            c1038i.a("Unsupported matte type: Luma");
                        } else if (i13 == 2) {
                            c1038i.a("Unsupported matte type: Luma Inverted");
                        }
                        c1038i.r(1);
                        break;
                    } else {
                        c1038i.a("Unsupported matte type: " + j13);
                        break;
                    }
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    abstractC1346c.b();
                    while (abstractC1346c.f()) {
                        arrayList2.add(x.a(abstractC1346c, c1038i));
                    }
                    c1038i.r(arrayList2.size());
                    abstractC1346c.d();
                    break;
                case 11:
                    abstractC1346c.b();
                    while (abstractC1346c.f()) {
                        W1.c a10 = AbstractC1317h.a(abstractC1346c, c1038i);
                        if (a10 != null) {
                            arrayList3.add(a10);
                        }
                    }
                    abstractC1346c.d();
                    break;
                case 12:
                    abstractC1346c.c();
                    while (abstractC1346c.f()) {
                        int r10 = abstractC1346c.r(f12341b);
                        if (r10 == 0) {
                            jVar = AbstractC1313d.d(abstractC1346c, c1038i);
                        } else if (r10 != 1) {
                            abstractC1346c.s();
                            abstractC1346c.t();
                        } else {
                            abstractC1346c.b();
                            if (abstractC1346c.f()) {
                                kVar = AbstractC1311b.a(abstractC1346c, c1038i);
                            }
                            while (abstractC1346c.f()) {
                                abstractC1346c.t();
                            }
                            abstractC1346c.d();
                        }
                    }
                    abstractC1346c.e();
                    break;
                case 13:
                    abstractC1346c.b();
                    ArrayList arrayList4 = new ArrayList();
                    while (abstractC1346c.f()) {
                        abstractC1346c.c();
                        while (abstractC1346c.f()) {
                            int r11 = abstractC1346c.r(f12342c);
                            if (r11 == 0) {
                                int j14 = abstractC1346c.j();
                                if (j14 == 29) {
                                    aVar2 = AbstractC1314e.b(abstractC1346c, c1038i);
                                } else if (j14 == 25) {
                                    c1319j = new C1320k().b(abstractC1346c, c1038i);
                                }
                            } else if (r11 != 1) {
                                abstractC1346c.s();
                                abstractC1346c.t();
                            } else {
                                arrayList4.add(abstractC1346c.n());
                            }
                        }
                        abstractC1346c.e();
                    }
                    abstractC1346c.d();
                    c1038i.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    f16 = (float) abstractC1346c.i();
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    f12 = (float) abstractC1346c.i();
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    f13 = (float) (abstractC1346c.i() * b2.l.e());
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    f14 = (float) (abstractC1346c.i() * b2.l.e());
                    break;
                case 18:
                    f11 = (float) abstractC1346c.i();
                    break;
                case 19:
                    f15 = (float) abstractC1346c.i();
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    bVar3 = AbstractC1313d.f(abstractC1346c, c1038i, false);
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    str3 = abstractC1346c.n();
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    z12 = abstractC1346c.g();
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    if (abstractC1346c.j() != 1) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    int j15 = abstractC1346c.j();
                    if (j15 < W1.h.values().length) {
                        hVar2 = W1.h.values()[j15];
                        break;
                    } else {
                        c1038i.a("Unsupported Blend Mode: " + j15);
                        hVar2 = W1.h.NORMAL;
                        break;
                    }
                default:
                    abstractC1346c.s();
                    abstractC1346c.t();
                    break;
            }
        }
        abstractC1346c.e();
        ArrayList arrayList5 = new ArrayList();
        if (f11 > 0.0f) {
            arrayList = arrayList2;
            z10 = z11;
            arrayList5.add(new C1718a(c1038i, valueOf, valueOf, null, 0.0f, Float.valueOf(f11)));
            f10 = 0.0f;
        } else {
            arrayList = arrayList2;
            z10 = z11;
            f10 = 0.0f;
        }
        if (f15 <= f10) {
            f15 = c1038i.f();
        }
        arrayList5.add(new C1718a(c1038i, valueOf2, valueOf2, null, f11, Float.valueOf(f15)));
        arrayList5.add(new C1718a(c1038i, valueOf, valueOf, null, f15, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            c1038i.a("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (nVar == null) {
                nVar = new V1.n();
            }
            nVar.m(z10);
        }
        return new X1.e(arrayList3, c1038i, str2, j10, aVar, j11, str, arrayList, nVar, i10, i11, i12, f16, f12, f13, f14, jVar, kVar, arrayList5, bVar2, bVar3, z12, aVar2, c1319j, hVar2);
    }
}
