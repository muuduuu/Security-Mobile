package io.sentry.transport;

/* loaded from: classes2.dex */
public abstract class A {

    private static final class b extends A {

        /* renamed from: a, reason: collision with root package name */
        private final int f35501a;

        b(int i10) {
            super();
            this.f35501a = i10;
        }

        @Override // io.sentry.transport.A
        public int c() {
            return this.f35501a;
        }

        @Override // io.sentry.transport.A
        public boolean d() {
            return false;
        }
    }

    private static final class c extends A {

        /* renamed from: a, reason: collision with root package name */
        static final c f35502a = new c();

        private c() {
            super();
        }

        @Override // io.sentry.transport.A
        public int c() {
            return -1;
        }

        @Override // io.sentry.transport.A
        public boolean d() {
            return true;
        }
    }

    public static A a() {
        return b(-1);
    }

    public static A b(int i10) {
        return new b(i10);
    }

    public static A e() {
        return c.f35502a;
    }

    public abstract int c();

    public abstract boolean d();

    private A() {
    }
}
