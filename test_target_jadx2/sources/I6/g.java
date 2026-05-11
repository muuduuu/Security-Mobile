package I6;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.AbstractBinderC2063k0;

/* loaded from: classes2.dex */
final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4329a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f4330b;

    g(String str, Bundle bundle) {
        this.f4329a = str;
        this.f4330b = bundle;
    }

    @Override // I6.h
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        Bundle D02 = AbstractBinderC2063k0.k1(iBinder).D0(this.f4329a, this.f4330b);
        i.f(D02);
        String string = D02.getString("Error");
        if (D02.getBoolean("booleanResult")) {
            return null;
        }
        throw new a(string);
    }
}
