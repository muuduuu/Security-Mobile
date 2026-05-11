package V6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import e7.AbstractC3091c;
import e7.BinderC3090b;

/* renamed from: V6.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1266b0 extends AbstractC3091c {

    /* renamed from: c, reason: collision with root package name */
    private static final C1266b0 f10888c = new C1266b0();

    private C1266b0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i10, int i11) {
        C1266b0 c1266b0 = f10888c;
        try {
            return (View) BinderC3090b.l1(((O) c1266b0.b(context)).n1(BinderC3090b.m1(context), new Z(1, i10, i11, null)));
        } catch (Exception e10) {
            throw new AbstractC3091c.a("Could not get button with size " + i10 + " and color " + i11, e10);
        }
    }

    @Override // e7.AbstractC3091c
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof O ? (O) queryLocalInterface : new O(iBinder);
    }
}
