package com.facebook.imagepipeline.memory;

import j4.C3492F;
import j4.G;

/* loaded from: classes.dex */
public class NativeMemoryChunkPool extends f {
    public NativeMemoryChunkPool(e3.d dVar, C3492F c3492f, G g10) {
        super(dVar, c3492f, g10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public NativeMemoryChunk h(int i10) {
        return new NativeMemoryChunk(i10);
    }
}
