package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridData;
import com.facebook.react.common.mapbuffer.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import lc.z;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import xc.m;
import y4.C5173a;
import yc.InterfaceC5191a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 N2\u00020\u0001:\u0002DFB\u0011\b\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\u0012J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0012J\u0017\u00100\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010(J\u0017\u00101\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0012J\u0017\u00102\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010!J\u0017\u00103\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010+J\u0017\u00104\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u0010(J\u0017\u00105\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010.J\u000f\u00106\u001a\u00020\bH\u0016¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u000108H\u0096\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020)H\u0016¢\u0006\u0004\b<\u0010=J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0096\u0002¢\u0006\u0004\b@\u0010AR\u0016\u0010B\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u000eR$\u0010K\u001a\u00020\b2\u0006\u0010H\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bI\u0010\u000e\u001a\u0004\bJ\u00107R\u0014\u0010M\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u00107\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/a;", "Lcom/facebook/jni/HybridData;", "hybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Ljava/nio/ByteBuffer;", "buffer", BuildConfig.FLAVOR, "offset", "(Ljava/nio/ByteBuffer;I)V", "importByteBuffer", "()Ljava/nio/ByteBuffer;", BuildConfig.FLAVOR, "I", "()V", "intKey", "v", "(I)I", "bucketIndex", "Lcom/facebook/react/common/mapbuffer/a$b;", "F", "(I)Lcom/facebook/react/common/mapbuffer/a$b;", "key", "expected", "D", "(ILcom/facebook/react/common/mapbuffer/a$b;)I", "bufferPosition", "Llc/z;", "P", "(I)S", BuildConfig.FLAVOR, "G", "(I)D", "J", BuildConfig.FLAVOR, "L", "(I)J", BuildConfig.FLAVOR, "E", "(I)Z", BuildConfig.FLAVOR, "O", "(I)Ljava/lang/String;", "position", "M", "(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "w", "C", "getInt", "getDouble", "getString", "getBoolean", "A", "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "Lcom/facebook/react/common/mapbuffer/a$c;", "iterator", "()Ljava/util/Iterator;", "mHybridData", "Lcom/facebook/jni/HybridData;", C4870a.f43493a, "Ljava/nio/ByteBuffer;", "b", "offsetToMapBuffer", "<set-?>", "c", "getCount", "count", "B", "offsetForDynamicData", "d", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReadableMapBuffer implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ByteBuffer buffer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int offsetToMapBuffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int count;
    private final HybridData mHybridData;

    private final class b implements a.c {

        /* renamed from: a, reason: collision with root package name */
        private final int f21407a;

        public b(int i10) {
            this.f21407a = i10;
        }

        private final void g(a.b bVar) {
            a.b type = getType();
            if (bVar == type) {
                return;
            }
            throw new IllegalStateException(("Expected " + bVar + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public long a() {
            g(a.b.LONG);
            return ReadableMapBuffer.this.L(this.f21407a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public double b() {
            g(a.b.DOUBLE);
            return ReadableMapBuffer.this.G(this.f21407a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public String c() {
            g(a.b.STRING);
            return ReadableMapBuffer.this.O(this.f21407a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int d() {
            g(a.b.INT);
            return ReadableMapBuffer.this.J(this.f21407a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public a e() {
            g(a.b.MAP);
            return ReadableMapBuffer.this.M(this.f21407a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public boolean f() {
            g(a.b.BOOL);
            return ReadableMapBuffer.this.E(this.f21407a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getKey() {
            return ReadableMapBuffer.this.P(this.f21407a) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public a.b getType() {
            return a.b.values()[ReadableMapBuffer.this.P(this.f21407a + 2) & 65535];
        }
    }

    public static final class c implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private int f21409a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21410b;

        c() {
            this.f21410b = ReadableMapBuffer.this.getCount() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a.c next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i10 = this.f21409a;
            this.f21409a = i10 + 1;
            return readableMapBuffer.new b(readableMapBuffer.w(i10));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21409a <= this.f21410b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static final class d extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f21412a = new d();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21413a;

            static {
                int[] iArr = new int[a.b.values().length];
                try {
                    iArr[a.b.BOOL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.b.INT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.b.LONG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.b.DOUBLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.b.STRING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.b.MAP.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f21413a = iArr;
            }
        }

        d() {
            super(1);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
        
            return r0;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CharSequence invoke(a.c entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(entry.getKey());
            sb2.append('=');
            switch (a.f21413a[entry.getType().ordinal()]) {
                case 1:
                    sb2.append(entry.f());
                    break;
                case 2:
                    sb2.append(entry.d());
                    break;
                case 3:
                    sb2.append(entry.a());
                    break;
                case 4:
                    sb2.append(entry.b());
                    break;
                case 5:
                    sb2.append('\"');
                    sb2.append(entry.c());
                    sb2.append('\"');
                    break;
                case 6:
                    sb2.append(entry.e().toString());
                    break;
            }
        }
    }

    static {
        C5173a.a();
    }

    private ReadableMapBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.buffer = importByteBuffer();
        this.offsetToMapBuffer = 0;
        I();
    }

    private final int B() {
        return w(getCount());
    }

    private final int D(int key, a.b expected) {
        int v10 = v(key);
        if (v10 == -1) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        a.b F10 = F(v10);
        if (F10 == expected) {
            return w(v10) + 4;
        }
        throw new IllegalStateException(("Expected " + expected + " for key: " + key + ", found " + F10 + " instead.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(int bufferPosition) {
        return J(bufferPosition) == 1;
    }

    private final a.b F(int bucketIndex) {
        return a.b.values()[P(w(bucketIndex) + 2) & 65535];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double G(int bufferPosition) {
        return this.buffer.getDouble(bufferPosition);
    }

    private final void I() {
        if (this.buffer.getShort() != 254) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = P(this.buffer.position()) & 65535;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int J(int bufferPosition) {
        return this.buffer.getInt(bufferPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long L(int bufferPosition) {
        return this.buffer.getLong(bufferPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMapBuffer M(int position) {
        return new ReadableMapBuffer(this.buffer, B() + this.buffer.getInt(position) + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String O(int bufferPosition) {
        int B10 = B() + this.buffer.getInt(bufferPosition);
        int i10 = this.buffer.getInt(B10);
        byte[] bArr = new byte[i10];
        this.buffer.position(B10 + 4);
        this.buffer.get(bArr, 0, i10);
        return new String(bArr, Charsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final short P(int bufferPosition) {
        return z.c(this.buffer.getShort(bufferPosition));
    }

    private final native ByteBuffer importByteBuffer();

    private final int v(int intKey) {
        IntRange a10 = a.f21422R.a();
        int c10 = a10.c();
        if (intKey <= a10.e() && c10 <= intKey) {
            short c11 = z.c((short) intKey);
            int count = getCount() - 1;
            int i10 = 0;
            while (i10 <= count) {
                int i11 = (i10 + count) >>> 1;
                int P10 = P(w(i11)) & 65535;
                int i12 = 65535 & c11;
                if (Intrinsics.g(P10, i12) < 0) {
                    i10 = i11 + 1;
                } else {
                    if (Intrinsics.g(P10, i12) <= 0) {
                        return i11;
                    }
                    count = i11 - 1;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int w(int bucketIndex) {
        return this.offsetToMapBuffer + 8 + (bucketIndex * 12);
    }

    @Override // com.facebook.react.common.mapbuffer.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public ReadableMapBuffer x1(int key) {
        return M(D(key, a.b.MAP));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean C(int key) {
        return v(key) != -1;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) other).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return Intrinsics.b(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean getBoolean(int key) {
        return E(D(key, a.b.BOOL));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getCount() {
        return this.count;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public double getDouble(int key) {
        return G(D(key, a.b.DOUBLE));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getInt(int key) {
        return J(D(key, a.b.INT));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public String getString(int key) {
        return O(D(key, a.b.STRING));
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        CollectionsKt.j0(this, sb2, null, null, null, 0, null, d.f21412a, 62, null);
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer, int i10) {
        this.mHybridData = null;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i10);
        Intrinsics.checkNotNullExpressionValue(duplicate, "apply(...)");
        this.buffer = duplicate;
        this.offsetToMapBuffer = i10;
        I();
    }
}
