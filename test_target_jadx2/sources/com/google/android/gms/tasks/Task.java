package com.google.android.gms.tasks;

import D7.InterfaceC0779c;
import D7.InterfaceC0781e;
import D7.InterfaceC0782f;
import D7.InterfaceC0783g;
import D7.InterfaceC0786j;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class Task<TResult> {
    public Task a(InterfaceC0781e interfaceC0781e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task b(Executor executor, InterfaceC0781e interfaceC0781e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task c(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract Task d(InterfaceC0782f interfaceC0782f);

    public abstract Task e(Executor executor, InterfaceC0782f interfaceC0782f);

    public abstract Task f(InterfaceC0783g interfaceC0783g);

    public abstract Task g(Executor executor, InterfaceC0783g interfaceC0783g);

    public abstract Exception getException();

    public abstract TResult getResult();

    public Task h(InterfaceC0779c interfaceC0779c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task i(Executor executor, InterfaceC0779c interfaceC0779c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public abstract boolean isSuccessful();

    public Task j(Executor executor, InterfaceC0779c interfaceC0779c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Object k(Class cls);

    public abstract boolean l();

    public abstract boolean m();

    public Task n(InterfaceC0786j interfaceC0786j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task o(Executor executor, InterfaceC0786j interfaceC0786j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
