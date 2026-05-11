package r5;

import android.content.Context;
import com.facebook.soloader.C;
import com.facebook.soloader.C2000c;
import com.facebook.soloader.C2003f;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;
import java.io.File;
import java.util.ArrayList;

/* renamed from: r5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4015c implements InterfaceC4020h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39246a;

    public C4015c(Context context) {
        this.f39246a = context;
    }

    @Override // r5.InterfaceC4020h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/app missing libraries.");
        File file = new File(this.f39246a.getApplicationInfo().nativeLibraryDir);
        if (!file.exists()) {
            p.b("SoLoader", "Native library directory " + file + " does not exist, exiting /data/app recovery.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = eArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            E e10 = eArr[i10];
            if (e10 instanceof C2000c) {
                C2000c c2000c = (C2000c) e10;
                try {
                    for (G.c cVar : c2000c.o()) {
                        if (!new File(file, cVar.f23020a).exists()) {
                            arrayList.add(cVar.f23020a);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        p.b("SoLoader", "No libraries missing from " + file);
                        return false;
                    }
                    p.b("SoLoader", "Missing libraries from " + file + ": " + arrayList.toString() + ", will run prepare on tbe backup so source");
                    c2000c.e(0);
                } catch (Exception e11) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/app failure ", e11);
                    return false;
                }
            } else {
                i10++;
            }
        }
        for (E e12 : eArr) {
            if ((e12 instanceof C2003f) && !(e12 instanceof C2000c)) {
                ((C2003f) e12).h();
            }
        }
        p.b("SoLoader", "Successfully recovered from /data/app disk failure.");
        return true;
    }
}
