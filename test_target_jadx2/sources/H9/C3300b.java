package h9;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import com.google.android.gms.dynamite.DynamiteModule;
import e7.BinderC3090b;
import e9.C3102a;
import f9.AbstractC3155b;
import f9.C3156c;
import f9.C3157d;
import g9.C3201a;
import g9.C3205e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t7.EnumC4721l4;
import t7.M5;
import t7.a6;
import t7.e6;
import t7.g6;
import t7.i6;
import t7.k6;

/* renamed from: h9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3300b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33986a;

    /* renamed from: b, reason: collision with root package name */
    private final C3205e f33987b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33988c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33989d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33990e;

    /* renamed from: f, reason: collision with root package name */
    private final M5 f33991f;

    /* renamed from: g, reason: collision with root package name */
    private i6 f33992g;

    /* renamed from: h, reason: collision with root package name */
    private i6 f33993h;

    C3300b(Context context, C3205e c3205e, M5 m52) {
        this.f33986a = context;
        this.f33987b = c3205e;
        this.f33991f = m52;
    }

    static boolean a(Context context) {
        return DynamiteModule.a(context, "com.google.mlkit.dynamite.face") > 0;
    }

    private final void d() {
        if (this.f33987b.c() != 2) {
            if (this.f33993h == null) {
                this.f33993h = e(new e6(this.f33987b.e(), this.f33987b.d(), this.f33987b.b(), 1, this.f33987b.g(), this.f33987b.a()));
                return;
            }
            return;
        }
        if (this.f33992g == null) {
            this.f33992g = e(new e6(this.f33987b.e(), 1, 1, 2, false, this.f33987b.a()));
        }
        if ((this.f33987b.d() == 2 || this.f33987b.b() == 2 || this.f33987b.e() == 2) && this.f33993h == null) {
            this.f33993h = e(new e6(this.f33987b.e(), this.f33987b.d(), this.f33987b.b(), 1, this.f33987b.g(), this.f33987b.a()));
        }
    }

    private final i6 e(e6 e6Var) {
        return this.f33989d ? c(DynamiteModule.f23554c, "com.google.mlkit.dynamite.face", "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", e6Var) : c(DynamiteModule.f23553b, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", e6Var);
    }

    private static List g(i6 i6Var, C3102a c3102a) {
        if (c3102a.h() == -1) {
            c3102a = C3102a.c(C3156c.d().c(c3102a, false), c3102a.m(), c3102a.i(), c3102a.l(), 17);
        }
        try {
            List m12 = i6Var.m1(C3157d.b().a(c3102a), new a6(c3102a.h(), c3102a.m(), c3102a.i(), AbstractC3155b.b(c3102a.l()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = m12.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3201a((g6) it.next(), c3102a.g()));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new T8.a("Failed to run face detector.", 13, e10);
        }
    }

    @Override // h9.c
    public final Pair b(C3102a c3102a) {
        List list;
        if (this.f33993h == null && this.f33992g == null) {
            f();
        }
        if (!this.f33988c) {
            try {
                i6 i6Var = this.f33993h;
                if (i6Var != null) {
                    i6Var.g();
                }
                i6 i6Var2 = this.f33992g;
                if (i6Var2 != null) {
                    i6Var2.g();
                }
                this.f33988c = true;
            } catch (RemoteException e10) {
                throw new T8.a("Failed to init face detector.", 13, e10);
            }
        }
        i6 i6Var3 = this.f33993h;
        List list2 = null;
        if (i6Var3 != null) {
            list = g(i6Var3, c3102a);
            if (!this.f33987b.g()) {
                i.k(list);
            }
        } else {
            list = null;
        }
        i6 i6Var4 = this.f33992g;
        if (i6Var4 != null) {
            list2 = g(i6Var4, c3102a);
            i.k(list2);
        }
        return new Pair(list, list2);
    }

    final i6 c(DynamiteModule.b bVar, String str, String str2, e6 e6Var) {
        return k6.p(DynamiteModule.d(this.f33986a, bVar, str).c(str2)).L0(BinderC3090b.m1(this.f33986a), e6Var);
    }

    @Override // h9.c
    public final boolean f() {
        if (this.f33993h != null || this.f33992g != null) {
            return this.f33989d;
        }
        if (DynamiteModule.a(this.f33986a, "com.google.mlkit.dynamite.face") > 0) {
            this.f33989d = true;
            try {
                d();
            } catch (RemoteException e10) {
                throw new T8.a("Failed to create thick face detector.", 13, e10);
            } catch (DynamiteModule.a e11) {
                throw new T8.a("Failed to load the bundled face module.", 13, e11);
            }
        } else {
            this.f33989d = false;
            try {
                d();
            } catch (RemoteException e12) {
                k.c(this.f33991f, this.f33989d, EnumC4721l4.OPTIONAL_MODULE_INIT_ERROR);
                throw new T8.a("Failed to create thin face detector.", 13, e12);
            } catch (DynamiteModule.a unused) {
                if (!this.f33990e) {
                    X8.l.c(this.f33986a, HVRetakeActivity.FACE_TAG);
                    this.f33990e = true;
                }
                k.c(this.f33991f, this.f33989d, EnumC4721l4.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new T8.a("Waiting for the face module to be downloaded. Please wait.", 14);
            }
        }
        k.c(this.f33991f, this.f33989d, EnumC4721l4.NO_ERROR);
        return this.f33989d;
    }

    @Override // h9.c
    public final void zzb() {
        try {
            i6 i6Var = this.f33993h;
            if (i6Var != null) {
                i6Var.h();
                this.f33993h = null;
            }
            i6 i6Var2 = this.f33992g;
            if (i6Var2 != null) {
                i6Var2.h();
                this.f33992g = null;
            }
        } catch (RemoteException e10) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e10);
        }
        this.f33988c = false;
    }
}
