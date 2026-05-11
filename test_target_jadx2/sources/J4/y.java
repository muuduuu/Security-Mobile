package j4;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y implements e3.i {

    /* renamed from: a, reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.f f35837a;

    /* renamed from: b, reason: collision with root package name */
    private final e3.l f35838b;

    public y(com.facebook.imagepipeline.memory.f pool, e3.l pooledByteStreams) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        this.f35837a = pool;
        this.f35838b = pooledByteStreams;
    }

    public final x f(InputStream inputStream, com.facebook.imagepipeline.memory.g outputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.f35838b.a(inputStream, outputStream);
        return outputStream.a();
    }

    @Override // e3.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public x c(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        com.facebook.imagepipeline.memory.g gVar = new com.facebook.imagepipeline.memory.g(this.f35837a, 0, 2, null);
        try {
            return f(inputStream, gVar);
        } finally {
            gVar.close();
        }
    }

    @Override // e3.i
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public x d(InputStream inputStream, int i10) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        com.facebook.imagepipeline.memory.g gVar = new com.facebook.imagepipeline.memory.g(this.f35837a, i10);
        try {
            return f(inputStream, gVar);
        } finally {
            gVar.close();
        }
    }

    @Override // e3.i
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public x b(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        com.facebook.imagepipeline.memory.g gVar = new com.facebook.imagepipeline.memory.g(this.f35837a, bytes.length);
        try {
            try {
                gVar.write(bytes, 0, bytes.length);
                return gVar.a();
            } catch (IOException e10) {
                RuntimeException a10 = b3.q.a(e10);
                Intrinsics.checkNotNullExpressionValue(a10, "propagate(ioe)");
                throw a10;
            }
        } finally {
            gVar.close();
        }
    }

    @Override // e3.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.facebook.imagepipeline.memory.g a() {
        return new com.facebook.imagepipeline.memory.g(this.f35837a, 0, 2, null);
    }

    @Override // e3.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.facebook.imagepipeline.memory.g e(int i10) {
        return new com.facebook.imagepipeline.memory.g(this.f35837a, i10);
    }
}
