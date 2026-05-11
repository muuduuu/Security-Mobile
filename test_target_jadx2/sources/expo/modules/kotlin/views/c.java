package expo.modules.kotlin.views;

import Db.C0792a;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import xc.C5142C;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private final Function2 f32731c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String name, C0792a propType, Function2 setter) {
        super(name, propType);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(propType, "propType");
        Intrinsics.checkNotNullParameter(setter, "setter");
        this.f32731c = setter;
        this.f32732d = propType.d().p();
    }

    @Override // expo.modules.kotlin.views.a
    public void c(Dynamic prop, View onView, C3862a c3862a) {
        CodedException codedException;
        Intrinsics.checkNotNullParameter(prop, "prop");
        Intrinsics.checkNotNullParameter(onView, "onView");
        try {
            this.f32731c.invoke(onView, b().a(prop, c3862a));
            Unit unit = Unit.f36324a;
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else if (th instanceof Da.a) {
                String a10 = ((Da.a) th).a();
                Intrinsics.checkNotNullExpressionValue(a10, "getCode(...)");
                codedException = new CodedException(a10, th.getMessage(), th.getCause());
            } else {
                codedException = new UnexpectedException(th);
            }
            throw new z(a(), C5142C.b(onView.getClass()), codedException);
        }
    }
}
