package L0;

import I0.InterfaceC0843i;
import Jd.N;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.k;
import xc.m;

/* loaded from: classes.dex */
public final class c implements Ac.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5625a;

    /* renamed from: b, reason: collision with root package name */
    private final J0.b f5626b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f5627c;

    /* renamed from: d, reason: collision with root package name */
    private final N f5628d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f5629e;

    /* renamed from: f, reason: collision with root package name */
    private volatile InterfaceC0843i f5630f;

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f5631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f5632b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f5631a = context;
            this.f5632b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f5631a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f5632b.f5625a);
        }
    }

    public c(String name, J0.b bVar, Function1 produceMigrations, N scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f5625a = name;
        this.f5626b = bVar;
        this.f5627c = produceMigrations;
        this.f5628d = scope;
        this.f5629e = new Object();
    }

    @Override // Ac.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC0843i a(Context thisRef, k property) {
        InterfaceC0843i interfaceC0843i;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        InterfaceC0843i interfaceC0843i2 = this.f5630f;
        if (interfaceC0843i2 != null) {
            return interfaceC0843i2;
        }
        synchronized (this.f5629e) {
            try {
                if (this.f5630f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    M0.e eVar = M0.e.f5967a;
                    J0.b bVar = this.f5626b;
                    Function1 function1 = this.f5627c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f5630f = eVar.b(bVar, (List) function1.invoke(applicationContext), this.f5628d, new a(applicationContext, this));
                }
                interfaceC0843i = this.f5630f;
                Intrinsics.d(interfaceC0843i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0843i;
    }
}
