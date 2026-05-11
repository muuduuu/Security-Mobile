package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class H extends L {

    /* renamed from: d, reason: collision with root package name */
    public static final a f20785d = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final AssetManager f20786c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(m4.b bVar) {
            String path = bVar.u().getPath();
            Intrinsics.d(path);
            String substring = path.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Executor executor, e3.i pooledByteBufferFactory, AssetManager assetManager) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.f20786c = assetManager;
    }

    private final int g(m4.b bVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f20786c.openFd(f20785d.b(bVar));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (IOException unused2) {
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
        return d(this.f20786c.open(f20785d.b(imageRequest), 2), g(imageRequest));
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalAssetFetchProducer";
    }
}
