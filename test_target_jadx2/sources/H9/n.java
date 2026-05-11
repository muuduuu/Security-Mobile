package h9;

import V6.AbstractC1287s;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.C2018j;
import com.google.android.gms.dynamite.DynamiteModule;
import e7.BinderC3090b;
import e7.InterfaceC3089a;
import e9.C3102a;
import f9.AbstractC3155b;
import f9.C3156c;
import g9.C3201a;
import g9.C3205e;
import java.util.ArrayList;
import java.util.List;
import t7.EnumC4721l4;
import t7.F1;
import t7.H2;
import t7.InterfaceC4729m5;
import t7.J3;
import t7.L4;
import t7.M5;
import t7.p6;

/* loaded from: classes2.dex */
final class n implements c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f34017a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f34018b;

    /* renamed from: c, reason: collision with root package name */
    private final C3205e f34019c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34020d;

    /* renamed from: e, reason: collision with root package name */
    private final M5 f34021e;

    /* renamed from: f, reason: collision with root package name */
    private J3 f34022f;

    /* renamed from: g, reason: collision with root package name */
    private J3 f34023g;

    n(Context context, C3205e c3205e, M5 m52) {
        this.f34018b = context;
        this.f34019c = c3205e;
        this.f34020d = C2018j.h().b(context);
        this.f34021e = m52;
    }

    static int a(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Invalid classification type: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    static int c(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Invalid landmark type: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static int d(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Invalid mode type: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7 A[LOOP:0: B:11:0x00a5->B:12:0x00a7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List e(J3 j32, C3102a c3102a) {
        F1[] m12;
        try {
            p6 p6Var = new p6(c3102a.m(), c3102a.i(), 0, SystemClock.elapsedRealtime(), AbstractC3155b.b(c3102a.l()));
            if (c3102a.h() == 35) {
                try {
                    if (this.f34020d >= 201500000) {
                        Image.Plane[] planeArr = (Image.Plane[]) AbstractC1287s.m(c3102a.k());
                        m12 = j32.n1(BinderC3090b.m1(planeArr[0].getBuffer()), BinderC3090b.m1(planeArr[1].getBuffer()), BinderC3090b.m1(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), p6Var);
                        ArrayList arrayList = new ArrayList();
                        for (F1 f12 : m12) {
                            arrayList.add(new C3201a(f12, c3102a.g()));
                        }
                        return arrayList;
                    }
                } catch (RemoteException e10) {
                    e = e10;
                    throw new T8.a("Failed to detect with legacy face detector", 13, e);
                }
            }
            m12 = j32.m1(BinderC3090b.m1(C3156c.d().c(c3102a, false)), p6Var);
            ArrayList arrayList2 = new ArrayList();
            while (r12 < r3) {
            }
            return arrayList2;
        } catch (RemoteException e11) {
            e = e11;
        }
    }

    @Override // h9.c
    public final Pair b(C3102a c3102a) {
        List list;
        if (this.f34022f == null && this.f34023g == null) {
            f();
        }
        J3 j32 = this.f34022f;
        if (j32 == null && this.f34023g == null) {
            throw new T8.a("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        List list2 = null;
        if (j32 != null) {
            list = e(j32, c3102a);
            if (!this.f34019c.g()) {
                i.k(list);
            }
        } else {
            list = null;
        }
        J3 j33 = this.f34023g;
        if (j33 != null) {
            list2 = e(j33, c3102a);
            i.k(list2);
        }
        return new Pair(list, list2);
    }

    @Override // h9.c
    public final boolean f() {
        if (this.f34022f != null || this.f34023g != null) {
            return false;
        }
        try {
            InterfaceC4729m5 p10 = L4.p(DynamiteModule.d(this.f34018b, DynamiteModule.f23553b, "com.google.android.gms.vision.dynamite").c("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            InterfaceC3089a m12 = BinderC3090b.m1(this.f34018b);
            if (this.f34019c.c() == 2) {
                if (this.f34023g == null) {
                    this.f34023g = p10.A0(m12, new H2(2, 2, 0, true, false, this.f34019c.a()));
                }
                if ((this.f34019c.d() == 2 || this.f34019c.b() == 2 || this.f34019c.e() == 2) && this.f34022f == null) {
                    this.f34022f = p10.A0(m12, new H2(d(this.f34019c.e()), c(this.f34019c.d()), a(this.f34019c.b()), false, this.f34019c.g(), this.f34019c.a()));
                }
            } else if (this.f34022f == null) {
                this.f34022f = p10.A0(m12, new H2(d(this.f34019c.e()), c(this.f34019c.d()), a(this.f34019c.b()), false, this.f34019c.g(), this.f34019c.a()));
            }
            if (this.f34022f == null && this.f34023g == null && !this.f34017a) {
                Log.d("LegacyFaceDelegate", "Request face optional module download.");
                X8.l.c(this.f34018b, "barcode");
                this.f34017a = true;
            }
            k.c(this.f34021e, false, EnumC4721l4.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new T8.a("Failed to create legacy face detector.", 13, e10);
        } catch (DynamiteModule.a e11) {
            throw new T8.a("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }

    @Override // h9.c
    public final void zzb() {
        J3 j32 = this.f34022f;
        if (j32 != null) {
            try {
                j32.f();
            } catch (RemoteException e10) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e10);
            }
            this.f34022f = null;
        }
        J3 j33 = this.f34023g;
        if (j33 != null) {
            try {
                j33.f();
            } catch (RemoteException e11) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e11);
            }
            this.f34023g = null;
        }
    }
}
