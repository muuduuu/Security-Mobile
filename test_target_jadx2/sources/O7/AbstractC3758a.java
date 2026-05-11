package o7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3758a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f37958f;

    /* renamed from: g, reason: collision with root package name */
    private final String f37959g;

    protected AbstractC3758a(IBinder iBinder, String str) {
        this.f37958f = iBinder;
        this.f37959g = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f37958f;
    }
}
