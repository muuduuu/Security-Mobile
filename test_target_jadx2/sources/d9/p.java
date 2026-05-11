package d9;

import V6.AbstractC1287s;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import b9.C1662a;
import com.google.android.gms.dynamite.DynamiteModule;
import e7.BinderC3090b;
import e9.C3102a;
import f9.AbstractC3155b;
import f9.C3156c;
import java.util.ArrayList;
import java.util.List;
import r7.AbstractBinderC4149m;
import r7.C4109i;
import r7.C4129k;
import r7.C4169o;
import r7.C4217s8;
import r7.C4247v8;
import r7.EnumC4076e6;

/* loaded from: classes2.dex */
final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f31327a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f31328b;

    /* renamed from: c, reason: collision with root package name */
    private final C4109i f31329c;

    /* renamed from: d, reason: collision with root package name */
    private final C4217s8 f31330d;

    /* renamed from: e, reason: collision with root package name */
    private C4129k f31331e;

    p(Context context, Z8.b bVar, C4217s8 c4217s8) {
        C4109i c4109i = new C4109i();
        this.f31329c = c4109i;
        this.f31328b = context;
        c4109i.f40060a = bVar.a();
        this.f31330d = c4217s8;
    }

    @Override // d9.l
    public final boolean a() {
        if (this.f31331e != null) {
            return false;
        }
        try {
            C4129k v02 = AbstractBinderC4149m.p(DynamiteModule.d(this.f31328b, DynamiteModule.f23553b, "com.google.android.gms.vision.dynamite").c("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).v0(BinderC3090b.m1(this.f31328b), this.f31329c);
            this.f31331e = v02;
            if (v02 == null && !this.f31327a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                X8.l.c(this.f31328b, "barcode");
                this.f31327a = true;
                c.e(this.f31330d, EnumC4076e6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new T8.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            c.e(this.f31330d, EnumC4076e6.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new T8.a("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.a e11) {
            throw new T8.a("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }

    @Override // d9.l
    public final List b(C3102a c3102a) {
        C4247v8[] n12;
        if (this.f31331e == null) {
            a();
        }
        C4129k c4129k = this.f31331e;
        if (c4129k == null) {
            throw new T8.a("Error initializing the legacy barcode scanner.", 14);
        }
        C4129k c4129k2 = (C4129k) AbstractC1287s.m(c4129k);
        C4169o c4169o = new C4169o(c3102a.m(), c3102a.i(), 0, 0L, AbstractC3155b.b(c3102a.l()));
        try {
            int h10 = c3102a.h();
            if (h10 == -1) {
                n12 = c4129k2.n1(BinderC3090b.m1(c3102a.e()), c4169o);
            } else if (h10 == 17) {
                n12 = c4129k2.m1(BinderC3090b.m1(c3102a.f()), c4169o);
            } else if (h10 == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) AbstractC1287s.m(c3102a.k());
                c4169o.f40164a = planeArr[0].getRowStride();
                n12 = c4129k2.m1(BinderC3090b.m1(planeArr[0].getBuffer()), c4169o);
            } else {
                if (h10 != 842094169) {
                    throw new T8.a("Unsupported image format: " + c3102a.h(), 3);
                }
                n12 = c4129k2.m1(BinderC3090b.m1(C3156c.d().c(c3102a, false)), c4169o);
            }
            ArrayList arrayList = new ArrayList();
            for (C4247v8 c4247v8 : n12) {
                arrayList.add(new C1662a(new o(c4247v8), c3102a.g()));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new T8.a("Failed to detect with legacy barcode detector", 13, e10);
        }
    }

    @Override // d9.l
    public final void zzb() {
        C4129k c4129k = this.f31331e;
        if (c4129k != null) {
            try {
                c4129k.f();
            } catch (RemoteException e10) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.f31331e = null;
        }
    }
}
