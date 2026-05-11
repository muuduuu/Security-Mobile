package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class N extends L {

    /* renamed from: d, reason: collision with root package name */
    public static final a f20813d = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final Resources f20814c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(m4.b bVar) {
            String path = bVar.u().getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String substring = path.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return Integer.parseInt(substring);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Executor executor, e3.i pooledByteBufferFactory, Resources resources) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f20814c = resources;
    }

    private final int g(m4.b bVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f20814c.openRawResourceFd(f20813d.b(bVar));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected g4.i e(m4.b imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return d(this.f20814c.openRawResource(f20813d.b(imageRequest)), g(imageRequest));
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalResourceFetchProducer";
    }
}
