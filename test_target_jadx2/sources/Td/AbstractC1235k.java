package Td;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Td.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1235k {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10134a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1235k f10135b = new a();

    /* renamed from: Td.k$a */
    public static final class a extends AbstractC1235k {
        a() {
        }
    }

    /* renamed from: Td.k$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1235k a() {
            return AbstractC1235k.f10135b;
        }

        private b() {
        }
    }

    public void b(InterfaceC1234j connection, H route, InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void c(H route, InterfaceC1229e call, IOException failure) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(failure, "failure");
    }

    public void d(H route, InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void e(InterfaceC1234j connection, InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void f(InterfaceC1234j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void g(InterfaceC1234j connection, InterfaceC1229e call) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void h(InterfaceC1234j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }
}
