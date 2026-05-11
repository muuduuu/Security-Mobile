package De;

import De.InterfaceC0819c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* renamed from: De.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0821e extends InterfaceC0819c.a {

    /* renamed from: a, reason: collision with root package name */
    static final InterfaceC0819c.a f1634a = new C0821e();

    /* renamed from: De.e$a */
    private static final class a implements InterfaceC0819c {

        /* renamed from: a, reason: collision with root package name */
        private final Type f1635a;

        /* renamed from: De.e$a$a, reason: collision with other inner class name */
        private class C0031a implements InterfaceC0820d {

            /* renamed from: a, reason: collision with root package name */
            private final CompletableFuture f1636a;

            public C0031a(CompletableFuture completableFuture) {
                this.f1636a = completableFuture;
            }

            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b interfaceC0818b, Throwable th) {
                this.f1636a.completeExceptionally(th);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b interfaceC0818b, z zVar) {
                if (zVar.f()) {
                    this.f1636a.complete(zVar.a());
                } else {
                    this.f1636a.completeExceptionally(new j(zVar));
                }
            }
        }

        a(Type type) {
            this.f1635a = type;
        }

        @Override // De.InterfaceC0819c
        public Type b() {
            return this.f1635a;
        }

        @Override // De.InterfaceC0819c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture a(InterfaceC0818b interfaceC0818b) {
            b bVar = new b(interfaceC0818b);
            interfaceC0818b.v1(new C0031a(bVar));
            return bVar;
        }
    }

    /* renamed from: De.e$b */
    private static final class b extends CompletableFuture {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0818b f1638a;

        b(InterfaceC0818b interfaceC0818b) {
            this.f1638a = interfaceC0818b;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f1638a.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* renamed from: De.e$c */
    private static final class c implements InterfaceC0819c {

        /* renamed from: a, reason: collision with root package name */
        private final Type f1639a;

        /* renamed from: De.e$c$a */
        private class a implements InterfaceC0820d {

            /* renamed from: a, reason: collision with root package name */
            private final CompletableFuture f1640a;

            public a(CompletableFuture completableFuture) {
                this.f1640a = completableFuture;
            }

            @Override // De.InterfaceC0820d
            public void onFailure(InterfaceC0818b interfaceC0818b, Throwable th) {
                this.f1640a.completeExceptionally(th);
            }

            @Override // De.InterfaceC0820d
            public void onResponse(InterfaceC0818b interfaceC0818b, z zVar) {
                this.f1640a.complete(zVar);
            }
        }

        c(Type type) {
            this.f1639a = type;
        }

        @Override // De.InterfaceC0819c
        public Type b() {
            return this.f1639a;
        }

        @Override // De.InterfaceC0819c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture a(InterfaceC0818b interfaceC0818b) {
            b bVar = new b(interfaceC0818b);
            interfaceC0818b.v1(new a(bVar));
            return bVar;
        }
    }

    C0821e() {
    }

    @Override // De.InterfaceC0819c.a
    public InterfaceC0819c a(Type type, Annotation[] annotationArr, A a10) {
        if (InterfaceC0819c.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type b10 = InterfaceC0819c.a.b(0, (ParameterizedType) type);
        if (InterfaceC0819c.a.c(b10) != z.class) {
            return new a(b10);
        }
        if (b10 instanceof ParameterizedType) {
            return new c(InterfaceC0819c.a.b(0, (ParameterizedType) b10));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
