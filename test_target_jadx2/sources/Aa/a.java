package Aa;

import Db.C0792a;
import java.util.Map;
import jb.InterfaceC3521a;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q1.AbstractC3901a;
import wb.e;
import xb.AbstractC5139a;
import xc.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LAa/a;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "expo-constants_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends AbstractC5139a {

    /* renamed from: Aa.a$a, reason: collision with other inner class name */
    static final class C0006a extends m implements Function0 {
        C0006a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            InterfaceC3521a l10 = a.this.a().l();
            Map constants = l10 != null ? l10.getConstants() : null;
            return constants == null ? G.h() : constants;
        }
    }

    public static final class b extends m implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return System.getProperty("http.agent");
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExponentConstants");
            bVar.b(new C0006a());
            bVar.k().put("getWebViewUserAgentAsync", new e("getWebViewUserAgentAsync", new C0792a[0], new b()));
            return bVar.q();
        } finally {
            AbstractC3901a.f();
        }
    }
}
