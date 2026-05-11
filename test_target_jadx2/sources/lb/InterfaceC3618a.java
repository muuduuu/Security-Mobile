package lb;

import android.graphics.Bitmap;
import java.util.concurrent.Future;

/* renamed from: lb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3618a {

    /* renamed from: lb.a$a, reason: collision with other inner class name */
    public interface InterfaceC0551a {
        void onFailure(Throwable th);

        void onSuccess(Bitmap bitmap);
    }

    void a(String str, InterfaceC0551a interfaceC0551a);

    Future b(String str);
}
