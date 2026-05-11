package pb;

import android.util.Log;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pa.C3857c;

/* renamed from: pb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3866e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f38552a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Lazy f38553b = lc.i.a(a.f38554a);

    /* renamed from: pb.e$a */
    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38554a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l invoke() {
            try {
                Object newInstance = C3857c.class.getConstructor(null).newInstance(null);
                Intrinsics.e(newInstance, "null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider");
                return (l) newInstance;
            } catch (Exception e10) {
                Log.e("ExpoModulesHelper", "Couldn't get expo modules list.", e10);
                return null;
            }
        }
    }

    /* renamed from: pb.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a() {
            return (l) AbstractC3866e.f38553b.getValue();
        }

        private b() {
        }
    }
}
