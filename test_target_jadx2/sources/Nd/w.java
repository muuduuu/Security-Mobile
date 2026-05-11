package Nd;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
final class w implements kotlin.coroutines.d, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.coroutines.d f6798a;

    /* renamed from: b, reason: collision with root package name */
    private final CoroutineContext f6799b;

    public w(kotlin.coroutines.d dVar, CoroutineContext coroutineContext) {
        this.f6798a = dVar;
        this.f6799b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d dVar = this.f6798a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return this.f6799b;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        this.f6798a.resumeWith(obj);
    }
}
