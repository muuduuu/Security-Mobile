package com.facebook.imagepipeline.producers;

import java.io.FileInputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class M extends L {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20812c = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Executor executor, e3.i pooledByteBufferFactory) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected g4.i e(m4.b imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return d(new FileInputStream(imageRequest.t().toString()), (int) imageRequest.t().length());
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalFileFetchProducer";
    }
}
