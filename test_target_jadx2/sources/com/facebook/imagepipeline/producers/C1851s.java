package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.imagepipeline.producers.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1851s implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f21022a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f21023b;

    public C1851s(d0 inputProducer, ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f21022a = inputProducer;
        this.f21023b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1851s this$0, InterfaceC1847n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.f21022a.a(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(final InterfaceC1847n consumer, final e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        m4.b c10 = context.c();
        ScheduledExecutorService scheduledExecutorService = this.f21023b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.r
                @Override // java.lang.Runnable
                public final void run() {
                    C1851s.d(C1851s.this, consumer, context);
                }
            }, c10.e(), TimeUnit.MILLISECONDS);
        } else {
            this.f21022a.a(consumer, context);
        }
    }
}
