package co.hyperverge.encoder;

import Jd.N;
import android.graphics.Bitmap;
import android.view.View;
import androidx.camera.view.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.p;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.encoder.HyperVideoRecorder$previewToBitmap$1$1$1$previewBitmap$1", f = "HyperVideoRecorder.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", "Landroid/graphics/Bitmap;", "<anonymous>", "(LJd/N;)Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HyperVideoRecorder$previewToBitmap$1$1$1$previewBitmap$1 extends l implements Function2<N, d<? super Bitmap>, Object> {
    final /* synthetic */ View $cameraPreview;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperVideoRecorder$previewToBitmap$1$1$1$previewBitmap$1(View view, d<? super HyperVideoRecorder$previewToBitmap$1$1$1$previewBitmap$1> dVar) {
        super(2, dVar);
        this.$cameraPreview = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HyperVideoRecorder$previewToBitmap$1$1$1$previewBitmap$1(this.$cameraPreview, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Bitmap> dVar) {
        return ((HyperVideoRecorder$previewToBitmap$1$1$1$previewBitmap$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        return ((m) this.$cameraPreview).getBitmap();
    }
}
