package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class D implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f15703a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Context f15704b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private D(Context context) {
        this.f15704b = context;
    }

    public static D j(Context context) {
        return new D(context);
    }

    public D c(Intent intent) {
        this.f15703a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D e(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = q.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f15704b.getPackageManager());
            }
            h(component);
            c(supportParentActivityIntent);
        }
        return this;
    }

    public D h(ComponentName componentName) {
        int size = this.f15703a.size();
        try {
            Intent b10 = q.b(this.f15704b, componentName);
            while (b10 != null) {
                this.f15703a.add(size, b10);
                b10 = q.b(this.f15704b, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f15703a.iterator();
    }

    public void k() {
        m(null);
    }

    public void m(Bundle bundle) {
        if (this.f15703a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f15703a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.m(this.f15704b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f15704b.startActivity(intent);
    }
}
