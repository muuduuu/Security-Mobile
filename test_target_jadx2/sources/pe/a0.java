package pe;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class a0 extends C3875c {

    /* renamed from: o, reason: collision with root package name */
    private final Socket f38645o;

    public a0(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f38645o = socket;
    }

    @Override // pe.C3875c
    protected void B() {
        Logger logger;
        Logger logger2;
        try {
            this.f38645o.close();
        } catch (AssertionError e10) {
            if (!M.d(e10)) {
                throw e10;
            }
            logger2 = N.f38605a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f38645o, (Throwable) e10);
        } catch (Exception e11) {
            logger = N.f38605a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f38645o, (Throwable) e11);
        }
    }

    @Override // pe.C3875c
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
