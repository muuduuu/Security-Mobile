package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class B {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f15696a;

        /* renamed from: b, reason: collision with root package name */
        private final Intent f15697b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f15698c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f15699d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f15700e;

        /* renamed from: f, reason: collision with root package name */
        private ArrayList f15701f;

        /* renamed from: g, reason: collision with root package name */
        private ArrayList f15702g;

        public a(Context context) {
            Activity activity;
            this.f15696a = (Context) y0.f.g(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f15697b = action;
            action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f15697b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                this.f15697b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
        }

        private void b(String str, ArrayList arrayList) {
            String[] stringArrayExtra = this.f15697b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f15697b.putExtra(str, strArr);
        }

        public static a d(Activity activity) {
            return new a(activity);
        }

        public a a(Uri uri) {
            if (this.f15702g == null) {
                this.f15702g = new ArrayList();
            }
            this.f15702g.add(uri);
            return this;
        }

        public Intent c() {
            return Intent.createChooser(e(), this.f15698c);
        }

        public Intent e() {
            ArrayList arrayList = this.f15699d;
            if (arrayList != null) {
                b("android.intent.extra.EMAIL", arrayList);
                this.f15699d = null;
            }
            ArrayList arrayList2 = this.f15700e;
            if (arrayList2 != null) {
                b("android.intent.extra.CC", arrayList2);
                this.f15700e = null;
            }
            ArrayList arrayList3 = this.f15701f;
            if (arrayList3 != null) {
                b("android.intent.extra.BCC", arrayList3);
                this.f15701f = null;
            }
            ArrayList arrayList4 = this.f15702g;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                this.f15697b.setAction("android.intent.action.SEND");
                ArrayList arrayList5 = this.f15702g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f15697b.removeExtra("android.intent.extra.STREAM");
                    this.f15697b.setClipData(null);
                    Intent intent = this.f15697b;
                    intent.setFlags(intent.getFlags() & (-2));
                } else {
                    this.f15697b.putExtra("android.intent.extra.STREAM", (Parcelable) this.f15702g.get(0));
                    B.a(this.f15697b, this.f15702g);
                }
            } else {
                this.f15697b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f15697b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f15702g);
                B.a(this.f15697b, this.f15702g);
            }
            return this.f15697b;
        }

        public a f(CharSequence charSequence) {
            this.f15698c = charSequence;
            return this;
        }

        public a g(Uri uri) {
            this.f15702g = null;
            if (uri != null) {
                a(uri);
            }
            return this;
        }

        public a h(String str) {
            this.f15697b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        public a i(CharSequence charSequence) {
            this.f15697b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public a j(String str) {
            this.f15697b.setType(str);
            return this;
        }
    }

    static void a(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i10 = 1; i10 < size; i10++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i10)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
