package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f28162a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28163b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28164c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f28166e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque f28165d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private boolean f28167f = false;

    private d0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f28162a = sharedPreferences;
        this.f28163b = str;
        this.f28164c = str2;
        this.f28166e = executor;
    }

    private boolean c(boolean z10) {
        if (z10 && !this.f28167f) {
            j();
        }
        return z10;
    }

    static d0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        d0 d0Var = new d0(sharedPreferences, str, str2, executor);
        d0Var.e();
        return d0Var;
    }

    private void e() {
        synchronized (this.f28165d) {
            try {
                this.f28165d.clear();
                String string = this.f28162a.getString(this.f28163b, BuildConfig.FLAVOR);
                if (!TextUtils.isEmpty(string) && string.contains(this.f28164c)) {
                    String[] split = string.split(this.f28164c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f28165d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this.f28165d) {
            this.f28162a.edit().putString(this.f28163b, h()).commit();
        }
    }

    private void j() {
        this.f28166e.execute(new Runnable() { // from class: com.google.firebase.messaging.c0
            @Override // java.lang.Runnable
            public final void run() {
                d0.this.i();
            }
        });
    }

    public boolean b(String str) {
        boolean c10;
        if (TextUtils.isEmpty(str) || str.contains(this.f28164c)) {
            return false;
        }
        synchronized (this.f28165d) {
            c10 = c(this.f28165d.add(str));
        }
        return c10;
    }

    public String f() {
        String str;
        synchronized (this.f28165d) {
            str = (String) this.f28165d.peek();
        }
        return str;
    }

    public boolean g(Object obj) {
        boolean c10;
        synchronized (this.f28165d) {
            c10 = c(this.f28165d.remove(obj));
        }
        return c10;
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f28165d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f28164c);
        }
        return sb2.toString();
    }
}
