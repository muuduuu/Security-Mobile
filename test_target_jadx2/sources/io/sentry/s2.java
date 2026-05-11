package io.sentry;

import java.lang.Thread;

/* loaded from: classes2.dex */
interface s2 {

    public static final class a implements s2 {

        /* renamed from: a, reason: collision with root package name */
        private static final a f35492a = new a();

        private a() {
        }

        static s2 c() {
            return f35492a;
        }

        @Override // io.sentry.s2
        public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.s2
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}
