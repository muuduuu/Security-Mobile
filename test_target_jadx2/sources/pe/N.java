package pe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
abstract /* synthetic */ class N {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f38605a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? StringsKt.K(message, "getsockname failed", false, 2, null) : false;
    }

    public static final Z c(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return g(file, false, 1, null);
    }

    public static final Z d(File file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return M.g(new FileOutputStream(file, z10));
    }

    public static final Z e(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new Q(outputStream, new c0());
    }

    public static final Z f(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        a0 a0Var = new a0(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return a0Var.z(new Q(outputStream, a0Var));
    }

    public static /* synthetic */ Z g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return M.f(file, z10);
    }

    public static final b0 h(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new C3891t(new FileInputStream(file), c0.f38662e);
    }

    public static final b0 i(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new C3891t(inputStream, new c0());
    }

    public static final b0 j(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        a0 a0Var = new a0(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return a0Var.A(new C3891t(inputStream, a0Var));
    }
}
