package Q2;

import Jd.AbstractC0887i;
import Jd.C0874b0;
import Jd.N;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import c1.C1716b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* renamed from: Q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1123b {

    /* renamed from: a, reason: collision with root package name */
    private static final Paint f8081a = new Paint(2);

    /* renamed from: Q2.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f8082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f8083b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8084c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Bitmap bitmap, int i10, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f8083b = bitmap;
            this.f8084c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new a(this.f8083b, this.f8084c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f8082a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            return AbstractC1123b.e(AbstractC1123b.g(this.f8083b, this.f8084c), this.f8084c);
        }
    }

    public static final Object d(Bitmap bitmap, kotlin.coroutines.d dVar) {
        return AbstractC0887i.g(C0874b0.a(), new a(bitmap, -65281, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double e(Bitmap bitmap, final int i10) {
        C1716b c10 = C1716b.b(bitmap).b().a(new C1716b.c() { // from class: Q2.a
            @Override // c1.C1716b.c
            public final boolean a(int i11, float[] fArr) {
                boolean f10;
                f10 = AbstractC1123b.f(i10, i11, fArr);
                return f10;
            }
        }).c();
        Intrinsics.checkNotNullExpressionValue(c10, "from(this)\n        .clearFilters()\n        .addFilter { rgb, _ -> (rgb != alphaSubstitute) }\n        .generate()");
        C1716b.d f10 = c10.f();
        if (f10 == null) {
            return null;
        }
        return Double.valueOf(androidx.core.graphics.d.f(f10.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(int i10, int i11, float[] noName_1) {
        Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return i11 != i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap g(Bitmap bitmap, int i10) {
        Bitmap result = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        result.eraseColor(i10);
        new Canvas(result).drawBitmap(bitmap, new Matrix(), f8081a);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
