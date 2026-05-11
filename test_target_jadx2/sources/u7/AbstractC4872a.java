package u7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: u7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4872a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f43584f;

    /* renamed from: g, reason: collision with root package name */
    private final String f43585g;

    protected AbstractC4872a(IBinder iBinder, String str) {
        this.f43584f = iBinder;
        this.f43585g = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f43584f;
    }
}
