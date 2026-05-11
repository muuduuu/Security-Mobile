package r1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    public View f39104b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f39103a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f39105c = new ArrayList();

    public s(View view) {
        this.f39104b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f39104b == sVar.f39104b && this.f39103a.equals(sVar.f39103a);
    }

    public int hashCode() {
        return (this.f39104b.hashCode() * 31) + this.f39103a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f39104b + "\n") + "    values:";
        for (String str2 : this.f39103a.keySet()) {
            str = str + "    " + str2 + ": " + this.f39103a.get(str2) + "\n";
        }
        return str;
    }
}
