package com.google.android.gms.internal.vision;

import V6.AbstractC1287s;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import e7.BinderC3090b;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class g2 extends D2 {

    /* renamed from: i, reason: collision with root package name */
    private final C2577i1 f25137i;

    public g2(Context context, C2577i1 c2577i1) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.f25137i = c2577i1;
        c();
    }

    @Override // com.google.android.gms.internal.vision.D2
    protected final /* synthetic */ Object a(DynamiteModule dynamiteModule, Context context) {
        z2 b22;
        IBinder c10 = dynamiteModule.c("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        if (c10 == null) {
            b22 = null;
        } else {
            IInterface queryLocalInterface = c10.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            b22 = queryLocalInterface instanceof z2 ? (z2) queryLocalInterface : new B2(c10);
        }
        if (b22 == null) {
            return null;
        }
        return b22.C0(BinderC3090b.m1(context), (C2577i1) AbstractC1287s.m(this.f25137i));
    }

    public final F7.a[] d(Bitmap bitmap, C2 c22) {
        if (!b()) {
            return new F7.a[0];
        }
        try {
            return ((H1) AbstractC1287s.m((H1) c())).p0(BinderC3090b.m1(bitmap), c22);
        } catch (RemoteException e10) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
            return new F7.a[0];
        }
    }

    public final F7.a[] e(ByteBuffer byteBuffer, C2 c22) {
        if (!b()) {
            return new F7.a[0];
        }
        try {
            return ((H1) AbstractC1287s.m((H1) c())).c0(BinderC3090b.m1(byteBuffer), c22);
        } catch (RemoteException e10) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
            return new F7.a[0];
        }
    }
}
