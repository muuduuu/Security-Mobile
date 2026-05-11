package co.hyperverge.hypersnapsdk.components.camera;

import Jd.N;
import Md.s;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.components.camera.model.FaceStateUIFlow;
import co.hyperverge.hypersnapsdk.helpers.face.FaceConstants;
import co.hyperverge.hypersnapsdk.views.CircularProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hypersnapsdk.components.camera.HVFacePreview$setFaceDetectionState$1", f = "HVFacePreview.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HVFacePreview$setFaceDetectionState$1 extends l implements Function2<N, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ FaceConstants.FaceDetectionState $faceDetectionState;
    int label;
    final /* synthetic */ HVFacePreview this$0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FaceConstants.FaceDetectionState.values().length];
            try {
                iArr[FaceConstants.FaceDetectionState.FACE_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaceConstants.FaceDetectionState.FACE_NOT_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FaceConstants.FaceDetectionState.FACE_TOO_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FaceConstants.FaceDetectionState.MULTIPLE_FACES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFacePreview$setFaceDetectionState$1(FaceConstants.FaceDetectionState faceDetectionState, HVFacePreview hVFacePreview, kotlin.coroutines.d<? super HVFacePreview$setFaceDetectionState$1> dVar) {
        super(2, dVar);
        this.$faceDetectionState = faceDetectionState;
        this.this$0 = hVFacePreview;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new HVFacePreview$setFaceDetectionState$1(this.$faceDetectionState, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, kotlin.coroutines.d<? super Unit> dVar) {
        return ((HVFacePreview$setFaceDetectionState$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        s sVar;
        CircularProgressBar circularProgressBar;
        s sVar2;
        CircularProgressBar circularProgressBar2;
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        FaceConstants.FaceDetectionState faceDetectionState = this.$faceDetectionState;
        int i10 = faceDetectionState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[faceDetectionState.ordinal()];
        CircularProgressBar circularProgressBar3 = null;
        if (i10 == 1) {
            sVar = this.this$0.faceUIStateFlow;
            sVar.e(FaceStateUIFlow.Detected.INSTANCE);
            circularProgressBar = this.this$0.progressBar;
            if (circularProgressBar == null) {
                Intrinsics.v("progressBar");
            } else {
                circularProgressBar3 = circularProgressBar;
            }
            circularProgressBar3.setProgressColor(this.this$0.getResources().getColor(R.color.face_capture_circle_success));
        } else if (i10 == 2 || i10 == 3 || i10 == 4) {
            sVar2 = this.this$0.faceUIStateFlow;
            sVar2.e(FaceStateUIFlow.NotDetected.INSTANCE);
            circularProgressBar2 = this.this$0.progressBar;
            if (circularProgressBar2 == null) {
                Intrinsics.v("progressBar");
            } else {
                circularProgressBar3 = circularProgressBar2;
            }
            circularProgressBar3.setProgressColor(this.this$0.getResources().getColor(R.color.face_capture_circle_failure));
        }
        return Unit.f36324a;
    }
}
