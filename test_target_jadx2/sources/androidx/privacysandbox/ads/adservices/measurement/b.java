package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import d1.C2973a;
import d1.C2974b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17202a = new a(null);

    public static final class a {

        /* renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a$a, reason: collision with other inner class name */
        static final class C0296a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f17203a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0296a(Context context) {
                super(1);
                this.f17203a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new d(this.f17203a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            C2973a c2973a = C2973a.f31195a;
            sb2.append(c2973a.a());
            Log.d("MeasurementManager", sb2.toString());
            if (c2973a.a() >= 5) {
                return new g(context);
            }
            if (c2973a.b() >= 9) {
                return (b) C2974b.f31198a.a(context, "MeasurementManager", new C0296a(context));
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, kotlin.coroutines.d dVar);

    public abstract Object b(kotlin.coroutines.d dVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, kotlin.coroutines.d dVar);

    public abstract Object d(m mVar, kotlin.coroutines.d dVar);

    public abstract Object e(Uri uri, kotlin.coroutines.d dVar);

    public abstract Object f(n nVar, kotlin.coroutines.d dVar);

    public abstract Object g(o oVar, kotlin.coroutines.d dVar);
}
