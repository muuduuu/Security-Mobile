package expo.modules.kotlin.sharedobjects;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import pb.r;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedRef;", "RefType", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "ref", "Lpb/r;", "runtimeContext", "<init>", "(Ljava/lang/Object;Lpb/r;)V", "c", "Ljava/lang/Object;", "t", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "d", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "nativeRefType", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class SharedRef<RefType> extends SharedObject {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object ref;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String nativeRefType;

    public /* synthetic */ SharedRef(Object obj, r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : rVar);
    }

    /* renamed from: s, reason: from getter */
    public String getNativeRefType() {
        return this.nativeRefType;
    }

    /* renamed from: t, reason: from getter */
    public final Object getRef() {
        return this.ref;
    }

    public SharedRef(Object obj, r rVar) {
        super(rVar);
        this.ref = obj;
        this.nativeRefType = "unknown";
    }
}
