package i4;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3320a implements e {
    @Override // com.facebook.imagepipeline.producers.h0
    public void b(String requestId, String producerName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void d(String requestId, String producerName, Map map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void e(String requestId, String producerName, boolean z10) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public boolean f(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void g(String requestId, String producerName, String eventName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void h(String requestId, String producerName, Map map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void i(String requestId, String producerName, Throwable t10, Map map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(t10, "t");
    }
}
