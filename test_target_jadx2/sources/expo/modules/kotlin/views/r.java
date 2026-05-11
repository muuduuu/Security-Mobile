package expo.modules.kotlin.views;

import Db.W;
import android.view.View;
import expo.modules.kotlin.exception.w;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class r extends W {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.o f32762a;

    public r(kotlin.reflect.o type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f32762a = type;
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(expo.modules.kotlin.jni.a.INT, expo.modules.kotlin.jni.a.VIEW_TAG);
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.W
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public View a(Object obj, C3862a c3862a) {
        if (c3862a == null) {
            throw new expo.modules.kotlin.exception.e();
        }
        c3862a.c();
        if (obj == null) {
            if (this.f32762a.p()) {
                return null;
            }
            throw new w();
        }
        int intValue = ((Integer) obj).intValue();
        View e10 = c3862a.e(intValue);
        if (this.f32762a.p() || e10 != null) {
            return e10;
        }
        kotlin.reflect.e j10 = this.f32762a.j();
        Intrinsics.e(j10, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        throw new expo.modules.kotlin.exception.m((kotlin.reflect.d) j10, intValue);
    }
}
