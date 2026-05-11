package expo.modules.kotlin.jni;

import Cb.j;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import xc.m;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b$\u0010%J \u0010'\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0015H\u0096 ¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0018H\u0096 ¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b+\u0010,J \u0010-\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u001dH\u0096 ¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020 H\u0096 ¢\u0006\u0004\b/\u00100J \u00101\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020#H\u0096 ¢\u0006\u0004\b1\u00102R\u001b\u00108\u001a\u0002038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010;\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\tR\u001b\u0010>\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u0010\tR\u001b\u0010A\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\t¨\u0006B"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "LCb/j;", "Lcom/facebook/jni/HybridData;", "hybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", BuildConfig.FLAVOR, "getRawKind", "()I", "Ljava/nio/ByteBuffer;", "toDirectBuffer", "()Ljava/nio/ByteBuffer;", BuildConfig.FLAVOR, "buffer", "position", "size", BuildConfig.FLAVOR, "read", "([BII)V", "write", BuildConfig.FLAVOR, "readByte", "(I)B", BuildConfig.FLAVOR, "read2Byte", "(I)S", "read4Byte", "(I)I", BuildConfig.FLAVOR, "read8Byte", "(I)J", BuildConfig.FLAVOR, "readFloat", "(I)F", BuildConfig.FLAVOR, "readDouble", "(I)D", "value", "writeByte", "(IB)V", "write2Byte", "(IS)V", "write4Byte", "(II)V", "write8Byte", "(IJ)V", "writeFloat", "(IF)V", "writeDouble", "(ID)V", "Lexpo/modules/kotlin/jni/f;", C4870a.f43493a, "Lkotlin/Lazy;", "getKind", "()Lexpo/modules/kotlin/jni/f;", "kind", "b", "getLength", "length", "c", "e", "byteLength", "d", "h", "byteOffset", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JavaScriptTypedArray extends JavaScriptObject implements j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy kind;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy length;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy byteLength;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy byteOffset;

    static final class a extends m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf((int) JavaScriptTypedArray.this.getProperty("byteLength").getDouble());
        }
    }

    static final class b extends m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf((int) JavaScriptTypedArray.this.getProperty("byteOffset").getDouble());
        }
    }

    static final class c extends m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            int rawKind = JavaScriptTypedArray.this.getRawKind();
            for (f fVar : f.values()) {
                if (fVar.getValue() == rawKind) {
                    return fVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static final class d extends m implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf((int) JavaScriptTypedArray.this.getProperty("length").getDouble());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaScriptTypedArray(HybridData hybridData) {
        super(hybridData);
        Intrinsics.checkNotNullParameter(hybridData, "hybridData");
        this.kind = i.a(new c());
        this.length = i.a(new d());
        this.byteLength = i.a(new a());
        this.byteOffset = i.a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native int getRawKind();

    @Override // Cb.j
    public int e() {
        return ((Number) this.byteLength.getValue()).intValue();
    }

    @Override // Cb.j
    public int getLength() {
        return ((Number) this.length.getValue()).intValue();
    }

    @Override // Cb.j
    public int h() {
        return ((Number) this.byteOffset.getValue()).intValue();
    }

    public native void read(byte[] buffer, int position, int size);

    public native short read2Byte(int position);

    public native int read4Byte(int position);

    public native long read8Byte(int position);

    public native byte readByte(int position);

    public native double readDouble(int position);

    public native float readFloat(int position);

    @Override // Cb.j
    public native ByteBuffer toDirectBuffer();

    @Override // Cb.j
    public native void write(byte[] buffer, int position, int size);

    public native void write2Byte(int position, short value);

    public native void write4Byte(int position, int value);

    public native void write8Byte(int position, long value);

    public native void writeByte(int position, byte value);

    public native void writeDouble(int position, double value);

    public native void writeFloat(int position, float value);
}
