package com.squareup.picasso;

import android.net.NetworkInfo;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.squareup.picasso.G;
import com.squareup.picasso.u;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class w extends ThreadPoolExecutor {

    private static final class a extends FutureTask implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final RunnableC2926c f29661a;

        a(RunnableC2926c runnableC2926c) {
            super(runnableC2926c, null);
            this.f29661a = runnableC2926c;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            u.f r10 = this.f29661a.r();
            u.f r11 = aVar.f29661a.r();
            return r10 == r11 ? this.f29661a.f29555a - aVar.f29661a.f29555a : r11.ordinal() - r10.ordinal();
        }
    }

    w() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new G.c());
    }

    private void b(int i10) {
        setCorePoolSize(i10);
        setMaximumPoolSize(i10);
    }

    void a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                b(4);
                return;
            } else {
                b(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                b(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        b(3);
                        break;
                    default:
                        b(3);
                        break;
                }
                return;
        }
        b(2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        a aVar = new a((RunnableC2926c) runnable);
        execute(aVar);
        return aVar;
    }
}
