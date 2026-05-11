package De;

import De.InterfaceC0819c;
import De.g;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class g extends InterfaceC0819c.a {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1642a;

    class a implements InterfaceC0819c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f1643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f1644b;

        a(Type type, Executor executor) {
            this.f1643a = type;
            this.f1644b = executor;
        }

        @Override // De.InterfaceC0819c
        public Type b() {
            return this.f1643a;
        }

        @Override // De.InterfaceC0819c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0818b a(InterfaceC0818b interfaceC0818b) {
            Executor executor = this.f1644b;
            return executor == null ? interfaceC0818b : new b(executor, interfaceC0818b);
        }
    }

    static final class b implements InterfaceC0818b {

        /* renamed from: a, reason: collision with root package name */
        final Executor f1646a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC0818b f1647b;

        class a implements InterfaceC0820d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0820d f1648a;

            a(InterfaceC0820d interfaceC0820d) {
                this.f1648a = interfaceC0820d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void c(InterfaceC0820d interfaceC0820d, Throwable th) {
                interfaceC0820d.onFailure(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void d(InterfaceC0820d interfaceC0820d, z zVar) {
                if (b.this.f1647b.e()) {
                    interfaceC0820d.onFailure(b.this, new IOException("Canceled"));
                } else {
                    interfaceC0820d.onResponse(b.this, zVar);
                }
            }

            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b interfaceC0818b, final Throwable th) {
                Executor executor = b.this.f1646a;
                final InterfaceC0820d interfaceC0820d = this.f1648a;
                executor.execute(new Runnable() { // from class: De.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.this.c(interfaceC0820d, th);
                    }
                });
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b interfaceC0818b, final z zVar) {
                Executor executor = b.this.f1646a;
                final InterfaceC0820d interfaceC0820d = this.f1648a;
                executor.execute(new Runnable() { // from class: De.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.this.d(interfaceC0820d, zVar);
                    }
                });
            }
        }

        b(Executor executor, InterfaceC0818b interfaceC0818b) {
            this.f1646a = executor;
            this.f1647b = interfaceC0818b;
        }

        @Override // De.InterfaceC0818b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public InterfaceC0818b clone() {
            return new b(this.f1646a, this.f1647b.clone());
        }

        @Override // De.InterfaceC0818b
        public void cancel() {
            this.f1647b.cancel();
        }

        @Override // De.InterfaceC0818b
        public boolean e() {
            return this.f1647b.e();
        }

        @Override // De.InterfaceC0818b
        public z j() {
            return this.f1647b.j();
        }

        @Override // De.InterfaceC0818b
        public Td.D t() {
            return this.f1647b.t();
        }

        @Override // De.InterfaceC0818b
        public void v1(InterfaceC0820d interfaceC0820d) {
            Objects.requireNonNull(interfaceC0820d, "callback == null");
            this.f1647b.v1(new a(interfaceC0820d));
        }
    }

    g(Executor executor) {
        this.f1642a = executor;
    }

    @Override // De.InterfaceC0819c.a
    public InterfaceC0819c a(Type type, Annotation[] annotationArr, A a10) {
        if (InterfaceC0819c.a.c(type) != InterfaceC0818b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(E.g(0, (ParameterizedType) type), E.l(annotationArr, C.class) ? null : this.f1642a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
