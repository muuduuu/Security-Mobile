package d9;

import V6.AbstractC1287s;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b9.C1662a;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import e7.BinderC3090b;
import e7.InterfaceC3089a;
import e9.C3102a;
import f9.AbstractC3155b;
import f9.C3157d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r7.AbstractC4140l0;
import r7.C4217s8;
import r7.EnumC4076e6;
import r7.X8;
import r7.Z8;
import r7.h9;
import r7.j9;
import r7.k9;
import r7.r9;

/* loaded from: classes2.dex */
final class n implements l {

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC4140l0 f31318h = AbstractC4140l0.r("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a, reason: collision with root package name */
    private boolean f31319a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31320b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31321c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f31322d;

    /* renamed from: e, reason: collision with root package name */
    private final Z8.b f31323e;

    /* renamed from: f, reason: collision with root package name */
    private final C4217s8 f31324f;

    /* renamed from: g, reason: collision with root package name */
    private h9 f31325g;

    n(Context context, Z8.b bVar, C4217s8 c4217s8) {
        this.f31322d = context;
        this.f31323e = bVar;
        this.f31324f = c4217s8;
    }

    static boolean c(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // d9.l
    public final boolean a() {
        if (this.f31325g != null) {
            return this.f31320b;
        }
        if (c(this.f31322d)) {
            this.f31320b = true;
            try {
                this.f31325g = d(DynamiteModule.f23554c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e10) {
                throw new T8.a("Failed to create thick barcode scanner.", 13, e10);
            } catch (DynamiteModule.a e11) {
                throw new T8.a("Failed to load the bundled barcode module.", 13, e11);
            }
        } else {
            this.f31320b = false;
            if (!X8.l.a(this.f31322d, f31318h)) {
                if (!this.f31321c) {
                    X8.l.d(this.f31322d, AbstractC4140l0.r("barcode", "tflite_dynamite"));
                    this.f31321c = true;
                }
                c.e(this.f31324f, EnumC4076e6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new T8.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f31325g = d(DynamiteModule.f23553b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.a e12) {
                c.e(this.f31324f, EnumC4076e6.OPTIONAL_MODULE_INIT_ERROR);
                throw new T8.a("Failed to create thin barcode scanner.", 13, e12);
            }
        }
        c.e(this.f31324f, EnumC4076e6.NO_ERROR);
        return this.f31320b;
    }

    @Override // d9.l
    public final List b(C3102a c3102a) {
        if (this.f31325g == null) {
            a();
        }
        h9 h9Var = (h9) AbstractC1287s.m(this.f31325g);
        if (!this.f31319a) {
            try {
                h9Var.g();
                this.f31319a = true;
            } catch (RemoteException e10) {
                throw new T8.a("Failed to init barcode scanner.", 13, e10);
            }
        }
        int m10 = c3102a.m();
        if (c3102a.h() == 35) {
            m10 = ((Image.Plane[]) AbstractC1287s.m(c3102a.k()))[0].getRowStride();
        }
        try {
            List m12 = h9Var.m1(C3157d.b().a(c3102a), new r9(c3102a.h(), m10, c3102a.i(), AbstractC3155b.b(c3102a.l()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = m12.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1662a(new m((X8) it.next()), c3102a.g()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new T8.a("Failed to run barcode scanner.", 13, e11);
        }
    }

    final h9 d(DynamiteModule.b bVar, String str, String str2) {
        boolean z10;
        k9 p10 = j9.p(DynamiteModule.d(this.f31322d, bVar, str).c(str2));
        InterfaceC3089a m12 = BinderC3090b.m1(this.f31322d);
        int a10 = this.f31323e.a();
        if (this.f31323e.d()) {
            z10 = true;
        } else {
            this.f31323e.b();
            z10 = false;
        }
        return p10.n0(m12, new Z8(a10, z10));
    }

    @Override // d9.l
    public final void zzb() {
        h9 h9Var = this.f31325g;
        if (h9Var != null) {
            try {
                h9Var.h();
            } catch (RemoteException e10) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.f31325g = null;
            this.f31319a = false;
        }
    }
}
