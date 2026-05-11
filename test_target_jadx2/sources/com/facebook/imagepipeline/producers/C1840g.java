package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.imagepipeline.producers.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1840g extends C1842i {

    /* renamed from: d, reason: collision with root package name */
    public static final a f20911d = new a(null);

    /* renamed from: com.facebook.imagepipeline.producers.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1840g(Z3.x memoryCache, Z3.k cacheKeyFactory, d0 inputProducer) {
        super(memoryCache, cacheKeyFactory, inputProducer);
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
    }

    @Override // com.facebook.imagepipeline.producers.C1842i
    protected String d() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C1842i
    protected String e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C1842i
    protected InterfaceC1847n g(InterfaceC1847n consumer, V2.d cacheKey, boolean z10) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return consumer;
    }
}
