package com.facebook.react.fabric.mounting;

import android.os.SystemClock;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import s5.C4313a;

/* loaded from: classes.dex */
public class MountItemDispatcher {
    private static final long FRAME_TIME_NS = 16666666;
    private static final String TAG = "MountItemDispatcher";
    private final ItemDispatchListener mItemDispatchListener;
    private final MountingManager mMountingManager;
    private final ConcurrentLinkedQueue<DispatchCommandMountItem> mViewCommandMountItems = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<MountItem> mMountItems = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<MountItem> mPreMountItems = new ConcurrentLinkedQueue<>();
    private boolean mInDispatch = false;
    private int mReDispatchCounter = 0;
    private long mBatchedExecutionTime = 0;
    private long mRunStartTime = 0;

    public interface ItemDispatchListener {
        void didDispatchMountItems();

        void didMountItems(List<MountItem> list);

        void willMountItems(List<MountItem> list);
    }

    public MountItemDispatcher(MountingManager mountingManager, ItemDispatchListener itemDispatchListener) {
        this.mMountingManager = mountingManager;
        this.mItemDispatchListener = itemDispatchListener;
    }

    private static <E> List<E> drainConcurrentItemQueue(ConcurrentLinkedQueue<E> concurrentLinkedQueue) {
        if (concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            E poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
        } while (!concurrentLinkedQueue.isEmpty());
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private void executeOrEnqueue(MountItem mountItem) {
        if (!this.mMountingManager.isWaitingForViewAttach(mountItem.get_surfaceId())) {
            mountItem.execute(this.mMountingManager);
            return;
        }
        if (G4.a.f()) {
            AbstractC1721a.o(TAG, "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(mountItem.get_surfaceId()));
        }
        this.mMountingManager.getSurfaceManager(mountItem.get_surfaceId()).scheduleMountItemOnViewAttach(mountItem);
    }

    private List<MountItem> getAndResetMountItems() {
        return drainConcurrentItemQueue(this.mMountItems);
    }

    private List<MountItem> getAndResetPreMountItems() {
        return drainConcurrentItemQueue(this.mPreMountItems);
    }

    private List<DispatchCommandMountItem> getAndResetViewCommandMountItems() {
        return drainConcurrentItemQueue(this.mViewCommandMountItems);
    }

    private static void printMountItem(MountItem mountItem, String str) {
        for (String str2 : mountItem.toString().split("\n")) {
            AbstractC1721a.m(TAG, str + ": " + str2);
        }
    }

    public void addMountItem(MountItem mountItem) {
        this.mMountItems.add(mountItem);
    }

    public void addPreAllocateMountItem(MountItem mountItem) {
        if (!this.mMountingManager.surfaceIsStopped(mountItem.get_surfaceId())) {
            this.mPreMountItems.add(mountItem);
        } else if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            AbstractC1721a.o(TAG, "Not queueing PreAllocateMountItem: surfaceId stopped: [%d] - %s", Integer.valueOf(mountItem.get_surfaceId()), mountItem.toString());
        }
    }

    public void addViewCommandMountItem(DispatchCommandMountItem dispatchCommandMountItem) {
        this.mViewCommandMountItems.add(dispatchCommandMountItem);
    }

    public void dispatchMountItems(Queue<MountItem> queue) {
        while (!queue.isEmpty()) {
            MountItem poll = queue.poll();
            try {
                poll.execute(this.mMountingManager);
            } catch (RetryableMountingLayerException e10) {
                if (poll instanceof DispatchCommandMountItem) {
                    DispatchCommandMountItem dispatchCommandMountItem = (DispatchCommandMountItem) poll;
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    }
                } else {
                    printMountItem(poll, "dispatchExternalMountItems: mounting failed with " + e10.getMessage());
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public void dispatchPreMountItems(long j10) {
        MountItem poll;
        if (this.mPreMountItems.isEmpty()) {
            return;
        }
        C4313a.c(0L, "MountItemDispatcher::premountViews");
        this.mInDispatch = true;
        long j11 = j10 + 8333333;
        while (System.nanoTime() <= j11 && (poll = this.mPreMountItems.poll()) != null) {
            try {
                if (G4.a.f()) {
                    printMountItem(poll, "dispatchPreMountItems");
                }
                executeOrEnqueue(poll);
            } catch (Throwable th) {
                this.mInDispatch = false;
                throw th;
            }
        }
        this.mInDispatch = false;
        C4313a.i(0L);
    }

    public long getBatchedExecutionTime() {
        return this.mBatchedExecutionTime;
    }

    public long getRunStartTime() {
        return this.mRunStartTime;
    }

    public void tryDispatchMountItems() {
        if (this.mInDispatch) {
            return;
        }
        boolean z10 = true;
        if (G4.a.j()) {
            this.mInDispatch = true;
            while (z10) {
                try {
                    z10 = dispatchMountItems();
                } finally {
                }
            }
            this.mInDispatch = false;
            this.mItemDispatchListener.didDispatchMountItems();
            return;
        }
        try {
            boolean dispatchMountItems = dispatchMountItems();
            this.mInDispatch = false;
            this.mItemDispatchListener.didDispatchMountItems();
            int i10 = this.mReDispatchCounter;
            if (i10 < 10 && dispatchMountItems) {
                if (i10 > 2) {
                    ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Re-dispatched " + this.mReDispatchCounter + " times. This indicates setState (?) is likely being called too many times during mounting."));
                }
                this.mReDispatchCounter++;
                tryDispatchMountItems();
            }
            this.mReDispatchCounter = 0;
        } catch (Throwable th) {
            try {
                this.mReDispatchCounter = 0;
                throw th;
            } finally {
            }
        }
    }

    private boolean dispatchMountItems() {
        boolean isIgnorable;
        if (this.mReDispatchCounter == 0) {
            this.mBatchedExecutionTime = 0L;
        }
        this.mRunStartTime = SystemClock.uptimeMillis();
        List<DispatchCommandMountItem> andResetViewCommandMountItems = getAndResetViewCommandMountItems();
        List<MountItem> andResetMountItems = getAndResetMountItems();
        if (andResetMountItems == null && andResetViewCommandMountItems == null) {
            return false;
        }
        this.mItemDispatchListener.willMountItems(andResetMountItems);
        if (andResetViewCommandMountItems != null) {
            C4313a.c(0L, "MountItemDispatcher::mountViews viewCommandMountItems");
            for (DispatchCommandMountItem dispatchCommandMountItem : andResetViewCommandMountItems) {
                if (G4.a.f()) {
                    printMountItem(dispatchCommandMountItem, "dispatchMountItems: Executing viewCommandMountItem");
                }
                try {
                    executeOrEnqueue(dispatchCommandMountItem);
                } catch (RetryableMountingLayerException e10) {
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    } else {
                        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + dispatchCommandMountItem.toString(), e10));
                    }
                } catch (Throwable th) {
                    ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("Caught exception executing ViewCommand: " + dispatchCommandMountItem.toString(), th));
                }
            }
            C4313a.i(0L);
        }
        List<MountItem> andResetPreMountItems = getAndResetPreMountItems();
        if (andResetPreMountItems != null) {
            C4313a.c(0L, "MountItemDispatcher::mountViews preMountItems");
            for (MountItem mountItem : andResetPreMountItems) {
                if (G4.a.f()) {
                    printMountItem(mountItem, "dispatchMountItems: Executing preMountItem");
                }
                executeOrEnqueue(mountItem);
            }
            C4313a.i(0L);
        }
        if (andResetMountItems != null) {
            C4313a.c(0L, "MountItemDispatcher::mountViews mountItems to execute");
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<MountItem> it = andResetMountItems.iterator();
            while (it.hasNext()) {
                MountItem next = it.next();
                if (G4.a.f()) {
                    printMountItem(next, "dispatchMountItems: Executing mountItem");
                }
                try {
                    executeOrEnqueue(next);
                } finally {
                    if (isIgnorable) {
                    }
                }
            }
            this.mBatchedExecutionTime += SystemClock.uptimeMillis() - uptimeMillis;
            C4313a.i(0L);
        }
        this.mItemDispatchListener.didMountItems(andResetMountItems);
        return true;
    }
}
