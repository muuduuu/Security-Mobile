package expo.modules.kotlin.types.folly;

import Eb.a;
import android.util.ArrayMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;", BuildConfig.FLAVOR, "<init>", "()V", C4870a.f43493a, "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FollyDynamicExtensionConverter {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayMap f32726b = new ArrayMap();

    /* renamed from: c, reason: collision with root package name */
    private static int f32727c;

    /* renamed from: expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized Object get(String payload) {
            String substring;
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!StringsKt.F(payload, "__expo_dynamic_extension__#", false, 2, null)) {
                throw new a();
            }
            substring = payload.substring(27);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return FollyDynamicExtensionConverter.f32726b.remove(Integer.valueOf(Integer.parseInt(substring)));
        }

        public final synchronized String put(Object any) {
            int i10;
            Intrinsics.checkNotNullParameter(any, "any");
            i10 = FollyDynamicExtensionConverter.f32727c;
            FollyDynamicExtensionConverter.f32727c = i10 + 1;
            FollyDynamicExtensionConverter.f32726b.put(Integer.valueOf(i10), any);
            return "__expo_dynamic_extension__#" + i10;
        }

        private Companion() {
        }
    }

    public static final synchronized Object get(String str) {
        Object obj;
        synchronized (FollyDynamicExtensionConverter.class) {
            obj = INSTANCE.get(str);
        }
        return obj;
    }

    public static final synchronized String put(Object obj) {
        String put;
        synchronized (FollyDynamicExtensionConverter.class) {
            put = INSTANCE.put(obj);
        }
        return put;
    }
}
