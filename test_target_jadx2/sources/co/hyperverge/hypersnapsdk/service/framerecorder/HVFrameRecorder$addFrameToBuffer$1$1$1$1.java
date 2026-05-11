package co.hyperverge.hypersnapsdk.service.framerecorder;

import Jd.N;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.io.c;
import kotlin.jvm.functions.Function2;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$addFrameToBuffer$1$1$1$1", f = "HVFrameRecorder.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HVFrameRecorder$addFrameToBuffer$1$1$1$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ File $frameFile;
    final /* synthetic */ Bitmap $rotatedBitmap;
    final /* synthetic */ Bitmap $scaledBitmap;
    int label;
    final /* synthetic */ HVFrameRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFrameRecorder$addFrameToBuffer$1$1$1$1(File file, Bitmap bitmap, Bitmap bitmap2, HVFrameRecorder hVFrameRecorder, d<? super HVFrameRecorder$addFrameToBuffer$1$1$1$1> dVar) {
        super(2, dVar);
        this.$frameFile = file;
        this.$scaledBitmap = bitmap;
        this.$rotatedBitmap = bitmap2;
        this.this$0 = hVFrameRecorder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HVFrameRecorder$addFrameToBuffer$1$1$1$1(this.$frameFile, this.$scaledBitmap, this.$rotatedBitmap, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HVFrameRecorder$addFrameToBuffer$1$1$1$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ArrayDeque arrayDeque;
        HVFrameRecorderConfig hVFrameRecorderConfig;
        ArrayDeque arrayDeque2;
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        FileOutputStream fileOutputStream = new FileOutputStream(this.$frameFile);
        try {
            this.$scaledBitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.f36324a;
            c.a(fileOutputStream, null);
            this.$scaledBitmap.recycle();
            this.$rotatedBitmap.recycle();
            arrayDeque = this.this$0.frameBuffer;
            int size = arrayDeque.size();
            hVFrameRecorderConfig = this.this$0.hvFrameRecorderConfig;
            if (size >= hVFrameRecorderConfig.getNumberOfFrames()) {
                arrayDeque2 = this.this$0.frameBuffer;
                File file = new File((String) arrayDeque2.removeFirst());
                if (file.exists()) {
                    file.delete();
                }
            }
            return Unit.f36324a;
        } finally {
        }
    }
}
