package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 extends L {

    /* renamed from: d, reason: collision with root package name */
    public static final a f20919d = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f20920c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Executor executor, e3.i pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f20920c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected g4.i e(m4.b imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        InputStream openInputStream = this.f20920c.openInputStream(imageRequest.u());
        if (openInputStream == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream");
        }
        g4.i d10 = d(openInputStream, -1);
        Intrinsics.checkNotNullExpressionValue(d10, "getEncodedImage(\n       …mage.UNKNOWN_STREAM_SIZE)");
        return d10;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "QualifiedResourceFetchProducer";
    }
}
