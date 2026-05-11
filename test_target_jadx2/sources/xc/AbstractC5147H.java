package xc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xc.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5147H implements kotlin.reflect.p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f44967a = new a(null);

    /* renamed from: xc.H$a */
    public static final class a {

        /* renamed from: xc.H$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0658a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44968a;

            static {
                int[] iArr = new int[kotlin.reflect.q.values().length];
                try {
                    iArr[kotlin.reflect.q.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlin.reflect.q.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlin.reflect.q.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f44968a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(kotlin.reflect.p typeParameter) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C0658a.f44968a[typeParameter.u().ordinal()];
            if (i10 == 2) {
                sb2.append("in ");
            } else if (i10 == 3) {
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }

        private a() {
        }
    }
}
