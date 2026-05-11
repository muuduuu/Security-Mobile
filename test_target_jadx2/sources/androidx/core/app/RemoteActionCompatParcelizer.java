package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f15713a = (IconCompat) aVar.v(remoteActionCompat.f15713a, 1);
        remoteActionCompat.f15714b = aVar.l(remoteActionCompat.f15714b, 2);
        remoteActionCompat.f15715c = aVar.l(remoteActionCompat.f15715c, 3);
        remoteActionCompat.f15716d = (PendingIntent) aVar.r(remoteActionCompat.f15716d, 4);
        remoteActionCompat.f15717e = aVar.h(remoteActionCompat.f15717e, 5);
        remoteActionCompat.f15718f = aVar.h(remoteActionCompat.f15718f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f15713a, 1);
        aVar.D(remoteActionCompat.f15714b, 2);
        aVar.D(remoteActionCompat.f15715c, 3);
        aVar.H(remoteActionCompat.f15716d, 4);
        aVar.z(remoteActionCompat.f15717e, 5);
        aVar.z(remoteActionCompat.f15718f, 6);
    }
}
