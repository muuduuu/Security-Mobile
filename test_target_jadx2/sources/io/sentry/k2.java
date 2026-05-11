package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public final class k2 implements ILogger {
    private String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.ILogger
    public void a(K1 k12, Throwable th, String str, Object... objArr) {
        if (th == null) {
            c(k12, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", k12, String.format(str, objArr), th.toString(), e(th)));
        }
    }

    @Override // io.sentry.ILogger
    public void b(K1 k12, String str, Throwable th) {
        if (th == null) {
            c(k12, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", k12, String.format(str, th.toString()), e(th)));
        }
    }

    @Override // io.sentry.ILogger
    public void c(K1 k12, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", k12, String.format(str, objArr)));
    }

    @Override // io.sentry.ILogger
    public boolean d(K1 k12) {
        return true;
    }
}
