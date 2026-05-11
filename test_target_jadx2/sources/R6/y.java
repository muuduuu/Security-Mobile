package R6;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f8623a;

    /* renamed from: b, reason: collision with root package name */
    private final l f8624b;

    y(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f8623a = new Messenger(iBinder);
            this.f8624b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f8624b = new l(iBinder);
            this.f8623a = null;
        }
    }

    final void a(Message message) {
        Messenger messenger = this.f8623a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        l lVar = this.f8624b;
        if (lVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        lVar.b(message);
    }
}
