package r2;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* renamed from: r2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4001B implements i2.j {

    /* renamed from: a, reason: collision with root package name */
    private final t f39115a;

    public C4001B(t tVar) {
        this.f39115a = tVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, i2.h hVar) {
        return this.f39115a.d(parcelFileDescriptor, i10, i11, hVar);
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, i2.h hVar) {
        return e(parcelFileDescriptor) && this.f39115a.o(parcelFileDescriptor);
    }
}
