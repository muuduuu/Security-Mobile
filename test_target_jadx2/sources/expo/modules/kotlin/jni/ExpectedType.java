package expo.modules.kotlin.jni;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import xc.C5145F;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/jni/ExpectedType;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lexpo/modules/kotlin/jni/SingleType;", "innerPossibleTypes", "<init>", "([Lexpo/modules/kotlin/jni/SingleType;)V", "Lexpo/modules/kotlin/jni/a;", "expectedTypes", "([Lexpo/modules/kotlin/jni/a;)V", BuildConfig.FLAVOR, "getCombinedTypes", "()I", "getPossibleTypes", "()[Lexpo/modules/kotlin/jni/SingleType;", "getFirstType", "()Lexpo/modules/kotlin/jni/SingleType;", "other", C4870a.f43493a, "(Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;", "[Lexpo/modules/kotlin/jni/SingleType;", "b", "I", "innerCombinedTypes", "c", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExpectedType {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f32688d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SingleType[] innerPossibleTypes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int innerCombinedTypes;

    /* renamed from: expo.modules.kotlin.jni.ExpectedType$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExpectedType a() {
            return new ExpectedType(a.STRING, a.INT);
        }

        public final ExpectedType b(ExpectedType parameterType) {
            Intrinsics.checkNotNullParameter(parameterType, "parameterType");
            return new ExpectedType(new SingleType(a.LIST, new ExpectedType[]{parameterType}));
        }

        public final ExpectedType c(ExpectedType valueType) {
            Intrinsics.checkNotNullParameter(valueType, "valueType");
            return new ExpectedType(new SingleType(a.MAP, new ExpectedType[]{valueType}));
        }

        public final ExpectedType d(a parameterType) {
            Intrinsics.checkNotNullParameter(parameterType, "parameterType");
            return new ExpectedType(new SingleType(a.PRIMITIVE_ARRAY, new ExpectedType[]{new ExpectedType(parameterType)}));
        }

        public final ExpectedType e(ExpectedType parameterType) {
            Intrinsics.checkNotNullParameter(parameterType, "parameterType");
            return new ExpectedType(new SingleType(a.PRIMITIVE_ARRAY, new ExpectedType[]{parameterType}));
        }

        private Companion() {
        }
    }

    public ExpectedType(SingleType... innerPossibleTypes) {
        Intrinsics.checkNotNullParameter(innerPossibleTypes, "innerPossibleTypes");
        this.innerPossibleTypes = innerPossibleTypes;
        int i10 = 0;
        for (SingleType singleType : innerPossibleTypes) {
            i10 |= singleType.getCppType();
        }
        this.innerCombinedTypes = i10;
    }

    public final ExpectedType a(ExpectedType other) {
        Intrinsics.checkNotNullParameter(other, "other");
        C5145F c5145f = new C5145F(2);
        c5145f.b(this.innerPossibleTypes);
        c5145f.b(other.innerPossibleTypes);
        return new ExpectedType((SingleType[]) c5145f.d(new SingleType[c5145f.c()]));
    }

    /* renamed from: getCombinedTypes, reason: from getter */
    public final int getInnerCombinedTypes() {
        return this.innerCombinedTypes;
    }

    public final SingleType getFirstType() {
        return (SingleType) AbstractC3574i.z(this.innerPossibleTypes);
    }

    /* renamed from: getPossibleTypes, reason: from getter */
    public final SingleType[] getInnerPossibleTypes() {
        return this.innerPossibleTypes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExpectedType(a... expectedTypes) {
        this((SingleType[]) Arrays.copyOf(r9, r9.length));
        Intrinsics.checkNotNullParameter(expectedTypes, "expectedTypes");
        ArrayList arrayList = new ArrayList(expectedTypes.length);
        for (a aVar : expectedTypes) {
            arrayList.add(new SingleType(aVar, null, 2, 0 == true ? 1 : 0));
        }
        SingleType[] singleTypeArr = (SingleType[]) arrayList.toArray(new SingleType[0]);
    }
}
