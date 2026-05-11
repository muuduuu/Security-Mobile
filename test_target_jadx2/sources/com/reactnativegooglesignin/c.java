package com.reactnativegooglesignin;

import android.util.Log;
import com.facebook.react.bridge.Promise;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private Promise f29386a;

    /* renamed from: b, reason: collision with root package name */
    private String f29387b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29388c;

    public c(String str) {
        this.f29388c = str;
    }

    private void e(Promise promise, String str) {
        promise.reject("ASYNC_OP_IN_PROGRESS", "Warning: previous promise did not settle and was overwritten. You've called \"" + str + "\" while \"" + a() + "\" was already in progress and has not completed yet.");
    }

    private void f() {
        this.f29387b = null;
        this.f29386a = null;
    }

    public String a() {
        return this.f29387b;
    }

    public void b(Exception exc) {
        Promise promise = this.f29386a;
        String str = this.f29387b;
        if (promise == null) {
            Log.e(this.f29388c, "cannot reject promise because it's null");
            return;
        }
        a aVar = new a(exc, str);
        f();
        promise.reject(aVar.a(), aVar.b(), exc);
    }

    public void c(String str) {
        d(this.f29387b, str);
    }

    public void d(String str, String str2) {
        Promise promise = this.f29386a;
        if (promise == null) {
            Log.e(this.f29388c, "cannot reject promise because it's null");
        } else {
            f();
            promise.reject(str, str2);
        }
    }

    public void g(Object obj) {
        Promise promise = this.f29386a;
        if (promise == null) {
            Log.e(this.f29388c, "cannot resolve promise because it's null");
        } else {
            f();
            promise.resolve(obj);
        }
    }

    public void h(Promise promise, String str) {
        Promise promise2 = this.f29386a;
        if (promise2 != null) {
            e(promise2, str);
        }
        this.f29386a = promise;
        this.f29387b = str;
    }
}
