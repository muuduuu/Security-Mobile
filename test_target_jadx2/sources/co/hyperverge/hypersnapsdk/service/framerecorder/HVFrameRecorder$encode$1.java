package co.hyperverge.hypersnapsdk.service.framerecorder;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder", f = "HVFrameRecorder.kt", l = {422, 427, 445}, m = "encode")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class HVFrameRecorder$encode$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HVFrameRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HVFrameRecorder$encode$1(HVFrameRecorder hVFrameRecorder, kotlin.coroutines.d<? super HVFrameRecorder$encode$1> dVar) {
        super(dVar);
        this.this$0 = hVFrameRecorder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object encode;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        encode = this.this$0.encode(null, null, null, null, this);
        return encode;
    }
}
