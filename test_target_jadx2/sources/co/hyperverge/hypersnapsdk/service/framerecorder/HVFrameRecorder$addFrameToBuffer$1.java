package co.hyperverge.hypersnapsdk.service.framerecorder;

import Jd.N;
import android.graphics.Bitmap;
import co.hyperverge.hypersnapsdk.objects.HVFrameRecorderData;
import co.hyperverge.hypersnapsdk.utils.BitmapUtils;
import co.hyperverge.hypersnapsdk.utils.CoroutineExtensionsKt;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.StringUtils;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder$addFrameToBuffer$1", f = "HVFrameRecorder.kt", l = {307}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HVFrameRecorder$addFrameToBuffer$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ Bitmap $frame;
    final /* synthetic */ int $rotation;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ HVFrameRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFrameRecorder$addFrameToBuffer$1(Bitmap bitmap, HVFrameRecorder hVFrameRecorder, int i10, d<? super HVFrameRecorder$addFrameToBuffer$1> dVar) {
        super(2, dVar);
        this.$frame = bitmap;
        this.this$0 = hVFrameRecorder;
        this.$rotation = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HVFrameRecorder$addFrameToBuffer$1 hVFrameRecorder$addFrameToBuffer$1 = new HVFrameRecorder$addFrameToBuffer$1(this.$frame, this.this$0, this.$rotation, dVar);
        hVFrameRecorder$addFrameToBuffer$1.L$0 = obj;
        return hVFrameRecorder$addFrameToBuffer$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HVFrameRecorder$addFrameToBuffer$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00df A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:8:0x00d9, B:10:0x00df, B:17:0x00f1, B:18:0x010f, B:21:0x00cf, B:26:0x003a, B:28:0x0046, B:29:0x0067), top: B:25:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f1 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:8:0x00d9, B:10:0x00df, B:17:0x00f1, B:18:0x010f, B:21:0x00cf, B:26:0x003a, B:28:0x0046, B:29:0x0067), top: B:25:0x003a }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        ArrayDeque arrayDeque;
        File file;
        HVFrameRecorder hVFrameRecorder;
        Throwable th;
        Bitmap bitmap;
        Bitmap bitmap2;
        File file2;
        Object b11;
        HVFrameRecorderData hVFrameRecorderData;
        Throwable d10;
        ArrayDeque arrayDeque2;
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            HVFrameRecorder hVFrameRecorder2 = this.this$0;
            Bitmap bitmap3 = this.$frame;
            int i11 = this.$rotation;
            try {
                o.a aVar = o.f37128b;
                arrayDeque = hVFrameRecorder2.frameBuffer;
                if (arrayDeque.isEmpty()) {
                    hVFrameRecorder2.setOriginalBitmapWidth(b.b(bitmap3.getWidth()));
                    hVFrameRecorder2.setOriginalBitmapHeight(b.b(bitmap3.getHeight()));
                    hVFrameRecorder2.setImageProxyRotation(b.b(i11));
                }
                Bitmap rotatedBitmap = BitmapUtils.rotateBitmap(bitmap3, i11);
                Intrinsics.checkNotNullExpressionValue(rotatedBitmap, "rotatedBitmap");
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(rotatedBitmap, HVFrameRecorder.VIDEO_WIDTH, HVFrameRecorder.VIDEO_HEIGHT, true);
                Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
                String str = "frame_" + System.currentTimeMillis() + ".jpg";
                file = hVFrameRecorder2.framesTempDir;
                File file3 = new File(file, str);
                try {
                    HVFrameRecorder$addFrameToBuffer$1$1$1$1 hVFrameRecorder$addFrameToBuffer$1$1$1$1 = new HVFrameRecorder$addFrameToBuffer$1$1$1$1(file3, createScaledBitmap, rotatedBitmap, hVFrameRecorder2, null);
                    this.L$0 = hVFrameRecorder2;
                    this.L$1 = rotatedBitmap;
                    this.L$2 = file3;
                    this.L$3 = createScaledBitmap;
                    this.label = 1;
                    if (CoroutineExtensionsKt.onIO$default(null, hVFrameRecorder$addFrameToBuffer$1$1$1$1, this, 1, null) == e10) {
                        return e10;
                    }
                    hVFrameRecorder = hVFrameRecorder2;
                    bitmap = rotatedBitmap;
                    bitmap2 = createScaledBitmap;
                    file2 = file3;
                } catch (Throwable th2) {
                    hVFrameRecorder = hVFrameRecorder2;
                    th = th2;
                    bitmap = rotatedBitmap;
                    bitmap2 = createScaledBitmap;
                    file2 = file3;
                    o.a aVar2 = o.f37128b;
                    b11 = o.b(p.a(th));
                    d10 = o.d(b11);
                    if (d10 != null) {
                    }
                }
            } catch (Throwable th3) {
                o.a aVar3 = o.f37128b;
                b10 = o.b(p.a(th3));
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap2 = (Bitmap) this.L$3;
            file2 = (File) this.L$2;
            bitmap = (Bitmap) this.L$1;
            hVFrameRecorder = (HVFrameRecorder) this.L$0;
            try {
                p.b(obj);
            } catch (Throwable th4) {
                th = th4;
                o.a aVar22 = o.f37128b;
                b11 = o.b(p.a(th));
                d10 = o.d(b11);
                if (d10 != null) {
                }
            }
        }
        b11 = o.b(Unit.f36324a);
        d10 = o.d(b11);
        if (d10 != null) {
            HVLogUtils.e(HVFrameRecorder.TAG, "Error saving frame: " + d10.getMessage());
            bitmap2.recycle();
            bitmap.recycle();
            throw d10;
        }
        arrayDeque2 = hVFrameRecorder.frameBuffer;
        arrayDeque2.addLast(file2.getAbsolutePath());
        b10 = o.b(Unit.f36324a);
        HVFrameRecorder hVFrameRecorder3 = this.this$0;
        Throwable d11 = o.d(b10);
        if (d11 != null) {
            HVLogUtils.e(HVFrameRecorder.TAG, "Error pushing frame: " + d11.getMessage());
            hVFrameRecorderData = hVFrameRecorder3.hvFrameRecorderData;
            hVFrameRecorderData.getErrorEvents().setPushFrameFailure(new HVFrameRecorderData.ErrorEvents.ErrorEvent(null, d11.getMessage(), StringUtils.getCurrentTimestampAsString(), 1, null));
        }
        this.$frame.recycle();
        return Unit.f36324a;
    }
}
